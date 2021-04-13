package headfirst.designpatterns.state.gumballstatewinner;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = 
			new GumballMachine(10);

		System.out.println(gumballMachine);

		gumballMachine.insert();
		gumballMachine.turn();
		gumballMachine.insert();
		gumballMachine.turn();

		System.out.println(gumballMachine);

		gumballMachine.insert();
		gumballMachine.turn();
		gumballMachine.insert();
		gumballMachine.turn();

		System.out.println(gumballMachine);

		gumballMachine.insert();
		gumballMachine.turn();
		gumballMachine.insert();
		gumballMachine.turn();

		System.out.println(gumballMachine);

		gumballMachine.insert();
		gumballMachine.turn();
		gumballMachine.insert();
		gumballMachine.turn();

		System.out.println(gumballMachine);

		gumballMachine.insert();
		gumballMachine.turn();
		gumballMachine.insert();
		gumballMachine.turn();

		System.out.println(gumballMachine);
	}
}
