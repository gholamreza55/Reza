package user;

import org.junit.jupiter.api.Test;
import use.User;
import use.UserDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    @Test
    void name() {
        List<User> users = new ArrayList<>();
        users.add(new User(2, "Secret", "gholamreza", "gh137"));
        users.add(new User(4, "swet", "reza", "nah137"));
        users.add(new User(6, "Secret", "alireza", "alh137"));
       // System.out.println(users);

        List<UserDto> userDtos = users.stream()
                .map((User user) -> new UserDto(user.getId(), user.getEmail(), user.getPassword()))
                .toList();
        System.out.println(userDtos);

    }
}

