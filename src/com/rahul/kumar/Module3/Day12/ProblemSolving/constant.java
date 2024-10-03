package com.rahul.kumar.Module3.Day12.ProblemSolving;

import java.util.Scanner;

public class constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of times");
        int testCase = sc.nextInt();
        
         sc.nextLine();
        for(int i=0;i<testCase;i++){
        	System.out.println("Enter the String");
            String str = sc.nextLine();
            int vowelCount =0;
            int constantCount = 0;

            for(int j=0;j<str.length();j++){
                char ch = str.charAt(i);
                if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelCount++;
                }
                else{
                    constantCount++;
                }
            }
            System.out.println(vowelCount + " "+ constantCount);
        }
        
    }
}
