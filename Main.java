package JavaDevelopmentKit.Lesson4.HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Handbook hb = new Handbook();
        // Добавление сотрудника в справочник
        hb.add(new Worker(1, "9054758956", "Дима", 2));
        hb.add(new Worker(2, "9185214687", "Оля", 10));
        hb.add(new Worker(3, "9286524598", "Максим", 9));
        hb.add(new Worker(4, "9883651289", "Петя", 6));
        hb.addFromConsole();
        hb.printWorker();

        // Поиск 
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Поиск телефона по имени. Введите имя: ");
            String name = in.nextLine();
            System.out.println(hb.findPhoneToName(name));
            System.out.print("Поиск сотрудника по стажу. Введите стаж: ");
            int experience = in.nextInt();
            System.out.println(hb.findExperience(experience));
            System.out.print("Поиск по табельному номеру. Введите т.номер: ");
            int persNumber = in.nextInt();
            System.out.println(hb.findPersNumber(persNumber));

        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }

    }
}
