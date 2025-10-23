package org.example.animal.student;

import java.util.ArrayList;
import java.util.List;

public class Group {
    List<Student> students;

    public Group() {
        students = new ArrayList<>();
    }

    public  void addStudent(Student student){
        students.add(student);
    }

    public void showAll(){
        for(Student student : students) {
            student.getInfo();
        }
    }

    public double getAverageGrade(){
        double sum = 0;
        for(Student s : students){
            sum += s.getGrade();
        }

        return sum / students.size();
    }
}
