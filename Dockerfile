FROM jeanblanchard/java:8
COPY target/es-ms-bookstore-1-0.0.1-SNAPSHOT.jar es-ms-bookstore-1-0.0.1-SNAPSHOT.jar
CMD java -jar es-ms-bookstore-1-0.0.1-SNAPSHOT.jar
