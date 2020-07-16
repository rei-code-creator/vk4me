import java.util.Vector;
import javax.microedition.lcdui.Image;

final class ib extends Thread {
  private final Vector a;
  
  private final gs a;
  
  ib(Vector paramVector, gs paramgs) {
    this.a = (gs)paramVector;
    this.a = paramgs;
  }
  
  public final void run() {
    for (byte b = 0; b < this.a.size(); b++) {
      try {
        ((r)this.a.elementAt(b)).a(hx.a(this.a.a[b]), (Image)null);
        gz.a.b();
      } catch (Exception exception) {}
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ib.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */