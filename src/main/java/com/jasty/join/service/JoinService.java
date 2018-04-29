package com.jasty.join.service;

import com.jasty.join.model.Users;
import com.jasty.join.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class JoinService {

    //@Autowired
    @Resource(name="bCryptPasswordEncoder")
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UsersRepository usersRepository;


    //
    public void joinService(Users users){
        //System.out.println(users);
        String encodePwd = bCryptPasswordEncoder.encode(users.getPwd());
        //System.out.println(encodePwd);
        users.setPwd(encodePwd); //암호화된 비밀번호가 들어감
        //jpa의 insert
        usersRepository.save(users);


    }

}
