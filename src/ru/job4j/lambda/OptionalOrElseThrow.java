package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOrElseThrow {
    public static class User {

        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException { }

    public static User orElseThrow(List<User> list, String login) {
        return search(list, login).orElseThrow(UserNotFoundException::new);
    }

    private static Optional<User> search(List<User> list, String login) {
        return list.stream()
                .filter(u -> u.getLogin().equals(login))
                .findFirst();
    }

    public static Optional<String> findValue(List<String> strings, String value) {
        Optional<String> rsl = Optional.empty();
        for (String word : strings) {
            if (word.equals(value)) {
                rsl = Optional.of(word);
            }
        }
        return rsl;
    }

}
