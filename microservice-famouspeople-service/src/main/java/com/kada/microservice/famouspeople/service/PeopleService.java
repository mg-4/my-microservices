package com.kada.microservice.famouspeople.service;

import com.kada.microservice.famouspeople.persistence.model.People;
import com.kada.microservice.famouspeople.persistence.repo.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository repository;

    @Cacheable("peoples")
    public Iterable<People> getPeoples (){
        return repository.findAll();
    }

    @Cacheable("peoples")
    public People getPeopleById (Long id){
        return repository.findById(id).get();
    }
}
