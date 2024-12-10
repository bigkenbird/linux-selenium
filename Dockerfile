FROM selenium/standalone-chrome:131.0
ENV TZ=Asia/Hong_Kong
ENV SOCIAL_MEDIA_CRAWLER_CONFIG_java_opts="-server -XX:+UseG1GC -verbose:gc -Xlog:gc:stdout -XX:InitialRAMPercentage=50 -XX:MaxRAMPercentage=90 -XX:MinRAMPercentage=50 -Dhttps.protocols=TLSv1.2,TLSv1.3 -Dwebdriver.chrome.driver=/social-media-crawler/file/ig/driver/chromedriver.exe -Dwebdriver.gecko.driver=/usr/bin/geckodriver"
RUN apt-get update && apt-get install -y openjdk-21-jdk
COPY extras/glowroot /extras/glowroot
COPY target/*.jar app.jar
COPY file /social-media-crawler/file
RUN chmod -R 777 /social-media-crawler/file
ENTRYPOINT exec java $SOCIAL_MEDIA_CRAWLER_CONFIG_java_opts -javaagent:/extras/glowroot/glowroot.jar -Dglowroot.collector.address=$SOCIAL_MEDIA_CRAWLER_CONFIG_glowroot_address -Dglowroot.agent.id=$SOCIAL_MEDIA_CRAWLER_CONFIG_app_name:: -jar /app.jar