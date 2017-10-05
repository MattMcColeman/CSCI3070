import java.util.*;

public class DivideAndConquer {

	//variables
	static String Letr = "You have a long string containing many characters (such as this paragraph), and you want to search for a substring within this string.";



    public static void main(String[] args) {
    	//String str = "You have a long string containing many characters (such as this paragraph), and you want to search for a substring within this string.";
    	DivideAndConquer obj1 = new DivideAndConquer(Letr, "characters");
    	
    	//boolean x = false;
    	//System.out.println(x);
        // Prints "Hello, World" to the terminal window.
        System.out.println("你好! 积分将开1家看好接口＋科技化");
    }

    DivideAndConquer(String str, String find){
    	int strSize = str.length();
    	int findSize = find.length();
    	//System.out.println(strSize-findSize);
    	for(int i = 0; i < strSize - findSize; i++){
    		if(false){
    			System.out.println(find + " was found");
    			return;
    		}
    	}
    	//System.out.println(str.substring(15));
    	System.out.println(find + " was not found");
    	return;
    }

}
