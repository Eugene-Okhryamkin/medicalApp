package com.vsudevs.medApp.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
@Getter
@Setter
@ToString
public class User extends BaseEntity {

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "snils")
    private String snils;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "middlename")
    private String middlename;

    @Column(name = "live_area")
    private String liveArea;

    @Column(name = "live_settlement")
    private String liveSettlement;

    @Column(name = "live_neighbourhood")
    private String liveNeighbourhood;

    @Column(name = "live_house")
    private String liveHouse;

    @Column(name = "live_housing")
    private String liveHousing;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "disability")
    private String disablity;

    @Column(name = "place_of_work")
    private String placeOfWork;

    @Column(name = "profession")
    private String profession;

    @Column(name = "position")
    private String position;

    @Column(name = "passport")
    private String passport;

    @Column(name = "death")
    private String death;

    @Column(name = "role")
    private String role;

    @Column(name = "password")
    private String password;
}
