public class seminar01_04 {
    
    public static void main(String[] args) {
        
        moveRing('A', 'B', 'C', 3);
    }

    public static void moveRing(char a, char b, char c, int count) {

    	if (count==1){
		    System.out.println(String.format("из %s в %s",a,b));
	    }else {
		    moveRing(a, c, b, count - 1);
		    System.out.println(String.format("из %s в %s",a,b));
	        moveRing(c,b,a,count-1);
    	}

    }
}
