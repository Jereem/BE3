package Game_Board;
import java.util.Random;

/**
 *
 * @author teddy.delavallee
 */
public class Dice {
	private int value;
        private int val_min;
        private int val_max;

    /**
     *
     * @param val_min
     * @param val_max
     */
    public Dice (int val_min,int val_max) {
            this.val_max=val_max;
            this.val_min=val_min;
            this.value =val_min;
        }

    /**
     *
     * @return
     */
    public int getValue() {
		return this.value;
	}

    /**
     *
     */
    public void setValue() {
            Random r = new Random();
            this.value = this.val_min + r.nextInt(this.val_max-this.val_min);
	}
}