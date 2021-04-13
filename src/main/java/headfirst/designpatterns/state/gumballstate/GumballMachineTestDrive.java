package headfirst.designpatterns.state.gumballstate;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(2);

		System.out.println(gumballMachine);

		gumballMachine.insert();
		gumballMachine.turn();

		System.out.println(gumballMachine);

		gumballMachine.insert();
		gumballMachine.turn();
		gumballMachine.insert();
		gumballMachine.turn();
		
		gumballMachine.refill(5);
		gumballMachine.insert();
		gumballMachine.turn();

		System.out.println(gumballMachine);
	}
}
