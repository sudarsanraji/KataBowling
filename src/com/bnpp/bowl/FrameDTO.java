package com.bnpp.bowl;

import static java.lang.Integer.parseInt;
import static com.bnpp.bowl.ConstantCls.EMPTY;
import static com.bnpp.bowl.ConstantCls.LINE;
import static com.bnpp.bowl.ConstantCls.SPARE_SIGNAL;
import static com.bnpp.bowl.ConstantCls.STRIKE_SIGNAL;

public class FrameDTO {	
	private String first;
	  private String second;
	  private boolean bonus;
	  private String upComingRecords;
	  FrameDTO(String first, String second) {
	    this.first = first;
	    this.second = second;
	  }

	  FrameDTO() {

	  }

	  int calculateScore() {
	    return isSpare() || isStrike() ? 10 : getFirstScore() + getSecondScore();
	  }
}
