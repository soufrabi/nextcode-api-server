# Spring Backend

Generate classes for dependencies to allow caching of docker layers. This significantly reduces the size of the application layer of docker image.
```sh
./mvnw package
mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)
```

## Deploying with Docker

Spring Boot Docker Image Tutorial <https://spring.io/guides/gs/spring-boot-docker/>

Docker image hosted at : <https://hub.docker.com/r/soufrabidev/nextcode-api-server/>

## Environment Variables

- DATASOURCE_URL
: ,eg, `jdbc:mysql://hostname:3306/db_name`
- DATASOURCE_USERNAME
: ,eg, mysqluser
- DATASOURCE_PASSWORD
- RCEE_BASEURL
: base url of the remote code execution engine <https://github.com/soufrabi/nextcode-rcee-isolate/>
