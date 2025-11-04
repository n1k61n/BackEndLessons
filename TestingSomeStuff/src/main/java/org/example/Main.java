package org.example;

class MyThread extends Thread{
    private int counter = 0;

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
            counter++;
        }
    }

    int getCounter() {
        return counter;
    }
}


class Main {


     static void main(String[] args) {
        MyThread myThread = new MyThread();
        for(int i = 0; i < 5; i++){
            myThread.start();
        }

        System.out.println(myThread.getCounter());


    }
}