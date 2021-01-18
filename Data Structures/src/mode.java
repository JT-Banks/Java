
public class mode {

	private Node next;
	private int key;
	private int freq;
	private Node node;
	HashTable hash = new HashTable(node);
	public static void main(String[] args) {
		
	}
	
	public mode(int key, int freq, Node next, Node node) {
		this.key = key;
		this.freq = freq;
		this.next = next;
		this.node = node;
	}
	public int getKey() {
		return key;
	}
	
	public int getFreq() {
		return freq;
	}
	public Node getNext() {
		return next;
	}
	int h(int k) {
		return (k*7193 % node);
	}
}

