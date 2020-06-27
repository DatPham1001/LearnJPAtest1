package com.example.demo.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "user")
public class UserEntity extends BaseEntity {

    @Column
    private String password;
}
