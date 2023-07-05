package lessons.print;

import java.util.Scanner;
import java.lang.System;
// System является глобальным классом и нет смысла импортировать его. Но знать нужно!
// import java.lang.System;

public class Print {
    public static void ask() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя?");
        String name = scan.nextLine();
        System.out.println("Ваше имя " + name);
        System.out.println("Сколько вам лет?");
        byte age = scan.nextByte();
        System.out.println("Вам " + age + " лет");
    }
}

