class ex3_2_1{
    public static void main(String[] args){
        for(int i=150, count=1; i<=300; i++, count++){
            System.out.print(i+" ");
            if(count==10){
                System.out.print("\n");
		count=0;
	    }
        }
    }
}
