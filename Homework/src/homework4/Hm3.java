package homework4;

import java.util.Scanner;

class Employee {
    public Employee(String name, int age, double salary, double bonus) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.bonus = bonus;
    }

    String name;
    int age;
    double salary;
    double bonus;

    public void display() {
        System.out.println("Employee's name: " + name);
        System.out.println("Employee's age: " + age);
        System.out.println("Employee's income: " + (salary + bonus));
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input the employee's name:");
        String name = in.nextLine();
        System.out.println("Please input the employee's age:");
        int age = in.nextInt();
        System.out.println("Please input the employee's sarary:");
        double salary = in.nextDouble();
        System.out.println("Please input the employee's bonus:");
        double bonus = in.nextDouble();
        Employee employee = new Employee(name,age,salary,bonus);
        employee.display();
    }
}
