package week2;

/*
    Week2.Prob19 : 핸드폰 번호 가리기
    전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 * 으로 가린 문자열 출력
 */

public class Prob19 {
    public static void main(String[] args) {
        String answer = "";
        String phone_number = "01033334444";

        for(int i=0; i<phone_number.length(); i++){
            if(phone_number.length() - i > 4){
                answer += "*";
            }
            else{
                answer += phone_number.charAt(i);
            }
        }

        System.out.println(answer);
    }
}