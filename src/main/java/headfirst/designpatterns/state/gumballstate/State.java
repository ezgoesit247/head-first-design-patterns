package headfirst.designpatterns.state.gumballstate;

public interface State {
 
	public void insert();
	public void eject();
	public void turn();
	public void dispense();
	
	public void refill();
}
