/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aldrin.foodprophet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Java Programming with Aldrin
 */
@Controller
@RequestMapping(value = "/")
public class FoodProphetController {
    @GetMapping("/")
    public String index(){
        return "/index";
    }
    
}
