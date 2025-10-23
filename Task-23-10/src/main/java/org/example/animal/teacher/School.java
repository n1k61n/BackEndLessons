package org.example.animal.teacher;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Teacher> teachers = new ArrayList<>();


//    public School() {
//        teachers = new ArrayList<>();
//    }

    public void addTeacher(Teacher t){
        teachers.add(t);
    }

    public void removeTeacher(String name){
        for(Teacher t : teachers){
            if (t.name.equals(name)) {
                if(teachers.remove(t)) {
                    System.out.println("Muellim cixarildi.");
                    return;
                }
            }
        }
        System.out.println("Müəllim tapılmadı: " + name);
    }

    public void showAllTeachers(){
        for(Teacher teacher : teachers)
            teacher.info();
    }
}
