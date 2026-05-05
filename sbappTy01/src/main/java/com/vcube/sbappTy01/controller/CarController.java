package com.vcube.sbappTy01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.vcube.sbappTy01.model.Car;
import com.vcube.sbappTy01.repo.CarRepo;

import jakarta.servlet.http.HttpSession;

@Controller
public class CarController {

    @Autowired
    private CarRepo carRepo;

    // Show all cars (Only after login)
    @GetMapping("/")
    public String getCarInfo(Model model, HttpSession session) {

        // Authentication check
        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }

        model.addAttribute("allCarsInfo", carRepo.findAll());
        return "index";
    }

    // Open Add Car Form
    @GetMapping("/add")
    public String addCarForm(Model model, HttpSession session) {

        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }

        model.addAttribute("car", new Car());
        return "addCar";
    }

    // Save or Update Car
    @PostMapping("/save")
    public String saveCar(@ModelAttribute Car car, HttpSession session) {

        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }

        carRepo.save(car);
        return "redirect:/";
    }

    // Open Edit Form
    @GetMapping("/edit/{id}")
    public String editCar(@PathVariable("id") long id, Model model, HttpSession session) {

        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }

        Car car = carRepo.findById(id).get();
        model.addAttribute("car", car);
        return "addCar";
    }

    // Delete Car
    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable("id") long id, HttpSession session) {

        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }

        carRepo.deleteById(id);
        return "redirect:/";
    }
}
