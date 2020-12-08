package com.example.cloudComputing.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity(name ="modelTest")
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModelExample {
    @Id
    private Long id;

    @Column(name = "cnt", nullable = false)
    private int cnt;
}