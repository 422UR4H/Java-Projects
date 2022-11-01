class testeNull{
public static void main(String[] args){
int var;
var=5; var='\0';
if(var==5){
System.out.println("Var vale 5");
}
else if(var=='\0'){
System.out.println("Var vale NULL");
}
else{
System.out.println("Algo estranho ocorreu aqui");
System.out.println("Interessante...");
}
}
}
