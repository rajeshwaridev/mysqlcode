import java.io.*;
import java.util.*;
public class Alphabets{
public static void main(String a[]){
Scanner s= new Scanner(System.in);
char s1=s.next().charAt(0);
int k=(int)s1;
for(int i=k+1;i<=90;i++){
char z=(char)i;
System.out.print(z);
}
}
}
