package homeworktree1;

class Queue{
    
    Student head;
    Student tail;
    private int size;
    
    
    public Queue(){
        
        head = tail = null;
        size = 0;
        
    }
    
    
    public void enqueue(Student student){
        
        if(!isEmptyQueue())
            tail.node = student;
        else
            head = student;
        
        
        tail = student;
        size++;
        
    }
    
    
    public int dequeue(){
        
        if(!isEmptyQueue())
        {
            int val = head.number;
            head = head.node;
            
            
            if(head == null)
                tail = null;
            
            
            size--;
            return val;
        }
        
        return -1;
    
    }
    
    
    public Student peekQueue(){
        
        return head;
    
    }
    
    
    public boolean isEmptyQueue(){
        
        return (head == null);
        
    }
    
    
    public int getSizeQueue(){
        
        return size;
    
    }
    
}

class BinarySearchTree{
    
    Student root;
    private int size;
    
    public BinarySearchTree(){
        
        root = null;
        size = 0;
    
    }
    
    
    void AddTree(Student student){
        
        Student iter = root;
        Student prev = root;
        
        if(iter == null)
            root = student;
        
        
        else
        {
            
            do{
                
               prev = iter;
               
               if(student.number < iter.number)
                   iter = iter.leftNode;
               else
                   iter = iter.rightNode;
               
            }while(iter != null);
            
            
            if(student.number < prev.number)
                prev.leftNode = student;
            else
                prev.rightNode = student;
            
            
            student.prev = prev;
        }
        
        size++;
    }
    
    
    boolean DeleteTree(int number){
        
        Student find = FindTree(number);
        
        if(find == null)
            return false;
        
        
        if(find == root)
            RootDeleteTree(find);
        else
            GenericDeleteTree(find);
        
        
        size--;
        return true;
    }
    
    
    private void RootDeleteTree(Student find){
        
        if(find.leftNode == null && find.rightNode == null)
             root = null;
        
        
        else if (find.leftNode == null)
             root = find.rightNode;
        
        
        else
        {
            Student iter = root.leftNode;
            Student temp = iter;
            
            
            while(iter.rightNode != null)
                iter = iter.rightNode;
            
            
            root = iter;
            
            /* En sağın sol tarafı dolu ise */
            if(iter.leftNode != null)
                iter.prev.rightNode = iter.leftNode;
            else
                iter.prev.rightNode = null;
            
            
            root.leftNode = temp; // Yeni kökün soluna eski kökün solunu ekle
            iter.rightNode = temp.prev.rightNode; // Yeni kökün sağına eski kökün sağını ekle
        }
        
    }
    
    
    private void GenericDeleteTree(Student find){
       
       if(find.leftNode == null && find.rightNode == null)
       {
           if(find.prev.number > find.number)
               find.prev.leftNode = null;
           else
               find.prev.rightNode = null;
       }
       
        
       else if(find.leftNode == null)
       {
           if(find.prev.number > find.number)
               find.prev.leftNode = find.rightNode;
           else
               find.prev.rightNode = find.rightNode;
       }
       
       
       else
       {
           Student iter = find.leftNode;
           Student temp = find;
           
           while(iter.rightNode != null)
               iter = iter.rightNode;
           
           /* Silinecek değerin previ sağ mı sol mu onu bul*/
           if(find.prev.number > find.number)
               find.prev.leftNode = iter;
           else
               find.prev.rightNode = iter;
           
           
           iter.rightNode = temp.rightNode; // Silinecek yere eklenecek değerin sağ tarafına, silinecek değerin sağ tarafını taşı.
          
           
           if(iter.prev == temp)
               iter.prev.leftNode = null;
           else{
               if(iter.leftNode != null)
                   iter.prev.rightNode = iter.leftNode; // iter'in sol tarafı boş değilse, iter'in öncesinin sağına iter'in solunu ata.
               else
                   iter.prev.rightNode = null;
           }
               
           
       }
       
    }
    
    
    Student FindTree(int number){
        
        Student iter = root;
        
        while(iter != null)
        {
            if(number == iter.number)
                return iter;
        
            
            if(number < iter.number)
                iter = iter.leftNode;
            else
                iter = iter.rightNode;
        }
        
        return null;
    }
    
    
    void InOrder(Student iter){
        
        if(iter == null)
            return;
        
        InOrder(iter.leftNode);
        
        System.out.print(iter.number + " ");
        
        InOrder(iter.rightNode);
        
    }
    
    
    void PreOrder(Student iter){
        
        if(iter == null)
            return;
        
        System.out.print(iter.number + " ");
        
        PreOrder(iter.leftNode);
        
        PreOrder(iter.rightNode);
        
    }
    
    
    void PostOrder(Student iter){
        
        if(iter == null)
            return;
        
        
        PostOrder(iter.leftNode);
        
        PostOrder(iter.rightNode);
        
        System.out.print(iter.number + " ");
        
    }
    
    
    void LevelOrder(){
        
        Queue queue = new Queue();
        queue.enqueue(root);
        
        while(queue.peekQueue() != null){
            
            
            if(queue.head.leftNode != null)
                queue.enqueue(queue.head.leftNode);
            
            
            if(queue.head.rightNode != null)
                queue.enqueue(queue.head.rightNode);
            
            
            System.out.print(queue.dequeue()+ " ");
        
        }
    }
    
    
    int MinTree(){
        
        Student iter = root;
        
        if(!IsEmptyTree())
        {
            while(iter.leftNode != null)
                iter = iter.leftNode;
            
            return iter.number;
        }
        
       return -1;
    }
    
    
    int MaxTree(){
       
        Student iter = root;
       
       if(!IsEmptyTree())
       {
            while(iter.rightNode != null)
                iter = iter.rightNode;
            
            return iter.number;
       }
       
       return -1;
    }
    
    
    boolean IsEmptyTree(){
        
        return (size == 0);
        
    }
    
    
    int GetSizeTree(){
        
        return size;
        
    }
}

class Student{
    
    int number;
    String name;
    int grade;
    Student prev;
    Student node;
    Student leftNode;
    Student rightNode; 
    
    public Student(int number, String name, int grade){
        
        this.number = number;
        this.name = name;
        this.grade = grade;
        prev = node = leftNode = rightNode = null;
        
    }
    
}

public class HomeworkTree1 {
    
    public static void main(String[] args) {
        
        BinarySearchTree bst = new BinarySearchTree();
        
        
        Student stu1 = new Student(8, "Kaan", 90);
        Student stu2 = new Student(3, "Tuğrul", 50);
        Student stu3 = new Student(10, "Aydemir Bey", 35);
        Student stu4 = new Student(14, "Azat Bey", 20);
        Student stu5 = new Student(13, "Gaffar Bey", 100);
        Student stu6 = new Student(1, "İsmet Bey", 76);
        Student stu7 = new Student(5, "Mansur Bey", 97);
        Student stu8 = new Student(4, "Semiha Hanım", 11);
        Student stu9 = new Student(7, "Agah Bey", 92);
        Student stu10 = new Student(6, "Stuart Efendi", 33);
        Student stu11 = new Student(18, "GBM-X", 21);
        
        
        
        bst.AddTree(stu1);
        bst.AddTree(stu2);
        bst.AddTree(stu3);
        bst.AddTree(stu4);
        bst.AddTree(stu5);
        bst.AddTree(stu6);
        bst.AddTree(stu7);
        bst.AddTree(stu8);
        bst.AddTree(stu9);
        bst.AddTree(stu10);
        bst.AddTree(stu11);
        
        
        System.out.println("Toplam öğrenci sayısı: " + bst.GetSizeTree());
        System.out.println("Min öğrenci numarası: " + bst.MinTree());
        System.out.println("Maks öğrenci numarası: " + bst.MaxTree());
        System.out.println("Aranan kişinin ismi: " + bst.FindTree(13).name);
        
        
        System.out.println("Silme işlemi: " + bst.DeleteTree(6));
        //System.out.println(bst.DeleteTree(5));
        //System.out.println(bst.root.rightNode.rightNode.rightNode.name);
        
        
        System.out.print("\nLevelorder: ");
        bst.LevelOrder();
        
        
        System.out.print("\nİnorder(LNR): ");
        bst.InOrder(bst.root);
        
        
        System.out.print("\nPreorder(NLR): ");
        bst.PreOrder(bst.root);
        
        
        System.out.print("\nPostorder(LRN): ");
        bst.PostOrder(bst.root);
        
        
        
        System.out.println("");
    }
}
