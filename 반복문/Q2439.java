//문제
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

//입력
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

//출력
//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

package 반복문;

import java.io.*;

public class Q2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        br.close();

        for (int i = 0; i < N; i++){
            for (int j = N - 1; j > i; j--){
                bw.write(" ");
            }
            for (int k = 1; k <= i + 1; k++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
