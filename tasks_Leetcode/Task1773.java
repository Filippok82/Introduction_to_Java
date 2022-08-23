package tasks_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Task1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int res = 0;
        for (int i = 0; i < items.size(); i++) {

            if (ruleKey.equalsIgnoreCase("type")) {
                if (items.get(i).get(0).equalsIgnoreCase(ruleValue))
                    res++;
            } else if (ruleKey.equalsIgnoreCase("color")) {
                if (items.get(i).get(1).equalsIgnoreCase(ruleValue))
                    res++;
            } else if (ruleKey.equalsIgnoreCase("name")) {
                if (items.get(i).get(2).equalsIgnoreCase(ruleValue))
                    res++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
    List<List<String>> items = new ArrayList<List<String>>();
    List<String> a= new ArrayList<String>();
    a.add("phone");
    a.add("blue");
    a.add("pixel");
    List<String> b= new ArrayList<String>();
    b.add("computer");
    b.add("silver");
    b.add("lenovo");
    List<String> c= new ArrayList<String>();
    c.add("phone");
    c.add("gold");
    c.add("iphone");
    items.add(a);
    items.add(b);
    items.add(c);
     String ruleKey = "type";
     String ruleValue = "phone";
     Task1773 result = new Task1773();
     System.out.println(result.countMatches(items, ruleKey, ruleValue));
    }
}
