import javax.microedition.lcdui.Graphics;

public class cj extends ay {
  public long a;
  
  public long b;
  
  public final void b() {
    if (this.a < 0L) {
      this.a = 0L;
      return;
    } 
    if (this.a > this.b)
      this.a = this.b; 
  }
  
  private cj(byte paramByte) {
    this(((gz)gz.a).a.getHeight() / 4);
  }
  
  public cj(int paramInt) {
    this.e = paramInt;
    b(100L);
    this.a = 0L;
    b();
  }
  
  public cj a(long paramLong) {
    this.a = paramLong;
    b();
    return this;
  }
  
  public final cj b(long paramLong) {
    this.b = paramLong;
    b();
    return this;
  }
  
  public cj() {
    this((byte)0);
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    b();
    kp.c(paramGraphics, this.f + paramInt2, this.g + paramInt1, this.d, this.e, 12895428, 16053492);
    kp.c(paramGraphics, this.f + paramInt2, this.g + paramInt1, (int)(this.d * this.a / this.b), this.e, 7708140, 4681404);
    if (this.k && this.m) {
      paramGraphics.setColor(4681404);
      paramGraphics.drawRect(this.f + paramInt2 - 1, this.g + paramInt1 - 1, this.d + 2, this.e + 2);
    } 
  }
  
  public final void d() {}
}


/* Location:              /home/kost/Загрузки/latest.jar!/cj.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */