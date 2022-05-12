import java.util.Scanner;
class Armstrong{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int x,y,z,rem,n=0;
double r=0.0;
System.out.println("Enter Integer");
x=sc.nextInt();
z=y=x;
while(y!=0){
y/=10;
++n;
}
while(z!=0){
rem=z%10;
r+=Math.pow(rem,n);
z/=10;
}
if((int)r==x){
System.out.println("\n"+ x +"is an armstrong number");
}
else{
System.out.println("\n"+ x +"is an armstrong  not number");
}
}
}