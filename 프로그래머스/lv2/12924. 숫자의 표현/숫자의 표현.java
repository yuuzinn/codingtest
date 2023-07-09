class Solution {
    public int solution(int n) {
    int answer = isAdd(n);
    return answer;
  }
  public static int isAdd(int number) {
    int count = 0;
    int start = 1;  // 시작 숫자
    int sum = 0;   // 합

    for (int end = 1; end <= number; end++) {
      sum += end;  // 현재까지의 합에 다음 숫자를 더함

      // 합이 주어진 수보다 커지면 시작 숫자를 늘려나감
      while (sum > number) {
        sum -= start;
        start++;
      }

      if (sum == number) {
        count++;
      }
    }

    return count;
  }
}