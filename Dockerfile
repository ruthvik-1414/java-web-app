FROM amazoncorretto:21
RUN mkdir -p /usr/local/user
ENV JAVA_OPTS=$JAVA_OPTS
COPY /build/libs/webapp-0.0.1-SNAPSHOT.jar /usr/local/user/webapp.jar
ENTRYPOINT exec java $JAVA_OPTS -jar /usr/local/user/webapp.jar
