import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int k=0; k<t; k++){
            solveProblem(scanner);
        }
    }

    public static void solveProblem(Scanner scanner){
        int n = scanner.nextInt();
        List<String> num = new ArrayList<String>();

        for(int i=0; i<n; i++){
            String temp = scanner.next();
            char[] tempArray = temp.toCharArray();
            Arrays.sort(tempArray);
            num.add(String.copyValueOf(tempArray));
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                if(num.get(i).charAt(j) < num.get(i-1).charAt(j)){
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }

}
