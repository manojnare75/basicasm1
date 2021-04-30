package com.manojnare.basicasm.repository;

import com.manojnare.basicasm.entity.users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends CrudRepository<users, Long> {

}
