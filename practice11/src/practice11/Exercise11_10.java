package practice11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Exercise11_10 {
	public static void main(String[] args) {
		Set set = new HashSet();
		int[][] board = new int[5][5];
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1 + "");
		}
		ArrayList a1 = new ArrayList(set);
		Collections.shuffle(a1);
		Iterator it = a1.iterator();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}
	}
}