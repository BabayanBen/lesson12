package lesson4;

public class Lesson4 {
    public static void main(String[] args) {
        // խնդիրներ  21-40
        // N21
        int a = 2;
        int b = 4;
        int c = 6;

        if (a > b && a > c) {
            System.out.println("bigger a = " + a);
        } else if (b > a && b > c) {
            System.out.println("bigger b = " + b);
        } else {
            System.out.println("bigger c = " + c);
        }
        // N22
        if (a < b && a < c) {
            System.out.println("smallest a = " + a);
        } else if (b < a && b < c) {
            System.out.println("smallest b = " + b);
        } else {
            System.out.println("smallest c = " + c);
        }
        // N23
        if (a == 1 || b == 1 || c == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // N 24

        if (a == 2 && b == 2 && c != 2 ||
                a == 2 && c == 2 && b != 2 ||
                b == 2 && c == 2 && a != 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // 25
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("y = 1");
        } else {
            System.out.println(" y = 2");
        }
        // 26 even
        if ((a % 2 == 0) || (b % 2 == 0 ) || ( c % 2 == 0)){
            System.out.println(1);
        }else {
            System.out.println(2);
        }
           // 26.5
        if ((a % 2 != 0) || (b % 2 !=0) || ( c % 2 != 0)){
            System.out.println(1);
        }else {
            System.out.println(2);
        }

        // 27
        if((b - a) == (c - b)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
            //28
        double x = 2;
        double y = 4;
        double z = 6;

        if((x / y) == (z / y)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        // 29  //2,4,6

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        if (a > c) {
            a = a + c;
            c = a - c;
            a = a - c;
        }
        if (b > c) {
            b = b + c;
            c = b - c;
            b = b - c;
        }
        System.out.println(a + " " + b + " " + c);

        //30
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        if (a < c) {
            a = a + c;
            c = a - c;
            a = a - c;
        }

        if (b < c) {
            b = b + c;
            c = b - c;
            b = b - c;
        }

        System.out.println(a + " " + b + " " + c);

        // 31

        int q = 7;
        int w = 11;
        int e = 14;
        int s = 5;

        if (q > w && q > e && q > s){
            System.out.println(q);
        }
        if (w > q && w > e && w > s){
            System.out.println(w);
        }
        if (e > q && e > w && e > s){
            System.out.println(e);
        } else if (s > q && s > w && s > e) {
            System.out.println(s);
        }

        // 32

        if (q < w && q < e && q < s){
            System.out.println(q);
        }
        if (w < q && w < e && w < s){
            System.out.println(w);
        }
        if (e < q && e < w && e < s){
            System.out.println(e);
        } else if (s < q && s < w && s < e) {
            System.out.println(s);
        }

        // 33

        if (q == w || q == e || q == s || w == e || w == s || e == s) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

            // 34

        if( q + w == e || q + w == s ||
                q + e == w || q + e == s ||
                q + s == w || q + s == e ||
                w + e == q || w + e == s ||
                w + s == q || w + s == e ||
                e + s == q || e + s == w ){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        // 35

        if (
                q == w + e + s ||
                        w == q + e + s ||
                        e == q + w + s ||
                        s == q + w + e
        ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // 36
        int count = 0;

        if (q % 2 != 0) count++;
        if (w % 2 != 0) count++;
        if (e % 2 != 0) count++;
        if (s % 2 != 0) count++;

        if (count >= 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // 51
        System.out.println("xndir 51");

        int l = 491;

        int miavor = l % 10;
        int tasnavor = l / 10 % 10;
        int haruravor = l / 100 % 10;

        if (miavor == tasnavor + haruravor){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        //52
        if(miavor == tasnavor || tasnavor == haruravor || haruravor ==miavor){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        // 53
        int k = 36;
        int p = l / miavor + tasnavor + haruravor;
        int v = miavor + tasnavor + haruravor / l;
        if (l > k){
            System.out.println(p);
        }else {
            System.out.println(v);
        }

        // 54



        if (miavor > tasnavor && miavor > haruravor) {
            System.out.println("miavor = " + miavor);
        } else if (tasnavor > miavor && tasnavor > haruravor) {
            System.out.println( "tasnavor = " + tasnavor);
        } else {
            System.out.println("haruravor = " + haruravor);
        }

        // 55
        if(miavor < tasnavor && miavor < haruravor){
            System.out.println("min value miavor = " + miavor);
        } else if (tasnavor < miavor && tasnavor < haruravor) {
            System.out.println("min value tasnavor = " + tasnavor);
        }else {
            System.out.println("min value haruravor = " + haruravor);
        }

        //56
        if ( miavor > tasnavor){
            System.out.println(v);
        }else {
            System.out.println(l);
        }
        // 57
        int u = tasnavor / miavor;
        int m = haruravor / miavor;

        if (l > 300){
            System.out.println(u);
        }else {
            System.out.println(m);
        }

        // 58
        char f = 'q';
        if (tasnavor + haruravor < 5){
            System.out.println(f = 'a');
        }else {
            System.out.println(  f = 'b');
        }

        //59
        if (miavor <= tasnavor && tasnavor <= haruravor) {
            System.out.println(miavor + ", " + tasnavor + ", " + haruravor);
        } else if (miavor <= haruravor && haruravor <= tasnavor) {
            System.out.println(miavor + ", " + haruravor + ", " + tasnavor);
        } else if (tasnavor <= miavor && miavor <= haruravor) {
            System.out.println(tasnavor + ", " + miavor + ", " + haruravor);
        } else if (tasnavor <= haruravor && haruravor <= miavor) {
            System.out.println(tasnavor + ", " + haruravor + ", " + miavor);
        } else if (haruravor <= miavor && miavor <= tasnavor) {
            System.out.println(haruravor + ", " + miavor + ", " + tasnavor);
        } else {
            System.out.println(haruravor + ", " + tasnavor + ", " + miavor);
        }

        // 60

        if (miavor >= tasnavor && tasnavor >= haruravor) {
            System.out.println(miavor + ", " + tasnavor + ", " + haruravor);
        } else if (miavor >= haruravor && haruravor >= tasnavor) {
            System.out.println(miavor + ", " + haruravor + ", " + tasnavor);
        } else if (tasnavor >= miavor && miavor >= haruravor) {
            System.out.println(tasnavor + ", " + miavor + ", " + haruravor);
        } else if (tasnavor >= haruravor && haruravor >= miavor) {
            System.out.println(tasnavor + ", " + haruravor + ", " + miavor);
        } else if (haruravor >= miavor && miavor >= tasnavor) {
            System.out.println(haruravor + ", " + miavor + ", " + tasnavor);
        } else {
            System.out.println(haruravor + ", " + tasnavor + ", " + miavor);
        }

        // 151-159
        System.out.println("xndir 151 - 159");
        // 151
         int nat = 65;
        for (int i = 1; i <= nat; i++){
            if (nat % i == 0){
                System.out.println(i + ", ");
            }
        }

        // 152
        int times = 1;
        for (int i = 1; i <= nat; i++){
            if (nat % i == 1){
               times *=i;

            }
        }
        System.out.println(times);

        // 153
        int sum = 0;

        for (int i = 1; i <= nat; i++) {
            if (nat % i == 2) {

                sum += i;
            }
        }
        System.out.println(sum);

        //154
        int t = 1;
        for (int i = 1; i <= nat; i++) {
            if (nat % i == 3) {

                t *= i;
            }
        }
        System.out.println(t);

        //155

        int ereq = 0;


        for (int i = 10; i <= 99; i++) {
            if (i % 3 == 0) {
                ereq += i;
            }
        }
        System.out.println(ereq);

        //156
        int hing = 0;
        for (int i = 10; i <= 99; i++){
            if (i % 5 ==0){
                hing += i;
            }
        }
        System.out.println(hing * ereq);

        //157
        int hingp = 0;
        for (int i = 100; i <= 999; i++){
            if (i % 5 !=0){
                hingp += i;
            }
        }
        System.out.println(hingp);

        // 158
        int ereqp = 0;
        int erkwusp = 0;

        for (int i = 100; i <= 1000; i++){
            if (i % 3 != 0){
                ereqp += i;
            }
        }
        for (int i = 100; i <= 1000; i++){
            if (i % 2 != 0){
                ereqp += i;
            }
        }
        System.out.println(ereqp * erkwusp);

        //159






    }
}
