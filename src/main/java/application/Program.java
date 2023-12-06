package application;

import model.Board;
import model.Position;

public class Program {

    public static void main(String[] args) {
        Position p = new Position(3, 5);
        System.out.println("Position: " + p);

        Board board = new Board(8, 8);

    }
}
