import java.util.Scanner;

public class ASC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to print the characters corresponding to ASCII codes from 65 to 90.
System.out.println("enter any value between 65 to 90");
		
		for(int i=65;i<=90;i++){
Scanner characterreader=new Scanner(System.in);
char charfromcode=(char)characterreader.nextInt();
System.out.println(charfromcode);
 characterreader.close();
	
		}}
}
