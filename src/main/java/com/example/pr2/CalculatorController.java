package com.example.pr2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    Calculator calculator = new Calculator();
    @RequestMapping("/sum")
    public int sum(
            @RequestParam int a,
            @RequestParam int b) {
        return a + b;
    }

//multiply
    @RequestMapping("/multiply")
    public int multiply(
            @RequestParam int a,
            @RequestParam int b) {
        return a * b;
    }

//absolute
    @RequestMapping("/absolute")
    public int absolute(
            @RequestParam int a
            ) {
        if (a < 0){
            return a*-1;
        }
        else {
            return a;
        }
    }
    //division

    @RequestMapping("/division")
    public double division(
            @RequestParam int a,
            @RequestParam int b) {
        return a / b;
    }

    //minus

    @RequestMapping("/minus")
    public double minus(
            @RequestParam int a,
            @RequestParam int b) {
        return a - b;
    }


    //quadrieren
    @RequestMapping("/square")
    public int square(
            @RequestParam int a) {
        return a*a;
    }



}
