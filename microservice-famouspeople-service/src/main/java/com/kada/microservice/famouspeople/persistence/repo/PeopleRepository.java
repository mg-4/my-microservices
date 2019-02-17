package com.kada.microservice.famouspeople.persistence.repo;

import com.kada.microservice.famouspeople.persistence.model.People;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PeopleRepository extends CrudRepository<People, Long> {
    List<People> findByPays(String title);
}
