import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class r extends fe implements fp {
  public boolean a;
  
  public ad a;
  
  public boolean b;
  
  public boolean c;
  
  public boolean d;
  
  public Image a;
  
  public Image b;
  
  public byte a;
  
  public int b_ = 10396590;
  
  public int b;
  
  public int c;
  
  private int h;
  
  public boolean e;
  
  public String a = false;
  
  public String b;
  
  public String c = Character.MIN_VALUE;
  
  public String d = '\001';
  
  public boolean f;
  
  public boolean g;
  
  public boolean h;
  
  public boolean i;
  
  public boolean j;
  
  public static Image[] a = new Image[] { kp.a(gz.a("online.png"), ((gz)gz.a).a.a()), kp.a(gz.a("onlinemob.png"), ((gz)gz.a).a.a()), kp.a(gz.a("onlineandr.png"), ((gz)gz.a).a.a()), kp.a(gz.a("onlineios.png"), ((gz)gz.a).a.a()), kp.a(gz.a("onlinewin.png"), ((gz)gz.a).a.a()), kp.a(gz.a("onlineme.png"), ((gz)gz.a).a.a()) };
  
  public static Image[] b = new Image[] { kp.a(gz.a("nickonline.png"), ((gz)gz.a).a.a()), kp.a(gz.a("nickonlinemob.png"), ((gz)gz.a).a.a()), kp.a(gz.a("nickonlineandr.png"), ((gz)gz.a).a.a()), kp.a(gz.a("nickonlineios.png"), ((gz)gz.a).a.a()), kp.a(gz.a("nickonlinewin.png"), ((gz)gz.a).a.a()), kp.a(gz.a("nickonlineme.png"), ((gz)gz.a).a.a()) };
  
  public final r a(int paramInt) {
    this.b = paramInt;
    if (!this.f)
      this.g = null; 
    return this;
  }
  
  public final r a() {
    this.i = true;
    return this;
  }
  
  public final r a(ad paramad) {
    this.a = (Image[])paramad;
    return this;
  }
  
  public final r b(int paramInt) {
    this.b_ = (paramInt == -1) ? 10396590 : paramInt;
    return this;
  }
  
  public final r c(int paramInt) {
    this.c = (paramInt == -1) ? 0 : paramInt;
    return this;
  }
  
  public final r d(int paramInt) {
    this.h = (paramInt == -1) ? true : paramInt;
    return this;
  }
  
  public final r a(boolean paramBoolean1, boolean paramBoolean2) {
    this.d = paramBoolean1;
    this.c = paramBoolean2;
    return this;
  }
  
  public final r a(String paramString1, String paramString2) {
    a(kp.a(paramString1, (this.a != null)), kp.a(paramString2, (this.a != null)));
    c((String)this.a);
    b(this.c);
    return this;
  }
  
  public final r a(Image paramImage1, Image paramImage2) {
    this.a = (Image[])paramImage1;
    this.b = (Image[])paramImage2;
    if (this.b == null && this.a != null) {
      this.b = this.a;
    } else if (this.a == null && this.b != null) {
      this.a = this.b;
    } 
    c((String)this.a);
    b(this.c);
    return this;
  }
  
  public void a() {
    if (this.a == true) {
      this.e = !this.e;
      b();
    } 
  }
  
  public void b() {}
  
  public final void c() {
    this.e = u.a((this.a == null) ? this.e : ((this.a == true) ? (this.e ? "action.uncheck" : "action.check") : "action.goTo"));
  }
  
  public final void a(String paramString) {
    this.f = paramString;
    this.g = null;
    this.a = false;
  }
  
  public final r a(String paramString) {
    a(paramString);
    return this;
  }
  
  public final r b(String paramString) {
    this.c = paramString;
    this.d = null;
    this.a = false;
    a(this.f);
    return this;
  }
  
  public final r a(boolean paramBoolean) {
    this.b = paramBoolean;
    a(this.f);
    return this;
  }
  
  public final r c(String paramString) {
    this.a = (Image[])paramString;
    d();
    this.b = null;
    this.f = (this.a != null);
    this.a = false;
    a(this.f);
    return this;
  }
  
  public r(String paramString, byte paramByte) {
    super(paramString);
    this.c = Character.MIN_VALUE;
    this.h = true;
    c();
    this.a = paramByte;
    this.e = ((gz)gz.a).a.a() << 1;
  }
  
  public r(String paramString) {
    this(paramString, (byte)0);
  }
  
  public r() {
    this((String)null, (byte)0);
  }
  
  public final void d() {
    this.e = (this.a != null) ? (((gz)gz.a).a.a() * 13 / 4) : (((gz)gz.a).a.a() << 1);
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    int i = ((this.a != null) ? ((this.a == true) ? kp.a(false, this.e) : kp.b((this.k && this.m))).getWidth() : 0) + ((gz)gz.a).a.a() / 2;
    if (this.d > null && this.e) {
      if (this.c != null && this.d == null) {
        this.d = ((gz)gz.a).b.a(this.c, this.d - i - ((this.a != null) ? (this.a.getWidth() + ((gz)gz.a).a.a()) : 0) - ((gz)gz.a).a.a() / 2, true);
        this.a = (this.a != null || cp.a(this.d)) ? 1 : 0;
      } 
      if (this.a != null && this.b == null) {
        this.b = (Image[])((gz)gz.a).a.a((String)this.a, this.d - i - ((this.a != null) ? (this.a.getWidth() + ((gz)gz.a).a.a() / 2) : 0) - ((gz)gz.a).a.a() / 2 - ((this.d != null && this.d != null && this.c == null) ? (((gz)gz.a).b.a(this.d, (this.a == null)) + ((gz)gz.a).a.a() / 2) : 0), true);
        this.e = ((gz)gz.a).a.a() * 13 / 4;
        this.a = (this.a != null || cp.a((String)this.b)) ? 1 : 0;
      } else if (this.a == null) {
        this.e = ((gz)gz.a).a.a() << 1;
      } 
      if (this.f != null && this.g == null) {
        this.g = ((this.b != null) ? ((gz)gz.a).b : ((gz)gz.a).a).a(this.f, this.d - i - ((this.a != null) ? (this.a.getWidth() + ((gz)gz.a).a.a() / 2) : 0) - ((gz)gz.a).a.a() / 2 - ((this.d != null) ? (((gz)gz.a).b.a(this.d, (this.a == null)) + ((gz)gz.a).a.a() / 2) : 0) - ((this.b != null && !this.f) ? (a[this.b - 1].getWidth() + ((gz)gz.a).a.a() / 2) : 0), true);
        this.a = (this.a != null || cp.a(this.g)) ? 1 : 0;
      } 
    } 
    if ((this.m || this.j) && this.k)
      paramGraphics.drawImage(kp.b(this.d, this.e, this.g), this.f + paramInt2, this.g + paramInt1, 20); 
    if (this.g != null) {
      paramGraphics.setColor((this.k && this.m) ? this.h : ((this.g && !this.i) ? 12339015 : this.c));
      ((this.b != null) ? ((gz)gz.a).b : ((gz)gz.a).a).a(paramGraphics, this.g, this.f + paramInt2 + ((this.a != null) ? (this.a.getWidth() + ((gz)gz.a).a.a() / 2) : 0) + ((gz)gz.a).a.a() / 2, this.g + paramInt1 + ((gz)gz.a).a.a() / 2, 20, (this.a == null));
    } 
    if (this.d != null) {
      paramGraphics.setColor((this.k && this.m) ? 16777215 : this.b_);
      if (this.d != null) {
        ((gz)gz.a).b.a(paramGraphics, this.d, this.f + paramInt2 + this.d - i, this.g + paramInt1 + ((this.c != null) ? ((gz)gz.a).a.a() : (this.e - ((gz)gz.a).a.a())) / 2, 24, (this.a == null));
      } else {
        ((gz)gz.a).b.a(paramGraphics, this.d, this.f + paramInt2 + ((this.a != null) ? (this.a.getWidth() + ((gz)gz.a).a.a() / 2) : 0) + ((gz)gz.a).a.a() / 2 + ((this.g != null) ? (((this.b != null) ? ((gz)gz.a).b : ((gz)gz.a).a).a(this.g, (this.a == null)) + ((gz)gz.a).a.a() / 3) : 0), this.g + paramInt1 + ((gz)gz.a).a.a() / 2, 20, (this.a == null));
      } 
    } 
    if (this.b != null) {
      paramGraphics.setColor((this.k && this.m) ? 16777215 : 5134694);
      ((gz)gz.a).a.a(paramGraphics, (String)this.b, this.f + paramInt2 + ((this.a != null) ? (this.a.getWidth() + ((gz)gz.a).a.a() / 2) : 0) + ((gz)gz.a).a.a() / 2, this.g + paramInt1 + ((gz)gz.a).a.a() * 7 / 4, 20, (this.a == null));
    } 
    if (this.a != null)
      paramGraphics.drawImage((this.a == true) ? kp.a((this.m && this.k), this.e) : kp.b(((this.k && this.m) || this.h)), this.f + paramInt2 + this.d - i, this.g + paramInt1 + this.e / 2, 6); 
    if (this.k && this.m && this.b != null)
      paramGraphics.drawImage((Image)this.b, this.f + paramInt2 + ((gz)gz.a).a.a() / 2, this.g + paramInt1 + this.e / 2, 6); 
    if ((!this.k || !this.m) && this.a != null)
      paramGraphics.drawImage((Image)this.a, this.f + paramInt2 + ((gz)gz.a).a.a() / 2, this.g + paramInt1 + this.e / 2, 6); 
    if (this.b > null)
      if (!this.f) {
        paramGraphics.drawImage(b[this.b - 1], this.f + paramInt2 + ((this.a != null) ? (this.a.getWidth() + ((gz)gz.a).a.a() / 2) : 0) + ((gz)gz.a).a.a() / 2 + ((this.g != null) ? (((this.b != null) ? ((gz)gz.a).b : ((gz)gz.a).a).a(this.g, (this.a == null)) + ((gz)gz.a).a.a() / 3) : 0), this.g + paramInt1 + ((gz)gz.a).a.a() / 2 + (((gz)gz.a).a.a() - b[this.b - 1].getHeight()) / 2, 20);
      } else if (this.a != null || this.b != null) {
        paramGraphics.drawImage(a[this.b - 1], this.f + paramInt2 + ((gz)gz.a).a.a() / 2 - a[this.b - 1].getWidth() + ((this.a != null) ? this.a.getWidth() : this.b.getWidth()), this.g + paramInt1 + this.e / 2 + ((this.a != null) ? this.a.getHeight() : this.b.getHeight()) / 2 - a[this.b - 1].getHeight(), 20);
      }  
    if (this.a == true)
      c(); 
  }
  
  public final ay a(int paramInt1, int paramInt2, int paramInt3) {
    if (this.k && this.m && this.a != null) {
      int i = this.f + ((gz)gz.a).a.a() / 2;
      int j = this.a.getWidth();
      int k = this.a.getHeight();
      int m = this.g + (this.e - k) / 2;
      if (paramInt1 < i + j && paramInt1 > i && paramInt2 < m + k + ((gz)gz.a).g - paramInt3 && paramInt2 > m + ((gz)gz.a).g - paramInt3) {
        e();
        this.k = false;
        return this;
      } 
    } 
    return super.a(paramInt1, paramInt2, paramInt3);
  }
  
  public void e() {
    a();
  }
  
  final void f() {
    this.d = null;
    this.g = null;
    this.b = null;
    this.a = false;
  }
  
  final r b() {
    this.g = true;
    return this;
  }
  
  public final r b(boolean paramBoolean) {
    this.e = paramBoolean;
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/r.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */