package com.agpulse.demospringbootagpulse.controllers;

import com.agpulse.demospringbootagpulse.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author Evgeny Borisov
 */
@RestController
@RequestMapping("/api")
public class HelloController {


    @PostMapping("/save")
    public String savePerson(@RequestBody Person person){
        return person.getName()+ " was saved to db";
    }


    @GetMapping("/person")
    @SneakyThrows
    public Person getSomePerson(){
        Person person = Person.builder().name("Carmel").age(40).build();
        return person;
    }


    @GetMapping("/hello")
    public String hello() {
        return "Hi";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name.toUpperCase();
    }


    @GetMapping("/hello2")
    public String hello2(@RequestParam String name) {
        return "Hi " + name.toLowerCase();
    }


    @SneakyThrows
    public static void main(String[] args) {
        var mapper = new ObjectMapper();
        Person person = Person.builder().age(12).name("Vailli 2").build();
        String json = mapper.writeValueAsString(person);
        System.out.println("json = " + json);
        json = "{\"name\":\"Vailli 2\",\"age\":12}";
        Person person1 = mapper.readValue(json, Person.class);
        System.out.println("person1 = " + person1);


    }










}
