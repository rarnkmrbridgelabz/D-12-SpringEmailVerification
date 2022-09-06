package com.bridgelabz.EmailVerification.repository;

import com.bridgelabz.EmailVerification.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<UserEntity,String> {
    UserEntity findByEmailIdIgnoreCase(String emailId);
}
