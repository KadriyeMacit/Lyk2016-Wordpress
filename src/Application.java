import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		
		String input = "";
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			Menu.printMenu();
			input = scanner.nextLine();
			
			processInput(input);
		}
	}
	
	
	public static void processInput(String input){
		
		input = input.trim();
		
		String[] inputParams = input.split(",");
		
		int action;
		action = Integer.parseInt(inputParams[0].trim());
		
		
		int index;
		
		switch(action){
		
		case 1:
			
		}
	}

}
