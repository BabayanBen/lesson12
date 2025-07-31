package service;

import lesson5.Student;

public class StudentService {

    public Student create(String name, String surname, int year, char gender, double mark, boolean PHD) {

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setYear(year);
        student.setGender(gender);
        student.setMark(mark);
        student.setPHD(PHD);
        return student;
    }

    public void maxStudent(Student student1, Student student2) {
        if (student1.getYear() < student2.getYear()) {
            student1.printInfo();
        } else {
            student2.printInfo();
        }
    }

    public Student maxMark(Student student1, Student student2, Student student3) {
        if (student1.getMark() > student2.getMark() && student1.getMark() > student3.getMark()){
            return student1;
        } else if (student2.getMark() > student3.getMark() && student2.getMark() > student1.getMark()) {
            return student2;
        }else {
            return student3;
        }

    }
    public void  girlStudent(Student [] students){
        for (Student student : students){
            if(student != null && student.getGender() == 'F'){
                student.printInfo();
                System.out.println("+++++++++++++++++++++");
            }
        }
    }

    public static Student YoungestGirl(Student[] arr) {
        Student youngest = null;

        for (Student student : arr) {
            if (student.getGender() == 'F') {
                if (youngest == null || student.getYear() > youngest.getYear()) {
                    youngest = student;
                }
            }
        }

        return youngest;
    }

}
