import java.util.Arrays;

public class Charge {


    public static void main(String[] args){
     Charge charge;
     charge = new Charge();
       int[] age;
       age = new int[6];

        int[] h;
        h = new int[6];

        int[] f;
        f = new int[6];

      double t,u,v,w,x,y,z;  t =10; u=10; v =10; w =10; x = 11; y =10; z = 10;
      charge.calculate(new double[]{2,4,6});
      int m ,n,p,r; m =2; n =3; p =4; r = 5;
        charge.watchPro(new int[]{2,4,6}, new int[]{3,5,7,6});

    }

    private int[] number;

    public Charge(){
       number = new int[]{1,2,4,5};
    }

    public void watch(int[] a){

    }
    // This method below can take things like this (new double[]{2,4,6}, new double[]{3,5,7,6}). Things like this
    // can't work (4,6,7).That g there is an array and accepts only arrays inside its own array.
    public void watchPro(int[]... g){
        int sum = 0;
        for(int[] i : g){
          System.out.println(Arrays.toString(i));
        }

    }
    // This method below can take things like this (4,7,3).
    // Things like this can't work (new double[]{2,4,6}, new double[]{3,5,7,6}). That k there is an array
    // and accepts only elements like normal double numbers inside its own array.
    // Also note that you could use (new double[]{2,4,6}) because the system will take it as if you
    // are defining k, saying that k = new double[]{2,4,6}
    public void calculate(double... k){
     double sum = 0;
       for(double i : k){
           sum = sum +i;
       }
        System.out.println(sum);
    }

}
