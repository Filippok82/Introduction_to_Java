package tasks_Leetcode;

class Task1108 {
    public String defangIPaddr(String address) {
        StringBuilder defanged_address = new StringBuilder("");
        for (char i : address.toCharArray()) {
            if (i == '.') {
                defanged_address.append("[.]");
                continue;
            }
            defanged_address.append(i);
        }
        return defanged_address.toString();
    }
public static void main(String[] args) {
    Task1108 result = new Task1108();
    System.err.println(result.defangIPaddr("1.1.1.1"));
}
}