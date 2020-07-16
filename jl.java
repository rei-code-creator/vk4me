import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class jl extends ay implements cc {
  private static Thread a;
  
  private static Vector a;
  
  private bw a;
  
  private Image a;
  
  private String a;
  
  private String b;
  
  private int b;
  
  private boolean a;
  
  private int c;
  
  private boolean b;
  
  private boolean c;
  
  public jl(bw parambw, is paramis, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: iload_3
    //   6: putfield d : I
    //   9: aload_0
    //   10: iconst_1
    //   11: putfield n : Z
    //   14: aload_2
    //   15: ifnull -> 34
    //   18: aload_0
    //   19: aload_2
    //   20: invokevirtual c : ()Z
    //   23: ifne -> 30
    //   26: iconst_1
    //   27: goto -> 31
    //   30: iconst_0
    //   31: putfield c : Z
    //   34: aload_0
    //   35: aload_1
    //   36: invokespecial a : (Lbw;)V
    //   39: aload_0
    //   40: invokevirtual d : ()V
    //   43: getstatic jl.a : Ljava/util/Vector;
    //   46: aload_0
    //   47: invokevirtual addElement : (Ljava/lang/Object;)V
    //   50: return
  }
  
  public final void d() {
    this.e = a;
    this.r = true;
    if (!this.b && !this.c) {
      this.e += a;
      if (v.a.i) {
        this.e += hx.b;
      } else {
        this.e += ((gz)gz.a).b.a();
      } 
      this.r = false;
    } 
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    paramInt1 = this.g + paramInt1;
    int i = this.f + paramInt2;
    if (this.c)
      paramGraphics.drawImage(kp.a(this.c, ((!this.c && !this.b && !v.a.i) ? (((gz)gz.a).b.a() + a) : 0) + a, (this.k && this.m), this.b), i + (this.b ? (this.d - this.c) : 0), paramInt1 + this.e, 36); 
    if (!this.b && !this.c)
      if (!v.a.i) {
        paramInt1 += a;
        i += a;
        if (this.d > 0 && this.a != null && this.b == null)
          a(this.a); 
        if (this.b != null) {
          paramGraphics.setColor(0);
          ((gz)gz.a).b.a(paramGraphics, this.b, i, paramInt1, 20, !this.a);
          i = i + ((gz)gz.a).b.a(this.b, !this.a) + gg.a_;
        } 
        if (this.b) {
          paramGraphics.drawImage(r.b[this.b - 1], i, paramInt1 + (((gz)gz.a).b.a() - r.b[this.b - 1].getHeight()) / 2, 20);
          return;
        } 
      } else {
        if (this.a != null) {
          paramGraphics.drawImage(this.a, i, paramInt1, 20);
          if (this.b)
            paramGraphics.drawImage(r.a[this.b - 1], i + 2 + this.a.getWidth(), paramInt1 + this.a.getHeight(), 40); 
          i = i + this.a.getWidth() + ((gz)gz.a).a.a() / 2;
        } 
        paramInt1 += (hx.b - ((gz)gz.a).b.a()) / 2;
        if (this.a != null && this.b == null && this.d > 0) {
          this.b = ((gz)gz.a).b.a(this.a, this.d - i + this.f + paramInt2, true);
          this.a = cp.a(this.b);
        } 
        if (this.b != null) {
          paramGraphics.setColor(0);
          ((gz)gz.a).b.a(paramGraphics, this.b, i, paramInt1, 20, !this.a);
          i = i + ((gz)gz.a).b.a(this.b, !this.a) + gg.a_;
        } 
        if (this.b && this.a == null)
          paramGraphics.drawImage(r.b[this.b - 1], i, paramInt1 + (((gz)gz.a).b.a() - r.b[this.b - 1].getHeight()) / 2, 20); 
      }  
  }
  
  private void a(bw parambw) {
    this.a = parambw;
    if (parambw == null)
      return; 
    this.b = parambw.a;
    if (this.b || this.c)
      return; 
    lb lb;
    if ((lb = au.a(parambw.c)) == null)
      return; 
    this.a = lb.c("nom");
    this.b = fw.a(lb);
    if (!v.a.i && this.a != null && this.b == null && this.d > 0) {
      this.b = ((gz)gz.a).b.a(this.a, this.d - a * 3 - (this.b ? (r.b[this.b - 1].getWidth() + gg.a_) : 0), true);
      this.a = cp.a(this.b);
      this.c = Math.max(this.c, ((gz)gz.a).b.a(this.b, !this.a) + (a << 1) + (this.b ? (gg.a_ + r.b[this.b - 1].getWidth()) : 0));
    } 
  }
  
  public final bw a() {
    return this.a;
  }
  
  public final ay d(int paramInt) {
    if (this.c == paramInt)
      return this; 
    this.c = paramInt;
    if (!v.a.i)
      this.b = null; 
    return this;
  }
  
  public final int a() {
    return this.c;
  }
  
  public final ay a(ba paramba) {
    return this;
  }
  
  public final void a() {
    if (this.a == null)
      return; 
    fw.a(au.a(this.a.c));
  }
  
  static void b() {
    // Byte code:
    //   0: getstatic v.a : Lv;
    //   3: getfield i : Z
    //   6: ifeq -> 176
    //   9: getstatic jl.a : Ljava/util/Vector;
    //   12: invokevirtual isEmpty : ()Z
    //   15: ifne -> 39
    //   18: getstatic gz.a : Lgz;
    //   21: getfield a : Lla;
    //   24: ifnull -> 39
    //   27: getstatic gz.a : Lgz;
    //   30: getfield a : Lla;
    //   33: instanceof hs
    //   36: ifne -> 52
    //   39: ldc2_w 3000
    //   42: invokestatic sleep : (J)V
    //   45: goto -> 9
    //   48: pop
    //   49: goto -> 9
    //   52: iconst_0
    //   53: istore_0
    //   54: iload_0
    //   55: getstatic jl.a : Ljava/util/Vector;
    //   58: invokevirtual size : ()I
    //   61: if_icmpge -> 146
    //   64: getstatic jl.a : Ljava/util/Vector;
    //   67: iload_0
    //   68: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   71: checkcast ay
    //   74: astore_1
    //   75: aload_1
    //   76: instanceof jl
    //   79: ifeq -> 126
    //   82: aload_1
    //   83: checkcast jl
    //   86: dup
    //   87: getfield a : Lbw;
    //   90: getfield c : I
    //   93: iconst_0
    //   94: invokestatic a : (IZ)Ljavax/microedition/lcdui/Image;
    //   97: astore_2
    //   98: astore_1
    //   99: aload_2
    //   100: ifnull -> 126
    //   103: aload_1
    //   104: getstatic v.a : Lv;
    //   107: getfield i : Z
    //   110: ifeq -> 117
    //   113: aload_2
    //   114: goto -> 118
    //   117: aconst_null
    //   118: putfield a : Ljavax/microedition/lcdui/Image;
    //   121: aload_1
    //   122: aconst_null
    //   123: putfield b : Ljava/lang/String;
    //   126: goto -> 130
    //   129: pop
    //   130: getstatic jl.a : Ljava/util/Vector;
    //   133: iload_0
    //   134: invokevirtual removeElementAt : (I)V
    //   137: invokestatic f : ()V
    //   140: iinc #0, 1
    //   143: goto -> 54
    //   146: ldc2_w 3000
    //   149: invokestatic sleep : (J)V
    //   152: goto -> 9
    //   155: pop
    //   156: goto -> 9
    //   159: pop
    //   160: getstatic jl.a : Ljava/util/Vector;
    //   163: invokevirtual removeAllElements : ()V
    //   166: invokestatic gc : ()V
    //   169: goto -> 9
    //   172: pop
    //   173: goto -> 9
    //   176: return
    // Exception table:
    //   from	to	target	type
    //   9	49	159	java/lang/OutOfMemoryError
    //   9	49	172	java/lang/Exception
    //   39	45	48	java/lang/Exception
    //   52	156	159	java/lang/OutOfMemoryError
    //   52	156	172	java/lang/Exception
    //   75	126	129	java/lang/Exception
    //   146	152	155	java/lang/Exception
  }
  
  static {
    // Byte code:
    //   0: new java/util/Vector
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: putstatic jl.a : Ljava/util/Vector;
    //   10: getstatic jl.a : Ljava/lang/Thread;
    //   13: ifnonnull -> 37
    //   16: new fz
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: dup
    //   24: putstatic jl.a : Ljava/lang/Thread;
    //   27: iconst_1
    //   28: invokevirtual setPriority : (I)V
    //   31: getstatic jl.a : Ljava/lang/Thread;
    //   34: invokevirtual start : ()V
    //   37: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jl.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */