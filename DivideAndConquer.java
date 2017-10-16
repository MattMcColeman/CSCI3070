/*
*Author: Matt McColeman
*SID: 100525235
*Date: 10/16/2017
*note: splitting up substring problem never solved
*/

import java.util.*;

public class DivideAndConquer {

	//variables
	static String Letr = "You have a long string containing many characters (such as this paragraph), and you want to search for a substring within this string.";

    public static void main(String[] args) {
    	String s = "You ";
    	System.out.println("Substring \""+s+"\" is in string?");
        System.out.println(Search(Letr, s));

        String t = "language";
        System.out.println("Substring \""+t+"\" is in string?");
        System.out.println(Search(Letr, t));
    }

    public static boolean Search(String str, String find){
    	int strSize = str.length(); // size of string
    	int findSize = find.length(); //size of substring to find

    	//System.out.println(str+strSize); //uncomment this line to see all possible strings to be found

        //D&C
        int n = str.length(); //subproblem string length
        if(n <= findSize){
            if(str.equals(find)){
                return true;
            }else{
                return false;
            }
        }else{
        	//recursively search half the array for string
            if(Search(str.substring(strSize/2+1, strSize), find) || Search(str.substring(0, strSize/2), find)){
                return true;
            }
        }
        return false;

        //linear search 
        /*
        String cursor;
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
    }
}
