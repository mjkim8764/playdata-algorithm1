package Week1;

/*
    Week1.Prob03 : String 배열에서 "Kim"의 위치 x를 찾아,
            "김서방은 x에 있다" 는 내용을 출력
 */

public class Prob03 {
    public static void main(String[] args){
        String[] seoul =  {"Jane", "Kim"};
        String answer;
        int i;

        for(i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim"))
                break;
        }

        answer = "김서방은 " + i + "에 있다";
        System.out.println(answer);
    }
}