package com.translate.lexer.Entities.Models;

public class TempManager {
    private static int tempCount = 0;

    public static String getTemp() {
        return "" + (tempCount++);
    }
}
