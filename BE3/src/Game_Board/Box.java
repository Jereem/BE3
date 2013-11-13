package Game_Board;

public class Box extends LineBox {
	private boolean busy;

	public Box() {
		this.busy=false;
	}

	public void setPiece( boolean isBusy) {
		this.busy=isBusy;
	}

	public boolean isBusy()   {
	return this.busy;	
	}
}