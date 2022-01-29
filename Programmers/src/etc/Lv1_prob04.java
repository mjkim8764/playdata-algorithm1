package etc;

/*
    etc.Lv01_prob04 : 이상한 문자 만들기
    url : https://programmers.co.kr/learn/courses/30/lessons/12930
 */

public class Lv1_prob04 {

    public static void solution(String s){
        int count = 0;
        String answer = "";
        int length = s.length();

        for(int i=0; i<length; i++){
            if(s.charAt(i) != ' ') {
                if(count % 2 == 0) {
                    answer += Character.toUpperCase(s.charAt(i));
                }
                else {
                    answer += Character.toLowerCase(s.charAt(i));
                }
                count++;
            }
            else {
                answer += s.charAt(i);
                count = 0;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        String s = "try hello world";
        solution(s);
    }
}
