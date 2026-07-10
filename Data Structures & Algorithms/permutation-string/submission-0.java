class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
    int l2 = s2.length();
    if (l1 > l2) return false;

    Map<Character, Integer> m1 = new HashMap<>();
    Map<Character, Integer> m2 = new HashMap<>();

    // 1. Fill m1 with string 'a' and m2 with the FIRST window of 'b'
    for (int i = 0; i < l1; i++) {
        m1.put(s1.charAt(i), m1.getOrDefault(s1.charAt(i), 0) + 1);
        m2.put(s2.charAt(i), m2.getOrDefault(s2.charAt(i), 0) + 1);
    }

    // 2. Slide the window across string 'b'
    for (int i = 0; i <= l2 - l1; i++) {
        // Check if current window matches
        if (m1.equals(m2)) {
            return true;
        }

        // If we aren't at the end, slide the window
        if (i < l2 - l1) {
            char charToRemove = s2.charAt(i);
            char charToAdd = s2.charAt(i + l1);

            // Add the next character
            m2.put(charToAdd, m2.getOrDefault(charToAdd, 0) + 1);

            // Remove the character that is falling out of the window
            if (m2.get(charToRemove) == 1) {
                m2.remove(charToRemove);
            } else {
                m2.put(charToRemove, m2.get(charToRemove) - 1);
            }
        }
    }

    return false;
    }
}
