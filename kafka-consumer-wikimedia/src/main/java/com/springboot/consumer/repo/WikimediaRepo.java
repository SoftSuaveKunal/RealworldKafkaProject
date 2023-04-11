package com.springboot.consumer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.consumer.entity.WikimediaData;

public interface WikimediaRepo extends JpaRepository<WikimediaData, Long> {

}
