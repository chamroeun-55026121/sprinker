#
# Alpine Java 8
#
# https://hub.docker.com/r/anapsix/alpine-java/
# https://github.com/anapsix/docker-alpine-java
#
FROM anapsix/alpine-java:8_server-jre
MAINTAINER Peerapat Asoktummarungsri <nuboat@gmail.com>

COPY target/sprinker*.jar /root/sprinker.jar

# Define working directory.
WORKDIR /root

# Define default command.
CMD ["java", "-server", "-jar", "sprinker.jar"]
