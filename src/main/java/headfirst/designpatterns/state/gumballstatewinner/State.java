package headfirst.designpatterns.state.gumballstatewinner;

public interface State {
 
	public void insert();
	public void eject();
	public void turn();
	public void dispense();
	
	public void refill();
}
