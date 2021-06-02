import java.util.Scanner;
import java.util.Random;

public class SnakeLadder{


	public static final int COUNTER=100;
	
	public static void main(String[] args){
	
	
		int startPosition=0, player1Pos=0, player2Pos=0, numOfPlay1=0, numOfPlay2=0;
		//System.out.println(startPosition);

		//System.out.println("Dice no: " + dice);
		
		
			while (player1Pos < COUNTER){
					
					numOfPlay1++;
					int dice1=(int)(Math.random()*6+1);
					boolean ladder1 = Math.random()<0.5;
					boolean snake1= Math.random()<0.5;
					
					if (ladder1 == true){
							
						player1Pos += dice1;
					}
								
					else if (snake1 == true){
						player1Pos -= dice1;
					}
					//System.out.println("player position: " + player1Pos);
			}
					
			while (player2Pos < COUNTER){
					
					numOfPlay2++;
					int dice2=(int)(Math.random()*6+1);
					boolean ladder2 = Math.random()<0.5;
					boolean snake2= Math.random()<0.5;
					
					if (ladder2 == true){
							
						player2Pos += dice2;
					}
								
					else if (snake2 == true){
						player2Pos -= dice2;
					}
					//System.out.println("player position: " + player1Pos);
			}
			
		if (player1Pos == 100){
			
			System.out.println("Player 1 won!!");
		}
		else{
			
			System.out.println("Player 2 won!!");
		}
			
		System.out.println("Number of plays player 1: " + numOfPlay1);
		System.out.println("Number of plays player 2: " + numOfPlay2);
			
	}
			
		
}

