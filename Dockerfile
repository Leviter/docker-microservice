FROM dockerfile/java:oracle-java8

MAINTAINER Marcel van den Brink

RUN (mkdir /usr/local/microservice)
ADD ./target/microservice.jar /usr/local/microservice/microservice.jar
ADD ./target/classes/config.yml /usr/local/microservice/config.yml

EXPOSE 8080

CMD java -jar /usr/local/microservice/microservice.jar server /usr/local/microservice/config.yml