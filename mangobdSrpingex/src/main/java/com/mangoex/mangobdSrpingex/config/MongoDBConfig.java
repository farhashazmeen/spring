package com.mangoex.mangobdSrpingex.config;


import com.mangoex.mangobdSrpingex.document.Users;
import com.mangoex.mangobdSrpingex.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository){
        return strings -> {
            usersRepository.save(new Users(1,"Fara",200L));
            usersRepository.save(new Users(2,"Shazmeen",500L));
        };
        }
}
