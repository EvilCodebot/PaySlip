package com.example.restservice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
// @RequestMapping("/response")
public class Controller {
    @PostMapping(value = "/postbody")
       
    public PaySlip[] payslip(@RequestBody Employee[] employeeArray, @Value("${tax-bracket}") float[] taxBracket, @Value("${base-tax}") float[] baseTax, @Value("${tax-rate}") double[] taxRate){

        PaySlip[] paySlips = new PaySlip[employeeArray.length];

        for (int i = 0; i < employeeArray.length; i++) {
            paySlips[i] = new PaySlip(employeeArray[i], taxBracket,baseTax, taxRate);
        }
        return paySlips;
    }

    @GetMapping("/")
    public String hello() {
    return String.format("Hello!");
    }
}
