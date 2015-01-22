package test;

public class Tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tr t = new Tr();
		t.permut("", "abcde");
	}
	
	public void permut(String str1,String str2){
	    if(str2.length() != 0){
	        char ch = str2.charAt(0);
	        for(int i = 0; i <= str1.length();i++)
	            permut(str1.substring(0,i) + ch + str1.substring(i,str1.length()),
	                     str2.substring(1,str2.length()));
	    }else{
	    System.out.println(str1);
	    }
	}

}
