public class backtracking{
static int n;
	 static int[][]a={
		 {0,1,1},
			 {0,1,1},
				 {0,0,0}
	 };
	static boolean find(int i,int j,int sol[][],int count){
		if(i==n-1&&j==n-1){
			sol[i][j]=1;
			System.out.println("valid "+count);
			return true;
		}
		
		if(i<0||j<0||i>=n||j>=n||a[i][j]==1||sol[i][j]==1){
			return false;
		
		}
		sol[i][j]=1;
		if(a[i][j]==1)return true;
		if(find(i+1,j,sol,count+1))return true;
		if(find(i-1,j,sol,count+1))return true;
		if(find(i,j-1,sol,count+1))return true;

		if(find(i,j+1,sol,count+1))return true;
		
		sol[i][j]=0;
		return false;
		
	}
	public static void main(String...aa){
		n=3;
		int [][]sol=new int[n][n];
		if(find(0,0,sol,1)){
		for(int i=0;i<n;i++){
			for(int j= 0;j<n;j++){
				
			System.out.print(sol[i][j]+" ");
		}
		System.out.println();
		}
		}
		else{
			System.out.println("no valid");
		}
	}
}

		
		

	
		