package com.example.springrecipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp(){
        category = new Category();
    }


    @Test
    void getId() throws Exception{
        Long idValue = 2L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());

    }

    @Test
    void getDescription() throws Exception{
    }

    @Test
    void getRecipes() throws  Exception{
    }
}