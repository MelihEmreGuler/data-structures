package week1.linkedList.homework;


public class LinkedList {
	Node root;
	
	
	public void insert (String data) {
		if(this.root == null) { 
			
			this.root= new Node(data);
			
		}else {
			Node iter = this.root;
			
			
			while(iter.next != null) {
				iter = iter.next;
				
			}
			
			iter.next = new Node(data);
		}
	}
	
	
	public void deleteByIndex(int index) { //the list index starts from 0
		
		
		if(this.root == null) { //control
			System.out.println("The list is already empty!");
			return;
		}
		
		if(index < 0) { //control
			System.out.println("The index (" + index +") is out of range!");
			return;
		}
		
		if(index == 0) { //if deleted index is 0
			this.root = this.root.next;
			return;
		}
		
		Node iter = this.root;
		for(int i = 0; i < index -1; i++) { //Melih Emre Güler Mert Şenel Güler
			iter = iter.next;
		}
		
		if(iter.next == null) {//control
			System.out.println("The index (" + index +") is out of range!");
			return;
		}
		
		iter.next = iter.next.next;
	}
	
	
	public int numberOfElements() {
		
		Node iter = this.root;
		int counter = 0;
		
		
		while(iter != null) {
			counter++;
			iter = iter.next;
		}
		return counter;
	}
	
	
	public void printInReverseOrder() {//Melih Emre Güler Mert Şenel Güler 
		//create a new list
		//fill the list by adding elements to first index
		//print the new list
		LinkedList ReverseOrderedList = new LinkedList();
		Node iter = this.root;
		
		while (iter != null) {
			ReverseOrderedList.addToFirstIndex(iter.data);
			iter = iter.next;
		}
		ReverseOrderedList.print();
	}
	
	
	private void addToFirstIndex(String data) {
		Node newNode = new Node(data);
		Node tmpNode = this.root;
		
		this.root = newNode;
		this.root.next = tmpNode;
	}
	
	
	public int findIndexOfElement(String data) {
		Node iter = this.root;
		int counter = 0;
		
		
		while(iter != null) {
			
			if(iter.data == data) {
				return counter; //successful case
			}
			counter++;
			iter = iter.next;
		
		}
		
		System.out.println("The data you are looking for does not exist!");
		return -1; //failed case
	}


	public void print() {
		Node iter = this.root;
				
				while(iter != null) {
					
					System.out.print(iter.data + " ");
					iter = iter.next;
				
				}
				System.out.println();
	}
}

