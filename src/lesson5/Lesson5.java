package lesson5;

import service.StudentService;

import java.util.Scanner;


public class Lesson5 {
    public static void main(String[] args) {
//        StudentService service = new StudentService();
//        Student s1 = service.create("Vigen", "Gevorgyan",1987,'M',75.8,false);
//        Student s2 = service.create("Aram", "Hobosyan",1957,'M',72.1,true);
//        Student s3 = service.create("Ani", "Atoyan",2007,'F',85.8,false);
//        Student s4 = service.create("Karen", "Achoyan",1964,'M',77.2,true);
//        Student s5 = service.create("Nina", "Makaryan",2003,'F',73.4,false);


//        s1.printInfo();
//        System.out.println("----------------");
//        s2.printInfo();
//        System.out.println("-----------------");
//        s3.printInfo();
//        System.out.println("------------------");
//        s4.printInfo();
//        System.out.println("-------------------");
//        s5.printInfo();

//        service.maxStudent(s1,s2);
//        System.out.println("++++++++++++++++++++++++");
//        service.maxMark(s1,s5,s4).printInfo();
//        System.out.println("------------------------");
//        service.girlStudent(new Student[]{s1,s2,s3,s4,s5});
//        System.out.println("--------------");
//        service.YoungestGirl(new Student[] {s1,s2,s3,s4,s5}).printInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int x = scanner.nextInt();
        System.out.println("Enter secund number");
        int y = scanner.nextInt();
        System.out.println("Equal");
        System.out.println(x + y);



    }
}
