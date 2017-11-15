
public class ChekerBoard {

public static void main(String[] args)
{
	int size = 24;
	int[][] board = new int[size][size];
	boolean flag1=false;
	boolean flag2=false;
	int temp1=0;
	int temp2=0;
	for (int i = 0;i < size; i++){
		for (int j = 0;j < size; j++){
			
			
			if(flag1){
				if(flag2){
				board[i][j]=1;}
				else board[i][j]=0;
			}
			else{ 
				if(flag2){
				board[i][j]=0;}
				else{board[i][j]=1;}
				}
			temp1++;
			if(temp1==4){
				temp1=0;
				if(!flag1)flag1=true;
				else flag1=false;
			}
			
			
			System.out.print(" "+board[i][j]);
		}
		temp2++;
		if(temp2==4){
			temp2=0;
			if(!flag2)flag2=true;
			else flag2=false;
		}
		
		System.out.print('\n');
	}
}
}
