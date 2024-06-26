# JUnit 5 with Spring Boot and Mockito

## REST API

### Working URLs

* `http://localhost:8080/products?name=OnePlus`

## H2 Database

### Connect to h2 database

* Go to URL > `http://localhost:8080/h2-console`
* Give username as `sa` and no password (as provided under `spring.datasource.username` and `spring.datasource.passport` properties under `application.yml`)

## Swagger

### See the swagger definition JSON file

* Swagger-ui - `http://localhost:8080/swagger-ui.html`
* Api-docs - `http://localhost:8080/v2/api-docs`

## References

* OAS / Swagger
  * Swagger 3 - OAS - OpanApi
    * https://www.baeldung.com/spring-rest-openapi-documentation
    * https://springdoc.org/#getting-started
  * Swagger 2 with springfox (not recommended) - https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
* Validation - https://www.baeldung.com/spring-validate-requestparam-pathvariable
* Spring - JUnit 5 Configuration - https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-kotlin-testing
