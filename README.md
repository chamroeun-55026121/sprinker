Yo
========

#Command
- mvn clean install -DskipTests
- mvn spring-boot:run

#pre-requisite
- sudo useradd sprinker
- sudo mkdir /var/log/sprinker/
- sudo chown sprinker:sprinker /var/log/sprinker

#Dcoker
- docker build -t nuboat/sprinker:latest .
- docker login --username=nuboat
- docker push nuboat/sprinker:latest

#Run
- java -jar sprinker-1.0-SNAPSHOT.jar & disown
