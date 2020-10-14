public class Leaderboard {

  private static int[] leaderboard = {100, 90, 90, 80, 75, 70, 60, 55, 55, 50};

  public static int[] calcRanking(int[] scores) {
    int[] ranking = new int[scores.length];
    for (int i = 0; i < scores.length; i++) {
      int rank = 1;
      for (int j = 0; j < leaderboard.length; j++) {
        if (leaderboard[j] > scores[i]) {
          rank += 1;
        }
      ranking[i] = rank;
      }
    }
    return ranking;
  }

}
