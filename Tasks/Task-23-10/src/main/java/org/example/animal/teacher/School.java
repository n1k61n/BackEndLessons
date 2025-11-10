package org.example.animal.teacher;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Teacher> teachers = new ArrayList<>();



    public void addTeacher(Teacher t){
        teachers.add(t);
    }

    public void removeTeacher(String name){
//        for(Teacher t : teachers){
//            if (t.name.equals(name)) {
//                if(teachers.remove(t)) {
//                    System.out.println("Muellim cixarildi.");
//                    break;
//                }
//            }
//        }
        int i = 0;
        while(true){
            if(teachers.get(i).name.equals(name)){
                teachers.remove(teachers.get(i));
                break;
            }
            i++;
        }
        




    }

    public void showAllTeachers(){
//        for(Teacher teacher : teachers)
//            System.out.println(teacher);
        teachers.forEach(System.out::println);
    }
}
