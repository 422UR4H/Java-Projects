class ex3_2_7{
    public static void main(String[] args){
	for(int x=13; x!=1; ){
	    if(x%2==0)
		x/=2;
	    else
		x=3*x+1;
	    System.out.println(x);
	}
    }
}
