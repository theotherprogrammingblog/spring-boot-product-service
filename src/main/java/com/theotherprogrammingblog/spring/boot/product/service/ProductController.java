package com.theotherprogrammingblog.spring.boot.product.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/hello-worlds/{name}")
    public String getHelloWorld (@PathVariable String name)
    {
        return "ProductControler says: Hello World "+name;
    }
}
