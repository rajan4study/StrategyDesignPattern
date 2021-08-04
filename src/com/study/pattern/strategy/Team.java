/**
 * 
 */
package com.study.pattern.strategy;

/**
 * @author 
 *
 */
public class Team {
	
	private PlayType playType;
	private String teamName;
	
	public Team(String teamName) {
		this.teamName=teamName;
	}
	
	void setPlayType(PlayType playType) {
		this.playType=playType;
	}
	
	void play() {
		System.out.println(teamName);
		this.playType.play();
	}
	

}
