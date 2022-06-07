class Publisher
 {
   String  publisher;
   Publisher(String p)
    {
      this.publisher=p;
    }
 }
class Book
 {
   String name;
   Publisher publisher;
   Book()
    {
      
    }
   public Book(String name,Publisher publisher)
    {
      this.name=name;
      this.publisher=publisher;
    }
 }
class Literature extends Book
 {
   String Littype="Literature";
   Literature(String name,Publisher publisher)
    {
      super(name,publisher);
    }
   void display()
    {
      System.out.println("\nName:"+super.name);
      System.out.println("\nType:"+this.Littype);
      System.out.println("\nPublisher:"+this.publisher.publisher);
    }
 }
class Fiction extends Book
 {
   String Littype="Fiction";
   Fiction(String name,Publisher publisher)
    {
      super(name,publisher);
    }
   void display()
    {
      System.out.println("\nName:"+super.name);
      System.out.println("\nType:"+this.Littype);
      System.out.println("\nPublisher:"+this.publisher.publisher);
    }
 }
class Bookmain
 {
   public static void main(String[] args)
    {
      Publisher lp=new Publisher("S.chand");
      Literature l=new Literature("As you like it",lp);
      l.display();
      Publisher fp=new Publisher("Tata Mc Graw Hill");
      Literature f=new Literature("Two Amigos",fp);
      f.display();
    }
 }
