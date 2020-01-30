package com.agpulse.demospringbootagpulse;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {


    private String name;
    @JsonIgnore
    private int age;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Event> events;
 }
















