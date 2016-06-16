package com.counter.game;

/*Louise and Richard play a game. They have a counter set to N. Louise gets the first turn and the turns alternate thereafter. In the game, they perform the following operations.

If N is not a power of 2, reduce the counter by the largest power of 2 less than N.
If N is a power of 2, reduce the counter by half of N.
The resultant value is the new N which is again used for subsequent operations.
The game ends when the counter reduces to 1, i.e., N == 1, and the last person to make a valid move wins.

Given N, your task is to find the winner of the game.

Update If they set counter to 1, Richard wins, because its Louise' turn and she cannot make a move.Louise and Richard play a game. They have a counter set to N. Louise gets the first turn and the turns alternate thereafter. In the game, they perform the following operations.

If N is not a power of 2, reduce the counter by the largest power of 2 less than N.
If N is a power of 2, reduce the counter by half of N.
The resultant value is the new N which is again used for subsequent operations.
The game ends when the counter reduces to 1, i.e., N == 1, and the last person to make a valid move wins.

Given N, your task is to find the winner of the game.

Update If they set counter to 1, Richard wins, because its Louise' turn and she cannot make a move.
*/

// This is a bit manipulation problem. Solve again later

public class CounterGame {

	public static void main(String[] args) {
		int counter=6;
		if(counter==1){
			System.out.println("Richard");
		}else{
			System.out.println(counterGame(counter));
		}
	}
	
	private static String counterGame(int c){
		String winner="";
		int i=0;
		int counter=0;
		while(c!=1){
			i=powerOfTwo(c);
			if(i==0){
				c=c/2;
			}else{
				c=c-i;
			}
			counter++;
		}
		if(counter/2==0)
			winner="Louise";
		else
			winner="Richard";
		
		return winner;
	}
	
	private static int powerOfTwo(int n){
		int i=2;
		if(i==n)
			return 0;
		
		while(i<=n){
			i=i*2;
		}
		if(i>n)
			return i/2;
		else
			return 0;
	}

}
