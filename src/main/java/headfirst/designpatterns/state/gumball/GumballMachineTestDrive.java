package headfirst.designpatterns.state.gumball;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);

		gumballMachine.insert();
		gumballMachine.turn();

		System.out.println(gumballMachine);

		gumballMachine.insert();
		gumballMachine.eject();
		gumballMachine.turn();

		System.out.println(gumballMachine);

		gumballMachine.insert();
		gumballMachine.turn();
		gumballMachine.insert();
		gumballMachine.turn();
		gumballMachine.eject();

		System.out.println(gumballMachine);

		gumballMachine.insert();
		gumballMachine.insert();
		gumballMachine.turn();
		gumballMachine.insert();
		gumballMachine.turn();
		gumballMachine.insert();
		gumballMachine.turn();

		System.out.println(gumballMachine);
	}
}
