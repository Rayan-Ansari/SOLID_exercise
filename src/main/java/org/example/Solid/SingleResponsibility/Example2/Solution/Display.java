package org.example.Solid.SingleResponsibility.Example2.Solution;

public class Display {
    public void display(Board board) {
        for (int row = 0; row < 3; row++) {
            StringBuilder line = new StringBuilder();
            for (int col = 0; col < 3; col++) {
                if (col < 2) line.append(" | ");
            }
            System.out.println(line);
        }
    }
}
