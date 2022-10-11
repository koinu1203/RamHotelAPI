package com.ram.hotel.proyect.models;

import javax.persistence.*;

@Entity
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private  String LastName;

    public employee(String firstName, String lastName) {
        this.firstName = firstName;
        LastName = lastName;
    }

    public employee() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
