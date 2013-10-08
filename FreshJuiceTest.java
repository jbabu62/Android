class FreshJuice {

   enum FreshJuiceSize{ male,female }
   FreshJuiceSize size;
}

public class FreshJuiceTest {

   public static void main(String args[]){
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice. FreshJuiceSize.male ;
      System.out.println("Size: " + juice.size);
   }
}