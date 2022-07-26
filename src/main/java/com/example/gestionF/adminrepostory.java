package com.example.gestionF;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface adminrepostory extends CrudRepository<Cycle,Integer> {


}
