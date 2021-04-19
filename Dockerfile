FROM maven
RUN mkdir -p /usr/src/spork
COPY . /usr/src/spork
WORKDIR /usr/src/spork
RUN mvn package
ENTRYPOINT ["java","-jar","target/spork-0.0.1-SNAPSHOT.jar --server.port=8081"]