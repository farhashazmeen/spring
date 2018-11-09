package com.mangoex.mangobdSrpingex.repository;

import com.mangoex.mangobdSrpingex.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users,Integer> {


}
