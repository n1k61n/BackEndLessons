package org.example.school;

import java.util.ArrayList;
import java.util.List;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();


    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void removeTeacher(String name){
        teachers.remove();
    }
}
