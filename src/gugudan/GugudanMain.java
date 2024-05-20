package gugudan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanMain {
    public static void main(String[] args) throws IOException {
        Gugudan gugudan = new Gugudan();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] splitedValue = s.split(",");

        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);


        for(int j=2; j<=first; j++){
            int[] result = gugudan.initGugudan(j,second);
            gugudan.printGugudan(result);
        }
    }
}
