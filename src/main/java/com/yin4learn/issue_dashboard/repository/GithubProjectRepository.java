package com.yin4learn.issue_dashboard.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yin4learn.issue_dashboard.entity.GithubProjectEntity;

public interface GithubProjectRepository extends PagingAndSortingRepository<GithubProjectEntity, Long>{

	GithubProjectEntity findByRepoName(String repoName);
	
}
