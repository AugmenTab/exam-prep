import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StaircaseStringsTest {

  static final int[] inputValues = {10, 1, 3, 5};

  static final String[][] expectedValues = {
      {
          "         *",
          "        **",
          "       ***",
          "      ****",
          "     *****",
          "    ******",
          "   *******",
          "  ********",
          " *********",
          "**********"
      },
      {
          "*"
      },
      {
          "  *",
          " **",
          "***"
      },
      {
          "    *",
          "   **",
          "  ***",
          " ****",
          "*****"
      }
  };

  @Test
  void constructStaircaseString() {
    for (int i = 0; i < inputValues.length; i++) {
      StaircaseStrings staircaseStrings = new StaircaseStrings();
      String[] staircase = staircaseStrings.constructStaircaseString(inputValues[i]);
      assertArrayEquals(expectedValues[i], staircase);
    }
  }

  @Test
  void constructStaircaseString_negative() {
    StaircaseStrings staircaseStrings = new StaircaseStrings();
      assertThrows(IllegalArgumentException.class, () ->
          staircaseStrings.constructStaircaseString(0));
    }
}
