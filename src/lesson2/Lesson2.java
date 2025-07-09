package lesson2;
// փոփոխական հայտարարելու համար կա բլոկ
// type - տեսակ -> name - անուն(փոփոխականի անուն) = value - արժեք;
// java -ում գոյություն ունի 8 պարզ փոփոխականի տիպեր
// առաջին փոփոխականի տիպը կոչվում է byte, 1 byte-ը դա 8 bit-ն է



public class Lesson2 {
 public static void main(String[] args) {
     //byte  minimum value 128 ->  maximum value 127 , default value 0;
     //byte 8 bit from memory
     byte b = 45;
     System.out.println(b);

     b = -16;
     System.out.println(b);

     // short 16bit from memory
     short s = 32524;
     System.out.println(s);

     //int  32bit from memory
     int i = 155154154;
     System.out.println(i);


     //long  64bit from memory, at the end print L;
     long l = 23152156161L;
     System.out.println(l);

     //float 32 bit from memory max float = 234.5f
     float f = 35.5645F;

     System.out.println(f);
     // double from memory 64bit
     double d = 3568.758;

     System.out.println(d);
     // boolean have 2 value false or true
     boolean bb = true;   //1
     boolean bbb = false;  //0

     System.out.println(bb);
     System.out.println(bbb);
     // char variables for symbol
     char c = 's';

     System.out.println(c);

     char cc = '\u000f';

     System.out.println(cc);

     // String

     String st = "Hello Java";

     System.out.println(st);
     System.out.println(st + "from me");
     System.out.println(st + "from oder");


     //                                                        Homework

     // |___________Resume______________|
     // | Name:              Beno       |
     // | Surname:           Babayan    |
     // | Age:               23         |
     // |_______________________________|

     String name = "Beno";
     String surname = "Babayan";
     byte age = 23;
     int phone = 374 ;
     char sym = '\u271D';


     System.out.println("|____________Resume___________|");
     System.out.println("|Name:             " + name + "       |");
     System.out.println("|Surname:          " + surname + "    |");
     System.out.println("|Age:              " + age + "         |");
     System.out.println("|Phone            " + "+" + phone + "94796796" + "|");
     System.out.println("|Favorite symbol:     " + sym + "       |");
     System.out.println("|_____________________________|");
 }

}

