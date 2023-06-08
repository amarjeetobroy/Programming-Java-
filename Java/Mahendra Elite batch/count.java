{
	public static void main(String[] args) {
	    System.out.println("Enter size:");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int size = sc.nextInt();
		System.out.println("Enter your elements:");
		//	int count =0;
		for(int i=0;i<size;i++){
			 arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
		    int count = 1;
		    for(int j=i+1;j<size;j++){
		         if(arr[i]==arr[j]){
		    	 count++;
		    	 arr[j]=-1;
		    }
		}
		if(arr[i]!=-1)
		   	System.out.println(arr[i]+" - "+ count);

	}
}
}

/* Output
Enter size:
5
Enter your elements:
10 20 30 10 20
10 - 2
20 - 2
30 - 1
*/
