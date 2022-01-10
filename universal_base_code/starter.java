	public double getMode(int[] x){
		int sum = 0;
		if(x.length <= 1)
			return -1;
		for(int i=0;i<x.length();i++)
			sum += x[i];
		double mode = sum/x.length();
		return mode;
	}
	
	public int getMedian(int[] x){
		if(x.length % 2 != 0)
			return x[x.length/2];
		else
			int y = x.length/2;
			int a = (x[y] + x[y-1])/2
			return a;
	}
	



	
