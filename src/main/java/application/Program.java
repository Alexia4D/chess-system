package application;

import application.boardPrint.UserInterface;
import model.Board;
import model.ChessMatch;
import model.Position;


public class Program {

    public static void main(String[] args) {
        Position p = new Position(3, 5);

        ChessMatch chessMatch = new ChessMatch();

        UserInterface.printBoard(chessMatch.getPieces());
    }
}
