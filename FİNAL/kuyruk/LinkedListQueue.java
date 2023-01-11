class LinkedListQueue
{
   private Node front, rear; 
   private int queueSize; // kuyruğun boyutu
    
   
   private class Node { 
     int data;
     Node next;
   }
  
   
   public LinkedListQueue()
   {
     front = null;
     rear = null;
     queueSize = 0;
   }
 
 
  
   public boolean isEmpty()// kuyruğun durumunu kontrol et
   {
     return (queueSize == 0);
   }
  
   //Öğeyi kuyruğun önünden kaldırın.
   public int dequeue()
   {
     int data = front.data;
     front = front.next;
     if (isEmpty()) 
     {
       rear = null;
     }
     queueSize--;
     System.out.println("sayı  " + data+ " silindi");
     return data;
   }
  
   //Kuyruğun en arkasına eleman ekleme
   public void enqueue(int data)
   {
     Node oldRear = rear;
     rear = new Node();
     rear.data = data;
     rear.next = null;
     if (isEmpty()) 
     {
       front = rear;
     }
     else  {
       oldRear.next = rear;
     }
     queueSize++;
     System.out.println("sayı  " + data+ " verisi eklendi");
   }
   // kuyruğun son halini yazdır
   public void print_frontRear() {
     System.out.println("Kuyruğun önü:" + front.data 
     + " Kuyruğun sonu:" + rear.data);
   }
  }