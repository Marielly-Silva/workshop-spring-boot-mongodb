package com.marielly.workshopmongo.repositiry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marielly.workshopmongo.domain.Post;
import com.marielly.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}
