package com.testing.junit.unitTestingSpringBoot.Repo;
import com.testing.junit.unitTestingSpringBoot.entites.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepo extends JpaRepository<Person,Integer> {

    @Query("SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE  END FROM Person s WHERE s.personId = :id")
    boolean isPersonExitById(@Param("id") Integer id);


}
