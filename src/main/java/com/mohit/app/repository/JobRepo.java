package com.mohit.app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohit.app.model.JobPost;

@Repository
public interface JobRepo  extends JpaRepository<JobPost, Integer>{
	
	
    
}
