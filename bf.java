final class bf extends Thread {
  private final ef a;
  
  bf(ef paramef) {
    this.a = paramef;
  }
  
  public final void run() {
    try {
      this.a.d();
    } catch (Exception exception) {
    
    } catch (OutOfMemoryError outOfMemoryError) {
      this.a.a();
    } 
    this.a.a = false;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/bf.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */