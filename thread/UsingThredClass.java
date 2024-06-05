class UsingThredClass extends Thread {
    private static UsingThredClass t1, t2, t3, t4;

    public void run() {
        System.out.println(this.getName() + " Priority: " + this.getPriority() + " isAlive: " + this.isAlive());

    }

    public static void main(String[] args) throws InterruptedException {
        t1 = new UsingThredClass();
        t2 = new UsingThredClass();
        t3 = new UsingThredClass();
        t4 = new UsingThredClass();
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");
        t1.setPriority(1);
        t2.setPriority(10);
        t4.setPriority(10);
        t1.join();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t4.sleep(1000);
        UsingThredClass.sleep(1000);
        System.out.println(t1.isAlive());
        System.out.println(currentThread());
    }
}
