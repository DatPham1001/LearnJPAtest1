package com.example.demo.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "user")

public class UserEntity {
    //@ID có 2 chức năng : NONULL and Primary key
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // tự tăng giá trị (=> không có hàm Setter chỉ có Getter)
    private int id;

    @Column()
    private String name;
    @Column()
    private String password;
}
