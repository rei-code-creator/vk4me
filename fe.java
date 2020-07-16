import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public class fe extends ay {
  public String f;
  
  public String g;
  
  private int a;
  
  public void a(String paramString) {
    this.f = paramString;
    this.g = null;
  }
  
  public fe(String paramString) {
    a(paramString);
    this.e = ((gz)gz.a).a.getHeight() + 8;
  }
  
  public fe() {
    this((String)null);
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramGraphics.drawImage(kp.a(this.d, this.e, (this.k && this.m)), this.f + paramInt2, this.g + paramInt1, 20);
    if (this.d > 0 && this.f != null && this.g == null) {
      this.g = ay.a(this.f, this.d - 8, true, (Font)((gz)gz.a).a);
      this.a = ((gz)gz.a).a.stringWidth(this.g);
    } 
    if (this.g != null) {
      paramGraphics.setFont((Font)((gz)gz.a).a);
      paramGraphics.setColor((this.k && this.m) ? 16777215 : 3223601);
      paramGraphics.drawString(this.g, this.f + (this.d - this.a) / 2 + paramInt2, this.g + paramInt1 + (this.e - ((gz)gz.a).a.getHeight()) / 2, 20);
    } 
  }
  
  public void d() {}
}


/* Location:              /home/kost/Загрузки/latest.jar!/fe.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */