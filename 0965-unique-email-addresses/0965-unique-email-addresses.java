class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> result = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String[] split = emails[i].split("@");
            String local = split[0];
            String localReplace = local.replaceAll("\\.", "");
            if (localReplace.contains("+")) {
                int i1 = localReplace.indexOf("+");
                localReplace = localReplace.substring(0, i1);
                result.add(localReplace + "@" + split[1]);
                continue;
            }
            result.add(localReplace + "@" + split[1]);
        }
        return result.size();
    }
}