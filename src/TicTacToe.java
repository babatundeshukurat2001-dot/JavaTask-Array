public class TicTacToe {

    public static int getRow(int position) {
        return (position - 1) / 3;
    }


    public static int getColumn(int position) {
        return (position - 1) % 3;
    }
}
