package tobyspring.helloboot;

import org.springframework.boot.SpringApplication;

@MySpringBootAnnotation
public class HelloBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloBootApplication.class, args);
    }
}
