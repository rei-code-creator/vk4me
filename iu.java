import javax.microedition.lcdui.Graphics;

public final class iu extends ay implements cc {
  private bw a;
  
  private bw b;
  
  private is a;
  
  private String a;
  
  private String b;
  
  private String c;
  
  private int b;
  
  private boolean a;
  
  private boolean b;
  
  private ba a;
  
  public iu(bw parambw1, is paramis, bw parambw2, int paramInt) {
    this.d = paramInt;
    this.n = true;
    d();
    this.a = (ba)parambw1;
    if (parambw1 != null)
      this.a = (ba)parambw1.a; 
    this.a = (ba)paramis;
    a(parambw2);
  }
  
  public final void d() {
    this.e = ((gz)gz.a).a.a() + gg.a_ + ((gz)gz.a).b.a();
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    d();
    if (this.a == null || this.c == null || this.b == null)
      a(this.b); 
    paramInt2 = this.f + paramInt2 + ((this.a != null) ? (this.d - this.b) : 0);
    paramInt1 = this.g + paramInt1;
    if (this.b && this.e > null)
      paramGraphics.drawImage(kp.b(this.b, this.e, (this.k && this.m), this.a), paramInt2, paramInt1, 20); 
    paramInt2 += a;
    paramGraphics.setColor((this.a != null) ? 4681404 : 6579300);
    paramGraphics.fillRect(paramInt2, paramInt1, gg.a_, this.e);
    paramInt2 += gg.a_ * 3;
    paramGraphics.setColor(0);
    if (this.a != null)
      ((gz)gz.a).b.a(paramGraphics, (String)this.a, paramInt2, paramInt1, 20, true); 
    if (this.b != null)
      ((gz)gz.a).a.a(paramGraphics, this.b, paramInt2 + ((this.a == null) ? 0 : ((gz)gz.a).b.a((String)this.a, true)), paramInt1, 20, true); 
    paramInt1 = paramInt1 + ((gz)gz.a).b.a() + gg.a_;
    if (this.c != null)
      ((gz)gz.a).a.a(paramGraphics, this.c, paramInt2, paramInt1, 20, !this.b); 
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
  
  private void a(bw parambw) {
    this.b = parambw;
    if (parambw == null || this.a == null || this.d <= 0)
      return; 
    int j = this.d - a * 3 - gg.a_ * 3;
    this.c = ((gz)gz.a).a.a(parambw.a(false, !this.a.c(), false, true, true), j, true);
    this.b = cp.a(this.c);
    this.b = ((gz)gz.a).a.a(" " + ab.b(parambw.a()), j, true);
    lb lb;
    if ((lb = au.a(parambw.c)) != null)
      this.a = (ba)((gz)gz.a).b.a(lb.c("nom"), j - ((this.b == null) ? 0 : ((gz)gz.a).a.a(this.b, true)), true); 
    int i = Math.max(((gz)gz.a).a.a(this.c, !this.b), ((this.a == null) ? 0 : ((gz)gz.a).b.a((String)this.a, true)) + ((gz)gz.a).a.a(this.b, true));
    this.b = Math.max(this.b, (a << 1) + gg.a_ * 3 + i);
  }
  
  public final ay a(ba paramba) {
    this.a = paramba;
    return this;
  }
  
  public final void a() {
    gz.a.a(this.a);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/iu.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */