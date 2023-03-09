# Spring Boot 
One of the challanges in working with Spring is that it involves a lot of configuration and boilerplate.
Spring MVC makes a lot of things easier, but it still involves a fair amount of configuration.
Spring Boot hides most of the boring details, through the use of automation and intelligent defaults.
Thus, Spring Boot makes it much easier to create a stand-alone, production-grade Spring based applications that we can Just Run!

# Annotations

**@SpringBootApplication**

It's syntactic sugar for combining other annotations that we'll look at in just a moment.
**@SpringBootApplication** is @Configuration, @EnableAutoConfiguration and 
@ComponentScan annotations combined, configured with their default attributes. We add this
annotation just once, to the main class of our application.