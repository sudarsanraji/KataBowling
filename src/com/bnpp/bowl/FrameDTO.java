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
	  private int getSecondScore() {
	    return EMPTY.equals(second) || LINE.equals(second) ? 0 : parseInt(second);
	  }

	  boolean isStrike() {
	    return STRIKE_SIGNAL.equals(first);
	  }

	  boolean isSpare() {
	    return SPARE_SIGNAL.equals(second);
	  }
int getFirstScore() {
	    return EMPTY.equals(first) || LINE.equals(first) ? 0 : parseInt(first);
	  }

	  void setBonus(boolean bonus) {
	    this.bonus = bonus;
	  }

	  boolean isBonus() {
	    return bonus;
	  }	  
}
