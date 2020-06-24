package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double avgPost1 = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avgPost1);

        double avgPost2 = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avgPost2);
    }
}
