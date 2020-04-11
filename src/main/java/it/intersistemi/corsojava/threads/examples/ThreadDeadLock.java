package it.intersistemi.corsojava.threads.examples;

public class ThreadDeadLock {

    public static void main(String[] args) {
        ThreadWaitingThread twt1 = new ThreadWaitingThread();
        ThreadWaitingThread twt2 = new ThreadWaitingThread();
        twt1.setOther(twt2);
        twt1.setOther(twt1);
        twt1.start();
        twt2.start();
        try {
            Thread.sleep(5000);
            twt1.interrupt();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class ThreadWaitingThread extends Thread{
        private Thread other;
        public void setOther(Thread other) {
            this.other = other;
        }
        @Override
        public void run() {
            if(this.other != null) {
                try {
                    this.other.join(10000);
                }catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
