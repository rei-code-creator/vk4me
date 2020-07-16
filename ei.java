import java.util.Vector;
import javax.microedition.lcdui.Image;

final class ei extends Thread {
  private final Vector a;
  
  ei(Vector paramVector) {
    this.a = paramVector;
  }
  
  public final void run() {
    for (byte b = 0; b < this.a.size(); b++) {
      try {
        ((r)this.a.elementAt(b)).a(hx.a(((lb)((r)this.a.elementAt(b)).a).a()), (Image)null);
        gz.a.b();
      } catch (Exception exception) {}
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ei.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */