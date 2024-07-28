package com.example.jenkins.jenkinsdemo.Controller;


import com.example.jenkins.jenkinsdemo.Entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SampleController {


    @GetMapping
    public String hello(){
        return "HELLO WORLD!";
    }


    @PostMapping("/post")
    public String sample1(@RequestBody Student student)
    {
        return student.getFname()+" "+student.getLname();
    }


}
