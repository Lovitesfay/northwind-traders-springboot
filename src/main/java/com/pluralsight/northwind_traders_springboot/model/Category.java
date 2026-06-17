package com.pluralsight.northwind_traders_springboot.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;


@Entity
@Table(name = "Categories")
@JsonPropertyOrder({
        "category id",
        "name",
        "description"
})
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    private Integer Categoryid;

    @Column(name = "CategoryName")
    private String CategoryName;

    @Column(name = "Description")
    private String Description;

    public Integer getCategoryid() {
        return Categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        Categoryid = categoryid;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

