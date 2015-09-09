import java.util.Scanner;
import java.io.*;

public class meow{
	public static void main(String args[]){
   
      Scanner input = new Scanner(System.in);
      Scanner tinput = new Scanner(System.in);
      
      System.out.println("Enter an amount of seconds: ");
      
     int inS = input.nextInt();
     int allMins;
     int hours;
     int check;
     int check2;
     int seconds;
     int minutes;
     
     allMins = inS/60;
     hours = allMins / 60;
     check = inS-(hours*60*60);
     minutes = check/60;
     check2 = (hours*60*60)+(minutes*60);
     seconds = inS - (check2);
     
      System.out.println(hours + " hours");
      System.out.println(minutes + " minutes");
      System.out.println(seconds + " seconds");
      
      //SECOND WITH MODULE
      
     int tinS = tinput.nextInt();
     int thours;
     int tseconds;
     int tminutes;
     
     thours = inS/3600;
     tminutes = inS%3600/60;
     tseconds = inS%3600%60;
              
      System.out.println(thours + " hours");
      System.out.println(tminutes + " minutes");
      System.out.println(tseconds + " seconds");
      
	}
}



