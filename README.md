# Calculate Journey Variable Payments

## Prerequisites

- [Docker and Docker compose](https://docs.docker.com/get-docker/)
- [Intellij IDEA](https://www.jetbrains.com/idea/)

## Running locally

You can run the dependencies for the projects with Docker compose:

```bash
docker-compose up
```

The command will launch:

- [Localstack](https://github.com/localstack/localstack) (which is used to mock S3)
- Postgres

Next, head over to Intellij and configure the Spring Boot's profile to use Localstack in `Run > Edit configurations`:

![Configure the Spring Profile in Intellij](assets/spring-profile.png)

You can run the application from Intelli with `Run > Run`.

If you prefer to run the app from the command line, you can do so from the root of the project with:

```bash
./gradlew bootRun --args='--spring.profiles.active=localstack'
```
