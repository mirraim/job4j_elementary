package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> preAddress = person -> person.getAddress().contains(key);
        Predicate<Person> preName = person -> person.getName().contains(key);
        Predicate<Person> prePhone = person -> person.getPhone().contains(key);
        Predicate<Person> preSurname = person -> person.getSurname().contains(key);
        Predicate<Person> combine = preAddress
                .or(preName)
                .or(prePhone)
                .or(preSurname);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
