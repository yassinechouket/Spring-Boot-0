package com.yasschouket.first_springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface softwareRepository extends JpaRepository<software, Integer> {
}
