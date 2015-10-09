package com.springAndAngularSeed.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.springAndAngularSeed.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findById(Long id);
}