package lesson5;

public class Xndir {
    public static void main(String[] args) {

        // 248
        int [] arr = {1,15,3,6,8,7,2,4};
        int k = 3;
        int sum = 0;
        for (int i = 0; i < arr. length; i++){
            if((arr[i] + i) % k == 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);

        //251
         int max = arr[0];

         for(int i = 0 ; i <arr.length ; i++){
             if(arr[i] > max){
                 max = arr[i];
             }
         }
        System.out.println(max);


         //252

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);

        //253
        int s = min + max;
        System.out.println(s);

        //254
        int t = min * max;
        System.out.println(t);

        //255

        int[] x = {2,8,9,4,3,15,21,37,1};
        int mx = x[0];
        int index = 0;

        for(int i = 1; i <x.length; i++){
            if (x[i] > mx){
                mx = x[i];
                index = i;
            }
        }
        int result = mx + index;
        System.out.println(result);

        //256

        int mi = x[0];
        int ind = 0;

        for (int i = 1; i < x.length; i++){
            if(x[i] < mi){
                mi = x[i];
                ind = i;
            }
        }
        int res = mi + ind;
        System.out.println(ind);


        //257

        int [] a = {7,8,5,6,2,1,0,9,4};

        int ma = a[0];
        int in = 0;

        for (int i = 1 ; i < a.length; i++){
            if (a[i] > ma){
                ma = a[i];
                in = i;
            }
        }
        System.out.println(in);

        // 258

        int l = a[0];
        int inde = 0;

        for (int i = 1; i < a.length;i++){
            if (a[i] >= l) {
                l =a[i];
                l = i;
            }
        }
        System.out.println(l);

        // 259


        int minim = arr[0];
        int indexe = 0;

        for (int i = 1; i < arr.length; i++) {
            if (a[i] < minim) {
                minim = arr[i];
                indexe = i;
            }
        }

        System.out.println(indexe);


    }
}
