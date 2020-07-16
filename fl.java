import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class fl extends ay {
  public Image a;
  
  public Image b;
  
  private boolean b;
  
  public byte a;
  
  public int c_;
  
  public boolean a;
  
  public ad a = 4;
  
  public int b;
  
  public fl(Image paramImage) {
    this();
    a(paramImage);
  }
  
  public fl() {
    fl fl1;
    (fl1 = this).b = 13948116;
    fl1.b = null;
    this.e = u.a("action.reveal");
    this.m = false;
  }
  
  public final void a(Image paramImage) {
    this.a = (ad)paramImage;
    if (paramImage == null)
      this.b = 0; 
  }
  
  public final fl a(int paramInt1, int paramInt2) {
    if (paramInt1 == 0 || paramInt2 == 0) {
      this.e = Character.MIN_VALUE;
      return this;
    } 
    if (this.d == 0)
      this.d = gz.a.getWidth() - (la.i << 1); 
    int i = Math.min(this.d, paramInt1);
    if (this.c_ != 0)
      i = Math.min(this.c_, i); 
    this.e = paramInt2 * i / paramInt1;
    this.c_ = paramInt1 * this.e / paramInt2;
    return this;
  }
  
  public final void d() {
    if (this.b == 0 && this.a != null) {
      int i = Math.min(this.d, this.a.getWidth());
      if (this.c_ != 0)
        i = Math.min(this.c_, i); 
      this.a = (ad)kp.a((Image)this.a, this.a.getHeight() * i / this.a.getWidth());
      if (this.a != null)
        this.a = (ad)kp.a(((gz)gz.a).a.getHeight() / 2, (Image)this.a); 
      this.e = this.a.getHeight();
      this.b = null;
      this.b = 1;
    } 
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    d();
    byte b = -1;
    if (this.a != null) {
      byte b1 = (this.a == 4) ? 0 : ((this.a == 8) ? (this.d - this.a.getWidth()) : ((this.d - this.a.getWidth()) / 2));
      paramGraphics.drawRegion((Image)this.a, 0, (this.a.getHeight() - this.e) / 2, this.a.getWidth(), (this.a.getHeight() - this.e) / 2 + this.e, 0, this.f + paramInt2 + b1, this.g + paramInt1, 20);
      this.b = null;
    } else if (this.b != -1) {
      int i = Math.min(this.d, this.c_);
      if (this.b == null && i != 0 && this.e != null) {
        this.b = Image.createImage(i, this.e);
        Graphics graphics;
        (graphics = this.b.getGraphics()).setColor(this.b);
        if (this.a != null) {
          kp.a(graphics, 0, 0, i, this.e, ((gz)gz.a).a.getHeight() / 2, kp.a);
        } else {
          graphics.fillRect(0, 0, i, this.e);
        } 
      } 
      if (this.b != null) {
        byte b1 = (this.a == 4) ? 0 : ((this.a == 8) ? (this.d - this.b.getWidth()) : ((this.d - this.b.getWidth()) / 2));
        paramGraphics.drawImage(this.b, this.f + paramInt2 + b1, this.g + paramInt1, 20);
      } 
    } 
    if (this.k && this.m && b != -1) {
      paramGraphics.setColor(4681404);
      if (this.a == null) {
        paramGraphics.drawRect(this.f + paramInt2 + b, this.g + paramInt1, this.a.getWidth(), this.a.getHeight());
        return;
      } 
      kp.b(paramGraphics, this.f + paramInt2 + b, this.g + paramInt1, this.a.getWidth(), this.a.getHeight(), ((gz)gz.a).a.getHeight() / 2, kp.a);
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/fl.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */