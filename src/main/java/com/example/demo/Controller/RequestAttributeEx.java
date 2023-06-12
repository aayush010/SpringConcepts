package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/attribute")
public class RequestAttributeEx {
        @GetMapping("/first")
        public String handle (@org.springframework.web.bind.annotation.RequestAttribute("visitorCounter") Integer counter) {
            return String.format("Visitor number: %d", counter);
        }
}
