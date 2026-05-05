package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String mobileNumber;
    private int age;
    private String village;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "home_id")
    private Home home;
}