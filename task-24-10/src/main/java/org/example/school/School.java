package org.example.school;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class School {
    List<Teacher> teachers = new ArrayList<Teacher>();



    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void removeTeacher(String name){
        if (teachers.removeIf(teacher -> teacher.name.equalsIgnoreCase(name))){
            System.out.println("Muellim silindi");
        }
        else{
            System.out.println("Muellim tapilmadi");
        }

    }


    public void showAllTeachers(){
        for(Teacher teacher : teachers)
            teacher.info();
    }
}
