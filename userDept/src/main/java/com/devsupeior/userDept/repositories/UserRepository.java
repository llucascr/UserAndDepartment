package com.devsupeior.userDept.repositories;

import com.devsupeior.userDept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
