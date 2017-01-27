#
# Alpine Java 8
#
# https://hub.docker.com/r/anapsix/alpine-java/
# https://github.com/anapsix/docker-alpine-java
#
FROM anapsix/alpine-java:8_server-jre
MAINTAINER Peerapat Asoktummarungsri <nuboat@gmail.com>

ENV JAVA_HOME /opt/jdk

COPY target/sprinker*.jar /root

# Define working directory.
WORKDIR /root

# Define default command.
CMD ["java -server -Xms128M -Xmx512M -jar sprinker-1.0-SNAPSHOT.jar & disown"]
