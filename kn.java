import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class kn extends r {
  public Vector a;
  
  public int h;
  
  public boolean s = true;
  
  public int i;
  
  is a;
  
  public int j;
  
  public final kn a(is paramis) {
    if (paramis == null)
      return this; 
    this.a = paramis;
    this.i = paramis.a();
    lb lb = paramis.b() ? au.a(paramis.a()) : null;
    this.s = true;
    if (this.a == null) {
      c("");
      a(hx.a, (Image)null);
      if (bc.a != null && ((bc)bc.a).a != null)
        ((bc)bc.a).a.addElement(this); 
    } 
    (a(fw.a(lb)).a(paramis).a(paramis.a())).q = false;
    return this;
  }
  
  public final kn a(bw parambw) {
    if (this.a == null || parambw == null)
      return this; 
    this.j = parambw.a();
    this.h = parambw.a;
    g();
    (c(parambw.a(true, this.a.b(), true, true, true))).q = false;
    return this;
  }
  
  public kn(int paramInt, at paramat) {
    super(null, (byte)0);
    this.q = true;
    this.n = true;
    a(true, true);
    a(true);
    this.i = paramInt;
    this.a = (is)new Vector();
    if (paramat != null)
      for (paramInt = 0; paramInt < paramat.a.size(); paramInt++) {
        int i;
        if ((i = paramat.a(paramInt)) != 0)
          this.a.addElement(new Integer(i)); 
      }  
  }
  
  public final void a() {
    a(this.i);
  }
  
  public static void a(int paramInt) {
    lc lc;
    if ((lc = (lc)(new bn()).a(paramInt).a()) == null || !lc.b())
      return; 
    fw.d();
    ((gz)gz.a).f = 3;
    hs hs = new hs(lc.a());
    gz.a.b(hs);
  }
  
  public final void g() {
    this.d = null;
    if (this.a.size() > 0) {
      this.c = "+" + this.a.size();
      b(4681404);
      return;
    } 
    if (this.j > 0) {
      this.c = ab.b(this.j);
      b(-1);
      return;
    } 
    this.c = null;
  }
  
  public final kn a(int paramInt) {
    this.a.removeElement(new Integer(paramInt));
    g();
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/kn.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */