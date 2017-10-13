package com.zeroquo.personservice.domain.repository;

import com.zeroquo.personservice.domain.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person, Long> {
}
