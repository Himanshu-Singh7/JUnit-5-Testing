package com.testing.junit.unitTestingSpringBoot.Controller;
import com.testing.junit.unitTestingSpringBoot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    //   http://localhost:9292:/persons/
    @GetMapping("/")
    public ResponseEntity<?> getAllPersons(){

        return ResponseEntity.ok(this.personService.getAllPerson());
    }
}
