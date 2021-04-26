
**Dockerising Spring Boot application**

Download and install Docker for windows/Linux/mac from the official website [https://hub.docker.com/](https://hub.docker.com/)

 - Clone the above Demo Spring Boot Application.
 - Build spring boot application to generate jar file.
	***mvn clean install*** (to build spring boot application) 
 - After installation in order to check whether the Docker is running or
   not
   

*Take the **CMD** from the project folder (or anywhere) and type command*

***docker   –v*** (will display current Docker version) 

Then open the “**Dockerfile**” from the project folder
This contains the commands for generating Docker image

    FROM openjdk:8  
    ADD target/spring-boot-docker.jar spring-boot-docker.jar  
    EXPOSE 8080  
    ENTRYPOINT ["java", "-jar" , "spring-boot-docker.jar" ]

**FROM** will pull openjdk from Docker repo.

**ADD** will copy build jar form target folder to root folder of the Docker.

**EXPOSE** will expose the port 8080.

**ENTRYPOINT** will execute the command given.
(Change the target jar name if you want)

`docker build -f Dockerfile -t spring-boot-docker .`
From the cmd enter the command where –f <FILENAME>
-t <tag-name-for-Docker-image> and **‘.’** is the file path that is current as of now.

This will execute the commands from the docker file and create an image. Initially running may take some time as it downloads a **openjdk** from the repository.

    docker image ls

This command will give you list of images you have and you can find one with the name **docker-spring-boot-user.**

**Running the Project inside the Docker**

`docker run -p 8080:8080 spring-boot-docker`


Now it will open up in

    http://localhost:8080/helloDocker

GET 

   Hello Docker
