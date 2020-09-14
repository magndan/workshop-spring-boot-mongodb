package com.magndan.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magndan.workshopmongo.domain.Post;
import com.magndan.workshopmongo.repository.PostRepository;
import com.magndan.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Post user = repo.findOne(id);
		if (user == null) {
		   throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;	
	}

	
}