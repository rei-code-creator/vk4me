import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public class ar extends ay implements hv {
  String a;
  
  String b;
  
  String c;
  
  String d;
  
  public final void a(String paramString) {
    this.b = paramString;
    this.c = null;
  }
  
  public void b(String paramString) {
    this.a = paramString;
    this.d = null;
  }
  
  public ar(String paramString1, String paramString2) {
    a(paramString1);
    b(paramString2);
    this.e = ((gz)gz.a).a.getHeight() + 8;
  }
  
  public ar(String paramString) {
    this(paramString, (String)null);
  }
  
  public ar() {
    this((String)null);
  }
  
  public final void a() {
    gz.a(this);
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    kp.a(paramGraphics, this.f + paramInt2, this.g + paramInt1, this.d, this.e, (this.k && this.m));
    if (this.d > null) {
      if (this.a != null && this.d == null)
        this.d = ay.a(this.a, this.d - 8, true, (Font)((gz)gz.a).a); 
      if (this.b != null && this.c == null)
        this.c = ay.a(this.b, this.d - 8, true, (Font)((gz)gz.a).a); 
    } 
    if (this.d != null && !this.d.trim().toLowerCase().equals("")) {
      paramGraphics.setFont((Font)((gz)gz.a).a);
      paramGraphics.setColor(0);
      paramGraphics.drawString(this.d, this.f + paramInt2 + 4, this.g + paramInt1 + (this.e - ((gz)gz.a).a.getHeight()) / 2, 20);
      return;
    } 
    if (this.c != null) {
      paramGraphics.setFont((Font)((gz)gz.a).a);
      paramGraphics.setColor(10790052);
      paramGraphics.drawString(this.c, this.f + paramInt2 + 4, this.g + paramInt1 + (this.e - ((gz)gz.a).a.getHeight()) / 2, 20);
    } 
  }
  
  public void d() {}
}


/* Location:              /home/kost/Загрузки/latest.jar!/ar.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */