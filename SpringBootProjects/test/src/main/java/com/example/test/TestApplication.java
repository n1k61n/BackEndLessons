package com.example.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);

	}


    public static int[] getSize(int w,int h,int d) {
        //To-Do
        int volume = w * h * d;
        int area = 2*(w*h+w*d+h*d);
        return new int[]{area, volume};
    }
}
