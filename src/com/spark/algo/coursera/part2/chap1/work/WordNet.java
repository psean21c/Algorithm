package com.spark.algo.coursera.part2.chap1.work;

public class WordNet {

	   // constructor takes the name of the two input files
	   public WordNet(String synsets, String hypernyms){}

	   // returns all WordNet nouns
	   public Iterable<String> nouns(){
		   return null;
	   }

	   // is the word a WordNet noun?
	   public boolean isNoun(String word){
		   return true;
	   }

	   // distance between nounA and nounB (defined below)
	   public int distance(String nounA, String nounB){
		   return 0;
	   }

	   // a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
	   // in a shortest ancestral path (defined below)
	   public String sap(String nounA, String nounB){
		   return null;
	   }

	   // do unit testing of this class
	   public static void main(String[] args){}
	}