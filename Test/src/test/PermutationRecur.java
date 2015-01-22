package test;

public class PermutationRecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		PermutationRecur pr = new PermutationRecur();
		pr.doPermu("", "abc");
	}
	
	public void doPermu(String str1,String str2){
		if(str2.length()!=0){
			char ch = str2.charAt(0);
			for(int i=0;i<=str1.length();i++){
			doPermu(str1.substring(0,i)+ch+str1.substring(i, str1.length()),str2.substring(1,str2.length()));	
			}
		}
		else{
			System.out.println(str1);
		}
	}

}
