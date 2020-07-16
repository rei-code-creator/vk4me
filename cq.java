import javax.microedition.lcdui.Graphics;

public final class cq extends iv implements cc {
  private int h;
  
  private bw a;
  
  private boolean s;
  
  public cq(bw parambw, dv paramdv, int paramInt) {
    super(paramdv);
    this.n = true;
    this.h = paramInt - a;
    this.a = parambw;
    if (parambw != null)
      this.s = parambw.a; 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    String str = this.d;
    paramInt2 = paramInt2 + la.i + (this.s ? (str - (la.i << 1) - this.h) : 0);
    this.d = this.h;
    if (this.h > 0 && this.e)
      paramGraphics.drawImage(kp.b(this.h, this.e, (this.k && this.m), this.s), this.f + paramInt2, this.g + paramInt1, 20); 
    super.a(paramGraphics, paramInt1, paramInt2);
    this.d = str;
  }
  
  public final bw a() {
    return this.a;
  }
  
  public final ay d(int paramInt) {
    this.h = paramInt;
    c((String)this.a);
    b(this.c);
    a(this.f);
    return this;
  }
  
  public final int a() {
    return this.h;
  }
  
  public final ay a(ba paramba) {
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/cq.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */