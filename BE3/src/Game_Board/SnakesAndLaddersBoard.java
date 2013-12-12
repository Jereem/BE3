package Game_Board;

public class SnakesAndLaddersBoard extends LineBoard {

    public SnakesAndLaddersBoard() {
        this.nbBox = 31;
        this.path = new LineBox[nbBox];
        for (int i = 0; i < this.path.length; i++) {
            this.path[i].setIndex(i);
            if (i == 6 || i == 18) {
                this.path[i].setMouvement(6);
            } else if (i == 12 || i == 24) {
                this.path[i].setMouvement(-6);
            } else {
                this.path[i].setMouvement(0);
            }
        }
    }
}
