package week1;

/*
    Week1.Prob09 : 두 개의 정수 n, m을 입력
             가로 길이가 n, 세로 길이가 m인 직사각형 형태로 별(*) 문자 출력
             input ex) 5 3
             output
                *****
                *****
                *****
 */

import java.util.Scanner;

public class Prob09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        /*
        String s = "";

        for(int i=0; i<a; i++)
            s += "*";

        for(int i=0; i<b; i++)
            System.out.println(s);

         */

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<a; i++)
            sb.append("*");

        for(int i=0; i<b; i++)
            System.out.println(sb);

    }
}