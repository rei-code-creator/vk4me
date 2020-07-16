import javax.microedition.lcdui.Graphics;

public final class km extends ay implements cc {
  public bw a;
  
  private int b;
  
  private boolean a;
  
  private ba a;
  
  public km(bw parambw) {
    this.a = (ba)parambw;
    if (parambw != null)
      this.a = (ba)parambw.a; 
    this.r = true;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.b > 0)
      paramGraphics.drawImage(kp.a(this.b, (this.k && this.m), this.a), this.f + paramInt2 + ((this.a != null) ? (this.d - this.b) : 0), this.g + paramInt1, 20); 
  }
  
  public final bw a() {
    return (bw)this.a;
  }
  
  public final ay d(int paramInt) {
    if (this.b == paramInt)
      return this; 
    this.b = paramInt;
    return this;
  }
  
  public final int a() {
    return this.b;
  }
  
  public final void d() {}
  
  public final ay a(ba paramba) {
    this.a = paramba;
    return this;
  }
  
  public final void a() {
    gz.a.a(this.a);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/km.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */