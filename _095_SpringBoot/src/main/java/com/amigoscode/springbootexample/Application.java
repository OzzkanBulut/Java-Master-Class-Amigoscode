package com.amigoscode.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

//@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@RestController // Any method within this class that has mapping annotations, will be exposed as rest endpoints that clients can call
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping(path = "/greet") // Jackson transforms java objects into json objects
    public GreetResponse greet(){
        return new GreetResponse(
                "hello",
                List.of("Java","Golang","JavaScript"),
                new Person("Özkan",23,100.32)
        );
    }

    record GreetResponse(
            String greet,
            List<String> favProgLanguages,
            Person person){}
    record Person(String name,int age,double cash){}

//    class GreetResponse{
//        private final String greet;
//
//
//        GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() { // getter is necessary if we want to see the greet in the screen
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{" +
//                    "greet='" + greet + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetResponse that = (GreetResponse) o;
//            return Objects.equals(greet, that.greet);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(greet);
//        }
//    }
}
