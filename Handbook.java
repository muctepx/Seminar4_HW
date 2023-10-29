package JavaDevelopmentKit.Lesson4.HW;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник
 */
public class Handbook {
    private ArrayList<Worker> hb;

    public Handbook() {
        hb = new ArrayList<>();
    }

    public void add(Worker worker) {

        this.hb.add(worker);
    }

public void addFromConsole(){

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите name: ");
            String name = in.next();
            System.out.print("Введите phoneNumber: ");
            String phoneNumber = in.next();
            System.out.print("Введите experience: ");
            int experience = in.nextInt();
            System.out.print("Введите persNumber: ");
            int persNumber = in.nextInt();

            hb.add(new Worker(persNumber, phoneNumber, name, experience));
        } catch (Exception e) {
            System.out.println(e.getStackTrace());

        }}


    public void printWorker() {
        for (Worker w : hb) {
            System.out.println(w);
        }
    }

    public ArrayList<Worker> showWorkers() {
        return hb;
    }

    public ArrayList<Worker> findExperience(Integer experience) {
        ArrayList<Worker> list = new ArrayList<>();
        for (Worker w : this.showWorkers()) {
            if (w.getExperience() == experience) {
                list.add(w);
            }
        }
        return list;
    }

    public ArrayList<String> findPhoneToName(String name) {
        ArrayList<String> list = new ArrayList<>();
        for (Worker w : this.showWorkers()) {
            if (w.getName() == name) {
                list.add(w.getPhoneNumber());
            }
        }
        return list;
    }

    public Worker findPersNumber(Integer persNumber) {
        for (Worker w : this.showWorkers()) {
            if (w.getPersNumber() == persNumber) {
                return w;
            }
        }
        return null;
    }
}
