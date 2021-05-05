package com.aditya.project.training.day1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(12, "aBC", 90.78d),
                new Student(17, "CBC", 50.78d),
                new Student(1, "XYZ", 78.65d),
                new Student(16, "a", 78.65d),
                new Student(2, "a", 45.78d),
                new Student(2, "a", 45.78d)
        );

//        displayForEach(students);

//        Stream<Student> stream = students.stream();
//        stream.forEach(System.out::println);
//
//        System.out.println("--- Reusing stream ---");
//        stream.forEach(System.out::println);

//        displayStream(students);

//        findAllPer(students, 70).forEach(System.out::println);

//        findAllPerLimit(students, 70).forEach(System.out::println);

//        findAllByName(students, "a");

//        countStudentsPer(students, 70);

//        Optional<Student> student = findOneByName(students, "a");
//        if (student.isPresent()) {
//            System.out.println("Student with name a : " + student.get());
//        } else {
//            System.out.println("Sorry no element found!");
//        }

//        List<Student> students1 = Arrays.asList(
//                new Student(12, "aBC", new int[] { 3, 1, 2 }),
//                new Student(17, "CBC", new int[] { 3, 5, 4 }),
//                new Student(1, "XYZ", new int[] { 5, 12, 77 }),
//                new Student(16, "a", new int[] { 6, 5, 6 }),
//                new Student(2, "a", new int[] { 7, 9, 60 }),
//                new Student(2, "a", new int[] { 30, 50, 5 })
//        );
//
//        calculateTotal(students1).forEach(System.out::println);
//        calculateTotalStudent(students1).forEach(System.out::println);

        System.out.println(findAllPer(students, 70));
        System.out.println("*** Parallel Program ***");
        System.out.println(findAllPerParallel(students, 70));
    }

    public static void displayForEach(List<Student> students) {
        students.forEach(System.out::println);
    }

    public static void displayStream(List<Student> students) {
        students.stream()
                .forEach(System.out::println);
    }

    public static List<Student> findAllPer(List<Student> students, long per) {
        return students.stream()
                .filter(s -> {
                    System.out.println("Thread : " + Thread.currentThread().getName());
                    return s.getPercentage()>=per;
                }).collect(Collectors.toList());
    }

    public static List<Student> findAllPerParallel(List<Student> students, long per) {
        return students.parallelStream()
                .filter(s -> {
                    System.out.println("Thread : " + Thread.currentThread().getName());
                    return s.getPercentage()>=per;
                }).collect(Collectors.toList());
    }

    public static List<Student> findAllPerLimit(List<Student> students, long per) {
        return students.stream()
                .filter(s -> s.getPercentage()>=per)
                .limit(2)
                .collect(Collectors.toList());
    }

    public static void findAllByName(List<Student> students, String name) {
        students.stream()
                .filter(s -> s.getName().equals(name))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    public static void countStudentsPer(List<Student> students, long per) {
        long count = students.stream()
                .filter(s -> s.getPercentage()>=per)
                .count();
        System.out.println("Count : " + count);
    }

    public static Optional<Student> findOneByName(List<Student> students, String name) {
        return students.stream()
                .filter(s -> s.getName().equals(name))
                .findAny();
    }

    public static List<Integer> calculateTotal(List<Student> students) {
        return students.stream()
                .map(s -> {
                    int total = 0;
                    for (int mark: s.getMarks()) {
                        total += mark;
                    }
                    return total;
                }).collect(Collectors.toList());
    }

    public static List<Student> calculateTotalStudent(List<Student> students) {
        return students.stream()
                .map(s -> {
                    int total = 0;
                    for (int mark: s.getMarks()) {
                        total += mark;
                    }
                    s.setPercentage(total);
                    return s;
                }).collect(Collectors.toList());
    }
}
