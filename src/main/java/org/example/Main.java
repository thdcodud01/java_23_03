package org.example;

public class Main {
    public static void main(String[] args) {
        // 프로그램의 시작점
         // System.out.println -> 출력 명령어 (=console.log("")) & . 은 ~의 와 같은 의미
        int age = 50;
        System.out.println("당신의 나이 : " + age);

        if (age>=20 && age<=34) {
            System.out.printf("청년입니다.");
        } else {
            System.out.printf("청년이아닙니다.");
        }
        // 프로그램의 끝점
    }
}