import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); 
        // 첫번째와 두번째의 합이 초과할 경우 뒤는 볼 필요 X
		if (people[0] + people[1] > limit) {
			return people.length;
		}
		int left = 0; // 왼쪽 포인터
		int right = people.length - 1; // 오른쪽 포인터
		int answer = 0; // 필요한 구명보트의 개수

		while (left <= right) {
			// 무거운 사람과 가벼운 사람을 함께 태워본다.
			if (people[left] + people[right] <= limit) {
				left++; // 가벼운 사람은 다음으로 이동
			}
			right--; // 무거운 사람은 다음으로 이동
			answer++; // 구명보트 사용

			// 왼쪽 포인터가 오른쪽 포인터를 넘어가면 모든 사람이 구출되었으므로 종료
			if (left > right) {
				break;
			}
		}

		return answer;
    }
}