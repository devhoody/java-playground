package gugudan;

public class Gugudan {


    public static int[] initGugudan(int n, int n2) {
        int[] result = new int[n2];

        for(int i=0; i<result.length; i++){
            result[i] = n * (i+1);
        }
        return result;
    }

    public static void printGugudan(int[] result){
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
