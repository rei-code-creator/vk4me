import javax.microedition.lcdui.Graphics;

public final class as extends ay implements cc {
  private bw a;
  
  private int b;
  
  private boolean a;
  
  private boolean b;
  
  private ba a;
  
  public as(bw parambw) {
    this.r = true;
    this.n = true;
    this.a = (ba)parambw;
    if (parambw != null)
      this.a = (ba)parambw.a; 
  }
  
  public as(bw parambw, boolean paramBoolean) {
    this(parambw);
    this.b = paramBoolean;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    if (this.b && this.e > null) {
      paramInt2 = this.f + paramInt2 + ((this.a != null) ? (this.d - this.b) : 0);
      paramInt1 = this.g + paramInt1;
      paramGraphics.drawImage(kp.b(this.b, this.e, (this.k && this.m), this.a), paramInt2, paramInt1, 20);
      if (!this.b)
        return; 
      paramInt2 += a;
      paramGraphics.setColor((this.a != null) ? 4681404 : 6579300);
      paramGraphics.fillRect(paramInt2, paramInt1, gg.a_, this.e);
    } 
  }
  
  public final bw a() {
    return (bw)this.a;
  }
  
  public final ay d(int paramInt) {
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


/* Location:              /home/kost/Загрузки/latest.jar!/as.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */