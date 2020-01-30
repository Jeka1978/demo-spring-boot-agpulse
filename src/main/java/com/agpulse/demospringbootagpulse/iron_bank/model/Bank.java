package com.agpulse.demospringbootagpulse.iron_bank.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Evgeny Borisov
 */
@Data
@Entity
//@Table(name = "...")
public class Bank {
    @Id
    @GeneratedValue
    private int id;

    private long balance;
}
