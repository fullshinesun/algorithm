import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);
                int t = scanner.nextInt();

                for(int k=0; k<t ;k++){
                        int n = scanner.nextInt();
                        List<Integer> num = new ArrayList<Integer>();
                        long sum = 0;
                        int h;
                        for(int i=0; i<n; i++){
                                h = scanner.nextInt();
                                sum += (long)h;
                                num.add(h);
                        }

                        Collections.sort(num);

                        long max = sum;
                        for(int i=0; i<n; i++){
                                sum -= num.get(i);
                                if(max < (i + 2) * sum){
                                        max = (i + 2 ) * sum;
                                }
                        }
                        System.out.println(max);

                }
        }

}
