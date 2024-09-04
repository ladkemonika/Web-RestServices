package com.rest.WebServices.User.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.WebServices.User.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
