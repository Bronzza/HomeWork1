package com.company.repin;

public class MatchPrediction {
    public static int checkResult(int team1, int team2, int predict1, int predict2) {
        int result = 0;
        result += (team1 < team2) && (predict1 < predict2) || (team1 > team2) && (predict1 > predict2) ||
                (team1 == team2) && (predict1 == predict2) ? 1 : 0;
        result += (team1 == predict1) && (team2 == predict2)? 1 : 0;
        return result;

    }
}
