package etc;

/*
    etc.Lv01_prob18 : 실패율
    url : https://programmers.co.kr/learn/courses/30/lessons/42889
 */

public class Lv1_prob18 {

    public static void solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N];
        double[] failure = new double[N];
        int people = stages.length;
        int sum = 0;

        //answer에 스테이지값 입력
        for(int i=0; i<N; i++)
            answer[i] = i + 1;

        //해당 stage에 머물러 있는 인원 카운팅
        for(int i=0; i<people; i++) {
            if (stages[i] - 1 != N)
                count[stages[i] - 1]++;
        }

        //실패율 계산
        for(int i=0; i<N; i++){
            if(people == sum)
                failure[i] = 0;
            else
                failure[i] = (double)count[i] / (double)(people - sum);
            sum += count[i];
        }

        //bubble sort
        double temp;
        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++){
                if(failure[i] < failure[j]) {
                    temp = failure[i];
                    failure[i] = failure[j];
                    failure[j] = temp;

                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = (int)temp;
                } else if(failure[i] == failure[j]) {    //failure이 같을 경우 index 비교
                    if(answer[i] > answer[j]) {
                        temp = answer[i];
                        answer[i] = answer[j];
                        answer[j] = (int)temp;
                    }
                }
            }
        }

        for(int i=0; i<N; i++)
            System.out.println(failure[i]);
        for (int i=0; i<N; i++)
            System.out.println(answer[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        int n1 = 5;
        int[] stages1 = new int[] {2, 1, 2, 6, 2, 4, 3, 3};

        int n2 = 4;
        int[] stages2 = new int[] {4, 4, 4, 4, 4};

        solution(n1, stages1);
        solution(n2, stages2);
    }
}