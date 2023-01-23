package use;

import org.w3c.dom.Node;
import org.w3c.dom.UserDataHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUser {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(2, "Secret", "gholamreza", "gh137"));
        users.add(new User(4, "swet", "reza", "nah137"));
        users.add(new User(6, "Secret", "alireza", "alh137"));

        List<UserDto> userDtos = new ArrayList<>();

        for (User user : users) {
            userDtos.add(new UserDto(user.getId(), user.getUseName(), user.getEmail()));
        }
        userDtos.forEach(System.out::println);
        System.out.println("----------------------------");

        List<UserDto> collect = users.stream()
                .map((User user) -> new UserDto(user.getId(), user.getUseName(), user.getEmail()))
                .toList();
        collect.forEach(System.out::println);

    }
    }





