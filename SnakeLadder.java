import java.util.Scanner;
import java.util.Random;

public class SnakeLadder{

	public static final int LADDER=1; 
	public static final int SNAKE=2;
	public static final int COUNTER=99;
	
	
	
	public static void main(String[] args){
	
	
		int startPosition=0, playerPos=0, numOfPlay=0;
		//System.out.println(startPosition);

		//System.out.println("Dice no: " + dice);
			
		while (playerPos < COUNTER){
				
				numOfPlay++;
				int dice=(int)(Math.random()*6+1);
				boolean ladder = Math.random()<0.5;
				boolean snake= Math.random()<0.5;
				
				if (ladder == true){
						
					playerPos += dice;
				}
							
				else if (snake == true){
					playerPos -= dice;
				}
					
			}
			
			
		System.out.println("Number of plays: " + numOfPlay);
		System.out.println("player position: " + playerPos);
			
	}
			
		
}

