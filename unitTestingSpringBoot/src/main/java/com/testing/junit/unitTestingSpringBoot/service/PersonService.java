package com.testing.junit.unitTestingSpringBoot.service;
import com.testing.junit.unitTestingSpringBoot.Repo.PersonRepo;
import com.testing.junit.unitTestingSpringBoot.entites.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepo repo;

    public List<Person>  getAllPerson(){
        return this.repo.findAll();
    }

    public PersonService(PersonRepo repo) {
        this.repo = repo;
    }
}
