package com.agpulse.demospringbootagpulse;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Evgeny Borisov
 */
@Entity
public class Event {
    @Id
    @GeneratedValue
    private int id;

    private String title;
    private Date date;

    @ManyToOne
    private Person owner;













}
