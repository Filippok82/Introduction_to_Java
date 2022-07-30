package tasks_Leetcode;

public class Task1678 {
    
public String interpret(String cd) {
    StringBuilder sb = new StringBuilder("");
    for(int i=0;i<cd.length();i++){
        if(cd.charAt(i)=='G'){
            sb.append("G");
        }
        else if(cd.charAt(i)=='('){
            if(cd.charAt(i+1)==')'){
                sb.append("o");
            }
            else{
                sb.append("al");
            }
            
        }
    }
    return sb.toString();
    }
public static void main(String[] args) {
    Task1678 res = new Task1678();
    System.out.println(res.interpret( "G()(al)"));
}
}