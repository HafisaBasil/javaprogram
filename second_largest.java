package programs;

public class second_largest {
	
	static int secLargest(int[] a) {
		int max1,max2=0;
		if(a[0]>a[1]) {
			max1=a[0];
			max2=a[1];
		}
		else {
			max1=a[1];
			max2=a[0];
			
		}
		for(int i=2;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2) {
				max2=a[i];
			}
		}
		return max2;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,50};
		System.out.println(secLargest(a));
		
		}
		
		
		
		
		
		
		
		
		
		

	}


