package com.aditya.project.training.day1.lambda;

public class TestLambda {

    public static void main(String[] args) {

        MyLambda myLambda = () -> System.out.println("My Lambda");
        myLambda.add();

        MyLambda1 myLambda1 = (x, y) -> {
            int add = x + y;
            System.out.println("Add = " + add);
        };
        myLambda1.add(3, 4);

        MyLambda2 myLambda2 = (x, y) -> x + y;
        System.out.println("Add = " + myLambda2.add(200, 200));

        MyLambda3 myLambda3 = (obj, name) -> {
            obj.setName(name);
            return obj;
        };
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Aditya");
        System.out.println(employee);
        Employee updated = myLambda3.update(employee, "Adi");
        updated.display();
    }
}
