import java.util.Scanner;
public class Count
{
public static int findElementCount(int arr[], int n, int search)
{
int count = 0;

for(int i=0 ; i<n ; i++)
{
if(search == arr[i])
{
count++;
}
}

return count;

}

public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int[] ar = new int[n];
for(int i=0 ; i<n ; i++)
{
ar[i] = scan.nextInt();
}
int search=scan.nextInt();
int occ = findElementCount(ar,n,search);
System.out.println(occ);
}
}
 