package week2;

/*
    Week2.Prob29 : 시저 암호
    url : https://programmers.co.kr/learn/courses/30/lessons/12926
 */

public class Prob29 {

    public static void solution(String s, int n){
        String answer = "";
        int length = s.length();

        for(int i=0; i<length; i++){
            if(s.charAt(i) >= 65  && s.charAt(i) <= 90) {             // if(Character.isUpperCase(s.charAt(i))
                if(s.charAt(i) + n > 90) {
                    answer += (char)(s.charAt(i) + n - 26);
                }
                else {
                    answer += (char)(s.charAt(i) + n);
                }
            }
            else if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {         // if(Character.isLowerCase(s.charAt(i))
                if(s.charAt(i) + n > 122) {
                    answer += (char)(s.charAt(i) + n - 26);
                }
                else {
                    answer += (char)(s.charAt(i) + n);
                }
            }
            else if(s.charAt(i) == 32) {
                answer += (char)s.charAt(i);
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        //ASCII CODE
        //space : 32
        //A ~ Z : 65 ~ 90
        //a ~ z : 97 ~ 122
        String s1 = "AB";
        int n1 = 1;

        String s2 = "z";
        int n2 = 1;

        String s3 = "a B z";
        int n3 = 4;

        solution(s1, n1);
        solution(s2, n2);
        solution(s3, n3);
    }
}