package Heaps;

public class Test {

	public static void main(String[] args) {
		MyHeap heap = new MyHeap();
		heap.insert(100);
		heap.insert(75);
		heap.insert(50);
		heap.insert(55);
		heap.insert(35);
		heap.insert(60);
		heap.insert(65);

		System.out.println(heap.getHeap());

		heap.remove();

		System.out.println(heap.getHeap());

		heap.remove();

		System.out.println(heap.getHeap());
		
		heap.remove();

		System.out.println(heap.getHeap());
		
		heap.remove();

		System.out.println(heap.getHeap());
		
		heap.remove();

		System.out.println(heap.getHeap());
		
		heap.remove();

		System.out.println(heap.getHeap());
	}

}
