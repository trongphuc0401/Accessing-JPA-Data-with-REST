package com.fuchs.AccessingJPADataWithREST.repository;


import com.fuchs.AccessingJPADataWithREST.models.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


/**
 *
 * This repository is an interface that lets you perform various operations involving Person objects. It gets these operations by extending the PagingAndSortingRepository interface that is defined in Spring Data Commons.
 *
 * At runtime, Spring Data REST automatically creates an implementation of this interface. Then it uses the @RepositoryRestResource annotation to direct Spring MVC to create RESTful endpoints at /people.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person,Long>, CrudRepository<Person,Long> {

    List<Person> findByLastName(@Param("name") String name);
}
