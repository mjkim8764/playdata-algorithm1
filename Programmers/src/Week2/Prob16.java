package Week2;

/*
    Week2.Prob16 : 문자열 다루기 기본
    문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성되어 있는지 확인
    ex1) "a234" : false
    ex2) "1234" : true
    ex3) "12345" : false
 */

public class Prob16 {
    public static boolean solution(String s, boolean answer){
        int length = s.length();

        if(length == 4 || length == 6){
            for(int i=0; i<length; i++){
                if(s.charAt(i) < 48 || s.charAt(i) > 57){
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }

        return answer;

    }

    public static void main(String[] args) {
        String s1 = "a234";
        String s2 = "1234";
        String s3 = "12345";
        System.out.println(solution("a234", true));
        System.out.println(solution("1234", true));
        System.out.println(solution("12345", true));
    }
}