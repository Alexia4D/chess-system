package model;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] matrizChessPiece = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int x = 0; x < board.getColumns(); x++) {
                matrizChessPiece[i][x] = (ChessPiece) board.piece(i, x);
            }
        }
        return matrizChessPiece;
    }
}
