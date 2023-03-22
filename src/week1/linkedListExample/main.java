package week1.linkedListExample;

public class main {

	public static void main(String[] args) {
	
		LinkedList list = new LinkedList();
		LinkedList list2 = new LinkedList(); 
		LinkedList list3 = new LinkedList();

		
		
		/*
		Node node = new Node(45);
		
		list.root = node;
		
		node = new Node(117);
		
		list.root.next = node;
		
		node = new Node(34);
		
		list.root.next.next = node;
		*/
		
		
		
		list.insert(562);
		list.insert(552);
		list.insert(542);
		list.insert(532);
		list.insert(522);
		list.insert(512);
		
		list.orderlyInsert(1);
		
		list.print();
		
		list2.orderlyInsert(3);
		list2.orderlyInsert(2);
		list2.orderlyInsert(6);
		list2.orderlyInsert(5);
		list2.orderlyInsert(4);
		list2.orderlyInsert(7);
		list2.orderlyInsert(1);
		
		list2.delete(1);
		list2.delete(4);
		list2.delete(7);
		
		list2.print();
		
		
		list3.delete(0);
		
		
	}
	
	

}















