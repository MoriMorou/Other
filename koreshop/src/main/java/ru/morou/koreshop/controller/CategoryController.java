package ru.morou.koreshop.controller;

import ru.morou.koreshop.persist.repo.ProductBrandRepository;
import ru.morou.koreshop.persist.repo.ProductColorRepository;
import ru.morou.koreshop.persist.repo.ProductTypeRepository;
import ru.morou.koreshop.persist.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * categoryController
 */
@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private ProductTypeRepository productTypeRepository;
    @Autowired
    private ProductColorRepository productColorRepository;
    @Autowired
    private ProductBrandRepository productBrandRepository;
    @Autowired
    private ProductService productService;

    @GetMapping
    public String showCategory(Model model) {
        model.addAttribute("productTypes", productTypeRepository.findAll());
        model.addAttribute("productColors", productColorRepository.findAll());
        model.addAttribute("productBrands", productBrandRepository.findAll());
        model.addAttribute("products", productService.findAll());
        return "category";
    }
}