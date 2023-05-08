package com.example.demo.Controller;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/pathVariable")
public class PathVariableEx {
    @GetMapping("/first/{id}")
    @ResponseBody
    public String getValue(@PathVariable(required = false) String id){
        return "id : " + id;
    }

    @GetMapping("/second/{name}")
    @ResponseBody
    public String getValue2(@PathVariable(value = "name") String name ){
        return "id : " + name;
    }

    @GetMapping("/third/{name}/{id}")
    @ResponseBody
    public String getValue3(@PathVariable(value = "id") String identity, @PathVariable String name){
        return "id:"+identity + "name: " + name;
    }

    @GetMapping("/forth/{name}")
    @ResponseBody
    public String getValue3(@PathVariable(value = "name") Optional<String> name ){
        return "id : " + name;
    }

}
