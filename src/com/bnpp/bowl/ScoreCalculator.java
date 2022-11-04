package com.bnpp.bowl;

import java.util.List;

public class ScoreCalculator {
	
	int calculate(List<FrameDTO> frames) {
	    int totalScore = 0;
	    for (int index = 0; index < frames.size(); index++) {
	      totalScore += calculateEachFrame(frames, index);
	    }
	    return totalScore;
	  }
}
