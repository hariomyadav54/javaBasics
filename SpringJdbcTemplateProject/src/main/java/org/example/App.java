package org.example;

import org.example.entity.model.Employee;
import org.example.repository.EmployeeDao;
import org.example.repository.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = (Employee) applicationContext.getBean("std1");
        EmployeeDao studentDao =(EmployeeDao)applicationContext.getBean("dao");
        int count = 0,counter=0;
        Scanner sc = new Scanner(System.in);
        while (1!=counter) {

            System.out.println("Welcome to employeeDetails Database Using JdbcTemplate");

            //   System.out.println("Enter 1 to see of particular employee the details");
            System.out.println("Enter 2 to insert the details");
            System.out.println("Enter 3 to update the details");
            System.out.println("Enter 4 to delete the details");
            System.out.println("Enter 5 to see all employee details");
            System.out.println("Enter 6 to update Name of employee details");
            System.out.println("Enter 7 to update LastName of employee details");
            System.out.println("Enter 8 to update Mobile No of employee details");
            System.out.println("Enter 9 to update Address of employee details");
            System.out.println("Enter 10 for exists");
            try {
                count = Integer.parseInt(sc.next());
            } catch (NumberFormatException ex) {
                System.out.println("Enter the given option");
            }
            switch (count) {
                case 1:
                    System.out.println("Enter Employee Id to see the details");
                    studentDao.findById(Integer.parseInt(sc.next()));
                    break;
                case 2:
                    System.out.print("Enter the employee Id :");
                    employee.setId(Integer.parseInt(sc.next()));
                    System.out.print("Enter the employee Name :");
                    employee.setName(sc.next());
                    System.out.print("Enter the employee Lastname :");
                    employee.setLastname(sc.next());
                    System.out.print("Enter the employee Address:");
                    employee.setAddress(sc.next());
                    System.out.print("Enter the employee MobileNo:");
                    employee.setMobileNo(sc.nextLong());
                    int i = studentDao.save(employee);
                    if (i > 0) {
                        System.out.println(i);
                        System.out.println("Data is Successfully Inserted");
                    } else System.out.println("Inserted employee already present");
                    break;

                case 3:
                    System.out.println("please Enter your existing id");
                    employee.setId(Integer.parseInt(sc.next()));
                    System.out.print("Enter the new  employee Name for update Employee Name");
                    employee.setName(sc.next());
                    System.out.print("Enter the new employee Lastname for update Employee LastName");
                    employee.setLastname(sc.next());
                    System.out.print("Enter the new employee Address for update Employee Address");
                    employee.setAddress(sc.next());
                    System.out.print("Enter the new employee MobileNo for update Employee MobileNo");
                    employee.setMobileNo(sc.nextLong());
                    boolean check1 = studentDao.updateById(employee);
                    if (check1) {
                        System.out.println("Employee details  is successfully updated");
                    } else {
                        System.out.println("Employee details  is not successfully updated");
                    }
                    break;
                case 4:
                    System.out.println("please Enter the Employee id to delete existing employee information");
                    employee.setId(Integer.parseInt(sc.next()));
                    boolean check2 = studentDao.delete(employee.getId());
                    if (check2) {
                        System.out.println("Employee details  is successfully deleted");
                    } else {
                        System.out.println("Employee details  is not successfully deleted");
                    }
                    break;
                case 5:
                    System.out.println("Please wait to see the all employee details");
                    List<Employee> students;
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    List<Employee> students1 = studentDao.findAll();
                    for (Employee s : students1)
                        System.out.println(s);
                    System.out.println();
                    System.out.println();
                    System.out.println();;
                    break;
                case 6:
                    System.out.println("please Enter your existing id");
                    employee.setId(Integer.parseInt(sc.next()));
                    System.out.print("Enter the new  employee Name for update Employee Name:");
                    employee.setName(sc.next());
                    boolean check3 = studentDao.updateName(employee.getId(),employee.getName());
                    if (check3) {

                        System.out.println("Employee Name  is successfully Updated");
                    } else {
                        System.out.println("Employee Name is not successfully Updated");
                    }
                    break;
                case 7:
                    System.out.println("please Enter your existing id");
                    employee.setId(Integer.parseInt(sc.next()));
                    System.out.print("Enter the  new surname  for update employee Surname:");
                    employee.setLastname(sc.next());
                    boolean check4 = studentDao.updateName(employee.getId(),employee.getLastname());
                    if (check4) {
                        System.out.println("Employee LastName  is successfully Updated");
                    } else {
                        System.out.println("Employee LastName  is not successfully Updated");
                    }
                    break;
                case 8:
                    System.out.println("please Enter your existing id");
                    employee.setId(Integer.parseInt(sc.next()));
                    System.out.print("Enter the  new Mobile No  for update employee MobileNo:");
                    employee.setMobileNo(sc.nextLong());
                    boolean check5 = studentDao.updateMobileNo(employee.getId(),employee.getMobileNo());
                    if (check5) {
                        System.out.println("Employee Mobile No  is successfully Updated");
                    } else {
                        System.out.println("Employee Mobile No is not successfully Updated");
                    }
                    break;
                case 9:
                    System.out.println("please Enter your existing id");
                    employee.setId(Integer.parseInt(sc.next()));
                    System.out.print("Enter the  new Address  for update employee Address:");
                    employee.setAddress(sc.next());
                    boolean check6 = studentDao.updateAddress(employee.getId(),employee.getAddress());
                    if (check6) {
                        System.out.println("Employee Address  is successfully Updated");
                    } else {
                        System.out.println("Employee Address is not successfully Updated");
                    }
                    break;

                case 10:
                    counter++;
                    break;
                default:
                    System.out.println("Please Enter Valid Number");
                    break;
            }
        }
    }
}