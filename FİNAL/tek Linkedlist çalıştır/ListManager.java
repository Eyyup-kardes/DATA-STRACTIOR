public class ListManager {
    ListNode value;
    ListNode next;

    ListManager(){
        value = null;
        next = null;
    }
    ///---> Listemizin Doluluğunu Kontrol Edelim <---\\\
    public boolean listValueCheck(){
        if(value != null)
            return true;
        else
            return false;
    }
    ///---> Listemize Eleman Ekleyelim <---\\\
    public void listFirstAdd(int v){
        ListNode listNode = new ListNode(v);
        if(listValueCheck()==true){
            listNode.next = value;
            this.value = listNode;
        }
        else{

            this.value = listNode;
            this.next = listNode;
        }
    }
    public void listLastAdd(int v){
        ListNode listNode = new ListNode(v);
        if(listValueCheck()==true){
            next.next = listNode;
            next = listNode;
        }
        else{
            this.value = listNode;
            this.next = listNode;
        }
    }

    ///---> Listemizi Ekrana Yazdıralım <---\\\
    public void listWrite(){
        ListNode listNode = value;
        while(listNode != null){
            System.out.print("[ "+listNode.value +" ] ");
            listNode = listNode.next;
        }
    }
}