package com.testing.junit.unitTestingSpringBoot.Repo;
import com.testing.junit.unitTestingSpringBoot.entites.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    void isPersonExitById() {
        Person person = new Person(1011,"Himanshu singh" ,"Varanasi");
        personRepo.save(person);

        Boolean actualResult = personRepo.isPersonExitById(person.getPersonId());

        assertThat(actualResult).isTrue();

    }

    @AfterEach
    void tearDown() {
        System.out.println("tearing down");
        personRepo.deleteAll();
    }

    @BeforeEach
    void setUp() {
        System.out.println("setting up");
    }
}