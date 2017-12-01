package com.ash.spring.rest.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This repository leverages the power of JPAs already available Repository CRUD methods
@Repository
public interface UserRepository extends CrudRepository < Users, String> {

}
