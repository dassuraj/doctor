package com.codewithsuraj.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "doctor")
public final class Doctor {
    @Id
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "dob")
    private  String dob;
    @Column(name = "phone_number")
    private long phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "specialization")
     private String specialization;

}
