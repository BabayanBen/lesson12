package human;

public class LessonHum {
    public static void main(String[] args) {

        Human human = new Human("Beno",2001);
        int sum = human.sum(5, 9);
        System.out.println(sum);

        int sum1 = human.sum(15,34,56);
        System.out.println(sum1);

        int sum3 = human.sum(30,"Vahe");
        System.out.println(sum3);

        int sum4 = human.sum("Ashot", 38);
        System.out.println(sum4);
    }
}
