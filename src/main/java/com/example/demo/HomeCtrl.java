package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {

    @Autowired
    CarRepository carRepository;

    @RequestMapping("/")
    public String loadCars(Model model){
        model.addAttribute("carRepository", carRepository.findAll());
        return "home";
    }
}
