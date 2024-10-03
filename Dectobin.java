import java.util.*;
class Dectobin{
static void decimaltobin(int n){
int a[]=new int[5];
int i=0;
while(n!=0){
int z=n%2;
a[i]=z;
n=n/2;
i++;
}
for(int p=i-1;p>=0;p--){
System.out.print(a[p]);
}
}

public static void main(String A[]){
Scanner s= new Scanner(System.in);
int n=s.nextInt();
decimaltobin(n);
}
}