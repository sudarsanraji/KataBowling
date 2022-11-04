package com.bnpp.bowl;
public class Game {	
	  int getScore(String input) {
		    FramesBuilder framesBuilder = new FramesBuilder();
		    ScoreCalculator bowlingCalculator = new ScoreCalculator();
		    return bowlingCalculator.calculate(framesBuilder.build(input));
		  }
}
