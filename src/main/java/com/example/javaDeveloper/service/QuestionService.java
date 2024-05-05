package com.example.javaDeveloper.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService {

    public int buyStock(int[] prices){

        int buy = prices[0];

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int currentPrice =prices[i];
            
            if (currentPrice< buy) {
                buy = currentPrice;
            } else if (currentPrice - buy > profit) {
                profit = currentPrice - buy;
            }
        }
        return profit;
    }

    public int compareVersion(String version1, String version2){
        var v1 = version1.split("\\.");
        var v2 = version2.split("\\.");

        for (var i=0; i < Math.max(v1.length, v2.length); i++) {
        var num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
        var num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;

        if (num1 < num2) return -1;
        if (num1 > num2) return 1;
        }
        return 0;
    }

    public int climbStairs(int steps){ // 1 <= steps <= 45
        int possibleWay = 1;
        int previousPossibleway = 0;
        int currentPossibleWay = 0;
        
        for (int i = 0; i < steps; i++) {
            currentPossibleWay = previousPossibleway + possibleWay;
            previousPossibleway = possibleWay;
            possibleWay = currentPossibleWay;
        }
        
        return possibleWay;
    }
}
