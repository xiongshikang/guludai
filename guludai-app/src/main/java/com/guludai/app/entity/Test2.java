package com.guludai.app.entity;

import javax.persistence.*;

@Table(name = "test2")
public class Test2 {
    @Id
    @SequenceGenerator(name="",sequenceName="SELECT LAST_INSERT_ID()")
    private Integer id;

    private String test;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return test
     */
    public String getTest() {
        return test;
    }

    /**
     * @param test
     */
    public void setTest(String test) {
        this.test = test;
    }
}