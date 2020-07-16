import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class az extends ar {
  private String f = null;
  
  public az(String paramString) {
    super(paramString, (String)null);
  }
  
  public az() {
    super((String)null);
  }
  
  public final void b(String paramString) {
    this.a = paramString;
    this.d = null;
    this.f = null;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    kp.a(paramGraphics, this.f + paramInt2, this.g + paramInt1, this.d, this.e, (this.k && this.m));
    if (this.d > null) {
      if (this.a != null && (this.d == null || this.f == null)) {
        this.d = ay.a(this.a, this.d - 8, false, (Font)((gz)gz.a).a);
        String str = this.a;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null)
          for (byte b = 0; b < str.length(); b++)
            stringBuffer.append("*");  
        this.f = ay.a(stringBuffer.toString(), this.d - 8, false, (Font)((gz)gz.a).a);
      } 
      if (this.b != null && this.c == null)
        this.c = ay.a(this.b, this.d - 8, true, (Font)((gz)gz.a).a); 
    } 
    if (this.d != null && this.f != null && !this.d.trim().toLowerCase().equals("")) {
      paramGraphics.setFont((Font)((gz)gz.a).a);
      paramGraphics.setColor(0);
      paramGraphics.drawString((this.k && this.m) ? this.d : this.f, this.f + paramInt2 + 4, this.g + paramInt1 + (this.e - ((gz)gz.a).a.getHeight()) / 2, 20);
      return;
    } 
    if (this.c != null) {
      paramGraphics.setFont((Font)((gz)gz.a).a);
      paramGraphics.setColor(10790052);
      paramGraphics.drawString(this.c, this.f + paramInt2 + 4, this.g + paramInt1 + (this.e - ((gz)gz.a).a.getHeight()) / 2, 20);
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/az.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */