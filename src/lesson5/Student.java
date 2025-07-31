package lesson5;

public class Student {
   public String name;

   public  String surname;

   public  int year;

   public  double mark;

   public  char gender;

   public  boolean PHD;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSurname() {
      return surname;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public char getGender() {
      return gender;
   }

   public void setGender(char gender) {
      this.gender = gender;
   }

   public double getMark() {
      return mark;
   }

   public void setMark(double mark) {
      this.mark = mark;
   }

   public boolean isPHD() {
      return PHD;
   }

   public void setPHD(boolean PHD) {
      this.PHD = PHD;
   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public void printInfo(){
      System.out.println("Name: " + name);
      System.out.println("Surname: " + surname);
      System.out.println("Year: " + year);
      System.out.println("Mark: " + mark);
      System.out.println("Gender: " + gender);
      System.out.println("PHD:" + PHD);
   }
}
