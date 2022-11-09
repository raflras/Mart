package com.example.Mart.repository;

import com.example.Mart.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findFirstByUserId(int UserId);

    User findFirstByName(String userName);

    User findFirstByPhoneNumber(String userPhoneNumber);

}
