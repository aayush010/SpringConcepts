package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/requestParam")
public class RequestParamEx {

    //http://localhost:8080/example/second?id=7980

    @GetMapping("/first")
    @ResponseBody
    public String getParam(@RequestParam String id){
        return "id: " + id;
    }

    @GetMapping("/second")
    @ResponseBody
    public String getParam2(@RequestParam(required = false) String id){
        return "id: " + id;
    }

    @GetMapping("/third")
    @ResponseBody
    public String getParam3(@RequestParam(defaultValue = "default") String id){
        return "id : " + id;
    }


    @GetMapping("/forth")
    @ResponseBody
    public String getParam4(@RequestParam List<String> ids){
        return "id : " + ids.toString();
    }

    @GetMapping("/f")
    public String handle (@org.springframework.web.bind.annotation.RequestAttribute("visitorCounter") Integer counter) {
        return String.format("Visitor number: %d", counter);
    }

}
