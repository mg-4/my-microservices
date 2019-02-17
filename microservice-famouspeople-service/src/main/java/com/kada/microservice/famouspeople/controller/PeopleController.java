package com.kada.microservice.famouspeople.controller;

import com.kada.microservice.famouspeople.persistence.model.People;
import com.kada.microservice.famouspeople.service.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("famous-people")
public class PeopleController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PeopleService peopleService;

    @GetMapping("hello")
    public String getHello (){
        return "Hello world";
    }

    @GetMapping("peoples")
    public Iterable<People> getPeoples (){
        return peopleService.getPeoples();
    }

    @GetMapping("peoples/{id}")
    public People getPeopleById (@PathVariable Long id){
        return peopleService.getPeopleById(id);
    }
}
