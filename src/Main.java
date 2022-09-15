public class Main {
    public static void main(String[] args){
        ThreadGroup group=new ThreadGroup("Поток группы 1");
        MyThread myThread1=new MyThread();
        MyThread myThread2=new MyThread();
        MyThread myThread3=new MyThread();
        MyThread myThread4=new MyThread();
        myThread1.setName("Я Поток 1. Всем привет!");
        myThread2.setName("Я Поток 2. Всем привет!");
        myThread3.setName("Я Поток 3. Всем привет!");
        myThread4.setName("Я Поток 4. Всем привет!");
        final Thread thread1=new Thread(group,myThread1);
        final Thread thread2=new Thread(group,myThread2);
        final Thread thread3=new Thread(group,myThread3);
        final Thread thread4=new Thread(group,myThread4);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        group.interrupt();
    }
}
