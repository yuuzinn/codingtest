import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		String[] split = skill.split("");
		List<String> list1 = new ArrayList<>();
		for (int i = 0; i < split.length; i++) {
			list1.add(split[i]);
		}
		for (int i = 0; i < skill_trees.length; i++) {
			String skillTree = skill_trees[i];
			boolean skillTree1 = isSkillTree(list1, skillTree, skill);
			if (skillTree1) {
				answer++;
			}
		}
		return answer;
	}
	public static boolean isSkillTree(List<String> skillList, String skillTree, String skill) {
		String[] split = skillTree.split("");
		String[] split1 = skill.split("");
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		for (int i = 0; i < split.length; i++) {
			if (skillList.contains(split[i])) {
				list.add(split[i]);
			}
		}
		for (int i = 0; i < split1.length; i++) {
			list2.add(split1[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).equals(list2.get(i))) {
				return false;
			}
		}
		return true;
	}
}