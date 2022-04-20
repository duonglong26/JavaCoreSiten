package com.nduonglong02.unit06.program;

public class PrintNumber implements Runnable {

//    private int number = 1;
    private Integer number = Integer.valueOf(1);
    private boolean alive = true;

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        synchronized (number) {
            while (number < 30) {
                try {
                    number++;
                    System.out.println(current.getName() + " number is \'" + number + "\'");
                    Thread.sleep(300);
                    if (number % 13 == 0) break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(current.getName() + " is stopped!");
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getNumber() {
        return number;
    }
}
