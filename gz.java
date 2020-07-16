import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Timer;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.midlet.MIDlet;

public final class gz extends Canvas implements CommandListener {
  public static gz a;
  
  public static Display a;
  
  private static TextBox a;
  
  private static ar a;
  
  private static Command a;
  
  private static Command b;
  
  boolean a;
  
  public cj a;
  
  private Graphics a;
  
  public Font a;
  
  public Font b;
  
  public cp a;
  
  public cp b;
  
  public la a;
  
  double a;
  
  long a;
  
  private ba a;
  
  private boolean f;
  
  int a;
  
  int b;
  
  private int k;
  
  int c;
  
  private int l;
  
  int d;
  
  boolean b;
  
  private boolean g;
  
  private boolean h;
  
  private boolean i;
  
  private kz c;
  
  private boolean j;
  
  private boolean k;
  
  boolean c;
  
  private boolean l;
  
  private boolean m;
  
  public boolean d;
  
  private boolean n;
  
  private kz d;
  
  int e;
  
  private int m;
  
  private boolean o;
  
  private boolean p;
  
  private int n;
  
  private int o;
  
  private kz e;
  
  int f;
  
  public int g;
  
  public int h;
  
  private int p;
  
  public int i;
  
  private int q;
  
  private int r;
  
  private int s;
  
  boolean e;
  
  private int t;
  
  private int u;
  
  String a;
  
  private int v;
  
  private int w;
  
  private boolean q;
  
  kz a;
  
  private la b;
  
  private Image a;
  
  private Image b;
  
  private Image c;
  
  private Image d;
  
  private int[] a;
  
  int j;
  
  private boolean r;
  
  kz b;
  
  byte a;
  
  private boolean s = true;
  
  private Image e;
  
  private String b;
  
  private String c;
  
  private boolean t;
  
  static Player a;
  
  public gz(MIDlet paramMIDlet) {
    a = (Player)this;
    a = (Player)Display.getDisplay(paramMIDlet);
    (a = (Player)new TextBox(null, null, 500, 0)).setCommandListener(this);
    b = (String)new Command(u.a("action.ok"), 4, 1);
    a = (Player)new Command(u.a("action.cancel"), 3, 1);
    a.addCommand((Command)b);
    a.addCommand((Command)a);
    this.a = (Player)new cp((Font)(this.a = (Player)Font.getFont(0, 0, 8)));
    this.b = (String)new cp((Font)(this.b = (String)Font.getFont(0, 1, 8)));
    this.a = (Player)new cj(this.a.getHeight() / 4);
    Runtime.getRuntime();
    this.k = hasPointerEvents();
    System.gc();
    this.d = true;
    j();
  }
  
  protected final void paint(Graphics paramGraphics) {
    try {
      long l = System.currentTimeMillis();
      if (this.a == null || this.w != getWidth() || this.v != getHeight() || this.j != 0) {
        c(false);
        this.a = (Player)paramGraphics;
        if (!this.s)
          h(); 
      } 
      this.a = (Player)paramGraphics;
      gz gz1;
      if ((gz1 = this).s) {
        int j = gz1.getWidth() / 6;
        int k = gz1.getHeight() / 6;
        if (gz1.b == null)
          gz1.b(u.a("general.loading")); 
        ((cj)gz1.a).d = gz1.getWidth() - (j << 1);
        ((cj)gz1.a).f = j;
        ((cj)gz1.a).g = gz1.getHeight() - ((cj)gz1.a).e - k;
        gz1.a.setColor(16777215);
        gz1.a.fillRect(0, 0, gz1.getWidth(), gz1.getHeight());
        gz1.a.a((Graphics)gz1.a, 0, 0);
        gz1.a.setColor(0);
        gz1.a.setFont((Font)gz1.a);
        if (gz1.b != null && gz1.c == null)
          gz1.c = ay.a(gz1.b, gz1.getWidth() - (j << 1), true, (Font)gz1.a); 
        if (gz1.c != null)
          gz1.a.drawString(gz1.c, (gz1.getWidth() - gz1.a.stringWidth(gz1.c)) / 2, ((cj)gz1.a).g - (gz1.a.getHeight() << 1), 20); 
        if (gz1.e == null)
          try {
            gz1.e = kp.a(a("ph.png", false), Math.min(gz1.getWidth() - (j << 1), gz1.getHeight() - (k << 1)));
          } catch (Exception exception) {
            gz1.e = null;
          }  
        if (gz1.e != null)
          gz1.a.drawImage(gz1.e, gz1.getWidth() / 2, gz1.getHeight() / 2 - k, 3); 
      } 
      if (this.s)
        return; 
      if (!this.l || this.n != 0 || a()) {
        (gz1 = this).a.setColor(16777215);
        gz1.a.fillRect(0, 0, gz1.getWidth(), gz1.getHeight());
        h();
        gz1 = this;
        boolean bool1 = false;
        if (gz1.a != null && gz1.h < ((la)gz1.a).e) {
          if (((kz)gz1.b).a != 0) {
            bool1 = true;
            if (gz1.b.a())
              if (gz1.b.a() <= 0) {
                gz1.a = -1;
              } else if (gz1.b.a() >= 6) {
                gz1.a = 5;
              }  
          } 
          if (gz1.b.a() != 0)
            gz1.a.drawImage(kp.a((gz1.h - (gz1.i / 2 << 1)) * gz1.h / ((la)gz1.a).e, gz1.b.a()), gz1.p, gz1.g + gz1.i / 2 + ((la)gz1.a).f * gz1.h / ((la)gz1.a).e, 20); 
        } 
        if (!gz1.a() && gz1.d() && gz1.a == null)
          gz1.l(); 
        if (bool1)
          gz1.b(); 
      } 
      boolean bool = (((kz)(gz1 = this).c).a != 0 || ((kz)gz1.d).a != 0 || ((kz)gz1.e).a != 0) ? true : false;
      if (((kz)gz1.d).a != 0 && gz1.d == null) {
        gz1.m = 1;
        if (gz1.c == null) {
          gz1.c = (String)Image.createImage(gz1.getWidth(), gz1.a);
          gz1.a(gz1.c.getGraphics(), 0);
        } 
        gz1.a.drawImage((Image)gz1.c, 0, gz1.d.a(), 20);
        gz1.d.a();
      } else {
        gz1.a((Graphics)gz1.a, gz1.d.a());
        gz1.c = null;
      } 
      gz1.n = 0;
      if (bool)
        gz1.b(); 
      if (!(gz1 = this).a()) {
        Player player;
        gz1.a.drawImage(kp.a(false), 0, gz1.m, 20);
        gz1.a.setColor(4620482);
        String str1 = (gz1.d == null && !gz1.d()) ? u.a("action.menu") : null;
        String str2 = (gz1.d() && gz1.d == null) ? u.a("action.close") : (gz1.c() ? ((gz1.a.a() instanceof eb) ? gz1.a.a() : u.a("action.erase")) : ((gz1.a != null) ? gz1.a.a() : null));
        if (str1 != null && gz1.o != 0)
          kp.c((Graphics)gz1.a, 0, gz1.m + 1, 16 + gz1.a.stringWidth(str1), gz1.e - 1, 7708140, 4681404); 
        if (str2 != null && gz1.p != 0)
          kp.c((Graphics)gz1.a, gz1.getWidth() - 16 - gz1.a.stringWidth(str2), gz1.m + 1, 16 + gz1.a.stringWidth(str2), gz1.e - 1, 7708140, 4681404); 
        gz1.a.setFont((Font)gz1.a);
        if (str1 != null) {
          gz1.a.setColor(16777215);
          gz1.a.drawString(str1, 8, gz1.m + gz1.t, 20);
        } 
        if (str2 != null) {
          gz1.a.setColor(16777215);
          gz1.a.drawString(str2, gz1.getWidth() - 8, gz1.m + gz1.t, 24);
        } 
        if (gz1.d() && gz1.d == null) {
          gz gz2;
          switch ((gz2 = gz1).n) {
            case 0:
              if (gz2.i != 0);
            case 1:
            
            case 2:
            
            case 3:
            
            case 4:
            
            default:
            
          } 
        } else {
        
        } 
        String str3;
        if ((str3 = (String)((gz1.a != null) ? gz1.a.b() : null)) == null)
          player = gz1.a; 
        if (player != null) {
          gz1.a.setColor(16777215);
          gz1.b.a((Graphics)gz1.a, (String)player, gz1.getWidth() / 2, gz1.m + gz1.u, 17, true);
        } 
      } 
      (gz1 = this).a.drawImage(kp.a(!gz1.a()), 0, 0, 20);
      if (gz1.a != null && ((la)gz1.a).c != null) {
        if (((la)gz1.a).d == null) {
          ((la)gz1.a).d = ay.a(((la)gz1.a).c, gz1.getWidth() - 28 - gz1.b.getHeight() * 3, true, (Font)gz1.b);
          ((la)gz1.a).e = cp.a(((la)gz1.a).d);
        } 
        gz1.a.setColor(16777215);
        gz1.b.a((Graphics)gz1.a, ((la)gz1.a).d, 8, 4, 20, !((la)gz1.a).e);
      } 
      if (gz1.a != null && ((ba)gz1.a).b && ((ba)gz1.a).a)
        gz1.a.a((Graphics)gz1.a, 0); 
      if (gz1.a != null) {
        gz1.l();
        gz1.a.drawRegion(gz1.d, 32 * gz1.j, 0, 32, 32, 0, gz1.getWidth() / 2, gz1.getHeight() / 2, 3);
      } 
      Graphics graphics = paramGraphics;
      gz1 = this;
      int i;
      if (v.a.g && (i = (int)(System.currentTimeMillis() - l)) != 0) {
        int j = 1000 / i;
        int k = gz1.b.getHeight();
        String str1 = "Paint time: " + i;
        String str2 = "FPS: " + j;
        graphics.setColor(0);
        graphics.fillRect(0, 0, 8 + Math.max(gz1.b.stringWidth(str1), gz1.b.stringWidth(str2)), (k << 1) + 8 + 2);
        int m = 16711680;
        if (j >= 40) {
          m = 65501;
        } else if (j >= 30) {
          m = 65280;
        } else if (j >= 20) {
          m = 16776960;
        } else if (j >= 15) {
          m = 16744448;
        } 
        graphics.setColor(m);
        graphics.setFont((Font)gz1.b);
        graphics.drawString(str1, 4, 4, 0);
        graphics.drawString(str2, 4, k + 4 + 2, 0);
        graphics.setColor(16777215);
      } 
      return;
    } catch (Throwable throwable) {
      if (null instanceof OutOfMemoryError) {
        System.gc();
        c(true);
      } 
      return;
    } 
  }
  
  private void f() {
    this.o = this.n;
    this.n = (this.n == 0) ? 4 : (this.n - 1);
    if (v.a.e) {
      int i = this.b * this.n;
      ((kz)this.e).b[0] = i;
      if (this.n == 4 && this.o == 0 && ((kz)this.e).c[0] < this.w - this.b) {
        i = ((kz)this.e).c[0] + this.w;
        ((kz)this.e).c[0] = i;
      } 
      this.e.a(100);
    } 
  }
  
  private void g() {
    this.o = this.n;
    this.n = (this.n == 4) ? 0 : (this.n + 1);
    if (v.a.e) {
      int i = this.b * this.n;
      ((kz)this.e).b[0] = i;
      if (this.n == 0 && this.o == 4 && ((kz)this.e).c[0] > 0) {
        i = ((kz)this.e).c[0] - this.w;
        ((kz)this.e).c[0] = i;
      } 
      this.e.a(100);
    } 
  }
  
  private void a(Graphics paramGraphics, int paramInt) {
    if (this.m != 0 && this.d == null) {
      paramGraphics.drawImage(kp.g(), 0, paramInt, 20);
      if (this.n != -1 && ((kz)this.e).a == 0) {
        int i = (this.b != null) ? (this.k / this.b) : this.n;
        paramGraphics.drawImage(kp.h(), i * this.b, paramInt, 20);
      } else if (((kz)this.e).a != 0) {
        int i = ((kz)this.e).c[0];
        paramGraphics.drawImage(kp.h(), i, paramInt, 20);
        if (i < 0 || i > this.w - this.b)
          paramGraphics.drawImage(kp.h(), ((i < 0) ? this.w : -this.w) + i, paramInt, 20); 
        if (this.e.a()) {
          i = this.b * this.n;
          ((kz)this.e).c[0] = i;
        } 
      } 
      if (this.g != 0)
        paramGraphics.drawImage(kp.a(6, (this.f == 0)), ((kz)this.c).c[0], paramInt + this.s, 3); 
      if (this.h != 0)
        paramGraphics.drawImage(kp.a(1, (this.f == 0)), -((kz)this.c).c[0], paramInt + this.s, 3); 
      paramGraphics.drawImage(kp.a(2, (this.f == 1)), this.b + this.r, paramInt + this.s, 3);
      paramGraphics.drawImage(kp.a(3, (this.f == 2)), (this.b << 1) + this.r, paramInt + this.s, 3);
      if (this.f == 3 || this.f == 0) {
        paramGraphics.drawImage(kp.a(4, (this.f == 3)), this.b * 3 + this.r, paramInt + this.s, 3);
      } else {
        paramGraphics.drawImage(kp.f(), this.b * 3 + this.r, paramInt + this.s, 3);
      } 
      paramGraphics.drawImage(kp.a(5, (this.f == 4)), (this.b << 2) + this.r, paramInt + this.s, 3);
    } 
    if (((kz)this.c).a != 0) {
      this.g = 1;
      this.h = 1;
      if (this.c.a()) {
        if (this.i != 0) {
          this.h = 0;
          return;
        } 
        this.g = 0;
      } 
    } 
  }
  
  private void c(boolean paramBoolean) {
    kp.a();
    hx.a();
    this.a = null;
    if (paramBoolean)
      this.a = null; 
    this.a = null;
    this.b = null;
    this.d = null;
    this.c = null;
    System.gc();
    this.c = null;
    this.e = null;
    this.w = getWidth();
    this.v = getHeight();
    this.e = (getHeight() / 56 > 7 && getWidth() / 5 >= 36) ? 1 : 0;
    this.j = 0;
    this.b = getWidth() / 5;
    this.a = (this.e != null) ? 56 : 36;
    this.r = this.b / 2;
    this.g = 0;
    this.h = 1;
    this.c = (String)new kz(2);
    paramBoolean = -this.r;
    ((kz)this.c).c[0] = paramBoolean;
    this.i = 0;
    this.g = this.e = 8 + Math.max(this.b.a(), this.a.getHeight());
    this.m = getHeight() - this.e;
    this.o = -1;
    getHeight();
    this.e = (Image)new kz(0);
    int i = this.b << 1;
    ((kz)this.e).c[0] = i;
    this.l = this.m = this.k;
    this.d = (Image)new kz(2);
    i = this.k ? (getHeight() - this.a) : -this.a;
    ((kz)this.d).c[0] = i;
    this.q = this.h = getHeight() - this.g;
    this.i = this.a.a() / 4;
    this.p = getWidth() - this.i - this.i / 2;
    this.n = -1;
    this.s = this.a / 2;
    this.t = (this.e - this.a.getHeight()) / 2;
    this.u = (this.e - this.b.a()) / 2;
    this.q = false;
    this.a = (Player)new kz(2);
    i();
    this.b = null;
    this.d = a("spinner.png", true);
    this.b = (String)new kz(2);
    if (this.a != null)
      ((la)this.a).j = c(); 
    this.a = (getWidth() * getWidth() + getHeight() * getHeight()) / 41984.0D;
    kp.g();
    kp.h();
    kp.f();
    for (i = 1; i <= 6; i++) {
      kp.a(i, false);
      kp.a(i, true);
    } 
    if (!this.t) {
      (new Timer()).schedule(new kx(this), 0L, 1000L);
      (new Timer()).schedule(new ky(this), 0L, 200L);
      (new kt(this)).start();
      this.t = true;
    } 
  }
  
  protected final void pointerPressed(int paramInt1, int paramInt2) {
    if (this.a != null)
      return; 
    if (!this.k) {
      this.k = true;
      c(false);
    } 
    this.c = Character.MIN_VALUE;
    this.b = '\001';
    this.l = this.d = false;
    this.k = paramInt1;
    this.c = paramInt2;
    this.n = -1;
    if (b()) {
      this.a.a(paramInt1, paramInt2);
      repaint();
      return;
    } 
    if (this.c >= ((kz)this.d).c[0] && d()) {
      this.n = this.k / this.b;
    } else {
      this.n = -1;
      this.r = true;
      if (this.a != null && paramInt2 <= this.g + this.h + ((this.a instanceof hs) ? ((hs)this.a).a.e : 0) && paramInt2 >= this.g)
        this.a.a(paramInt1, paramInt2); 
    } 
    repaint();
  }
  
  protected final void pointerReleased(int paramInt1, int paramInt2) {
    if (this.a != null)
      return; 
    if (!this.k) {
      this.k = true;
      c(false);
    } 
    this.b = Character.MIN_VALUE;
    this.l = paramInt1;
    this.d = paramInt2;
    this.k = false;
    this.c = Character.MIN_VALUE;
    this.n = -1;
    if (b()) {
      this.a.b(paramInt1, paramInt2);
      repaint();
      return;
    } 
    if (this.d >= ((kz)this.d).c[0] && d() && !this.r) {
      a(this.l / this.b);
    } else {
      this.n = -1;
      if (this.a != null && paramInt2 <= this.g + this.h + ((this.a instanceof hs) ? ((hs)this.a).a.e : 0) && paramInt2 >= this.g)
        this.a.b(paramInt1, paramInt2); 
    } 
    this.r = false;
    repaint();
  }
  
  protected final void pointerDragged(int paramInt1, int paramInt2) {
    if (this.a != null)
      return; 
    if (!this.k) {
      this.k = true;
      c(false);
    } 
    a();
    this.b = '\001';
    this.l = this.k;
    this.d = (Image)this.c;
    this.k = paramInt1;
    this.c = paramInt2;
    this.n = -1;
    if (b()) {
      this.a.c(paramInt1, paramInt2);
      repaint();
      return;
    } 
    if (this.c >= ((kz)this.d).c[0] && d() && !this.r) {
      this.n = this.k / this.b;
    } else {
      this.n = -1;
      if (this.a != null && paramInt2 <= this.g + this.h + ((this.a instanceof hs) ? ((hs)this.a).a.e : 0) && paramInt2 >= this.g)
        this.a.c(paramInt1, paramInt2); 
    } 
    repaint();
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand == b) {
      a.b(a.getString());
      j();
      return;
    } 
    if (paramCommand == a)
      j(); 
  }
  
  protected final void sizeChanged(int paramInt1, int paramInt2) {
    this.j = 1;
  }
  
  private void h() {
    if (this.a != null)
      if (((kz)this.a).a != 0) {
        if (this.a == null) {
          this.a = (Player)Image.createImage(getWidth(), c());
          int i = this.g;
          this.g = 0;
          this.a.a(this.a.getGraphics(), 0);
          this.g = i;
        } 
        this.a.drawImage((Image)this.a, ((kz)this.a).c[0], this.g, 20);
      } else {
        this.a.a((Graphics)this.a, ((kz)this.a).c[0]);
      }  
    if (this.b != null) {
      int i = ((kz)this.a).c[0] + (this.q ? getWidth() : -getWidth());
      if (((kz)this.a).a != 0) {
        if (this.b == null) {
          this.b = (String)Image.createImage(getWidth(), c());
          int j = this.g;
          this.g = 0;
          this.b.a(this.b.getGraphics(), 0);
          this.g = j;
        } 
        this.a.drawImage((Image)this.b, i, this.g, 20);
      } else {
        this.b.a((Graphics)this.a, i);
      } 
    } 
    byte b = ((kz)this.a).a;
    if (((kz)this.a).a != 0 && this.a.a())
      i(); 
    if (b != 0)
      repaint(); 
  }
  
  private void a(la paramla, boolean paramBoolean) {
    Player player;
    i();
    if (paramla == null)
      return; 
    if (this.a == null) {
      this.a = (Player)paramla;
      i();
      return;
    } 
    if (this.a.equals(paramla))
      return; 
    if (v.a.e) {
      this.b = (String)paramla;
      this.q = !paramBoolean;
      int i = (paramBoolean ? 1 : -1) * getWidth();
      ((kz)this.a).b[0] = i;
      ((kz)(player = this.a)).a = 300;
      ((kz)player).a = System.currentTimeMillis();
      ((kz)player).a = 1;
      System.arraycopy(((kz)player).a, 0, ((kz)player).c, 0, ((kz)player).c.length);
    } else {
      this.a = player;
    } 
    repaint();
  }
  
  private void i() {
    if (!v.a.e)
      return; 
    if (this.b != null)
      this.a = (Player)this.b; 
    ((kz)this.a).b[0] = 0;
    this.a.a();
    this.q = false;
    this.b = null;
    this.a = null;
    this.b = null;
    repaint();
  }
  
  public final void a(la paramla) {
    a(paramla, true);
  }
  
  public final void b(la paramla) {
    a(paramla, false);
  }
  
  public final void a(boolean paramBoolean) {
    if (this.i == paramBoolean)
      return; 
    this.i = paramBoolean;
    if (v.a.e) {
      int j = this.r * (paramBoolean ? 1 : -1);
      ((kz)this.c).b[0] = j;
      this.c.a(300);
      return;
    } 
    int i = this.r * (paramBoolean ? 1 : -1);
    ((kz)this.c).c[0] = i;
    this.g = paramBoolean;
    this.h = !paramBoolean ? 1 : 0;
  }
  
  public final void a() {
    if (v.a.e) {
      ((kz)this.b).b[0] = 6;
      this.b.a(100);
      return;
    } 
    ((kz)this.b).c[0] = 6;
    this.a = 5;
  }
  
  static void a(ar paramar) {
    a = (Player)paramar;
    a.setString(paramar.a);
    a.setTitle(paramar.b);
    a.setCurrent((Displayable)a);
  }
  
  private void j() {
    a.setString(null);
    a.setTitle(null);
    setFullScreenMode(true);
    repaint();
    a.setCurrent((Displayable)this);
  }
  
  public final boolean a() {
    return this.k;
  }
  
  protected final void keyPressed(int paramInt) {
    gz gz1;
    if (this.a != null)
      return; 
    paramInt = a(paramInt);
    this.c = (this.c != null || paramInt == 6 || paramInt == 1) ? 1 : 0;
    if (b()) {
      if (this.a.a() && jy.a(paramInt)) {
        jy.a(paramInt, this.a.a());
      } else {
        this.a.a(paramInt);
      } 
      repaint();
      return;
    } 
    if (paramInt == 1000001) {
      this.o = 1;
      if (!d() && this.d == null && !(gz1 = this).k) {
        gz1.o = -1;
        gz1.n = gz1.f;
        if (gz1.n == -1)
          gz1.n = 2; 
        gz1.n = 1;
        gz1.l = true;
        if (v.a.e) {
          int i = gz1.b * gz1.n;
          ((kz)gz1.e).c[0] = i;
          Image image = gz1.e;
          ((kz)gz1.d).b[0] = image;
          gz1.d.a(100);
        } else {
          Image image = gz1.e;
          ((kz)gz1.d).c[0] = image;
          gz1.m = 1;
        } 
      } 
    } else if (gz1 == 1000002) {
      this.p = 1;
      if (d() && this.d == null && !this.k) {
        k();
      } else if (c()) {
        jy.a(1000010, this.a.a());
      } else {
        if (this.a != null)
          ((ba)this.a).a = false; 
        this.a.b_();
      } 
    } else if (gz1 == 2) {
      if (d() && !this.k) {
        f();
      } else if (this.a != null) {
        this.a.a(gz1);
      } 
    } else if (gz1 == 5) {
      if (d() && !this.k) {
        g();
      } else if (this.a != null) {
        this.a.a(gz1);
      } 
    } else if (gz1 == true || (gz1 == 50 && !c())) {
      if (!d() || this.k) {
        if (this.a != null)
          this.a.a(gz1); 
      } else {
        k();
      } 
    } else if (gz1 == 6 || (gz1 == 56 && !c())) {
      if ((!d() || this.k) && this.a != null)
        this.a.a(gz1); 
    } else if (gz1 == 8) {
      if ((!d() || this.k) && this.a != null)
        this.a.a(gz1); 
    } else if (c() && jy.a(gz1)) {
      jy.a(gz1, this.a.a());
    } else if (this.a != null) {
      this.a.a(gz1);
    } 
    repaint();
  }
  
  protected final void keyRepeated(int paramInt) {
    if (this.a != null)
      return; 
    paramInt = a(paramInt);
    if (b()) {
      if (this.a.a() && jy.a(paramInt)) {
        jy.b(paramInt, this.a.a());
      } else {
        this.a.b(paramInt);
      } 
      repaint();
      return;
    } 
    if (paramInt == 2) {
      if (d() && !this.k) {
        f();
      } else if (this.a != null) {
        this.a.b(paramInt);
      } 
    } else if (paramInt == 5) {
      if (d() && !this.k) {
        g();
      } else if (this.a != null) {
        this.a.b(paramInt);
      } 
    } else if (paramInt == 1) {
      if (!d() || this.k) {
        if (this.a != null)
          this.a.b(paramInt); 
      } else {
        k();
      } 
    } else if (paramInt == 6) {
      if ((!d() || this.k) && this.a != null)
        this.a.b(paramInt); 
    } else if (paramInt == 1000002) {
      this.p = 1;
      if ((!d() || this.k) && c())
        jy.b(1000010, this.a.a()); 
    } else if (c() && jy.a(paramInt)) {
      jy.b(paramInt, this.a.a());
    } else if (this.a != null) {
      this.a.b(paramInt);
    } 
    repaint();
  }
  
  protected final void keyReleased(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: iload_1
    //   10: invokespecial a : (I)I
    //   13: dup
    //   14: istore_1
    //   15: ldc 1000001
    //   17: if_icmpne -> 28
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield o : Z
    //   25: goto -> 39
    //   28: iload_1
    //   29: ldc 1000002
    //   31: if_icmpne -> 39
    //   34: aload_0
    //   35: iconst_0
    //   36: putfield p : Z
    //   39: aload_0
    //   40: invokevirtual b : ()Z
    //   43: ifeq -> 69
    //   46: aload_0
    //   47: getfield a : Lba;
    //   50: invokevirtual a : ()Z
    //   53: ifne -> 64
    //   56: aload_0
    //   57: getfield a : Lba;
    //   60: iload_1
    //   61: invokevirtual c : (I)V
    //   64: aload_0
    //   65: invokevirtual repaint : ()V
    //   68: return
    //   69: iload_1
    //   70: ldc 1000001
    //   72: if_icmpne -> 83
    //   75: aload_0
    //   76: iconst_0
    //   77: putfield o : Z
    //   80: goto -> 181
    //   83: iload_1
    //   84: ldc 1000002
    //   86: if_icmpne -> 97
    //   89: aload_0
    //   90: iconst_0
    //   91: putfield p : Z
    //   94: goto -> 181
    //   97: iload_1
    //   98: bipush #8
    //   100: if_icmpne -> 138
    //   103: aload_0
    //   104: invokespecial d : ()Z
    //   107: ifeq -> 117
    //   110: aload_0
    //   111: getfield k : Z
    //   114: ifeq -> 127
    //   117: aload_0
    //   118: getfield a : Lla;
    //   121: ifnull -> 181
    //   124: goto -> 173
    //   127: aload_0
    //   128: aload_0
    //   129: getfield n : I
    //   132: invokevirtual a : (I)V
    //   135: goto -> 181
    //   138: aload_0
    //   139: getfield a : Lla;
    //   142: ifnull -> 181
    //   145: aload_0
    //   146: invokespecial d : ()Z
    //   149: ifeq -> 159
    //   152: aload_0
    //   153: getfield k : Z
    //   156: ifeq -> 181
    //   159: aload_0
    //   160: invokespecial c : ()Z
    //   163: ifeq -> 173
    //   166: iload_1
    //   167: invokestatic a : (I)Z
    //   170: ifne -> 181
    //   173: aload_0
    //   174: getfield a : Lla;
    //   177: iload_1
    //   178: invokevirtual c : (I)V
    //   181: aload_0
    //   182: invokevirtual repaint : ()V
    //   185: return
  }
  
  private int a(int paramInt) {
    try {
      String str = getKeyName(paramInt).toLowerCase();
      if ("soft1".equals(str) || "soft 1".equals(str) || "soft_1".equals(str) || "softkey 1".equals(str) || "sk2(left)".equals(str) || str.startsWith("left soft"))
        return 1000001; 
      if ("soft2".equals(str) || "soft 2".equals(str) || "soft_2".equals(str) || "softkey 4".equals(str) || "sk1(right)".equals(str) || str.startsWith("right soft"))
        return 1000002; 
      if ("on/off".equals(str) || "back".equals(str))
        return 1000003; 
      if ("trackball".equals(str) || "select".equals(str) || "enter".equals(str))
        return c() ? 1000011 : 8; 
      if ("backspace".equals(str) || "clear".equals(str))
        return 1000010; 
    } catch (Throwable throwable) {}
    gz gz1;
    if ((!(gz1 = this).c() && (!gz1.b() || gz1.a.a() == null) && (!(gz1.a instanceof hs) || ((hs)gz1.a).a.a == null))) {
      if (paramInt == 113 || paramInt == 81)
        return 1000001; 
      if (paramInt == 112 || paramInt == 80)
        return 1000002; 
      if (paramInt == 42)
        return 1000001; 
      if (paramInt == 35)
        return 1000002; 
    } 
    switch (paramInt) {
      case -202:
      case -21:
      case -6:
      case 21:
      case 57345:
        return 1000001;
      case -203:
      case -22:
      case -7:
      case 22:
      case 57346:
        return 1000002;
      case -8:
        return 1000010;
    } 
    try {
      int i;
      switch (i = getGameAction(paramInt)) {
        case 1:
        case 2:
        case 5:
        case 6:
          return jy.a(paramInt) ? paramInt : i;
        case 8:
          return jy.a(paramInt) ? paramInt : (c() ? 1000011 : i);
      } 
      return paramInt;
    } catch (Throwable throwable) {
      return paramInt;
    } 
  }
  
  public final void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield f : I
    //   12: iconst_3
    //   13: if_icmpeq -> 47
    //   16: aload_0
    //   17: getfield f : I
    //   20: iconst_4
    //   21: if_icmpeq -> 47
    //   24: iload_1
    //   25: aload_0
    //   26: getfield f : I
    //   29: if_icmpne -> 47
    //   32: aload_0
    //   33: getfield f : I
    //   36: ifne -> 46
    //   39: aload_0
    //   40: getfield i : Z
    //   43: ifne -> 47
    //   46: return
    //   47: aload_0
    //   48: getfield f : I
    //   51: istore_2
    //   52: aload_0
    //   53: iload_1
    //   54: putfield f : I
    //   57: iload_1
    //   58: tableswitch default -> 207, 0 -> 92, 1 -> 107, 2 -> 207, 3 -> 134, 4 -> 183
    //   92: aload_0
    //   93: iconst_0
    //   94: invokevirtual a : (Z)V
    //   97: iconst_0
    //   98: invokestatic a : (I)Llb;
    //   101: invokestatic a : (Llb;)V
    //   104: goto -> 210
    //   107: invokestatic d : ()V
    //   110: getstatic fw.a : Lgz;
    //   113: iconst_1
    //   114: putfield f : I
    //   117: getstatic fw.a : Lgz;
    //   120: new eg
    //   123: dup
    //   124: invokespecial <init> : ()V
    //   127: iconst_0
    //   128: invokespecial a : (Lla;Z)V
    //   131: goto -> 210
    //   134: invokestatic d : ()V
    //   137: getstatic fw.a : Lgz;
    //   140: iconst_0
    //   141: putfield f : Z
    //   144: getstatic fw.a : Lgz;
    //   147: iconst_3
    //   148: putfield f : I
    //   151: getstatic bc.a : Lbc;
    //   154: ifnonnull -> 170
    //   157: new bc
    //   160: dup
    //   161: invokespecial <init> : ()V
    //   164: putstatic bc.a : Lbc;
    //   167: goto -> 210
    //   170: getstatic fw.a : Lgz;
    //   173: getstatic bc.a : Lbc;
    //   176: iconst_0
    //   177: invokespecial a : (Lla;Z)V
    //   180: goto -> 210
    //   183: invokestatic a : ()Lea;
    //   186: getfield a : Ljp;
    //   189: invokevirtual a : ()Z
    //   192: ifne -> 201
    //   195: invokestatic c : ()V
    //   198: goto -> 210
    //   201: invokestatic b : ()V
    //   204: goto -> 210
    //   207: invokestatic g : ()V
    //   210: iload_2
    //   211: aload_0
    //   212: getfield f : I
    //   215: if_icmple -> 268
    //   218: aload_0
    //   219: dup
    //   220: astore_1
    //   221: getfield a : Lkz;
    //   224: getfield a : Z
    //   227: ifeq -> 268
    //   230: aload_1
    //   231: dup
    //   232: getfield q : Z
    //   235: iconst_1
    //   236: ixor
    //   237: putfield q : Z
    //   240: aload_1
    //   241: getfield a : Lkz;
    //   244: aload_1
    //   245: invokevirtual getWidth : ()I
    //   248: aload_1
    //   249: getfield q : Z
    //   252: ifeq -> 259
    //   255: iconst_m1
    //   256: goto -> 260
    //   259: iconst_1
    //   260: imul
    //   261: istore_1
    //   262: getfield b : [I
    //   265: iconst_0
    //   266: iload_1
    //   267: iastore
    //   268: aload_0
    //   269: invokespecial k : ()V
    //   272: return
  }
  
  private void k() {
    if (this.k)
      return; 
    this.o = -1;
    this.n = -1;
    this.l = false;
    if (v.a.e) {
      int j = this.e - this.a;
      ((kz)this.d).b[0] = j;
      this.d.a(100);
      return;
    } 
    int i = this.e - this.a;
    ((kz)this.d).c[0] = i;
  }
  
  public final void b() {
    repaint();
  }
  
  private boolean c() {
    return (((!this.k && !d()) || this.k) && ((this.a != null && this.a.a() && (!(this.a.a() instanceof eb) || ((eb)this.a.a()).a != null)) || (b() && this.a.a())));
  }
  
  private boolean d() {
    return (this.l && this.d == null);
  }
  
  public static Image a(String paramString) {
    return a(paramString, true);
  }
  
  public static Image a(String paramString, boolean paramBoolean) {
    Image image = null;
    try {
      image = Image.createImage(Runtime.getRuntime().getClass().getResourceAsStream("/res/" + paramString));
    } catch (Throwable throwable) {
      try {
        image = Image.createImage(new ByteArrayInputStream(u.a(paramString)));
      } catch (Throwable throwable1) {}
    } 
    if (paramBoolean && image == null)
      v.a((String)null); 
    return image;
  }
  
  public static byte[] a(String paramString) {
    return hk.a(paramString);
  }
  
  public static Image b(String paramString) {
    try {
      if (fy.e().startsWith("http:"))
        paramString = ab.a(paramString, "https://", "http://"); 
      InputStream inputStream;
      Image image = Image.createImage(inputStream = hk.a(paramString));
      inputStream.close();
      return image;
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final void b(boolean paramBoolean) {
    this.a = paramBoolean;
    repaint();
  }
  
  private void a(ba paramba, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 5
    //   4: return
    //   5: aload_0
    //   6: invokevirtual c : ()V
    //   9: aload_1
    //   10: iconst_0
    //   11: putfield a : Z
    //   14: aload_0
    //   15: aload_1
    //   16: putfield a : Lba;
    //   19: aload_0
    //   20: getfield a : Lba;
    //   23: dup
    //   24: astore_1
    //   25: iload_2
    //   26: putfield a : I
    //   29: aload_1
    //   30: iload_3
    //   31: putfield b : I
    //   34: aload_1
    //   35: invokevirtual b : ()I
    //   38: istore_2
    //   39: aload_1
    //   40: invokevirtual a : ()I
    //   43: istore_3
    //   44: iload #4
    //   46: iconst_1
    //   47: iand
    //   48: iconst_1
    //   49: if_icmpne -> 67
    //   52: aload_1
    //   53: dup
    //   54: getfield a : I
    //   57: iload_2
    //   58: iconst_2
    //   59: idiv
    //   60: isub
    //   61: putfield a : I
    //   64: goto -> 87
    //   67: iload #4
    //   69: bipush #8
    //   71: iand
    //   72: bipush #8
    //   74: if_icmpne -> 87
    //   77: aload_1
    //   78: dup
    //   79: getfield a : I
    //   82: iload_2
    //   83: isub
    //   84: putfield a : I
    //   87: iload #4
    //   89: iconst_2
    //   90: iand
    //   91: iconst_2
    //   92: if_icmpne -> 110
    //   95: aload_1
    //   96: dup
    //   97: getfield b : I
    //   100: iload_3
    //   101: iconst_2
    //   102: idiv
    //   103: isub
    //   104: putfield b : I
    //   107: goto -> 130
    //   110: iload #4
    //   112: bipush #32
    //   114: iand
    //   115: bipush #32
    //   117: if_icmpne -> 130
    //   120: aload_1
    //   121: dup
    //   122: getfield b : I
    //   125: iload_3
    //   126: isub
    //   127: putfield b : I
    //   130: aload_1
    //   131: iconst_0
    //   132: aload_1
    //   133: getfield a : I
    //   136: invokestatic max : (II)I
    //   139: getstatic gz.a : Lgz;
    //   142: invokevirtual getWidth : ()I
    //   145: iload_2
    //   146: isub
    //   147: invokestatic min : (II)I
    //   150: putfield a : I
    //   153: aload_1
    //   154: iconst_0
    //   155: aload_1
    //   156: getfield b : I
    //   159: invokestatic max : (II)I
    //   162: getstatic gz.a : Lgz;
    //   165: invokevirtual getHeight : ()I
    //   168: iload_3
    //   169: isub
    //   170: invokestatic min : (II)I
    //   173: putfield b : I
    //   176: aload_1
    //   177: aload_1
    //   178: iconst_0
    //   179: dup_x1
    //   180: putfield g : I
    //   183: putfield f : I
    //   186: aload_1
    //   187: iconst_0
    //   188: putfield h : I
    //   191: aload_1
    //   192: getfield a : Z
    //   195: ifne -> 205
    //   198: aload_1
    //   199: getfield b : Z
    //   202: ifne -> 209
    //   205: aload_1
    //   206: goto -> 224
    //   209: aload_1
    //   210: aload_1
    //   211: getfield b : Ljava/util/Vector;
    //   214: invokevirtual isEmpty : ()Z
    //   217: ifne -> 224
    //   220: iconst_1
    //   221: goto -> 225
    //   224: iconst_0
    //   225: putfield a : Z
    //   228: return
  }
  
  public final void a(ba paramba, boolean paramBoolean) {
    if (paramba == null)
      return; 
    if (!paramBoolean) {
      a(paramba, getWidth(), getHeight(), 40);
      return;
    } 
    a(paramba, getWidth() / 2, getHeight() / 2, 3);
  }
  
  public final void a(ba paramba) {
    a(paramba, this.k);
  }
  
  public final void a(String paramString) {
    gg gg;
    (gg = (new gg(u.a("general.error"))).b().a(13948116)).r = true;
    ba ba1;
    (ba1 = new ba()).a(gg, false);
    (gg = (new gg(paramString)).a(13948116)).r = true;
    ba1.a(gg, false);
    ba1.a(new kw(this, u.a("action.ok")), true);
    a(ba1, true);
    ba1.h = 2;
  }
  
  public final void a(Exception paramException) {
    a(paramException.toString() + " " + paramException.getMessage());
  }
  
  public final void c() {
    if (this.a != null)
      ((ba)this.a).a = false; 
    this.a = null;
  }
  
  public final int a() {
    return (this.a != null) ? ((ba)this.a).b : 0;
  }
  
  public final int b() {
    return (this.a != null) ? this.a.a() : 0;
  }
  
  private void l() {
    // Byte code:
    //   0: getstatic v.a : Lv;
    //   3: getfield c : Z
    //   6: ifeq -> 10
    //   9: return
    //   10: aload_0
    //   11: getfield a : [I
    //   14: ifnull -> 34
    //   17: aload_0
    //   18: invokevirtual getWidth : ()I
    //   21: aload_0
    //   22: invokevirtual getHeight : ()I
    //   25: imul
    //   26: aload_0
    //   27: getfield a : [I
    //   30: arraylength
    //   31: if_icmpeq -> 77
    //   34: aload_0
    //   35: aload_0
    //   36: invokevirtual getWidth : ()I
    //   39: aload_0
    //   40: invokevirtual getHeight : ()I
    //   43: imul
    //   44: bipush #10
    //   46: idiv
    //   47: newarray int
    //   49: putfield a : [I
    //   52: iconst_0
    //   53: istore_1
    //   54: iload_1
    //   55: aload_0
    //   56: getfield a : [I
    //   59: arraylength
    //   60: if_icmpge -> 77
    //   63: aload_0
    //   64: getfield a : [I
    //   67: iload_1
    //   68: ldc 1426063360
    //   70: iastore
    //   71: iinc #1, 1
    //   74: goto -> 54
    //   77: iconst_0
    //   78: istore_1
    //   79: iload_1
    //   80: aload_0
    //   81: getfield w : I
    //   84: if_icmpge -> 116
    //   87: aload_0
    //   88: getfield a : Ljavax/microedition/lcdui/Graphics;
    //   91: aload_0
    //   92: getfield a : [I
    //   95: iconst_0
    //   96: bipush #10
    //   98: iload_1
    //   99: iconst_0
    //   100: bipush #10
    //   102: aload_0
    //   103: getfield v : I
    //   106: iconst_1
    //   107: invokevirtual drawRGB : ([IIIIIIIZ)V
    //   110: iinc #1, 10
    //   113: goto -> 79
    //   116: return
  }
  
  public static void d() {
    ((gz)a).f = (((gz)a).f != 3) ? 1 : 0;
  }
  
  public static void e() {
    if (a != null)
      return; 
    try {
      (a = Manager.createPlayer(Runtime.getRuntime().getClass().getResourceAsStream("/bb2.mp3"), jp.a())).addPlayerListener(new kq());
      a.realize();
      a.prefetch();
      a.start();
      return;
    } catch (Throwable throwable) {
      return;
    } 
  }
  
  public final void b(String paramString) {
    this.b = paramString;
    this.c = null;
    repaint();
  }
  
  public final int c() {
    return this.q - (this.k ? (d() ? this.a : 0) : this.e);
  }
  
  public static long a(double paramDouble) {
    return (paramDouble % 10.0D < 0.5D) ? (long)Math.floor(paramDouble) : (long)Math.ceil(paramDouble);
  }
  
  public final boolean b() {
    return (this.a != null && ((ba)this.a).b && ((ba)this.a).a);
  }
  
  static void a(gz paramgz) {
    paramgz.b = (paramgz = paramgz).c = null;
    paramgz.e = null;
    paramgz.s = false;
    paramgz.repaint();
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/gz.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */