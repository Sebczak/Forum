package com.company.Repository;

import com.company.Model.ForumUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ForumUserRepo extends MongoRepository<ForumUser, String> {
}
