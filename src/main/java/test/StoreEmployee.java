package test;

import java.io.*;
import java.util.Scanner;

public class StoreEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter emp details :");
        Employee employee = new Employee();
        employee.setEmpId(scanner.nextInt());
        employee.setEmpName(scanner.next());
        employee.setDeptNo(scanner.nextInt());
        FileOutputStream fileOutputStream = new FileOutputStream("C://file//EmployeeData.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        System.out.println("Object Written");

        FileInputStream fileInputStream = new FileInputStream("C://file//EmployeeData.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee emp = (Employee) objectInputStream.readObject();
        System.out.println("Object Returned :"+emp.getEmpName()+emp.getEmpId()+emp.getDeptNo());
    }
}
