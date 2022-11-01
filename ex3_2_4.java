class ex3_2_4{
    public static void main(String[] args){
	for(int i=1, valor=1; i<=10; i++){
	    System.out.print("Fatorial de "+i);
	    for(int j=i; j>0; j--){
		if(j>0)
		    valor*=j;
	    }
	    System.out.println(" vale "+valor);
	    valor=1;
   	}
    }
}
