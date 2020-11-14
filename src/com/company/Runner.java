package com.company;

public class Runner extends Thread {

    private Runner before;
    private Runner after;

    Runner(String name) {
        super(name);
    }

    public void setRunner(Runner before, Runner after) {
        this.after = after;
        this.before = before;
    }

    @Override
    public void run() {
        System.out.print(getName() + " берет палочку\n");
        if (getName().equals("Runner 5")) {
            System.out.print(getName() + " бежит к финишу\n");
            System.out.println(getName() + " бежит к " + before.getName());
        } else {
            System.out.println(getName() + " бежит к " + after.getName());
            try {
                after.start();
                after.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (!getName().equals("Runner 5")) {
            System.out.println(getName() + " берет палочку");
            if (!getName().equals("Runner 1")) {
                System.out.println(getName() + " бежит к " + before.getName());

            }else {
                System.out.println("забег окончен");
            }
        }
    }
}