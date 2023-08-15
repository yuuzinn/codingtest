import java.util.*;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 유저별 신고 횟수 기록
        Map<String, Integer> reportCountMap = new HashMap<>();
        // 각 유저가 누구에게 신고했는지 기록
        Map<String, Set<String>> reportMap = new HashMap<>();
        
        for (String r : report) {
            String[] split = r.split(" ");
            String reporter = split[0];
            String target = split[1];
            
            // 중복 신고 방지를 위한 Set
            Set<String> reportedTargets = reportMap.getOrDefault(reporter, new HashSet<>());
            if (!reportedTargets.contains(target)) {
                reportedTargets.add(target);
                reportMap.put(reporter, reportedTargets);
                reportCountMap.put(target, reportCountMap.getOrDefault(target, 0) + 1);
            }
        }
        
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            if (reportMap.containsKey(user)) {
                Set<String> reportedTargets = reportMap.get(user);
                for (String target : reportedTargets) {
                    if (reportCountMap.get(target) >= k) {
                        answer[i]++;
                    }
                }
            }
        }
        
        return answer;
    }
}
