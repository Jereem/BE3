/**
 *
 * @author teddy.delavallee
 */
package Game_Board;

public class Box{
	private boolean isBusy;

	public Box() {
		this.isBusy=false;
	}

	public void setIsBusy(boolean p) {
		this.isBusy=p;
	}
        
        public boolean getIsBusy(){
            return(this.isBusy);
        }

}