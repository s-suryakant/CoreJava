package ThreadPoolDemo;

import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        MyRunnable[] jobs = {new MyRunnable("Job1"), new MyRunnable("Job2"), new MyRunnable("Job3"),
                            new MyRunnable("Job4"), new MyRunnable("Job5"), new MyRunnable("Job5")};

        ExecutorService service = Executors.newFixedThreadPool(3);

        for(MyRunnable job: jobs){
            service.submit(job);
        }

        service.shutdown();
    }

}
