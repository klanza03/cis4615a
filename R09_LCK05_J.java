
// Rule 09. Locking
// Example LCK05-J: Synchronize access to static fields that can be modified by untrusted code


/* This class is not thread-safe */
public final class CountHits {
    private static int counter;
   
    public void incrementCounter() {
      counter++;
    }
  }