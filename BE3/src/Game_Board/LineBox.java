package Game_Board;

public class LineBox {
	private int index;
        
	public LineBox(){
            this.index = 0; 
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
}