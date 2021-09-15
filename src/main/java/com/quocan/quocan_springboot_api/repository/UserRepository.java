package com.quocan.quocan_springboot_api.repository;

import com.quocan.quocan_springboot_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
