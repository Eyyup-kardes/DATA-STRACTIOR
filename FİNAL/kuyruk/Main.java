 
class Main {
  public static void main(String[] args) {
   LinkedListQueue queue = new LinkedListQueue();
 
 queue.enqueue(3); // kuyruğa 3 ekle
 queue.enqueue(5); // 5 ekle
 queue.print_frontRear();  // kuyruğun önü 3 kuyruğun sonu 5
 queue.enqueue(10); // 10 sayısını ekle
 queue.enqueue(24);  // 24 ekle
 queue.dequeue(); // 3 silindi
 queue.dequeue(); // 5 silindi 
 queue.enqueue(9); // 9 eklendi
 
 queue.print_frontRear();     // kuyruğun önü 10 sonu 9 
  }
}