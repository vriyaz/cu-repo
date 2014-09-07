package com.cu.algos;

public class Queens {

	public static void main(String[] args) {
		int size = 4;
		int[] board = new int[size];
		
		for (int i=0; i<size; i++)
			board[i]=0;
		solve(1, board, size);
	}

	static void printBoard(int[] board, int size) {
		
		for (int i=0; i<size; i++) {
			for (int j=0; j<board[i]; j++) {
				System.out.print(0 + " ");
			}
			System.out.print(1 + " ");
			for (int j=board[i]+1; j<size; j++) {
				System.out.print(0 + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<size; i++) {
			System.out.print(board[i] + " ");
		}
		System.out.println("");
	}
	
	static boolean legal(int numcols, int[] board) {
		
		for (int i=0; i<numcols; i++) {
			for (int j=i+1; j<numcols; j++) {
				if ((board[i] == board[j]) || Math.abs(i-j) == Math.abs(board[i] - board[j])) {
					return false;
				}
			}
		}
		return true;
	}
	
	static void solve(int numcols, int[] board, int size) {
		
		if (numcols > size) {
			printBoard(board, size);
			System.out.println();
		} else {
			for (int i=0; i<size; i++) {
				board[numcols-1] = i;
				if (legal(numcols, board)) {
					solve(numcols+1, board, size);
				}
			}
		}
	}
}
