/**
 *
 * @author BE3 Group
 */
package Game_Board;

/**
 *
 * @author teddy.delavallee
 */
public class LineBox extends Box{
	private int index;
        private int mouvement;

    /**
     *
     */
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

    /**
     *
     * @param pIndex
     */
    public void setIndex(int pIndex) {
		this.index = pIndex;
	}

    /**
     *
     * @return
     */
    public int getMouvement() {
        return this.mouvement;
    }

    /**
     *
     * @param pMouvement
     */
    public void setMouvement(int pMouvement) {
        this.mouvement = pMouvement;
    }
    
    /**
     *
     */
    @Override
    public void putBox() {
        System.out.println("");
        System.out.print("Box number : ");
        System.out.println(this.index);
        super.putBox();
    }
}
