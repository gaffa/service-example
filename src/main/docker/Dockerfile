FROM gaffa/spring-boot-as

ADD ${project.artifactId}-${project.version}.jar /srv/
EXPOSE 8080
ENTRYPOINT java -cp '/srv/*' de.gaffa.spring.boot.as.exampleservice.ExampleConfig