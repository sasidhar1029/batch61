package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long homeId;

    private String houseNumber;
    private String address;
    private String pincode;
    private String state;
    private String country;
}