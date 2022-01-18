package week1;

/*
    Week1.Prob07 : 가운데 글자 가져오기
             단어 s의 가운데 글자를 반환, 단어의 길이가 짝수라면 가운데 두 글자 반환
             ex1) "abcde" : "c" 출력
             ex2) "qwer" : "we" 출력
 */

public class Prob07 {
    public static void main(String[] args) {
        String s = "abcde";
        String answer = "";

        int length = s.length();

        if(length%2 == 1)
            answer += s.charAt(length/2);
        else{
            answer = answer + s.charAt(length/2-1) + s.charAt(length/2) ;
        }

        /* Refactoring - substring 메소드 사용
                         substring(int beginIndex, int endIndex) : beginIndex 이상 endIndex 미만의 부분 스트링을 반환
        answer += s.substring( (length-1)/2, length/2+1);
         */

        System.out.println(answer);

    }
}