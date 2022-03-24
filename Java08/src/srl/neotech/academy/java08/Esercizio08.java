package srl.neotech.academy.java08;

import java.util.Scanner;

public class Esercizio08 {

	public static void main(String[] args) {

		
		String s = "Viva Java!";

        char s1;   

        for (int i = s.length()-1;i>=0; i--){

        s1= s.charAt(i);

        System.out.print(s1);

        }

    }	

	}




//import java.util.Scanner;
//
//public class Esercizio08 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String inpStr = in.nextLine();
//        System.out.println("Original String :" + inpStr);
//        char temp;
//        char[] arr = inpStr.toCharArray();
//        int len = arr.length;
//        for(int i=0; i<(inpStr.length())/2; i++,len--){
//            temp = arr[i];
//            arr[i] = arr[len-1];
//            arr[len-1] = temp;
//        }
//
//        System.out.println("Reverse String :" + String.valueOf(arr));
//    }
//}