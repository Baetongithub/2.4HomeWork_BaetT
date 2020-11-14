package com.company;

public class Main {

    public static void main(String[] args) {
        Runner runer1 = new Runner("Runner 1");
        Runner runer2 = new Runner("Runner 2");
        Runner runer3 = new Runner("Runner 3");
        Runner runer4 = new Runner("Runner 4");
        Runner runer5 = new Runner("Runner 5");


        runer1.setRunner(runer5,runer2);
        runer2.setRunner(runer1,runer3);
        runer3.setRunner(runer2,runer4);
        runer4.setRunner(runer3,runer5);
        runer5.setRunner(runer4,runer1);
        runer1.start();
    }
}
