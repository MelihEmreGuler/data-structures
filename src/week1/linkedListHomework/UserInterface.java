package week1.linkedListHomework;
import java.util.Scanner;

public abstract class UserInterface {
	
	public static void sayHello() {
		System.out.println("Merhaba! \nLinked List ödevime hoşgeldiniz.");
	}
	
	
	public static LinkedList createList() {
		return new LinkedList();
	}
	
	
	public static int optionsMenu() {
		System.out.println("Lütfen yapmak istediğiniz işlemin numrasını giriniz.\n"
				+ "1- Listeye veri ekleme \n"
				+ "2- Listeden indeks değerine göre silme \n"
				+ "3- Listenin eleman sayısını öğrenme \n"
				+ "4- Listeyi tersten yazdırma \n"
				+ "5- Dışarıdan alınan veriyi liste içerisinde arama ve kaçıncı sırada olduğunu öğrenme \n"
				+ "6- Programı kapatma");
		return UserInterface.getMenuSelection();
	}
	
	
	private static int getMenuSelection() {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Seçiminiz:");  
		int number= scanner.nextInt();
		
		if(number != 1 && number != 2 && number != 3 && number != 4 && number != 5 && number != 6) { //exception check
			System.out.println("Lütfen sadece menüdeki sayılardan birini giriniz.");
			return -1;
		}
		
		return number;
	}
	
	
	public static LinkedList insert(LinkedList list) {
		System.out.print("\nLütfen listenize eklemek istediğiniz veriyi giriniz:");
		Scanner scanner= new Scanner(System.in);
		String data = scanner.nextLine();
		
		list.insert(data);//the process
		return list;
	}
	
	
	public static LinkedList deleteByIndex(LinkedList list) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("\nSilmek istediğiniz index:");  
		int number= scanner.nextInt();
		
		list.deleteByIndex(number);//the process
		return list;
	}
	
	
	public static void numberOfElements(LinkedList list) {
		
		System.out.println("Listenizin eleman sayısı: " + list.numberOfElements());
	}
	
	
	public static void printInReverseOrder(LinkedList list) {
		
		System.out.println("\nListenizin tersten görüntüsü: ");
		list.printInReverseOrder();
	}
	
	
	public static void findIndexOfElement(LinkedList list) {
		System.out.print("\nLütfen listenizde aramak istediğiniz veriyi giriniz:");
		Scanner scanner= new Scanner(System.in);
		String data= scanner.nextLine();
		
		int index;
		index = list.findIndexOfElement(data);
		System.out.println("Aradığınız veri " + index + ". sırasındadır.");
	}
	
	
	public static void sayGoodbye() {
		
		System.out.println("\nÖdevimi incelediğiniz için teşekkür ederim :)");
	}
	
	
	public static void print(LinkedList list) {
		System.out.print("\nListenizin son hali: ");
		list.print();
		System.out.println("\n");//to clear looking
	}
	
	
	
	
	
	
	
	
	
	
}
