/*
 * Inefficient way to create a linked list
 */
class Node {
		public static void main(String[] args) {
			Node x = new Node(1, null);
			Node y = new Node(2, x);
			System.out.println(y.getNext().getData());
		}
		private int data;
		private Node next;
		
		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		
		}
		
		public int getData() {
			return data;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setData(int d) {
			data = d;
		}
		
		public void setNext(Node n) {
			next = n;
		}
	}