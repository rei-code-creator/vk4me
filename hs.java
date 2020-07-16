import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Player;

public final class hs extends ef {
  private Hashtable a;
  
  private int b;
  
  private int c;
  
  public final eb a = (eb)new Hashtable();
  
  public final void a(ay paramay) {
    if (this.b == 0)
      return; 
    if (paramay instanceof cc) {
      bw bw;
      if ((bw = ((cc)paramay).a()) == null)
        return; 
      if (bw.a == null && bw.a > this.b) {
        this.b = bw.a;
        String str = bw.a;
        int i = bw.b;
        if (bc.a != null) {
          bc.a(i).a(str);
          bc.d();
        } 
      } 
    } 
  }
  
  public static void d(int paramInt1, int paramInt2) {
    Player player;
    if ((player = ((gz)gz.a).a) != null && player instanceof hs) {
      hs hs1;
      if ((hs1 = (hs)player).a.a() != paramInt1)
        return; 
      hs1.a.put(new Integer(paramInt2), new Integer(5));
    } 
  }
  
  public static void a(at paramat, int paramInt) {
    Player player;
    if ((player = ((gz)gz.a).a) != null && player instanceof hs) {
      hs hs1;
      if ((hs1 = (hs)player).a.a() != paramInt)
        return; 
      for (paramInt = 0; paramInt < paramat.a.size(); paramInt++) {
        int i;
        if ((i = paramat.a(paramInt)) != 0)
          hs1.a.put(new Integer(i), new Integer(5)); 
      } 
    } 
  }
  
  public final void e() {
    while (this.a != null) {
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {}
    } 
  }
  
  public static void e(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: getstatic gz.a : Lgz;
    //   3: getfield a : Lla;
    //   6: dup
    //   7: astore_2
    //   8: ifnull -> 307
    //   11: aload_2
    //   12: instanceof hs
    //   15: ifeq -> 307
    //   18: aload_2
    //   19: checkcast hs
    //   22: dup
    //   23: astore_3
    //   24: getfield a : Lis;
    //   27: invokevirtual a : ()I
    //   30: iload_1
    //   31: if_icmpeq -> 35
    //   34: return
    //   35: aload_3
    //   36: invokespecial e : ()V
    //   39: aload_2
    //   40: getfield b : Ljava/util/Vector;
    //   43: invokevirtual size : ()I
    //   46: istore_1
    //   47: aload_2
    //   48: getfield b : Ljava/util/Vector;
    //   51: invokevirtual size : ()I
    //   54: iconst_1
    //   55: isub
    //   56: istore #4
    //   58: iload #4
    //   60: iflt -> 136
    //   63: aload_2
    //   64: getfield b : Ljava/util/Vector;
    //   67: iload #4
    //   69: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   72: checkcast ay
    //   75: dup
    //   76: astore #5
    //   78: instanceof km
    //   81: ifne -> 92
    //   84: aload #5
    //   86: instanceof bh
    //   89: ifeq -> 130
    //   92: aload #5
    //   94: checkcast cc
    //   97: invokeinterface a : ()Lbw;
    //   102: dup
    //   103: astore #6
    //   105: getfield a : I
    //   108: iload_0
    //   109: if_icmpne -> 113
    //   112: return
    //   113: aload #6
    //   115: getfield a : I
    //   118: iload_0
    //   119: if_icmpge -> 130
    //   122: iload #4
    //   124: iconst_1
    //   125: iadd
    //   126: istore_1
    //   127: goto -> 136
    //   130: iinc #4, -1
    //   133: goto -> 58
    //   136: new y
    //   139: dup
    //   140: invokespecial <init> : ()V
    //   143: iload_0
    //   144: invokevirtual a : (I)Ly;
    //   147: invokevirtual a : ()Laj;
    //   150: checkcast ho
    //   153: dup
    //   154: astore #4
    //   156: ifnull -> 307
    //   159: aload #4
    //   161: invokevirtual b : ()Z
    //   164: ifeq -> 307
    //   167: aload_3
    //   168: getfield a : Ljava/util/Hashtable;
    //   171: new java/lang/Integer
    //   174: dup
    //   175: aload #4
    //   177: invokevirtual a : ()Lbw;
    //   180: getfield c : I
    //   183: invokespecial <init> : (I)V
    //   186: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   189: pop
    //   190: aload_3
    //   191: invokevirtual g : ()V
    //   194: aload_3
    //   195: getfield b : Ljava/util/Vector;
    //   198: invokevirtual size : ()I
    //   201: istore #5
    //   203: aload_3
    //   204: getfield e : I
    //   207: aload_2
    //   208: getfield g : I
    //   211: isub
    //   212: aload_3
    //   213: getfield j : I
    //   216: isub
    //   217: getstatic gz.a : Lgz;
    //   220: getfield a : Lcp;
    //   223: invokevirtual a : ()I
    //   226: iconst_1
    //   227: ishl
    //   228: if_icmpgt -> 235
    //   231: iconst_1
    //   232: goto -> 236
    //   235: iconst_0
    //   236: istore_0
    //   237: aload #4
    //   239: invokevirtual a : ()Lbw;
    //   242: astore #6
    //   244: aload_3
    //   245: iload_1
    //   246: aload_3
    //   247: aload #6
    //   249: invokevirtual a : (Lbw;)Ljava/util/Vector;
    //   252: invokevirtual a : (ILjava/util/Vector;)V
    //   255: aload_3
    //   256: aload_3
    //   257: invokevirtual b : ()I
    //   260: aload_3
    //   261: getfield b : Ljava/util/Vector;
    //   264: invokevirtual size : ()I
    //   267: iload #5
    //   269: isub
    //   270: invokevirtual f : (II)V
    //   273: iload_0
    //   274: ifeq -> 307
    //   277: aload #6
    //   279: ifnull -> 307
    //   282: aload #6
    //   284: getfield a : I
    //   287: aload_3
    //   288: getfield b : I
    //   291: if_icmple -> 307
    //   294: aload_3
    //   295: aload_3
    //   296: getfield b : Ljava/util/Vector;
    //   299: invokevirtual size : ()I
    //   302: iconst_1
    //   303: isub
    //   304: invokevirtual d : (I)V
    //   307: return
  }
  
  public static void f() {
    if (((gz)gz.a).a instanceof hs)
      gz.a.b(); 
  }
  
  public final void a(Graphics paramGraphics, int paramInt) {
    this.a.d = gz.a.getWidth();
    this.a.f = 0;
    this.a.d();
    this.j = gz.a.c() - this.a.e;
    this.a.g = ((gz)gz.a).g + this.j;
    if (paramGraphics == null)
      return; 
    a(paramGraphics, this.j, paramInt);
    this.a.a(paramGraphics, 0, paramInt);
  }
  
  final String b() {
    return (this.a.a != null) ? this.a.e : super.b();
  }
  
  public final void a(int paramInt1, int paramInt2) {
    if (paramInt2 >= ((gz)gz.a).g + this.j) {
      this.a.c(paramInt1, paramInt2, 0);
      return;
    } 
    super.a(paramInt1, paramInt2);
  }
  
  public final void b(int paramInt1, int paramInt2) {
    if (paramInt2 >= ((gz)gz.a).g + this.j) {
      this.a.a(paramInt1, paramInt2, 0);
      return;
    } 
    super.b(paramInt1, paramInt2);
  }
  
  public final void c(int paramInt1, int paramInt2) {
    if (paramInt2 >= ((gz)gz.a).g + this.j) {
      this.a.b(paramInt1, paramInt2, 0);
      return;
    } 
    super.c(paramInt1, paramInt2);
  }
  
  public final void b(int paramInt) {
    if ((jy.a(paramInt) && this.a.a != null) || ((paramInt == 1000011 || paramInt == 8 || paramInt == 2 || paramInt == 5) && !gz.a.b())) {
      this.a.b(paramInt);
      return;
    } 
    super.b(paramInt);
  }
  
  public final void c(int paramInt) {
    if (((jy.a(paramInt) && this.a.a != null) || ((paramInt == 2 || paramInt == 5) && !gz.a.b())) && paramInt != 1000011 && paramInt != 8) {
      this.a.c(paramInt);
      return;
    } 
    super.c(paramInt);
  }
  
  public final void a(int paramInt) {
    if (((jy.a(paramInt) && this.a.a != null) || ((paramInt == 2 || paramInt == 5) && !gz.a.b())) && paramInt != 1000011 && paramInt != 8) {
      this.a.a(paramInt);
      return;
    } 
    super.a(paramInt);
  }
  
  public final void d() {
    a(true);
  }
  
  public final void c() {
    a(false);
  }
  
  private void a(boolean paramBoolean) {
    // Byte code:
    //   0: getstatic gz.a : Lgz;
    //   3: iconst_1
    //   4: invokevirtual b : (Z)V
    //   7: aload_0
    //   8: getfield b : Ljava/util/Vector;
    //   11: invokevirtual size : ()I
    //   14: istore_2
    //   15: aload_0
    //   16: getfield e : I
    //   19: istore_3
    //   20: new s
    //   23: dup
    //   24: aload_0
    //   25: getfield a : Lis;
    //   28: invokevirtual a : ()I
    //   31: bipush #20
    //   33: invokespecial <init> : (II)V
    //   36: astore #4
    //   38: iload_1
    //   39: ifne -> 58
    //   42: aload #4
    //   44: aload_0
    //   45: getfield a : I
    //   48: istore #6
    //   50: ldc 'start_message_id'
    //   52: iload #6
    //   54: invokevirtual a : (Ljava/lang/String;I)Les;
    //   57: pop
    //   58: aload #4
    //   60: invokevirtual a : ()Laj;
    //   63: checkcast jw
    //   66: dup
    //   67: astore #4
    //   69: ifnull -> 160
    //   72: aload #4
    //   74: invokevirtual b : ()Z
    //   77: ifeq -> 160
    //   80: aload #4
    //   82: getfield a : [Lbw;
    //   85: arraylength
    //   86: bipush #20
    //   88: if_icmpge -> 96
    //   91: aload_0
    //   92: iconst_1
    //   93: putfield b : Z
    //   96: iconst_0
    //   97: istore #5
    //   99: iload #5
    //   101: aload #4
    //   103: getfield a : [Lbw;
    //   106: arraylength
    //   107: if_icmpge -> 157
    //   110: aload #4
    //   112: getfield a : [Lbw;
    //   115: iload #5
    //   117: aaload
    //   118: dup
    //   119: astore #6
    //   121: getfield a : I
    //   124: aload_0
    //   125: getfield a : I
    //   128: if_icmpge -> 151
    //   131: aload_0
    //   132: aload #6
    //   134: getfield a : I
    //   137: putfield a : I
    //   140: aload_0
    //   141: iconst_0
    //   142: aload_0
    //   143: aload #6
    //   145: invokevirtual a : (Lbw;)Ljava/util/Vector;
    //   148: invokevirtual a : (ILjava/util/Vector;)V
    //   151: iinc #5, 1
    //   154: goto -> 99
    //   157: goto -> 181
    //   160: aload_0
    //   161: iconst_1
    //   162: putfield b : Z
    //   165: aload #4
    //   167: ifnonnull -> 181
    //   170: getstatic gz.a : Lgz;
    //   173: ldc 'general.loadError'
    //   175: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   178: invokevirtual a : (Ljava/lang/String;)V
    //   181: aload_0
    //   182: getfield b : Ljava/util/Vector;
    //   185: invokevirtual size : ()I
    //   188: iload_2
    //   189: isub
    //   190: istore #5
    //   192: aload_0
    //   193: aload_0
    //   194: invokevirtual b : ()I
    //   197: iload #5
    //   199: invokevirtual g : (II)V
    //   202: iload_1
    //   203: ifne -> 239
    //   206: aload_0
    //   207: iload #5
    //   209: putfield h : I
    //   212: aload_0
    //   213: aload_0
    //   214: aload_0
    //   215: getfield f : I
    //   218: aload_0
    //   219: getfield e : I
    //   222: iload_3
    //   223: isub
    //   224: iadd
    //   225: dup_x1
    //   226: putfield g : I
    //   229: putfield f : I
    //   232: goto -> 260
    //   235: pop
    //   236: goto -> 260
    //   239: aload_0
    //   240: aload_0
    //   241: getfield b : Ljava/util/Vector;
    //   244: invokevirtual size : ()I
    //   247: iconst_1
    //   248: isub
    //   249: invokevirtual d : (I)V
    //   252: aload_0
    //   253: aload_0
    //   254: getfield g : I
    //   257: putfield f : I
    //   260: getstatic gz.a : Lgz;
    //   263: iconst_0
    //   264: invokevirtual b : (Z)V
    //   267: iload_1
    //   268: ifeq -> 287
    //   271: aload_0
    //   272: aload_0
    //   273: aload_0
    //   274: getfield a : Lis;
    //   277: getfield a : I
    //   280: dup_x1
    //   281: putfield c : I
    //   284: putfield b : I
    //   287: return
    // Exception table:
    //   from	to	target	type
    //   212	232	235	java/lang/Exception
  }
  
  public hs(is paramis) {
    super(paramis);
    a(false);
    this.a = new eb(paramis.a(), this);
    c(paramis.a());
    hs hs1;
    if ((hs1 = this).a == null && !hs1.b) {
      hs1.a = true;
      (new bf(hs1)).start();
    } 
    a((Graphics)null, 0);
  }
  
  final void b_() {
    if (this.a.a())
      this.a.b(); 
  }
  
  final String a() {
    return !this.a.a() ? null : ((this.a.a != null) ? u.a("action.hide") : u.a("action.reveal"));
  }
  
  public final int[] a(int paramInt) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: aload_0
    //   5: getfield b : Ljava/util/Vector;
    //   8: invokevirtual size : ()I
    //   11: iconst_1
    //   12: isub
    //   13: istore #4
    //   15: iload #4
    //   17: iflt -> 184
    //   20: aload_0
    //   21: getfield b : Ljava/util/Vector;
    //   24: iload #4
    //   26: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   29: checkcast ay
    //   32: dup
    //   33: astore #5
    //   35: instanceof jl
    //   38: ifeq -> 140
    //   41: aload #5
    //   43: checkcast jl
    //   46: invokevirtual a : ()Lbw;
    //   49: getfield a : I
    //   52: iload_1
    //   53: if_icmpne -> 137
    //   56: iload #4
    //   58: istore_2
    //   59: iinc #3, 1
    //   62: iload #4
    //   64: iconst_1
    //   65: iadd
    //   66: istore #5
    //   68: iload #5
    //   70: aload_0
    //   71: getfield b : Ljava/util/Vector;
    //   74: invokevirtual size : ()I
    //   77: if_icmpge -> 137
    //   80: iinc #3, 1
    //   83: aload_0
    //   84: getfield b : Ljava/util/Vector;
    //   87: iload #5
    //   89: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   92: checkcast ay
    //   95: dup
    //   96: astore #6
    //   98: instanceof km
    //   101: ifeq -> 131
    //   104: aload #6
    //   106: checkcast km
    //   109: getfield a : Lbw;
    //   112: getfield a : I
    //   115: iload_1
    //   116: if_icmpne -> 131
    //   119: iconst_2
    //   120: newarray int
    //   122: dup
    //   123: iconst_0
    //   124: iload_2
    //   125: iastore
    //   126: dup
    //   127: iconst_1
    //   128: iload_3
    //   129: iastore
    //   130: areturn
    //   131: iinc #5, 1
    //   134: goto -> 68
    //   137: goto -> 178
    //   140: aload #5
    //   142: instanceof bh
    //   145: ifeq -> 178
    //   148: aload #5
    //   150: checkcast bh
    //   153: getfield a : Lbw;
    //   156: getfield a : I
    //   159: iload_1
    //   160: if_icmpne -> 178
    //   163: iload #4
    //   165: istore_2
    //   166: iconst_2
    //   167: newarray int
    //   169: dup
    //   170: iconst_0
    //   171: iload_2
    //   172: iastore
    //   173: dup
    //   174: iconst_1
    //   175: iconst_1
    //   176: iastore
    //   177: areturn
    //   178: iinc #4, -1
    //   181: goto -> 15
    //   184: iconst_2
    //   185: newarray int
    //   187: dup
    //   188: iconst_0
    //   189: iload_2
    //   190: iastore
    //   191: dup
    //   192: iconst_1
    //   193: iload_3
    //   194: iastore
    //   195: areturn
  }
  
  public final Vector a(bw parambw) {
    bw bw1 = parambw;
    hs hs1;
    if ((hs1 = this).a == null || bw1 == null)
      return new Vector(); 
    if (bw1.a()) {
      Vector vector1;
      (vector1 = new Vector()).addElement(new bh((is)hs1.a, bw1));
      return vector1;
    } 
    boolean bool = hs1.a.a();
    hu hu;
    (hu = new hu(u.a("action.TempReplyThisChat"), hs1, bw1)).m = bool;
    ba ba1;
    (ba1 = new ba(u.a("general.actions"))).a(hu, true);
    bool = (hs1.a.a() && bw1.f() && (bw1.c == ((iq)fy.a).a || (hs1.a.d() && ((is)hs1.a).a.a(((iq)fy.a).a))));
    hw hw;
    (hw = new hw(u.a("action.editMessage"), hs1, bw1)).m = bool;
    ba1.a(hw, true);
    bool = hs1.a.a();
    hq hq;
    (hq = new hq(u.a("action.TempFwdThisChat"), hs1, bw1)).m = bool;
    ba1.a(hq, true);
    bool = (hs1.a.a() && bw1.f() && bw1.b != ((iq)fy.a).a && (bw1.c == ((iq)fy.a).a || (hs1.a.d() && ((is)hs1.a).a.a(((iq)fy.a).a))));
    hr hr;
    (hr = new hr(u.a("action.deleteForEveryone"), bw1)).m = bool;
    ba ba2;
    (ba2 = new ba()).a(hr, true);
    bool = hs1.a.a();
    hn hn;
    (hn = new hn(u.a("action.deleteForMyself"), bw1)).m = bool;
    ba2.a(hn, true);
    bool = hs1.a.a();
    ap ap;
    (ap = new ap(u.a("action.deleteMessage"), ba2)).m = bool;
    ba1.a(ap, true);
    bool = hs1.a.a();
    (ap = new hp(u.a("action.clearMessageField"), hs1)).m = bool;
    ba1.a(ap, true);
    int i = gz.a.getWidth() - (la.i << 1);
    Vector vector = new Vector();
    jl jl = new jl(bw1, (is)hs1.a, i);
    vector.addElement(jl);
    if (bw1.c()) {
      vector.addElement(new iu(bw1, (is)hs1.a, (bw)bw1.a, i));
      vector.addElement(new as(bw1));
    } 
    if (bw1.e()) {
      vector.addElement(new hz(bw1, i));
      vector.addElement(new as(bw1));
    } 
    if (bw1.d())
      for (byte b1 = 0; b1 < bw1.a.length; b1++) {
        String str;
        if ((str = bw1.a[b1]) != null) {
          if (str instanceof fh) {
            vector.addElement(new kr(bw1, (dv)str, i));
          } else {
            vector.addElement(new cq(bw1, (dv)str, i));
          } 
          vector.addElement(new as(bw1));
        } 
      }  
    if (bw1.b())
      for (byte b1 = 0; b1 < bw1.a.length; b1++) {
        String str;
        if ((str = bw1.a[b1]) != null) {
          vector.addElement(new iu(bw1, (is)hs1.a, (bw)str, i));
          vector.addElement(new as(bw1, (b1 + 1 < bw1.a.length && bw1.a[b1 + 1] != null)));
        } 
      }  
    if (vector.size() > 1)
      vector.removeElementAt(vector.size() - 1); 
    vector.addElement(new km(bw1));
    int j = 0;
    byte b;
    for (b = 0; b < vector.size(); b++)
      j = Math.max(j, ((cc)vector.elementAt(b)).a()); 
    if (j == 0)
      j = i - bh.a; 
    for (b = 0; b < vector.size(); b++) {
      cc cc;
      (cc = vector.elementAt(b)).a(ba1);
      cc.d(j);
    } 
    return vector;
  }
  
  final void g() {
    if (this.b != this.c) {
      this.c = this.b;
      (new ix(this.a.a(), this.b)).a();
    } 
    Enumeration enumeration = this.a.keys();
    while (enumeration.hasMoreElements()) {
      Integer integer = enumeration.nextElement();
      this.a.put(integer, new Integer(((Integer)this.a.get(integer)).intValue() - 1));
      if (((Integer)this.a.get(integer)).intValue() <= 0)
        this.a.remove(integer); 
    } 
    if (this.a.isEmpty()) {
      c(this.a.a());
    } else if (this.a.size() == 1) {
      c(u.a("title.userTyping", au.a(((Integer)this.a.keys().nextElement()).intValue()).c("nom")));
    } else if (this.a.size() == 2) {
      Enumeration enumeration1 = this.a.keys();
      c(u.a("title.twoUsersTyping", au.a(((Integer)enumeration1.nextElement()).intValue()).c("nom") + u.a("title.manyUsersAnd") + au.a(((Integer)enumeration1.nextElement()).intValue()).c("nom")));
    } else {
      c(this.a.size() + u.a((this.a.size() % 10 == 1) ? "title.manyUsersTypingModTenOne" : "title.manyUsersTyping", this.a.size() + ""));
    } 
    f();
  }
  
  public final boolean a(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_0
    //   3: iaload
    //   4: aload_1
    //   5: iconst_1
    //   6: iaload
    //   7: istore_3
    //   8: istore_2
    //   9: astore_1
    //   10: iload_3
    //   11: iflt -> 18
    //   14: iload_2
    //   15: ifge -> 20
    //   18: iconst_0
    //   19: ireturn
    //   20: iload_2
    //   21: iload_3
    //   22: iadd
    //   23: aload_1
    //   24: getfield b : Ljava/util/Vector;
    //   27: invokevirtual size : ()I
    //   30: invokestatic min : (II)I
    //   33: iconst_1
    //   34: isub
    //   35: istore_3
    //   36: iload_3
    //   37: iload_2
    //   38: if_icmplt -> 55
    //   41: aload_1
    //   42: getfield b : Ljava/util/Vector;
    //   45: iload_3
    //   46: invokevirtual removeElementAt : (I)V
    //   49: iinc #3, -1
    //   52: goto -> 36
    //   55: iconst_1
    //   56: ireturn
  }
  
  public final void a(int paramInt, Vector paramVector) {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull -> 5
    //   4: return
    //   5: iconst_0
    //   6: istore_3
    //   7: iconst_0
    //   8: iload_1
    //   9: invokestatic max : (II)I
    //   12: istore_1
    //   13: iload_1
    //   14: aload_0
    //   15: getfield b : Ljava/util/Vector;
    //   18: invokevirtual size : ()I
    //   21: if_icmpgt -> 57
    //   24: iload_3
    //   25: aload_2
    //   26: invokevirtual size : ()I
    //   29: iconst_1
    //   30: isub
    //   31: if_icmple -> 35
    //   34: return
    //   35: aload_0
    //   36: getfield b : Ljava/util/Vector;
    //   39: aload_2
    //   40: iload_3
    //   41: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   44: iload_1
    //   45: invokevirtual insertElementAt : (Ljava/lang/Object;I)V
    //   48: iinc #3, 1
    //   51: iinc #1, 1
    //   54: goto -> 13
    //   57: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/hs.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */