import java.util.*;
public class Main1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int count = 0 ;

if(n<0)
{
System.out.println("Invalid Input");

}
int arr[]=new int[n];
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
arr[i]=sc.nextInt();  
} 

int search = sc.nextInt();
boolean flag=false;
for(int j=0 ; j<n ; j++)
{

if(arr[j] == search)
{
count++;
flag = true;
}
}
if(flag == true)
System.out.println(count);
else
System.out.println("Invalid Input");


}}