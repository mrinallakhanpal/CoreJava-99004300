import java.util.Scanner; 
public class Main 
{ 
public static void main(String[] args) 
{ 
int n, i,j=0,score; 
Scanner in=new Scanner(System.in); 
n = in.nextInt(); 
if(n < 0) { System.out.print("Invalid array size");
 System.exit(0); 
} else 
{ int a[]=new int[n]; 
for(i = 0; i< n; i++) 
{ 
a[i] = in.nextInt(); 
if(a[i] < 0) 
{ System.out.print("Invalid input"); 
System.exit(0); 
} 
} 
score = in.nextInt(); 
if(score<0) 
{ 
System.out.print ("Invalid score"); 
System.exit(0); 
} 
int cricketer[]=new int[100]; 
for(i=1;i<n;i=i+2) 
{ 
if(a [i]>score) 
{ 
cricketer[j]=a [i-1]; j++; 
} 
} 
for(i=0;i<j;i++) { System.out.println(cricketer[i]); 
} } } }