public class StaircaseStrings {

  public String[] constructStaircaseString(int height) throws IllegalArgumentException {
    if (height <= 0) {
      throw new IllegalArgumentException();
    }
    String[] staircase = new String[height];
    String space = " ";
    String stair = "*";
    for (int i = 1; i <= height; i++) {
      staircase[i - 1] = space.repeat(height - i) + stair.repeat(i);
    }
    return staircase;
  }

}
