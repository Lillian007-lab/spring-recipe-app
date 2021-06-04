package com.example.springrecipeapp.controllers;

import com.example.springrecipeapp.domain.Category;
import com.example.springrecipeapp.domain.UnitOfMeasure;
import com.example.springrecipeapp.repositories.CategoryRepository;
import com.example.springrecipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){
        System.out.println("test...");

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Cup");

        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM Id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
