/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ques6;
//This is for question5 
/**
 *
 * @author S541669
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("Sudhakar","603 East 7th Street","9442345679","sudhakar@gmail.com");
        Student student = new Student("S", "Sanjay","611 east 7th street","6605280529","sanj@gmail.com");
        Employee employee = new Employee("aramark office",3556,"02-11-2020","Saripalli","781 south street","5674930202","saripalli@yahoo.com");
        Faculty faculty = new Faculty(4,2,"cs department",4500,"12-11-2018","Pradeep","1234 W st","213454321","raja@gmail.com");
        Staff staff = new Staff("Professor","Library Office",1090,"01-12-2015","Charles","no st for me","1234567890","charles@nomail.com");
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);

    }
    
}
