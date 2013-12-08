package Game_Board;

public class SnackesAndLaddersBox extends LineBox {

    /**
     * nombre de case que le jeton doit avancer ou reculer
     *
     */
    private int mouvement;

    public SnackesAndLaddersBox() {
        this.index = 0;
        this.mouvement = 0;
    }

    public int getMouvement() {
        return this.mouvement;
    }

    public void setMouvement(int pMouvement) {
        this.mouvement = pMouvement;
    }
}
