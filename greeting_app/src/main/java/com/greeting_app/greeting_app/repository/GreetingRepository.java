package com.greeting_app.greeting_app.repository;


import com.greeting_app.greeting_app.entity.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<GreetingEntity, Long> {
}
