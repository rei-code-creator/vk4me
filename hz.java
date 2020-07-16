import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class hz extends ay implements cc {
  private bw a;
  
  private Vector a;
  
  private int b;
  
  private boolean a;
  
  private boolean b;
  
  private ba a;
  
  public hz(bw parambw, int paramInt) {
    this.d = paramInt;
    this.n = true;
    a(parambw);
  }
  
  public final void d() {
    if (this.d > 0 && this.a == null && this.a != null)
      a((bw)this.a); 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt2 = this.f + paramInt2 + (this.b ? (this.d - this.b) : 0);
    paramInt1 = this.g + paramInt1;
    d();
    if (this.b && this.e > null)
      paramGraphics.drawImage(kp.b(this.b, this.e, (this.k && this.m), this.b), paramInt2, paramInt1, 20); 
    paramInt2 += a;
    paramGraphics.setColor(0);
    if (this.a != null) {
      int m = paramInt1 - ((gz)gz.a).g;
      int k = 0;
      if (m < 0)
        k = 0 + -m / (gg.a_ + ((gz)gz.a).a.a()); 
      int i = k;
      m = paramInt1;
      hz hz1 = this;
      m = m - ((gz)gz.a).g + hz1.e - ((gz)gz.a).h;
      int j = hz1.a.size();
      if (m > 0)
        j += -m / (gg.a_ + ((gz)gz.a).a.a()); 
      for (m = 0; m < j; m++) {
        if (m >= i)
          ((gz)gz.a).a.a(paramGraphics, this.a.elementAt(m), paramInt2, paramInt1, 20, (this.a == null)); 
        paramInt1 += ((gz)gz.a).a.a() + gg.a_;
      } 
    } 
  }
  
  public final bw a() {
    return (bw)this.a;
  }
  
  public final ay d(int paramInt) {
    if (this.b == paramInt)
      return this; 
    this.b = paramInt;
    this.a = null;
    this.a = false;
    a((bw)this.a);
    return this;
  }
  
  private void a(bw parambw) {
    this.a = (ba)parambw;
    if (parambw == null)
      return; 
    this.b = parambw.a;
    if (this.d > 0 && this.a == null && parambw.e()) {
      this.a = (ba)ay.a(parambw.a, this.d - a * 3, ((gz)gz.a).a);
      this.a = cp.a(parambw.a);
      this.e = this.a.size() * ((gz)gz.a).a.a() + (this.a.isEmpty() ? 0 : ((this.a.size() - 1) * gg.a_));
      int i = 0;
      for (byte b = 0; b < this.a.size(); b++) {
        int j = ((gz)gz.a).a.a(this.a.elementAt(b), (this.a == null));
        i = Math.max(i, j);
      } 
      i += a << 1;
      this.b = Math.max(this.b, i);
    } 
  }
  
  public final int a() {
    return this.b;
  }
  
  public final ay a(ba paramba) {
    this.a = paramba;
    return this;
  }
  
  public final void a() {
    gz.a.a(this.a);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/hz.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */