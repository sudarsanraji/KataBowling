package com.bnpp.bowl;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
public class GameTest {
	private Game bowlingGame;
	  @Before
	  public void setUp() throws Exception {
	    bowlingGame = new Game();
	  }

	  @Test
	  public void noSpareAndNoStrike() throws Exception {
	    int score = bowlingGame.getScore("12345123451234512345");
	    assertThat(score, is(60));
	  }	  
}
