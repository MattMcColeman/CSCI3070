import java.util.*;

public class DivideAndConquer {

	//variables
	static String Letr = "You have a long string containing many characters (such as this paragraph), and you want to search for a substring within this string.";



    public static void main(String[] args) {
    	//String str = "You have a long string containing many characters (such as this paragraph), and you want to search for a substring within this string.";
    	//DivideAndConquer obj1 = new DivideAndConquer(Letr, "cd");
        Search(Letr, "You ");
    	
    	//boolean x = false;
    	//System.out.println(x);
        // Prints "Hello, World" to the terminal window.
        System.out.println("你好! 积分将开1家看好接口＋科技化");
    }

    public static boolean Search(String str, String find){
    	int strSize = str.length();
    	int findSize = find.length();
        String cursor;
    	System.out.println(str+strSize);

        //D&C
        int n = str.length();
        if(n <= findSize){
            if(str.equals(find)){
                System.out.println("很好！");
                return true;
            }else{
                return false;
            }
        }else{
            if(Search(str.substring(strSize/2+1, strSize), find) || Search(str.substring(0, strSize/2), find)){
                return true;
            }
        }

        //linear search 
        /*
    	for(int i = 0; i < (strSize - findSize - 1); i++){
            cursor = str.substring(i,i+findSize);
    		if (cursor.equals(find)){
    			System.out.println(cursor + " was found");
    			return;
    		}
    	}
    	System.out.println(find + " was not found");
    	return;
        */

        return false;
    }
}
