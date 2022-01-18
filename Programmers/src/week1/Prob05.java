package week1;

/*
    Week1.Prob05 : String s의 'p'의 개수와 'y'의 개수를 비교
            같으면 True 출력, 다르면 False 출력
            ex1) s가 "pPooyY" : true 출력
            ex2) s가 "Pyy" : false 출력
 */

public class Prob05 {
    public static void main(String[] args){
        boolean answer = true;      //answer : 결과값
        int pCount = 0;             //pCount : p 혹은 P의 갯수
        int yCount = 0;             //yCount : y 혹은 Y의 갯수

        String s = "pPoooyY";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P')
                pCount++;
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y')
                yCount++;
        }

        if(pCount != yCount)
            answer = false;

        System.out.println(answer);
    }
}