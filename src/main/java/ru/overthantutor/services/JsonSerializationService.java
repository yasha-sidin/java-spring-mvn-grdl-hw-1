package ru.overthantutor.services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class JsonSerializationService<T> {
    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public String serialize(T obj) {
        return gson.toJson(obj);
    }

    public T deserialize(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }
}
