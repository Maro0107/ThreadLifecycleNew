public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
      //  thread.start();
        System.out.println(thread.getState());
    }
}
