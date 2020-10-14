import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LeaderboardTest {

  static final int[][] inputValues = {{65, 75, 85, 95}};

  static final int[][] expectedValues = {{7, 5, 4, 2}};

  @Test
  void calcRanking() {
    for (int i = 0; i < inputValues.length; i++) {
      assertArrayEquals(expectedValues[i], Leaderboard.calcRanking(inputValues[i]));
    }
  }

}
