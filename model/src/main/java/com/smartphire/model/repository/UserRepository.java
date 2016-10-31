package com.smartphire.model.repository;

import com.smartphire.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by avoinovan on 10/28/16
 */
public interface UserRepository extends JpaRepository<User, String> {
}
