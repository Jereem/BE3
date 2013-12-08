/**
 *
 * @author teddy.delavallee
 */
package Game_Board;

public class LineBox {
	private int index;
        private int mouvement;
        
	public LineBox(){
            this.index = 0;
            this.mouvement = 0;
        }

	/**
	 * Donne le numéro de la case      
         * @return 
	 */
	public int getIndex() {
		return this.index;
	}

	public void setIndex(int pIndex) {
		this.index = pIndex;
	}

    public int getMouvement() {
        return this.mouvement;
    }

    public void setMouvement(int pMouvement) {
        this.mouvement = pMouvement;
    }
}