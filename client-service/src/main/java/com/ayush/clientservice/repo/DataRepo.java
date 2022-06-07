package com.ayush.clientservice.repo;

import com.ayush.clientservice.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepo extends JpaRepository<Data,Long> {
}
