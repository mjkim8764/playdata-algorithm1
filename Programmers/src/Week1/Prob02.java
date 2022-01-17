package Week1;

/*
    Week1.Prob02 : 길이가 n이고, "수박수박수..."와 같은 패턴을 유지하는 문자열 출력
    ex) n=3이면 "수박수", n=4이면 "수박수박"
 */

public class Prob02 {
    public static String solution2(int n){
        String answer = "";
        int i = 0;
        while(i < n){
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
            i++;
        }
        return answer;

        /*  Refactoring
        for(i=0; i<n; i++)
            answer += i%2==0 ? "수" : "박";
         */

    }

    public static void main(String[] args) {
        System.out.println(solution2(3));
        System.out.println(solution2(4));
    }
}