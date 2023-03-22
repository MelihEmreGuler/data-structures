package week1.linkedListExample;

public class LinkedList {
	Node root;
	
	
	
public void insert (int data) {
				
		if(this.root == null) { 
			
			this.root= new Node(data);
			//return this;
		
		}else {
			
			Node iter = this.root;

			while(iter.next != null) {
				iter = iter.next;
			}
			iter.next = new Node(data);
			
			//return this;
		}
	}


	public void orderlyInsert(int data) {
		
		if(this.root == null)//if the list is empty;
			this.root = new Node(data);
		
		else if(data < this.root.data) {//change the root
			//change the root
			Node tmpRoot = this.root; //old root informations
			this.root = new Node(data); //our new root
			this.root.next = tmpRoot; //new root's next field is old root
			
		}else { //add between two list nodes
			
			Node iter = this.root;							  //           7	
			while(iter.next != null && iter.next.data < data) // 1 2 3 4 5  9 10
				iter = iter.next;
			
			Node tmpNode = iter.next; //old iter.next
			Node newNode = new Node(data);
			
			iter.next = newNode; //switches
			newNode.next = tmpNode;
			
		}
			
	}
	
	
	public void delete(int deletedData) {
		Node iter = this.root;
		
		if(this.root == null) { //control
			System.out.println("The list is already empty!");
			return;
		}
		
		if(this.root.data == deletedData){//is the first element deletedData?
			this.root = this.root.next;
			
		}else { 

			while(iter != null && iter.next.data != deletedData) {//find the previous element before the deletedData
				
				if(iter.next == null) { //if it is not found
					
					System.out.println("The data you want to delete " + "(" + deletedData + ")" + " was not found!");
					return;
				}
		
				iter = iter.next;
			}
			
				iter.next = iter.next.next; //the delete process
				
		}
		
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
