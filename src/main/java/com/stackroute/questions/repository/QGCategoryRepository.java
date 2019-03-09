package com.stackroute.questions.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.questions.domain.Category;

@Repository
public interface QGCategoryRepository extends MongoRepository<Category, Integer> {

	Category findByCategoryName(String categoryName);

	Category findByCategoryId(int categoryId);

}
