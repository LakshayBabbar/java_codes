class SyncThread {
    synchronized void display(int no) {
        for (int i = 1; i < 5; i++) {
            System.out.println(no * i);
        }
    }
}

class synchronisedThred extends Thread {
    SyncThread obj = new SyncThread();
    int no;

    synchronisedThred(int no) {
        this.no = no;
    }

    public void run() {
        obj.display(no);
    }

    public static void main(String[] args) {
        synchronisedThred t1, t2;
        t1 = new synchronisedThred(5);
        t2 = new synchronisedThred(10);
        t1.start();
        t2.start();
    }
}