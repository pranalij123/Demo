package Collection.ApplicationBasedQ;
import java.util.*;

public class LargestPalindromicSubstring {

	public static void main(String[] args) {
		
	 String str="anamanan";
	 System.out.println(longPalStr(str));
	 

}

public static String longPalStr(String str){
	ArrayList <String> a= new ArrayList<>(PalArray(str));
	System.out.println(PalArray(str));
	int max=0;
	for(String ele:a){
		if(ele.length()>max) max=ele.length();

	}
	for(String ele:a){
		if(ele.length()==max)  return ele;
		
	}
	return null;

}

public static ArrayList<String> PalArray(String str){
	ArrayList<String> a= new ArrayList<>();
	for(int i=0;i<str.length();i++){
		for(int j=i;j<str.length();j++){
			if(str.charAt(i)==str.charAt(j)) {
				if(isPal(subStr1(i,j,str))) a.add(subStr1(i,j,str));
			}
		}
	}
	return a;
}
public static boolean isPal(String str){
	StringBuffer sb= new StringBuffer(str);
	sb.reverse();
	return str.contentEquals(sb);
}

public static String subStr1(int i, int j,String str){
	String sub="";
	for(int k=i;k<=j;k++){
		sub=sub+str.charAt(k);
	}
	return sub;
}

public static boolean isPali(String str){

   str=str.replaceAll("[^ A-Za-z]","");
	for(int i=0, j=str.length()-1;i<j;i++,j--){
		if(str.charAt(i)!=str.charAt(j)) return false;
	}
	return true;
}


public static boolean isAna(String ...str){
 if(str[0].length() != str[1].length())  return false;

 char arr1[]= str[0].toCharArray();
 char arr2[]= str[1].toCharArray();

 bubbleSort(arr1);
 bubbleSort(arr2);
 for(int i=0;i<arr1.length;i++){
 	if(arr1[i]!=arr2[i]) return false;
 }
return true;

}

public static void bubbleSort(char arr[]){
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i]>arr[j]){
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
}
	public static boolean isPana(String str){
     str=str.toLowerCase();
     for(char i='a';i<='z';i++){
     	int j=0;
     	for(;j<str.length();j++){
     		if(str.charAt(j)==i) break;
     	}
     	if(j==str.length()) return false;
     }
     return true;


	}
}

/*Output

[a, ana, anamana, n, naman, a, ama, m, a, ana, n, nan, a, n]
anamana

*/