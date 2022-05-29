From openjdk:8
Expose 8082
Add target/phase5-0.0.1-SNAPSHOT.war phase5-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/phase5-0.0.1-SNAPSHOT.war"]