package JavaDevelopmentKit.Lesson4.HW;

public class Worker {
    public int persNumber;
    public String phoneNumber;
    public String name;
    public int experience;

    public Worker(int persNumber, String phoneNumber, String name, int experience) {
        this.persNumber = persNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public Integer getPersNumber() {
        return persNumber;

    }

    public String getPhoneNumber() {
        return phoneNumber;

    }

    public Integer getExperience() {
        return experience;

    }

    public String getName() {
        return name;

    }

    @Override
    public String toString() {
        return "Личный номер: " + persNumber + ", " + "Имя: " + name + ", " + "Тел: " + phoneNumber + ", " + "Опыт: " + experience;
    }
}