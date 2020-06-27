package com.example.demo.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter

@Table(name = "category")
public class CategoryEntity extends BaseEntity {

//    @OneToMany(mappedBy = "categoryEntity")
//    private List<BookEntity> bookEntities = new ArrayList<>();
    @Column
    private int quantity;

    //Tao bang trung gian

}
