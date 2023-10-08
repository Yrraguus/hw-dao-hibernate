package com.example.hwdaohibernate.controller;

import com.example.hwdaohibernate.entity.Person;
import com.example.hwdaohibernate.repository.PersonsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonsController {
    private final PersonsRepository personsRepository;

    public PersonsController(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersons(@RequestParam String city) {
        return personsRepository.getPersonsByCity(city);
    }
}
