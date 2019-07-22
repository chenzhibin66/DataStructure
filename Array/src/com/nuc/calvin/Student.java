package com.nuc.calvin;

/**
 * @author Calvin
 * @Description:
 */
public class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {

        Array<Student> array = new Array<>();
        array.addLast(new Student("czb",100));
        array.addLast(new Student("wyf",100));
        array.addLast(new Student("WTR",100));
        System.out.println(array.toString());
    }
}
