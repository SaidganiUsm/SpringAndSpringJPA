package com.saidgani.spring_sample.models.repo;

import com.saidgani.spring_sample.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>
{

}
