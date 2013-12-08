package Game_Board;
import java.util.Random;

public class Dice {
	private int value;
        private int val_min;
        private int val_max;
        
        public Dice (int val_min,int val_max) {
            Random r = new Random();
            //int valeur = valeurMin + r.nextInt(valeurMax - valeurMin)
            int valeur = val_min + r.nextInt(val_max-val_min);
            this.value = valeur;
        }

	public int getValue() {
		return this.value;
	}

	public void setValue() {
            Random r = new Random();
            this.value = val_min + r.nextInt(val_max-val_min);
	}
}