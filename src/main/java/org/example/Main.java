package org.example;

public class Main {
    public static void main(String[] args) {
//        Person PersonA = new Person();
//        PersonA.age = 200;
//        PersonA.averageAge += PersonA.age;
//
//        Person PersonB = new Person();
//        PersonB.age = 100;
//        PersonB.averageAge += PersonB.age;
//
//        Person PersonC = new Person();
//        PersonC.age = 300;
//        PersonC.averageAge += PersonC.age;
//
//        Person.IntroduceAverageAge();

//        Calculator calculator = new Calculator();
//        calculator.plus(8, 2); //return 값 없을때 사용
//        calculator.minus(8, 2);
//        calculator.multiple(8, 2);
//        calculator.divide(8, 2);

//        System.out.println(calculator.plus(8, 2));
//        System.out.println(calculator.minus(8, 2));
//        System.out.println(calculator.multiple(8, 2));
//        System.out.println(calculator.divide(8, 2));
//        System.out.println("1부터 n까지의 합산 값: " + "=" + calculator.sum(2,4));
//        blackCat AblackCat = new blackCat();
//        AblackCat.breathe();
//
//        whiteCat AwhiteCat = new whiteCat();
//        AwhiteCat.run();
//
//        greyCat AgreyCat = new greyCat();
//        AgreyCat.run();
        duck Aduck = new duck();
        Aduck.fly();

        blueduck Ablueduck = new blueduck();
        Ablueduck.fly();

        whiteduck Awhiteduck = new whiteduck();
        Awhiteduck.fly();

        rubberduck Arubberduck = new rubberduck();
        Arubberduck.fly();

        rubberduck2 Arubberduck2 = new rubberduck2();
        Arubberduck2.fly();

    }
}

//class Person {
//    int age;
//    static int averageAge;
//    void introduce() {
//        System.out.println("제 나이는 " + this.age + "살 입니다.");
//    }
//    static void IntroduceAverageAge() {
//        System.out.println("인류평균나이는 " + averageAge / 3 + "살 입니다.");
//    }
//
//}

//class Calculator {
//    int plus (int a, int b) {
//        //System.out.println("plus: " + (a + b)); //void사용시
//        return a + b; //void는 return 값이 없는 함수라 int 사용
//    }
//    int minus (int a, int b) {
//        //System.out.println("minus: " + (a - b));
//        return a - b;
//    }
//    int multiple (int a, int b) {
//        //System.out.println("multiple: " + (a * b));
//        return a * b;
//    }
//    int divide (int a, int b) {
//        //System.out.println("divide: " + (a / b));
//        return a / b;
//    }
//    int sum (int n, int m) {
//        int sum = 0;
//        for (int i = n; i <= m; i++) {
//            sum += i;
//        }
//        return sum;
//    }
//}

//class cat {
//    void breathe () {
//        System.out.println("breathe");
//    }
//    void run () {
//        System.out.println("run");
//    }
//    void jump () {
//        System.out.printf("jump");
//    }
//    void choice () {
//        System.out.println("choice");
//    }
//}
//class blackCat extends cat {
//    void future () {
//        System.out.println("future");
//    }
//}
//
//class whiteCat extends cat {
//    void increase () {
//        System.out.println("increase");
//    }
//}
//
//class greyCat extends cat {
//    void run () { //오버라이드 : 상속에서 부모에 있는 자료가 자식에도 동일하게 있다면 자식이 우선임 (재정의)
//        System.out.println("greyCat run");
//    }
//}
class duck {
    void fly () {
        System.out.println("duck is fly to wings");
    }
}
class blueduck extends duck {

}
class whiteduck extends duck {

}
class rubberduck extends duck {
    void fly () {
        System.out.println("rubberduck can't fly to wings");
    }
}
class rubberduck2 extends rubberduck {

}