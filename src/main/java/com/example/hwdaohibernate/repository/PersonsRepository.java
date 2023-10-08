package com.example.hwdaohibernate.repository;

import com.example.hwdaohibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("from Person where lower(cityOfLiving) = lower(:city)", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}
