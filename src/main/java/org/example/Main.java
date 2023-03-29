package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

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

//        duck Aduck = new duck();
//        Aduck.fly();
//
//        blueduck Ablueduck = new blueduck();
//        Ablueduck.fly();
//
//        whiteduck Awhiteduck = new whiteduck();
//        Awhiteduck.fly();
//
//        rubberduck Arubberduck = new rubberduck();
//        Arubberduck.fly();
//
//        rubberduck2 Arubberduck2 = new rubberduck2();
//        Arubberduck2.fly();
//        weapon Aweapon = new sword(); //형변환 시킨 것
//        sword Asword = new sword();
//        Asword = new bow(); //bow라는 아이가 형변환이 일어나서 부모로 들어올수 있었던 것
//        Aweapon.attack();
//        Aweapon.defense();
//        TV Aremotecontrol = new SamsungTV();
//        Aremotecontrol.channelup();
//        worrier Aworrier = new worrier();
//        Aworrier.attack("Brian", "sword");
//        Aworrier.reattack();
//        Aworrier.attack("Phillp", "spear");
//        Aworrier.attack("Mark", "cane");
//        Aworrier.reattack();
//        Aworrier.reattack();

//        Aworrier.attack("brian", "sword");
//        Aworrier.attack("phiilp", "spear");
//        Aworrier.attack("mark", "cane");
//
//        xiaomiTV AxiaomiTV = new xiaomiTV();
//        samsungTV AsamsungTV = new samsungTV();
//        lgTV AlgTV = new lgTV();
//        normalTV AnormalTV = new normalTV();
//
//        AnormalTV = new xiaomiTV();
//        AnormalTV.on();
//        AnormalTV.off();
//
//        AnormalTV = new samsungTV();
//        AnormalTV.on();
//        AnormalTV.off();
//
//        AnormalTV = new lgTV();
//        AnormalTV.on();
//        AnormalTV.off();

//    Ferrari AFerrari  = new Ferrari();
//    car Acar = (car)AFerrari;
//    Acar =  AFerrari;
//    Ferrari AFerrari2 = (Ferrari)Acar;
//    AFerrari2.top_open();
//    warrior Awarrior = new warrior(); //Awarrior.Asword = new sword();
//    Awarrior.name = "카니";
//    Awarrior.age = 22;
//    Awarrior.Aweapon = new sword();
//    Awarrior.attack();
//
//    Awarrior.name = "초코";
//    Awarrior.Aweapon = new bow(); // weapon Aweapon; 과 같음
//    Awarrior.attack();

//        person Aperson = new person();
//        Aperson.run_speed = 20;
//        Aperson.run();
//        Aperson.run_speed = 50;
//        Aperson.run();
//        warrior Awarrior = new warrior();
//        String name = "칸";
//        Awarrior.name = name;
//        Awarrior.age = 20;
//        Awarrior.introduce();
//        Awarrior.age++;
//        Awarrior.introduce();
//        Awarrior.age = 30;
//        Awarrior.name = "카니";
//        Awarrior.introduce();
//        Awarrior.Aweapon = new bow();
//        Awarrior.attack();
//        // 출력 : 카니가 활로 공격합니다.
//        Awarrior.Aweapon = new sword();
//        Awarrior.attack();
//        // 출력 : 카니가 칼로 공격합니다.
//        person Aperson = new person();
//        Aperson.age = 10;
//        Aperson.leftarm = new arm();
//        System.out.println(Aperson.leftarm.length + "cm");
//        soldier Asoldier = new soldier();
//        Asoldier.name = "scy";
//
//        Asoldier.introduce();
//        // 안녕하세요. 저는 홍길동 이병 입니다.
//        Asoldier.attack();
//        // 홍길동 이병이 공격합니다.(공격력 : 7)
//
//        Asoldier.promote();
//
//        Asoldier.introduce();
//        // 안녕하세요. 저는 홍길동 일병 입니다.
//        Asoldier.attack();
//        // 홍길동 일병이 공격합니다.(공격력 : 9)
//
//        Asoldier.promote();
//
//        Asoldier.introduce();
//        // 안녕하세요. 저는 홍길동 상병 입니다.
//        Asoldier.attack();
//        // 홍길동 상병이 공격합니다.(공격력 : 11)
//        warriar Awarriar = new h();
//        Awarriar.Aweapon = new bow();
//
//        Awarriar.attack();
//
//        Awarriar = new hs();
//        Awarriar.attack();
//
//        Awarriar.Aweapon = new spear();
//        Awarriar.attack();
//        blueduck Ablueduck = new blueduck();
//        Ablueduck.fly();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        whiteduck Awhiteduck = new whiteduck();
//        Awhiteduck.fly();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        rubberduck Arubberduck = new rubberduck();
//        Arubberduck.fly();
//        // 출력 : 저는 날 수 없어요. ㅜㅠ
//
//        rubberduck2 Arubberduck2 = new rubberduck2();
//        Arubberduck2.fly();
//        // 출력 : 저는 날 수 없어요. ㅜㅠ
//        System.out.println("== person object start generate ==");
//        new person();
//        System.out.println("== person object end generate");
//
//        System.out.println("== blueduck object start generate ==");
//        new blueduck();
//        System.out.println("== blueduck object end generate");
//        person Aperson = new person();
//        Aperson.setId(23);
//        System.out.println("my number is " + Aperson.getId());
//        Person person1 = new Person("dong", 22);
//        Person person2 = new Person("soon", 23);
//        System.out.println(person1.toString()); // 문자열로 치환되는 함수
//        System.out.println(person2);
//        String str = "axslekjxxlkzjxkljxxXXXssjxxXXxxX";
//
//        int xCount = 0;
//        for(int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'x') {
//                xCount++;
//            }
//        }
//        System.out.println("xCount : " + xCount);
//        int[]array = new int[3];
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        System.out.println(array[0] + array[1] + array[2]);
//        System.out.println(array.length);
//
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        arr.add(10);
//        arr.add(20);
//        arr.add(30);
//        arr.add(40);
//        arr.add(50);
//        System.out.println(arr.get(0) + arr.get(1) + arr.get(2) + arr.get(3) + arr.get(4));
//        System.out.println(arr.size());
//        arr.add(60);
//        System.out.println(arr.size());
//        arr.add(70);
//        System.out.println(arr.size());
//
//        HashMap<String, Integer> arrMap = new HashMap<String, Integer>();
//        arrMap.put("영희", 10);
//        arrMap.put("철수", 20);
//        arrMap.put("길동", 30);
//
//        System.out.println("영희의 나이는" + arrMap.get("영희"));
//        System.out.println("철수의 나이는" + arrMap.get("철수"));
//        System.out.println("길동의 나이는" + arrMap.get("길동"));
        Person person1 = new Person("dong", 22, 170.5);
        Person person2 = new Person("soon", 25, 162.4);
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

//class duck {
//    void fly () {
//        System.out.println("duck is fly to wings");
//    }
//}
//class blueduck extends duck {
//
//}
//class whiteduck extends duck {
//
//}
//class rubberduck extends duck {
//    void fly () {
//        System.out.println("rubberduck can't fly to wings");
//    }
//}
//class rubberduck2 extends rubberduck {
//
//}

//class weapon {
//    void attack () {
//
//    }
//    void defense () {
//
//    }
//}
//class sword extends weapon {
//    void attack () {
//        System.out.println("attack by sword");
//    }
//    void defense () {
//        System.out.println("defense by sword");
//    }
//}
//class bow extends sword {
//
//}

//class TV {
//    void channelup () {
//
//    }
//}
//class SamsungTV extends TV {
//    void channelup () {
//        System.out.println("channelup");
//    }
//}

//class worrier {
//    String name; //class 의 세상 안에서는 전역변수인 꼴 (instance 변수)
//    String weapon;
//    void attack (String name, String weapon) {
//        this.name = name;
//        this.weapon = weapon;
//        System.out.println(this.name + "(이)가" + this.weapon + "(으)로 공격합니다."); //매개변수 받은대로 나온 것
//    }
//    void reattack () {
//        System.out.println(this.name + "(이)가" + this.weapon + "(으)로 공격합니다.");
//    }
//}
//
//class worrier {
//    void attack (String name, String weapon) {
//        System.out.printf("%s 가 %s 로 공격합니다.\n", name, weapon);
//    }
//}
//class normalTV {
//    void on() {
//
//    }
//    void off() {
//
//    }
//}
//class xiaomiTV extends normalTV {
//    void on () {
//        System.out.println("xiaomiTV on");
//    }
//    void off () {
//        System.out.println("xiaomiTV off");
//    }
//    void vr () {
//        System.out.println("vr on");
//    }
//}
//class samsungTV extends normalTV {
//    void on () {
//        System.out.println("samsungTV on");
//    }
//    void off () {
//        System.out.println("samsungTV off");
//    }
//    void ar () {
//        System.out.println("ar on");
//    }
//}
//class lgTV extends normalTV {
//    void on () {
//        System.out.println("lgTV on");
//    }
//    void off () {
//        System.out.println("lgTV off");
//    }
//    void change () {
//        System.out.println("gamemode change");
//    }
//}
//class car {
//    void run () {
//
//    }
//    void stop () {
//
//    }
//}
//class Ferrari extends car {
//    void top_open () {
//        System.out.println("top_open");
//    }
//}
//class warrior {
//    String name;
//    int age;
//    weapon Aweapon;
//    void attack () {
//        Aweapon.work(this.name);
//    }
//}
//abstract class weapon {
//    abstract void work (String name);
//}
//class sword extends weapon {
//    void work (String name) {
//        System.out.println(name + "가 칼로 공격합니다");
//    }
//
//}
//class bow extends weapon {
//    void work (String name) {
//        System.out.println(name + "가 활로 공격합니다");
//    }
//}
//class person {
//    int run_speed;
//    void run () {
//        System.out.println("human is running " + this.run_speed + "km/h");
//    }
//}
//class warrior {
//    // 인스턴스 변수
//    String name;
//    // 인스턴스 변수
//    int age;
//    // 인스턴스 변수
//    weapon Aweapon;
//    void attack () {
//        Aweapon.username = this.name;
//        Aweapon.work();
//    }
//    void introduce() {
//        System.out.println("Hello I am " + this.age + "age" + this.name + ".");
//    }
//}
//
//class weapon {
//    String username;
//    void work () {
//
//    }
//}
//
//class sword extends weapon {
//    void work () {
//        System.out.println(this.username + "is attack by sword");
//    }
//}
//
//class bow extends weapon {
//    void work () {
//        System.out.println(this.username + "is attack by bow");
//    }
//}
//class person {
//    int age;
//    arm leftarm;
//}
//class arm {
//    int length;
//    arm () {
//        this.length = 100;
//    }
//}
//class soldier {
//    String name;
//    int level_num;
//    soldier() {
//        level_num = 1;
//    }
//
//    int getpower() {
//        int power = 0;
//
//        if ( level_num == 1 ) {
//            power = 7;
//        }
//        else if ( level_num == 2 ) {
//            power = 9;
//        }
//        else if ( level_num == 3 ) {
//            power = 11;
//        }
//
//        return power;
//    }
//
//    String getlevel() {
//        String level = "";
//
//        if ( level_num == 1 ) {
//            level = "이병";
//        }
//        else if ( level_num == 2 ) {
//            level = "일병";
//        }
//        else if ( level_num == 3 ) {
//            level = "상병";
//        }
//
//        return level;
//    }
//
//    void introduce() {
//        System.out.println("안녕하세요. 저는 " + this.name + " " + this.getlevel() + " 입니다.");
//    }
//
//    void attack() {
//        System.out.println(this.name + this.getlevel()+ "이 공격합니다.(공격력 : " + this.getpower() + ")");
//    }
//
//    void promote() {
//        level_num++;
//    }
//}
//class warriar {
//    String name;
//    weapon Aweapon;
//    warriar() {
//        this.Aweapon = new sword();
//    }
//    void attack() {
//        this.Aweapon.name = this.name;
//        this.Aweapon.attack();
//    }
//}
//class h extends warriar {
//    h() {
//        this.name = "h";
//    }
//}
//class hs extends warriar {
//    hs() {
//        this.name = "hs";
//    }
//}
//abstract class weapon {
//    String name;
//    abstract void attack();
//}
//class bow extends weapon {
//    void attack() {
//        System.out.println(this.name + " attack by bow");
//    }
//}
//class sword extends weapon {
//    void attack() {
//        System.out.println(this.name + " attack by sword");
//    }
//}
//class spear extends weapon {
//    void attack() {
//        System.out.println(this.name + " attack by spear");
//    }
//}
//class duck {
//    fly_item Afly_item;
//    void fly() {
//        Afly_item.work();
//    }
//}
//
//class whiteduck extends duck {
//    whiteduck () {
//        this.Afly_item = new fly_item();
//    }
//}
//
//class blueduck extends duck {
//    blueduck () {
//        this.Afly_item = new fly_item();
//    }
//}
//
//class rubberduck extends duck {
//    rubberduck () {
//        this.Afly_item = new canfly_item();
//    }
//}
//
//class rubberduck2 extends duck {
//    rubberduck2 () {
//        this.Afly_item = new cantfly_item();
//    }
//}
//class fly_item {
//    void work() {
//
//    }
//
//}
//class canfly_item extends fly_item {
//    void work() {
//        System.out.println("duck fly to wings");
//    }
//}
//class cantfly_item extends fly_item {
//    void work() {
//        System.out.println("can't fly");
//
//    }
//}
//
//class bio {
//    bio() {
//        System.out.println("bio generate");
//    }
//}
//class animal extends bio{
//    animal() {
//        System.out.println("animal generate");
//    }
//}
//class person extends animal{
//    person() {
//        super();
//        System.out.println("person generate");
//    }
//}
//class duck extends animal {
//    duck() {
//        System.out.println("duck generate");
//    }
//}
//class blueduck extends duck {
//    blueduck() {
//        System.out.println("blueduck generate");
//    }
//}
//class person {
//    private int id; //private -> 외부로 공개x
//    void setId(int id) {
//        this.id = id;
//    }
//    int getId() {
//        return this.id;
//    }
//}
//class Person extends Object {
//    String name;
//    int age;
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public String toString() { //override -> 기본으로 제공하는 method도 override 가능
//        return name + '/' + age; //object 안에 내장되어있는
//    }
//}
class Person {
    String name;
    int age;
    double height;
    Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

}
