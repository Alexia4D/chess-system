package application.boardPrint;

import model.ChessPiece;

public class UserInterface {

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print(8 - i + " ");
            for (int x = 0; x < pieces.length; x++) {
                printPeace(pieces[i][x]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPeace(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }

}
