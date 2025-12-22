package org.example;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    // Переопределение equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;                      // Быстрая проверка на идентичность
        if (o == null || getClass() != o.getClass())     // Проверка на null и совпадение классов
            return false;
        Person person = (Person) o;                      // Приведение типа
        return age == person.age &&                      // Сравнение примитивов
                Objects.equals(name, person.name);        // Сравнение объектов (null-safe)
    }

    // Переопределение hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, age);                  // Генерация хэша по тем же полям
    }
}