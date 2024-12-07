
// Rule 10. Thread APIs
// Example THI01-J: Do not invoke ThreadGroup methods

public final class R10_THI01_J {
  private final ExecutorService executor;
 
  R10_THI01_J(int poolSize) {
    this.executor = Executors.newFixedThreadPool(poolSize);
  }
 
  public void startThreads() {
    for (int i = 0; i < 3; i++) {
      executor.execute(new HandleRequest());
    }
  }
 
  public void shutdownPool() {
    executor.shutdown();
  }
 
  public static void main(String[] args)  {
    R10_THI01_J nh = new R10_THI01_J(3);
    nh.startThreads();
    nh.shutdownPool();
  }
}