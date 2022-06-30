package tasks_Leetcode;

class Task771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains("" + stones.charAt(i))) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Task771 result = new Task771();
        System.out.println(result.numJewelsInStones("aAb", "aAAbbbb"));

    }
}
