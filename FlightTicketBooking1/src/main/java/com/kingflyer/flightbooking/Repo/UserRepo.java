package com.kingflyer.flightbooking.Repo;

import org.springframework.data . repository .CrudRepository;
import org.springframework.data . repository .query .Param;
import org.springframework.stereotype .Repository;

import    com .kingflyer.flightbooking.entity .User;

@Repository
public interface UserRepo extends CrudRepository<User , Integer> {
    //@Query(value = "SELECT * From User WHERE  email = :email", nativeQuery = true)
    public User findByEmail(@Param("email") String email);
}
