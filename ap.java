import javax.microedition.lcdui.Graphics;

public class ap extends r {
  private ba a;
  
  public ap(String paramString, ba paramba) {
    super(paramString, (paramba != null && paramba.b) ? 2 : 0);
    this.a = paramba;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    c(this.m ? 13948116 : 6579300);
    d(this.m ? 16777215 : 6579300);
    super.a(paramGraphics, paramInt1, paramInt2);
  }
  
  public ap(String paramString) {
    this(paramString, (ba)null);
  }
  
  public void a() {
    if (this.a != null && this.a.b)
      gz.a.a(this.a); 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ap.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */