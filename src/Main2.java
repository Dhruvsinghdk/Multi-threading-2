


class A extends Thread  {
    public void run(){
      try{
          Thread.sleep(2000);
      }
      catch (Exception e){
          System.out.println("Thread");
      }
        System.out.println("Multi threading");

    }
}

//class B extends Thread{
//    public void run() {
//        for (int i = 0; ; i++) {
//            System.out.println("B = "+i);
//        }
//    }
//}
public class Main2 {
    public static void main(String[] args) {
        A n1 = new A();
        n1.start();

       A n2 = new A();
       n2.start();



    }
}
