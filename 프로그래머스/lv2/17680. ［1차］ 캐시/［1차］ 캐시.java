import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
		if (cacheSize == 0) {
			return cities.length * 5;
		}
		Queue<String> queue = new LinkedList<>();
		List<String> list = new LinkedList<>();
		for (int i = 0; i < cities.length; i++) {
			String city = cities[i];
			String s = city.toUpperCase();
			queue.add(s);
		}
		for (int i = 0; i < cities.length; i++) {
			if (list.size() < cacheSize) {
				String poll = queue.poll();
				boolean contains = list.contains(poll);
				if (contains) {
					list.remove(poll);
					list.add(poll);
					answer++;
					continue;
				}
				list.add(poll);
				answer = answer + 5;
				continue;
			}
			if (list.size() == cacheSize) {
				// 캐시 사이즈에 다 들어온 경우 로직 실행
				String poll = queue.poll();
				// 리스트 안에 도시 이름이 있는가?
				boolean contains = list.contains(poll);
				// -> 있다면 제거하고 맨앞으로 삽입
				if (contains) {
					list.remove(poll);
					list.add(cacheSize - 1, poll);
					answer++;
					continue;
				}
				// 리스트 안에 도시 이름이 없는가?
				// -> 없다면 0번째 도시 제거하고 cacheSize 번째로 삽입
				list.remove(0);
				list.add(cacheSize - 1, poll);
				answer = answer + 5;
			}
		}
		return answer;
    }
}