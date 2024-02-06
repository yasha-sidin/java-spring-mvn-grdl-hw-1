package ru.overthantutor;

import ru.overthantutor.domen.Person;
import ru.overthantutor.services.JsonSerializationService;

public class Main {
    public static void main(String[] args) {
        JsonSerializationService<Person> service = new JsonSerializationService<>();
        Person person = new Person("Pitt", "Brad", 50);
        System.out.println(person);
        String json = service.serialize(person);
        System.out.println(json);
        System.out.println(service.deserialize(json, Person.class));
    }
}
