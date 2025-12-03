package main.java.armada;

import java.util.HashMap;
import java.util.Map;

public enum BoardSymbol {
    BLANK(' '),
    WATER('.'),
    SHIP('S');
    
    private final char symbol;
    public static final Map<BoardSymbol, BoardSymbol> Next = new HashMap<>();

    BoardSymbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
