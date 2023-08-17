FROM registry.paas.ptcloud.t.home/common/pateo-jdk10:v1
VOLUME /tmp
ADD target/app.jar app.jar

COPY ./startApp.sh /
RUN chmod 755 /startApp.sh
ENTRYPOINT ["/startApp.sh"]
