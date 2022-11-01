class ex3_2_3{
    public static void main(String[] args){
	int mult=3, valor=0;
	for(int i=1, count=0;valor<=100;i++, count++){
	    valor=i*mult;
	    if(valor>100)
		break;
	    System.out.print(valor+" ");
	    if(count==9){
	        System.out.println(); count=0;
	    }
	}
    }
}
