package com.example.demotest.controllers;


import com.example.demotest.mathoperations.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainControllers {
    Calculator calc = new Calculator();
    @GetMapping("/")
    public String CalcutorGet(@RequestParam(value = "strCalc",required = false, defaultValue = "0")String strCalc,
                              Model model){
        model.addAttribute("result",calc.Calculate(strCalc));
        model.addAttribute("strCalcLast",strCalc);
        return "home";
    }
    @PostMapping("/")
    public String CalcutorPost(@RequestParam(value = "strCalc",required = false, defaultValue = "")String strCalc,
                               Model model){
        model.addAttribute("result",calc.Calculate(strCalc));
        model.addAttribute("strCalcLast",strCalc);
        return "home";
    }
}
