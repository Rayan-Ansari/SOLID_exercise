package org.example.Solid.SingleResponsibility.Example2.Solution;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<String> spots;

    public Board() {
        spots = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            spots.add(String.valueOf(i));
        }
    }

    public String getSpot(int index) {
        return spots.get(index);
    }

    public void setSpot(int index, String value) {
        spots.set(index, value);
    }

    public List<String> getSpots() {
        return new ArrayList<>(spots);
    }
}
