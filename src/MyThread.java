public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Создаю потоки...");
        try {
            while (true) {
                Thread.sleep(300);
                System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
        } finally {
            System.out.println(" завершен\n" + getName());
        }
    }
}
