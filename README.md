# Spring Data JPA Demo

<p align="center">
    <img src="https://cdn-images-1.medium.com/max/880/1*PGm0KhbPIyepOlNWY2Nrgg.png" alt="Logo">
    <p align="center">
      Repository to explain Spring Data JPA concepts
      <br />
      <a href="https://jjeanjacques10.medium.com/pt-br-spring-data-jpa-overview-d04fb565aa07"><strong>Explore the article »</strong></a>
      <br />
      <br />
      <a href="https://github.com/jjeanjacques10/spring-data-jpa-demo/issues">Report Bug</a>
      ·
      <a href="https://github.com/jjeanjacques10/spring-data-jpa-demo/issues">Request Feature</a>
    </p>
</p>

<p align="center">
   <a href="https://www.linkedin.com/in/jjean-jacques10/">
      <img alt="Jean Jacques Barros" src="https://img.shields.io/badge/-JeanJacquesBarros-5FB832?style=flat&logo=Linkedin&logoColor=white" />
   </a>
  <img alt="Repository size" src="https://img.shields.io/github/repo-size/jjeanjacques10/spring-data-jpa-demo?color=5FB832">

  <a href="https://github.com/jjeanjacques10/spring-data-jpa-demo/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/jjeanjacques10/spring-data-jpa-demo?color=5FB832">
  </a>
  <img alt="License" src="https://img.shields.io/badge/license-MIT-5FB832">
  <img alt="GitHub Pull Requests" src="https://img.shields.io/github/issues-pr/jjeanjacques10/spring-data-jpa-demo?color=5FB832" />
  <a href="https://github.com/jjeanjacques10/spring-data-jpa-demo/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/jjeanjacques10/spring-data-jpa-demo?color=5FB832&logo=github">
  </a>
</p>

## Technologies

* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.1/reference/htmlsingle/#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.1/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [MySQL](https://www.mysql.com/)

## Dependencies

``` xml
<!-- Data JPA -->
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<!-- MySQL Connector -->
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <version>8.0.25</version>
</dependency>
```

## Configuration

Access the [application.properties](./src/main/resources/application.properties) file to configure the database.

``` properties
# Database URL
spring.datasource.url=jdbc:mysql://localhost:3306/shinobidatabase
# Database User and Password
spring.datasource.username=root
spring.datasource.password=hokage
# Driver -> MySQL
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
# Show SQL in terminal
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
# DDL Strategy - create, create-drop, update, validate, none
spring.jpa.hibernate.ddl-auto=update
# Convert Camelcase to Database Default
spring.jpa.hibernate.naming-strategy=org.hibernate.cfg.ImprovedNamingStrategy
```

### Import SQL Script

Using the sql/populate.sql file, we can populate the database with some data.

``` properties
spring.jpa.properties.hibernate.hbm2ddl.import_files=sql/populate-database.sql
```

## Getting Started

Running database using docker-compose [file](./docker-compose.yml)

``` bash
docker-compose up -d
```

#### Running Spring Boot Application

``` bash
mvn spring-boot:run
```

Example of the response:

* GET <http://localhost:8080/shinobi>

``` json
[
    {
        "id": 1,
        "name": "Naruto",
        "village": "KONOHAGAKURE"
    },
    {
        "id": 2,
        "name": "Sasuke",
        "village": "KONOHAGAKURE"
    },
    {
        "id": 3,
        "name": "Sakura",
        "village": "KONOHAGAKURE"
    },
    {
        "id": 4,
        "name": "Killer B",
        "village": "KUMOGAKURE"
    }
]
```

## Article

* [[PT-BR] Spring Data JPA - Overview](https://jjeanjacques10.medium.com/pt-br-spring-data-jpa-overview-d04fb565aa07)

## Author

| [<img src="https://avatars3.githubusercontent.com/u/32225403?s=460&v=4" width=115><br><sub>@jjeanjacques10</sub>](https://github.com/jjeanjacques10) |
| :---: |
