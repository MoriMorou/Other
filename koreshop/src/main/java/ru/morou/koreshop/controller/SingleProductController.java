package ru.morou.koreshop.controller;

import ru.morou.koreshop.persist.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * SingleProductController
 */
@Controller
@RequestMapping("single-product")
public class SingleProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("{id}")
    public String showSingleProduct(Model model, @PathVariable("id") Long id) {
        model.addAttribute("product", productService.findById(id));
        return "single-product";
    }
}