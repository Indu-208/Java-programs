import java.util.*;
public class FirstLastOcc{
	static int Search(int a[],int target,boolean first){
		int low=0;
		int high=a.length-1;
		int ans=-1;
		while(low<=high){
			int mid=low+(high-low)/2;
			if(a[mid]==target) {
				ans=mid;
				if(first) high=mid-1;
				else low=mid+1;
			}
			else if(a[mid]<target) low=mid+1;
			else high=mid+1;
		}
		return ans;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int first=Search(a,target,true);
		int last=Search(a,target,false);
		System.out.println("First occurence:"+first);
		System.out.println("Last occurence:"+last);
	}
}