import java.util.TimerTask;

final class ky extends TimerTask {
  private final gz a;
  
  ky(gz paramgz) {
    this.a = paramgz;
  }
  
  public final void run() {
    this.a.j = (this.a.j + 1) % 12;
    if (this.a.a != null)
      this.a.b(); 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ky.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */