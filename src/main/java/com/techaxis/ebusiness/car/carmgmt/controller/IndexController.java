package com.techaxis.ebusiness.car.carmgmt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	@GetMapping
	public String sayHello() {
        return "This is e-bussiness for car!!!";
    }
}
