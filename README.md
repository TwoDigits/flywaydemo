# Flyway Demo Application

This Spring Boot demo application has the purpose to show how flyway works. It requires a running mysql database on your local machine.

During startup of the application, all scripts located under `src/main/resources/db/migration` will be executed automatically.

## Starting the database

Everything that is required to run the mysql database locally is inside the docker-compose file. By executing `docker-compose up -d` you can start the database and an adminer.

## Accessing  the database

The adminer runs on localhost:8080. Username, password and schema are `test`.

## Starting the Application

There are two ways to start the application

    * Execute the main method in the class `FlywaydemoApplication`
    * Run `./gradlew bootRun` on the command line 
