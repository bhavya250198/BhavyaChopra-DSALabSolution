package com.java.codes.trees;
import java.util.*;
import com.java.codes.trees.implementation.Node;
import com.java.codes.trees.implementation.TreeSum;

public class Main {
	public static void showResults() {
		TreeSum treesum = new TreeSum();
		treesum.insert(40);
		treesum.insert(20);
		treesum.insert(60);
		treesum.insert(10);
		treesum.insert(30);
		treesum.insert(50);
		treesum.insert(70);
			Scanner ob = new Scanner(System.in);
			int sum = ob.nextInt();
		treesum.checkSum(treesum.root, sum);
				
	}
public static void main(String args[]) {
	showResults();
}
}
