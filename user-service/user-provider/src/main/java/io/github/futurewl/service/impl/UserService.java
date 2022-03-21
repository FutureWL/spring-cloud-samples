package io.github.futurewl.service.impl;

import io.github.futurewl.service.IUserService;

public class UserService implements IUserService {

    @Override
    public String getNameById(String uid) {
        System.out.println("receive request data:" + uid);
        return "Mic";
    }

}
