# Spring Cloud Examples

## Spring Sleuth and Zipkin

Show how to generate tracing logs for microservices application

### Build and run

If you are use IntelliJ, just go to main class and run.

**service01:** http://localhost:8081/app01/numbers

**service02:** http://localhost:8082/app02/letters

**service01 > service02:** http://localhost:8081/app01/numbers/letters

### Run Zipkin

You need docker to start server:

`docker run -d -p 9411:9411 openzipkin/zipkin`

**Access:** http://localhost:9411/zipkin/


## References

https://spring.io/projects/spring-cloud-sleuth

https://cloud.spring.io/spring-cloud-sleuth/reference/html/

https://www.baeldung.com/mdc-in-log4j-2-logback

https://www.youtube.com/watch?v=jkSm-652UPo
