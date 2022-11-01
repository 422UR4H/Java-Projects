class ex3_2_2{
    public static void main(String[] args){
        for(int i=1, count=0; i<=1000; i++, count++){
            int j=i; System.out.print(j+" ");
            if(count==9){
                System.out.print("\n"); count=-1;
            }
        }
    }
}
