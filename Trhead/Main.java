public class Main {
    static class MioThread extends Thread {
        public MioThread(String nome) {
            super(nome); 
        }

        @Override
        public void run() {
            System.out.println("esecuzione tramite ereditarietà: " + getName());
        }
    }

    static class MioRunnable implements Runnable {
        private String nome;

        public MioRunnable(String nome) {
            this.nome = nome;
        }

        @Override
        public void run() {
            System.out.println("esecuzione tramite runnable: " + nome);
        }
    }

    public static void main(String[] args) {
        MioThread t1 = new MioThread("thread 1");
        t1.start();

        MioRunnable mioRunnable = new MioRunnable("thread 2");
        Thread t2 = new Thread(mioRunnable);
        t2.start();

        Thread t3 = new Thread(() -> System.out.println("esecuzione tramite lambda"));
        t3.start();
    }
}