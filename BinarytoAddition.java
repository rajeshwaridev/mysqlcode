import java.util.*;
class BinarytoAddition{
static void binaryaddition(int n1,int n2){
int carry=0;
int B[]=new int[20];
int i=0;
while(n1!=0 || n2!=0){
int a=n1%10;
int b=n2%10;
int sum=a+b+carry;
int y=sum%2;
B[i]=y;
n1=n1/10;
n2=n2/10;
carry=sum/2;
i++;
}
if(carry!=0){
B[i]=carry;
i++;
}
for(int x=i-1;x>=0;x--){
System.out.print(B[x]);
}
}
public static void main(String A[]){
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
binaryaddition(n1,n2);
}
}