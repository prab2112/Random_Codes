package test;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[]{0,1,2,3,5};
		int j=0;
		for(int i=0;i<a.length;i++){
			if(!((i^a[i])==0)){
				j=i;
				break;
			}
		}
		System.out.println(j);
	}

}
