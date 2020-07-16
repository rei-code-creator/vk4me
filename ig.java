final class ig extends Thread {
  private final jr a;
  
  ig(jr paramjr) {
    this.a = paramjr;
  }
  
  public final void run() {
    try {
      this.a.c();
    } catch (Exception exception) {
    
    } catch (OutOfMemoryError outOfMemoryError) {
      this.a.a();
    } 
    this.a.a = false;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ig.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */