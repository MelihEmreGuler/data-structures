package week1.linkedList.homework;

public class main {

	public static void main(String[] args) {
		
		UserInterface.sayHello();
		LinkedList list = UserInterface.createList();
		
		boolean repeat = true;
		
		while(repeat) {
			switch (UserInterface.optionsMenu()) {
			case 1: 
				UserInterface.insert(list);
				break;
			case 2:
				UserInterface.deleteByIndex(list);
				break;
			case 3:
				UserInterface.numberOfElements(list);
				break;
			case 4:
				UserInterface.printInReverseOrder(list);
				break;
			case 5:
				UserInterface.findIndexOfElement(list);
				break;
			case 6:	
				UserInterface.sayGoodbye();
				repeat = false;
				break;
			
			default:
				System.out.println("exception");
				return;
			} 
			UserInterface.print(list);
		}
		
	}

}



/*
LinkedList list1 = new LinkedList();
LinkedList list2 = new LinkedList();
//a
list1.insert("Melih");
list1.insert("Emre");
list1.insert("Güler");
list1.insert("Mert");
list1.insert("Şenel");
list1.insert("Güler");
//-----

list1.deleteByIndex(5);
list1.print();
System.out.println("Number of elements: " + list1.numberOfElements());

list2.deleteByIndex(-1);
System.out.println("Number of elements: " + list2.numberOfElements());

list1.printInReverseOrder();
list2.printInReverseOrder();

System.out.println(list1.findIndexOfElement("Güler")); 
System.out.println(list2.findIndexOfElement("Data")); 
*/
