import javax.microedition.lcdui.Graphics;

public class w extends cj implements hv {
  public int a = this.e / 4;
  
  private int b;
  
  public void a(long paramLong) {}
  
  public w(int paramInt) {
    b(100L);
    this.a = paramInt;
    b();
  }
  
  public w() {
    this(0);
  }
  
  public final ay b(int paramInt1, int paramInt2, int paramInt3) {
    this.k = (this.k && paramInt1 <= this.f + this.d && paramInt1 >= this.f);
    if (this.k) {
      this.a = gz.a((paramInt1 - this.f + this.a / 2) * this.b / (this.d - this.a / 2));
      b();
    } 
    return this;
  }
  
  public final cj a(long paramLong) {
    super.a(paramLong);
    a(this.a);
    return this;
  }
  
  public final ay a(int paramInt1, int paramInt2, int paramInt3) {
    super.a(paramInt1, paramInt2, paramInt3);
    b();
    a(this.a);
    return this;
  }
  
  public final ay a(int paramInt) {
    this.b = 0;
    switch (paramInt) {
      case 2:
        this.a -= this.b / 20L;
        b();
        a(this.a);
        break;
      case 5:
        this.a += this.b / 20L;
        b();
        a(this.a);
        break;
    } 
    return this;
  }
  
  public final ay b(int paramInt) {
    this.b++;
    switch (paramInt) {
      case 2:
        this.a -= this.b * this.b * 3L / 40L;
        b();
        break;
      case 5:
        this.a += this.b * this.b * 3L / 40L;
        b();
        break;
    } 
    return this;
  }
  
  public final ay c(int paramInt) {
    b();
    this.b = 0;
    a(this.a);
    return this;
  }
  
  public final ay c(int paramInt1, int paramInt2, int paramInt3) {
    super.c(paramInt1, paramInt2, paramInt3);
    if (this.k) {
      this.a = gz.a((paramInt1 - this.f + this.a / 2) * this.b / (this.d - this.a / 2));
      b();
      a(this.a);
    } 
    return this;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    b();
    kp.c(paramGraphics, this.f + paramInt2, this.g + paramInt1 + (this.e - this.a) / 2, this.d, this.a, 12895428, 16053492);
    kp.c(paramGraphics, this.f + paramInt2, this.g + paramInt1 + (this.e - this.a) / 2, (int)(this.d * this.a / this.b), this.a, 7708140, 4681404);
    paramGraphics.drawImage(kp.b(this.e, (this.k && this.m)), (int)((this.f + paramInt2 + kp.b(this.e, (this.k && this.m)).getWidth() / 2) + (this.d - kp.b(this.e, (this.k && this.m)).getWidth()) * this.a / this.b), this.g + paramInt1, 17);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/w.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */