package model;

public class Courses {
    int id;
    int code;
    String name;
    String description;
    int credit;

    public Courses(int id, int code, String name, String description, int credit) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.credit = credit;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredit() {
        return credit;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Courses: " +
                " Id:" + id +
                " Code: " + code +
                " Name: " + name +
                " Description: " + description +
                " Credit: " + credit;
    }
}
