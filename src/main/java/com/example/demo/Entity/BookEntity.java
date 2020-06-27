package com.example.demo.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name= "book")
public class BookEntity extends BaseEntity {
    @ManyToMany(mappedBy = "bookEntities")
    private List<BucketEntity> bucketEntities = new ArrayList<>();
//    @ManyToOne
//    @JoinColumn(name = "category_id")
//    private CategoryEntity categoryEntity;
    @Column
    private int price;
}
