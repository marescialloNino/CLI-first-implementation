package com.nicola.user;


import java.util.UUID;

public class UserDao {
    private static final User[] users;

    static {
        users = new User[]{
                new User(UUID.randomUUID(),"Nicola"),
                new User(UUID.randomUUID(),"Gabriele"),
                new User(UUID.randomUUID(),"Giorgia"),
                new User(UUID.randomUUID(),"Stefano"),
                new User(UUID.randomUUID(),"Federica"),
                new User(UUID.randomUUID(),"Alessia")
        };
    }

    public static User[] getUsers() {
        return users;
    }
}
