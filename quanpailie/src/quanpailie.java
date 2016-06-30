
public class quanpailie {
	static int n=5;
	static int[] a = new int[n+1]; 
	static int[] book = new int[n+1];
//	int step = 1;
	
	
	public static void main(String[] args) {
		dnf(0);
		float a = 1.9F;
		System.out.print(""+(int)a+" "+a);
	}
	
	public static void dnf(int step){
		
		if(step==(n+1)){
			for(int i =0 ;i<=n;i++){
			System.out.print(a[i] + " ");
			}
			System.out.print("\n");
			return;
		}
		
		for(int i=0;i<n+1;i++){
			if(book[i]==0){
				book[i]=1;
				a[step]=i;
				dnf(step+1);
				book[i]=0;
			}
			
		}
	
	return;
	}
}
