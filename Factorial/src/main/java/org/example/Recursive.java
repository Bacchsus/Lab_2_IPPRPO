package org.example;

public class Recursive {

    public long recursive(int number) {
        if(number <= 1) {
            return 1;
        }
        else {
            return number * recursive(--number);
        }
    }
}
