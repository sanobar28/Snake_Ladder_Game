import java.util.Scanner;
import java.util.Random;

public class SnakeLadder{


	public static final int COUNTER=100;
	
	public static void main(String[] args){
	
	
		int startPosition=0, playerPos=0, numOfPlay=0;
		//System.out.println(startPosition);

		//System.out.println("Dice no: " + dice);
			
		while (playerPos <= COUNTER){
				
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
				System.out.println("player position: " + playerPos);
			}
			
			
		System.out.println("Number of plays: " + numOfPlay);
		
			
	}
			
		
}

