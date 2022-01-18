package org.example;

public class Task {

    public static void main(final String[] args) {
        System.out.println("org.example.Task called with args:");

        for (final String arg : args) {
            System.out.println("  " + arg);
        }
    }
}
