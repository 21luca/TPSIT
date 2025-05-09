class Saluto extends Thread {
    public Saluto(String nome) {
        super(nome);
    }

    @Override
    public void run() {
        System.out.println("thread che saluta. creato come estensione della classe thread");
    }
}

class mioSaluto implements Runnable {
    @Override
    public void run() {
        System.out.println("thread eseguito tramite runnable");
    }
}

public class SalutoMain {
    public static void main(String[] args) {
        Saluto t1 = new Saluto("thread esteso");
        t1.start();

        mioSaluto runnableObj = new mioSaluto();
        Thread t2 = new Thread(runnableObj);
        t2.start();

        Thread t3 = new Thread(() -> {
            System.out.println("sto usando lamda expression");
        });
        t3.start();
    }
}