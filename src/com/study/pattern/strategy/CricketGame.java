/**
 * 
 */
package com.study.pattern.strategy;

/**
 * @author 
 *
 */
public class CricketGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Team teamA=new Team("A");
		Team teamB= new Team("B");
		System.out.println("Toss done. TeamA won and choose to bat");
		teamA.setPlayType(new Batting());
		teamA.play();
		teamB.setPlayType(new Bowling());
		teamB.play();
		System.out.println("first innings over.Team B require 30 run to win from 5 over.");
		teamA.setPlayType(new Bowling());
		teamB.setPlayType(new Batting());
		teamB.play();
		teamA.play();
		System.out.println("Match tie.");
	}

}
