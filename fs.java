final class fs implements Runnable {
  private final dm a;
  
  fs(dm paramdm) {
    this.a = paramdm;
  }
  
  public final void run() {
    this.a.a.b();
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/fs.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */