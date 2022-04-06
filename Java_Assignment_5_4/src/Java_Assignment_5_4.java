/*	 Write an enum type TrafficLight, whose constants (RED,
	GREEN, YELLOW) take one parameter—the duration of the
	light.Write a program to test the TrafficLight enum so that it
	isplays the enum constants and their durations. */
import java.util.EnumSet;

enum TrafficLight{                             
   RED(20),                        
   GREEN(50),                           
   YELLOW(10);

   private int duration; 

   TrafficLight(int duration) 
   { 
      this.duration = duration;
   } 

   public int getDuration()
   {
      return duration;
   } 

}

public class Java_Assignment_5_4
{
   public static void main(String[] args) 
   {
      System.out.println("All Trafic Lights:");
                  
      for (TrafficLight tl: TrafficLight.values())                        
         System.out.printf("%-10s%d%n", tl, tl.getDuration());
   } 
} 
