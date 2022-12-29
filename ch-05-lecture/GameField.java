package ch05;

public class GameField {
    int[][] field;

    public void fire(int x, int y) {
        field[y][x] = 1;
    }

    public int getResult(int x, int y) {
        return field[y][x];
    }

    public GameField(int difficulty) {
        if (difficulty == 1) {
            field = new int[10][10];
        } else if (difficulty == 2) {
            field = new int[40][40];
        } else {
            field = new int[100][100];
        }
    }
}



