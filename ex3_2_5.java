class ex3_2_5{
    public static void main(String[] args){
	long valor=1;
	for(int i=1; i<=30; i++){
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
