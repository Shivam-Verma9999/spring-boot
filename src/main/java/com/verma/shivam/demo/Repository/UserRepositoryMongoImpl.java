package com.verma.shivam.demo.Repository;

import com.verma.shivam.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryMongoImpl extends MongoRepository<User, String>, UserRepository  {

}
