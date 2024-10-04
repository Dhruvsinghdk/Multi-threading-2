//class A extends Thread {
//    public void run() {
//        for (int i = 0; i <= 10 ; i++) {
//            System.out.println("A = "+i);
//        }
//    }
//}
//
//class B extends Thread{
//    public void run() {
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("B = "+i);
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        A n1 = new A();
//        n1.setPriority(2);
//        B n2 = new B();
//        n2.setPriority(1);
//
//        n1.start();
//        n2.start();
//    }
//}