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

**@EnableAutoConfiguration**

@EnableAutoConfiguration annotation is even better. It makes Spring guess the configuration
based on the Jar files available on the **classpath**. It can figure out what
libraries you use and pre-configure their components without you lifting a finger.
It is how all the spring-boot-starter libraries work. Meaning it's a major lifesaver both
when you're just starting to work with a library as well as when you know and trust the default config
to be reasonable.

**Spring Data**

**@Transactional**

Is the spring declarative transaction management annotation.

**Spring Security**

**@EnableWebSecurity**

Is used with @Configuration class to have the Spring Security configuration defined

# **Spring Web MVC Annotations**

**@Controller**

Marks the class as a web controller. A specialisation of the @Component annotation,
which allows Spring to auto-detect implementation classes/beans by scanning the
classpath.

**@RestController**

The @RestController annotation is a convenience syntax for @Controller and @ResponseBody together.
This indicates that the class is a controller, and that all the methods in the marked class
will return a JSON response.

**@Responsebody**

The @ResponseBody is a utility annotation that tells Spring to automatically
serialize return value(s) of this classes methods into HTTP responses. When building
a JSON endpoint, this is an amazing way to "magically" **convert your objects into JSON** 
for easier consumption. If we use the @RestController annotation on our class, we don't need
this annotation at all, because @RestController inherits from it.

**@RequestBody**

The @RequestBody annotation is used to bind the HTTP request body to a Java object.
The @RequestBody annotation is part of the spring framework and is used in conjunction
with the spring MVC web framework. The spring MVC web framework is a Java-based web application
framework that provides a comprehensive set of features for building
web applications. The spring framework is a populara choice for building Java-based
web applications. The spring MVC web framework is based on the **Model-View-Controller
(MVC) architecture**. The MVC architecture is a design pattern that seperates an application
into three components: the mode, the view and the controller. The @RequestBody annotation is used to 
bind the HTTP request body to the controller. The controller processes the
request and then sends the response back to the view. The view displays the
response to the user.

**@RequestMapping(method = RequestMethod.Get, value ="/path")**

This annotation specifies a method in the controller that should be responsible for serving the
HTTP request to the given path, or endpoint. Spring handles the mechanical details of how this
is achieved for you. You simpl specify the method and path parameters on the 
annotation and Spring will route the requests into the correct
action methods. If you don't specify a method value, it will default to GET.

**@GetMapping(value = "/path")**

An abbreviated form of @RequestMapping specifically for HTTP GET requests, which can only takes
an optional value argument, no method argument.**The Read in CRUD**

**@PostMapping(value = "/path")**

An abbreviated form of @RequestMapping specifically for HTTP POST requests, which only 
takes an optional value argument, no method argument.**The Create in Crud**

**@PutMapping(value="/path")**

An abbreviated form of @RequestMapping specifically for HTTP PUT requests, which only takes an 
optional value argument, no method argument.**The update in CRUD**

**@DeleteMapping**

An abbreviated form of @RequestMapping specifically for HTTP DELETE requests, which only takes an
optional value argument, no method argument.**The delete in CRUD**

**@RequestParam(value="name",defaultValue = "World")**

Naturally, the methods handling the requests might take parameters. To help
you with binding the HTTP parameters into the action method arguments, you can use
@RequestParam(value="name",defaultValue = "World") annotation.
Spring will parse the request parameters and put the appropriate ones into
your method arguments.

**@PathVariable("placeHolderName)**

Another common way to provide information to the backend is to encode it 
in the URL. Then you can use the @PathVariable("PlaceHoldername") annotation to bring the
values from the URL to the method arguments.







