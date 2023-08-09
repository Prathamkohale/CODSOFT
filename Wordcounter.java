import java.util.*;

class WordCounter
{


public static void main(String args[])
{
new WordCounter();
Scanner sc= new Scanner(System.in);
System.out.println("Enter the text:");

String s=sc.nextLine();
int count=1;

for(int i=0;i<s.length()-1;i++)
{
if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
{
count++;
}

}
System.out.println("Number of words in a string are:"+count);



}
}