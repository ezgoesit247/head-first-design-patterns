package headfirst.designpatterns.state.gumballstatewinner;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insert() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
 
	public void eject() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}
 
	public void turn() {
		System.out.println("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
	
	public void refill() { 
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public String toString() {
		return "sold out";
	}
}
