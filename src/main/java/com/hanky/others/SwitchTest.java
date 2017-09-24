package com.hanky.others;

public class SwitchTest {
    public static void main(String[] args) {
        String a = "T1";
        switch (a){
            case "T0":
                System.out.println("1");
                break;
            case "T1":
                System.out.println("2");
                break;
            default:
                System.out.println("3");
        }
    }
}
