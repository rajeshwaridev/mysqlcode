import java.util.*;
class BintoDec{
static void binarytodecimal(int n){
int k=1;
int sum=0;
while(n!=0){
int z=n%10;
sum=sum+(z*k);
k=k*2;
n=n/10;
}
System.out.print(sum);
}
public static void main(String A[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
binarytodecimal(n);
}
}