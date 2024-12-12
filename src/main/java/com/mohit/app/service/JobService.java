package com.mohit.app.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.app.model.JobPost;
import com.mohit.app.repository.JobRepo;

@Service
public class JobService {@Autowired
	public JobRepo repo;
	
	
	
	//method to return all JobPosts
	public List<JobPost> returnAllJobPosts() {
		return repo.findAll();

		
	}
	
	
	
	
	
	// method to add a jobPost
	public void addJobPost(JobPost jobPost) {
		 repo.save(jobPost);
	
	}
}
