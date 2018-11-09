package com.mangoex.mangobdSrpingex.resource;

import com.mangoex.mangobdSrpingex.document.Users;
import com.mangoex.mangobdSrpingex.repository.UsersRepository;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UsersRepository usersRepository;

    public UsersResource(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }
    @GetMapping("/all")
    public List<Users> getAll(){
        return usersRepository.findAll();
    }


}
