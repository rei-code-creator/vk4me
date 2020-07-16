import javax.microedition.lcdui.Image;

public final class fw {
  public static ar a;
  
  public static ar b;
  
  public static az a;
  
  public static r a;
  
  public static gz a;
  
  private static la b;
  
  public static la a;
  
  public static void a(boolean paramBoolean, String paramString1, String paramString2) {
    a.b(true);
    (new dx(paramString1, paramString2, paramBoolean)).start();
  }
  
  public static void a() {
    // Byte code:
    //   0: invokestatic d : ()V
    //   3: getstatic fw.a : Lgz;
    //   6: iconst_1
    //   7: putfield d : Z
    //   10: getstatic fw.b : Lla;
    //   13: ifnonnull -> 311
    //   16: new la
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: dup
    //   24: putstatic fw.b : Lla;
    //   27: ldc 'title.auth'
    //   29: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   32: invokevirtual c : (Ljava/lang/String;)V
    //   35: getstatic fw.b : Lla;
    //   38: getfield b : Ljava/util/Vector;
    //   41: new fl
    //   44: dup
    //   45: ldc 'ph.png'
    //   47: invokestatic a : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   50: getstatic fw.a : Lgz;
    //   53: invokevirtual getWidth : ()I
    //   56: iconst_2
    //   57: idiv
    //   58: getstatic fw.a : Lgz;
    //   61: invokevirtual getHeight : ()I
    //   64: iconst_2
    //   65: idiv
    //   66: invokestatic min : (II)I
    //   69: invokestatic a : (Ljavax/microedition/lcdui/Image;I)Ljavax/microedition/lcdui/Image;
    //   72: invokespecial <init> : (Ljavax/microedition/lcdui/Image;)V
    //   75: dup
    //   76: astore_0
    //   77: iconst_1
    //   78: putfield a : B
    //   81: aload_0
    //   82: invokevirtual addElement : (Ljava/lang/Object;)V
    //   85: getstatic fw.b : Lla;
    //   88: getfield b : Ljava/util/Vector;
    //   91: new ar
    //   94: dup
    //   95: ldc 'element.login'
    //   97: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   100: invokespecial <init> : (Ljava/lang/String;)V
    //   103: dup
    //   104: putstatic fw.a : Lar;
    //   107: invokevirtual addElement : (Ljava/lang/Object;)V
    //   110: getstatic fw.b : Lla;
    //   113: getfield b : Ljava/util/Vector;
    //   116: new az
    //   119: dup
    //   120: ldc 'element.password'
    //   122: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   125: invokespecial <init> : (Ljava/lang/String;)V
    //   128: dup
    //   129: putstatic fw.a : Laz;
    //   132: invokevirtual addElement : (Ljava/lang/Object;)V
    //   135: getstatic fw.b : Lla;
    //   138: getfield b : Ljava/util/Vector;
    //   141: new r
    //   144: dup
    //   145: ldc 'element.rememberPassword'
    //   147: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   150: iconst_1
    //   151: invokespecial <init> : (Ljava/lang/String;B)V
    //   154: dup
    //   155: astore_0
    //   156: iconst_1
    //   157: putfield n : Z
    //   160: aload_0
    //   161: checkcast r
    //   164: dup
    //   165: putstatic fw.a : Lr;
    //   168: invokevirtual addElement : (Ljava/lang/Object;)V
    //   171: getstatic fw.b : Lla;
    //   174: getfield b : Ljava/util/Vector;
    //   177: new do
    //   180: dup
    //   181: ldc 'action.logIn'
    //   183: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   186: invokespecial <init> : (Ljava/lang/String;)V
    //   189: ldc 'logoutg.png'
    //   191: ldc 'logouts.png'
    //   193: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   196: iconst_0
    //   197: iconst_0
    //   198: invokevirtual a : (ZZ)Lr;
    //   201: dup
    //   202: astore_0
    //   203: iconst_1
    //   204: putfield n : Z
    //   207: aload_0
    //   208: invokevirtual addElement : (Ljava/lang/Object;)V
    //   211: getstatic fw.b : Lla;
    //   214: getfield b : Ljava/util/Vector;
    //   217: new dn
    //   220: dup
    //   221: ldc 'element.settings'
    //   223: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   226: invokespecial <init> : (Ljava/lang/String;)V
    //   229: ldc 'mp.png'
    //   231: ldc 'mps.png'
    //   233: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   236: iconst_1
    //   237: iconst_0
    //   238: invokevirtual a : (ZZ)Lr;
    //   241: dup
    //   242: astore_0
    //   243: iconst_1
    //   244: putfield n : Z
    //   247: aload_0
    //   248: checkcast r
    //   251: dup
    //   252: astore_0
    //   253: invokevirtual addElement : (Ljava/lang/Object;)V
    //   256: new dq
    //   259: dup
    //   260: aload_0
    //   261: invokespecial <init> : (Lr;)V
    //   264: invokevirtual start : ()V
    //   267: getstatic fw.b : Lla;
    //   270: getfield b : Ljava/util/Vector;
    //   273: new ja
    //   276: dup
    //   277: ldc 'action.quit'
    //   279: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   282: invokespecial <init> : (Ljava/lang/String;)V
    //   285: invokevirtual b : ()Lr;
    //   288: invokevirtual a : ()Lr;
    //   291: ldc 'close.png'
    //   293: ldc 'closes.png'
    //   295: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   298: dup
    //   299: astore_0
    //   300: iconst_1
    //   301: putfield n : Z
    //   304: aload_0
    //   305: invokevirtual addElement : (Ljava/lang/Object;)V
    //   308: goto -> 336
    //   311: getstatic fw.a : Lgz;
    //   314: getfield a : Lla;
    //   317: ifnull -> 336
    //   320: getstatic fw.a : Lgz;
    //   323: getfield a : Lla;
    //   326: getstatic fw.b : Lla;
    //   329: invokevirtual equals : (Ljava/lang/Object;)Z
    //   332: ifeq -> 336
    //   335: return
    //   336: getstatic fw.a : Lgz;
    //   339: getfield a : Lla;
    //   342: ifnull -> 369
    //   345: getstatic fw.a : Lgz;
    //   348: getfield a : Lla;
    //   351: getfield d : Z
    //   354: ifeq -> 369
    //   357: getstatic fw.a : Lgz;
    //   360: getstatic fw.b : Lla;
    //   363: invokevirtual a : (Lla;)V
    //   366: goto -> 378
    //   369: getstatic fw.a : Lgz;
    //   372: getstatic fw.b : Lla;
    //   375: invokevirtual b : (Lla;)V
    //   378: iconst_0
    //   379: invokestatic a : (Z)V
    //   382: return
  }
  
  public static la a() {
    // Byte code:
    //   0: aconst_null
    //   1: putstatic fw.a : Lar;
    //   4: aconst_null
    //   5: putstatic fw.a : Laz;
    //   8: aconst_null
    //   9: putstatic fw.a : Lr;
    //   12: aconst_null
    //   13: putstatic fw.b : Lla;
    //   16: aconst_null
    //   17: putstatic fw.b : Lar;
    //   20: aconst_null
    //   21: putstatic fw.a : Lla;
    //   24: invokestatic d : ()V
    //   27: getstatic fw.a : Lgz;
    //   30: iconst_2
    //   31: putfield f : I
    //   34: new la
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: iconst_1
    //   42: invokevirtual a : (Z)Lla;
    //   45: dup
    //   46: astore_0
    //   47: ldc 'title.home'
    //   49: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   52: invokevirtual c : (Ljava/lang/String;)V
    //   55: aload_0
    //   56: getfield b : Ljava/util/Vector;
    //   59: new iy
    //   62: dup
    //   63: ldc ''
    //   65: invokespecial <init> : (Ljava/lang/String;)V
    //   68: ldc ''
    //   70: invokevirtual c : (Ljava/lang/String;)Lr;
    //   73: iconst_1
    //   74: invokevirtual a : (Z)Lr;
    //   77: dup
    //   78: astore_1
    //   79: iconst_1
    //   80: putfield n : Z
    //   83: aload_1
    //   84: invokevirtual addElement : (Ljava/lang/Object;)V
    //   87: aload_0
    //   88: getfield b : Ljava/util/Vector;
    //   91: new jd
    //   94: dup
    //   95: ldc 'element.myFriends'
    //   97: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   100: invokespecial <init> : (Ljava/lang/String;)V
    //   103: ldc 'mf.png'
    //   105: ldc 'mfs.png'
    //   107: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   110: dup
    //   111: astore_1
    //   112: iconst_1
    //   113: putfield n : Z
    //   116: aload_1
    //   117: invokevirtual addElement : (Ljava/lang/Object;)V
    //   120: aload_0
    //   121: getfield b : Ljava/util/Vector;
    //   124: new jb
    //   127: dup
    //   128: ldc 'element.myGroups'
    //   130: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   133: invokespecial <init> : (Ljava/lang/String;)V
    //   136: ldc 'mg.png'
    //   138: ldc 'mgs.png'
    //   140: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   143: dup
    //   144: astore_1
    //   145: iconst_1
    //   146: putfield n : Z
    //   149: aload_1
    //   150: invokevirtual addElement : (Ljava/lang/Object;)V
    //   153: aload_0
    //   154: getfield b : Ljava/util/Vector;
    //   157: new jf
    //   160: dup
    //   161: ldc 'element.myMusic'
    //   163: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   166: invokespecial <init> : (Ljava/lang/String;)V
    //   169: ldc 'mm.png'
    //   171: ldc 'mms.png'
    //   173: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   176: dup
    //   177: astore_1
    //   178: iconst_1
    //   179: putfield n : Z
    //   182: aload_1
    //   183: invokevirtual addElement : (Ljava/lang/Object;)V
    //   186: aload_0
    //   187: getfield b : Ljava/util/Vector;
    //   190: new je
    //   193: dup
    //   194: ldc 'element.settings'
    //   196: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   199: invokespecial <init> : (Ljava/lang/String;)V
    //   202: ldc 'mp.png'
    //   204: ldc 'mps.png'
    //   206: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   209: iconst_1
    //   210: iconst_0
    //   211: invokevirtual a : (ZZ)Lr;
    //   214: dup
    //   215: astore_1
    //   216: iconst_1
    //   217: putfield n : Z
    //   220: aload_1
    //   221: invokevirtual addElement : (Ljava/lang/Object;)V
    //   224: aload_0
    //   225: getfield b : Ljava/util/Vector;
    //   228: new jh
    //   231: dup
    //   232: ldc 'action.quit'
    //   234: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   237: invokespecial <init> : (Ljava/lang/String;)V
    //   240: invokevirtual b : ()Lr;
    //   243: invokevirtual a : ()Lr;
    //   246: ldc 'close.png'
    //   248: ldc 'closes.png'
    //   250: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   253: dup
    //   254: astore_1
    //   255: iconst_1
    //   256: putfield n : Z
    //   259: aload_1
    //   260: invokevirtual addElement : (Ljava/lang/Object;)V
    //   263: invokestatic a : ()J
    //   266: invokestatic a : (J)[I
    //   269: dup
    //   270: astore_1
    //   271: iconst_3
    //   272: iaload
    //   273: bipush #9
    //   275: if_icmpne -> 319
    //   278: aload_1
    //   279: iconst_4
    //   280: iaload
    //   281: iconst_1
    //   282: if_icmpne -> 319
    //   285: aload_0
    //   286: getfield b : Ljava/util/Vector;
    //   289: new ji
    //   292: dup
    //   293: ldc 'event.happyBirthday'
    //   295: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   298: invokespecial <init> : (Ljava/lang/String;)V
    //   301: ldc 'event.happyBirthdayDevCongratulation'
    //   303: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   306: invokevirtual c : (Ljava/lang/String;)Lr;
    //   309: ldc 'gift.png'
    //   311: ldc 'gifts.png'
    //   313: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   316: invokevirtual addElement : (Ljava/lang/Object;)V
    //   319: new jj
    //   322: dup
    //   323: aload_0
    //   324: invokespecial <init> : (Lla;)V
    //   327: invokevirtual start : ()V
    //   330: aload_0
    //   331: areturn
  }
  
  public static void b() {
    a(((iq)ad.a).a);
  }
  
  public static void a(int paramInt) {
    d();
    ((gz)a).f = 4;
    a.b(new jk(u.a("title.myMusic"), paramInt));
  }
  
  public static void a(lb paramlb) {
    if (paramlb == null)
      return; 
    d();
    ((gz)a).f = 0;
    a.a((paramlb.a() != ((iq)fy.a).a));
    la la1 = (new i(paramlb.a())).a(true);
    a.b(la1);
  }
  
  public static void b(int paramInt) {
    d();
    ((gz)a).f = 0;
    a.a(true);
    a.b(new gx((((iq)fy.a).a == paramInt) ? u.a("title.myFriends") : u.a("title.usersFriends", (au.a(paramInt) != null) ? au.a(paramInt).c("gen") : u.a("general.unknownUser")), paramInt));
  }
  
  public static void c(int paramInt) {
    d();
    ((gz)a).f = 0;
    a.a(true);
    a.b(new gu((((iq)fy.a).a == paramInt) ? u.a("title.myGroups") : u.a("title.usersGroups", (au.a(paramInt) != null) ? au.a(paramInt).c("gen") : u.a("general.unknownUser")), paramInt));
  }
  
  public static void c() {
    d();
    ((gz)a).f = 4;
    a.b(ea.a());
  }
  
  public static void a(boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic b : ()Z
    //   3: ifeq -> 10
    //   6: iload_0
    //   7: ifeq -> 192
    //   10: new bj
    //   13: dup
    //   14: new java/lang/String
    //   17: dup
    //   18: ldc 'vk4me_confign'
    //   20: invokestatic b : (Ljava/lang/String;)[B
    //   23: ldc 'UTF-8'
    //   25: invokespecial <init> : ([BLjava/lang/String;)V
    //   28: invokespecial <init> : (Ljava/lang/String;)V
    //   31: ldc 'account'
    //   33: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   36: ldc 'token'
    //   38: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   41: dup
    //   42: astore_0
    //   43: invokestatic a : (Ljava/lang/String;)Z
    //   46: ifeq -> 57
    //   49: new java/lang/Exception
    //   52: dup
    //   53: invokespecial <init> : ()V
    //   56: athrow
    //   57: new la
    //   60: dup
    //   61: invokespecial <init> : ()V
    //   64: dup
    //   65: astore_1
    //   66: ldc 'title.vk4meMigration'
    //   68: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   71: invokevirtual c : (Ljava/lang/String;)V
    //   74: new fl
    //   77: dup
    //   78: ldc 'account-question.png'
    //   80: invokestatic a : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   83: getstatic fw.a : Lgz;
    //   86: invokevirtual getWidth : ()I
    //   89: iconst_2
    //   90: idiv
    //   91: getstatic fw.a : Lgz;
    //   94: invokevirtual getHeight : ()I
    //   97: iconst_2
    //   98: idiv
    //   99: invokestatic min : (II)I
    //   102: invokestatic a : (Ljavax/microedition/lcdui/Image;I)Ljavax/microedition/lcdui/Image;
    //   105: invokespecial <init> : (Ljavax/microedition/lcdui/Image;)V
    //   108: dup
    //   109: astore_2
    //   110: iconst_1
    //   111: putfield a : B
    //   114: aload_1
    //   115: getfield b : Ljava/util/Vector;
    //   118: aload_2
    //   119: invokevirtual addElement : (Ljava/lang/Object;)V
    //   122: aload_1
    //   123: getfield b : Ljava/util/Vector;
    //   126: new gg
    //   129: dup
    //   130: ldc 'element.vk4meDetected'
    //   132: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   135: invokespecial <init> : (Ljava/lang/String;)V
    //   138: invokevirtual addElement : (Ljava/lang/Object;)V
    //   141: aload_1
    //   142: getfield b : Ljava/util/Vector;
    //   145: new gr
    //   148: dup
    //   149: ldc 'action.migrate'
    //   151: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   154: aload_0
    //   155: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   158: invokevirtual addElement : (Ljava/lang/Object;)V
    //   161: aload_1
    //   162: getfield b : Ljava/util/Vector;
    //   165: new gt
    //   168: dup
    //   169: ldc 'action.refuse'
    //   171: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   174: invokespecial <init> : (Ljava/lang/String;)V
    //   177: invokevirtual addElement : (Ljava/lang/Object;)V
    //   180: getstatic gz.a : Lgz;
    //   183: aload_1
    //   184: invokevirtual b : (Lla;)V
    //   187: return
    //   188: pop
    //   189: invokestatic b : ()V
    //   192: return
    // Exception table:
    //   from	to	target	type
    //   10	187	188	java/lang/Exception
  }
  
  public static void d() {
    bc.f();
    ((gz)(a = (la)gz.a)).d = false;
    ((gz)a).f = -1;
  }
  
  public static r a(lb paramlb, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5) {
    r r1;
    (r1 = (new gp(paramlb)).a(a(paramlb)).b((paramlb.a() == 100) ? 431878 : ((paramlb.a() == 145557030) ? 4681404 : 0)).a(paramlb).a(paramBoolean2).a(paramBoolean1 ? paramlb.c("nom") : paramlb.b("nom")).c(!paramBoolean4 ? null : (paramlb.d ? ((paramlb.a() && !paramBoolean5) ? ((lk)paramlb).b : i.a(((lk)paramlb).d)) : ((paramlb.a() && !paramBoolean5) ? ((bi)paramlb).c : ((((bi)paramlb).c == true) ? u.a("element.online") : i.a((((bi)paramlb).b == true) ? true : false, ((bi)paramlb).f))))).a(paramBoolean3 ? hx.a : hx.a(paramlb.a()), (Image)null)).n = true;
    return r1;
  }
  
  public static int a(lb paramlb) {
    if (paramlb == null || paramlb.d)
      return 0; 
    if (((bi)(paramlb = paramlb)).c == true) {
      if (((bi)paramlb).e != 0) {
        switch (((bi)paramlb).e) {
          case 2274003:
          case 2685278:
            return 3;
          case 3697615:
            return 5;
          case 3140623:
            return 4;
          case 6146827:
            return 2;
        } 
        return 1;
      } 
      return (((bi)paramlb).d == 1) ? 2 : 1;
    } 
    return 0;
  }
  
  public static void e() {
    if (fy.a == null) {
      f();
      return;
    } 
    ea.a();
    bc.a = (Thread)new bc();
    af.a();
    g();
  }
  
  public static void f() {
    af.a(true);
    fy.a = null;
    bc.a = null;
    eg.a = null;
    ea.a();
    u.a("unreadCount");
    v.a((String)null);
    a();
  }
  
  static void a(aa paramaa, jq paramjq) {
    if (paramaa == null)
      return; 
    d();
    ((gz)a).f = 0;
    a.a(true);
    a.b(new gq(u.a("title.comments"), paramaa, paramjq));
  }
  
  static r a(la paramla, aa paramaa, jq paramjq) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/util/Vector;
    //   4: invokevirtual size : ()I
    //   7: iconst_1
    //   8: if_icmpne -> 25
    //   11: aload_0
    //   12: getfield b : Ljava/util/Vector;
    //   15: new ak
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: invokevirtual addElement : (Ljava/lang/Object;)V
    //   25: aload_2
    //   26: getfield b : I
    //   29: invokestatic a : (I)Llb;
    //   32: iconst_1
    //   33: iconst_0
    //   34: iconst_1
    //   35: iconst_0
    //   36: iconst_1
    //   37: invokestatic a : (Llb;ZZZZZ)Lr;
    //   40: dup
    //   41: astore #5
    //   43: iconst_0
    //   44: putfield n : Z
    //   47: aload #5
    //   49: checkcast r
    //   52: astore_3
    //   53: aload_0
    //   54: getfield b : Ljava/util/Vector;
    //   57: aload_3
    //   58: invokevirtual addElement : (Ljava/lang/Object;)V
    //   61: aload_2
    //   62: getfield a : Ljava/lang/String;
    //   65: invokestatic a : (Ljava/lang/String;)Z
    //   68: ifne -> 75
    //   71: iconst_1
    //   72: goto -> 76
    //   75: iconst_0
    //   76: ifeq -> 97
    //   79: aload_0
    //   80: getfield b : Ljava/util/Vector;
    //   83: new gg
    //   86: dup
    //   87: aload_2
    //   88: getfield a : Ljava/lang/String;
    //   91: invokespecial <init> : (Ljava/lang/String;)V
    //   94: invokevirtual addElement : (Ljava/lang/Object;)V
    //   97: aload_2
    //   98: dup
    //   99: astore #4
    //   101: getfield a : [Ldv;
    //   104: ifnull -> 120
    //   107: aload #4
    //   109: getfield a : [Ldv;
    //   112: arraylength
    //   113: ifle -> 120
    //   116: iconst_1
    //   117: goto -> 121
    //   120: iconst_0
    //   121: ifeq -> 381
    //   124: iconst_0
    //   125: istore #4
    //   127: iload #4
    //   129: aload_2
    //   130: getfield a : [Ldv;
    //   133: arraylength
    //   134: if_icmpge -> 381
    //   137: aload_2
    //   138: getfield a : [Ldv;
    //   141: iload #4
    //   143: aaload
    //   144: dup
    //   145: astore #5
    //   147: ifnull -> 375
    //   150: aload #5
    //   152: instanceof jc
    //   155: ifeq -> 236
    //   158: aload_0
    //   159: getfield b : Ljava/util/Vector;
    //   162: new fl
    //   165: dup
    //   166: aload #5
    //   168: checkcast jc
    //   171: invokevirtual a : ()Leh;
    //   174: getfield b : Ljava/lang/String;
    //   177: invokestatic b : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   180: invokespecial <init> : (Ljavax/microedition/lcdui/Image;)V
    //   183: dup
    //   184: astore #5
    //   186: iconst_4
    //   187: putfield a : B
    //   190: aload #5
    //   192: dup
    //   193: astore #5
    //   195: iconst_1
    //   196: putfield a : Z
    //   199: aload #5
    //   201: getstatic gz.a : Lgz;
    //   204: invokevirtual getWidth : ()I
    //   207: iconst_2
    //   208: idiv
    //   209: istore #6
    //   211: dup
    //   212: astore #5
    //   214: iload #6
    //   216: putfield c_ : I
    //   219: aload #5
    //   221: dup
    //   222: astore #5
    //   224: iconst_1
    //   225: putfield m : Z
    //   228: aload #5
    //   230: invokevirtual addElement : (Ljava/lang/Object;)V
    //   233: goto -> 375
    //   236: aload #5
    //   238: instanceof ej
    //   241: ifeq -> 304
    //   244: aload_0
    //   245: getfield b : Ljava/util/Vector;
    //   248: new fl
    //   251: dup
    //   252: aload #5
    //   254: checkcast ej
    //   257: getfield a : Lde;
    //   260: getfield a : Ljava/lang/String;
    //   263: invokestatic b : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   266: invokespecial <init> : (Ljavax/microedition/lcdui/Image;)V
    //   269: dup
    //   270: astore #5
    //   272: iconst_4
    //   273: putfield a : B
    //   276: aload #5
    //   278: getstatic gz.a : Lgz;
    //   281: invokevirtual getWidth : ()I
    //   284: iconst_2
    //   285: idiv
    //   286: istore #6
    //   288: dup
    //   289: astore #5
    //   291: iload #6
    //   293: putfield c_ : I
    //   296: aload #5
    //   298: invokevirtual addElement : (Ljava/lang/Object;)V
    //   301: goto -> 375
    //   304: aload #5
    //   306: instanceof dp
    //   309: ifeq -> 375
    //   312: aload_0
    //   313: getfield b : Ljava/util/Vector;
    //   316: new fl
    //   319: dup
    //   320: aload #5
    //   322: checkcast dp
    //   325: getfield a : Ljava/lang/String;
    //   328: invokestatic b : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   331: invokespecial <init> : (Ljavax/microedition/lcdui/Image;)V
    //   334: dup
    //   335: astore #5
    //   337: iconst_4
    //   338: putfield a : B
    //   341: aload #5
    //   343: dup
    //   344: astore #5
    //   346: iconst_1
    //   347: putfield a : Z
    //   350: aload #5
    //   352: getstatic gz.a : Lgz;
    //   355: invokevirtual getWidth : ()I
    //   358: iconst_2
    //   359: idiv
    //   360: istore #6
    //   362: dup
    //   363: astore #5
    //   365: iload #6
    //   367: putfield c_ : I
    //   370: aload #5
    //   372: invokevirtual addElement : (Ljava/lang/Object;)V
    //   375: iinc #4, 1
    //   378: goto -> 127
    //   381: aload_0
    //   382: getfield b : Ljava/util/Vector;
    //   385: new bo
    //   388: dup
    //   389: aload_2
    //   390: aload_1
    //   391: invokespecial <init> : (Ljq;Laa;)V
    //   394: invokevirtual addElement : (Ljava/lang/Object;)V
    //   397: aload_0
    //   398: getfield b : Ljava/util/Vector;
    //   401: new ak
    //   404: dup
    //   405: invokespecial <init> : ()V
    //   408: invokevirtual addElement : (Ljava/lang/Object;)V
    //   411: aload_3
    //   412: areturn
  }
  
  public static void g() {
    d();
    b = a = null;
    a = null;
    b = a = null;
    if (!a())
      a.b(a()); 
  }
  
  private static boolean a() {
    // Byte code:
    //   0: invokestatic a : ()Ljava/lang/String;
    //   3: dup
    //   4: astore_0
    //   5: ifnull -> 18
    //   8: aload_0
    //   9: getstatic ru/curoviyxru/phoenix/midlet/Midlet.a : Ljava/lang/String;
    //   12: invokevirtual equals : (Ljava/lang/Object;)Z
    //   15: ifne -> 602
    //   18: invokestatic d : ()V
    //   21: getstatic fw.a : Lgz;
    //   24: iconst_1
    //   25: putfield d : Z
    //   28: new la
    //   31: dup
    //   32: ldc 'title.changelog'
    //   34: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   37: invokespecial <init> : (Ljava/lang/String;)V
    //   40: astore_0
    //   41: new java/lang/String
    //   44: dup
    //   45: invokestatic getRuntime : ()Ljava/lang/Runtime;
    //   48: invokevirtual getClass : ()Ljava/lang/Class;
    //   51: ldc '/changelog.txt'
    //   53: invokevirtual getResourceAsStream : (Ljava/lang/String;)Ljava/io/InputStream;
    //   56: invokestatic a : (Ljava/io/InputStream;)[B
    //   59: ldc 'UTF-8'
    //   61: invokespecial <init> : ([BLjava/lang/String;)V
    //   64: ldc '\\n'
    //   66: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/util/Vector;
    //   69: astore_1
    //   70: new java/lang/StringBuffer
    //   73: dup
    //   74: invokespecial <init> : ()V
    //   77: astore_2
    //   78: iconst_0
    //   79: istore_3
    //   80: iload_3
    //   81: aload_1
    //   82: invokevirtual size : ()I
    //   85: if_icmpge -> 506
    //   88: aload_1
    //   89: iload_3
    //   90: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   93: checkcast java/lang/String
    //   96: dup
    //   97: astore #4
    //   99: ifnull -> 500
    //   102: aload #4
    //   104: ldc '**bold '
    //   106: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   109: ifeq -> 207
    //   112: aload_2
    //   113: invokevirtual length : ()I
    //   116: ifle -> 142
    //   119: aload_0
    //   120: getfield b : Ljava/util/Vector;
    //   123: new gg
    //   126: dup
    //   127: aload_2
    //   128: invokevirtual toString : ()Ljava/lang/String;
    //   131: invokespecial <init> : (Ljava/lang/String;)V
    //   134: invokevirtual addElement : (Ljava/lang/Object;)V
    //   137: aload_2
    //   138: iconst_0
    //   139: invokevirtual setLength : (I)V
    //   142: aload #4
    //   144: bipush #7
    //   146: invokevirtual substring : (I)Ljava/lang/String;
    //   149: dup
    //   150: astore #4
    //   152: ldc '**ctr '
    //   154: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   157: dup
    //   158: istore #5
    //   160: ifeq -> 172
    //   163: aload #4
    //   165: bipush #6
    //   167: invokevirtual substring : (I)Ljava/lang/String;
    //   170: astore #4
    //   172: aload_0
    //   173: getfield b : Ljava/util/Vector;
    //   176: new gg
    //   179: dup
    //   180: aload #4
    //   182: invokespecial <init> : (Ljava/lang/String;)V
    //   185: invokevirtual b : ()Lgg;
    //   188: iload #5
    //   190: ifeq -> 197
    //   193: iconst_1
    //   194: goto -> 198
    //   197: iconst_4
    //   198: invokevirtual b : (I)Lgg;
    //   201: invokevirtual addElement : (Ljava/lang/Object;)V
    //   204: goto -> 500
    //   207: aload #4
    //   209: ldc '**img '
    //   211: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   214: ifeq -> 309
    //   217: aload_2
    //   218: invokevirtual length : ()I
    //   221: ifle -> 247
    //   224: aload_0
    //   225: getfield b : Ljava/util/Vector;
    //   228: new gg
    //   231: dup
    //   232: aload_2
    //   233: invokevirtual toString : ()Ljava/lang/String;
    //   236: invokespecial <init> : (Ljava/lang/String;)V
    //   239: invokevirtual addElement : (Ljava/lang/Object;)V
    //   242: aload_2
    //   243: iconst_0
    //   244: invokevirtual setLength : (I)V
    //   247: aload #4
    //   249: bipush #6
    //   251: invokevirtual substring : (I)Ljava/lang/String;
    //   254: astore #4
    //   256: aload_0
    //   257: getfield b : Ljava/util/Vector;
    //   260: new fl
    //   263: dup
    //   264: aload #4
    //   266: invokestatic a : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   269: getstatic gz.a : Lgz;
    //   272: invokevirtual getWidth : ()I
    //   275: iconst_2
    //   276: idiv
    //   277: getstatic gz.a : Lgz;
    //   280: invokevirtual getHeight : ()I
    //   283: iconst_2
    //   284: idiv
    //   285: invokestatic min : (II)I
    //   288: invokestatic a : (Ljavax/microedition/lcdui/Image;I)Ljavax/microedition/lcdui/Image;
    //   291: invokespecial <init> : (Ljavax/microedition/lcdui/Image;)V
    //   294: dup
    //   295: astore #4
    //   297: iconst_1
    //   298: putfield a : B
    //   301: aload #4
    //   303: invokevirtual addElement : (Ljava/lang/Object;)V
    //   306: goto -> 500
    //   309: aload #4
    //   311: ldc '**gray '
    //   313: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   316: ifeq -> 416
    //   319: aload_2
    //   320: invokevirtual length : ()I
    //   323: ifle -> 349
    //   326: aload_0
    //   327: getfield b : Ljava/util/Vector;
    //   330: new gg
    //   333: dup
    //   334: aload_2
    //   335: invokevirtual toString : ()Ljava/lang/String;
    //   338: invokespecial <init> : (Ljava/lang/String;)V
    //   341: invokevirtual addElement : (Ljava/lang/Object;)V
    //   344: aload_2
    //   345: iconst_0
    //   346: invokevirtual setLength : (I)V
    //   349: aload #4
    //   351: bipush #7
    //   353: invokevirtual substring : (I)Ljava/lang/String;
    //   356: dup
    //   357: astore #4
    //   359: ldc '**ctr '
    //   361: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   364: dup
    //   365: istore #5
    //   367: ifeq -> 379
    //   370: aload #4
    //   372: bipush #6
    //   374: invokevirtual substring : (I)Ljava/lang/String;
    //   377: astore #4
    //   379: aload_0
    //   380: getfield b : Ljava/util/Vector;
    //   383: new gg
    //   386: dup
    //   387: aload #4
    //   389: invokespecial <init> : (Ljava/lang/String;)V
    //   392: ldc 6579300
    //   394: invokevirtual a : (I)Lgg;
    //   397: iload #5
    //   399: ifeq -> 406
    //   402: iconst_1
    //   403: goto -> 407
    //   406: iconst_4
    //   407: invokevirtual b : (I)Lgg;
    //   410: invokevirtual addElement : (Ljava/lang/Object;)V
    //   413: goto -> 500
    //   416: aload #4
    //   418: ldc '**ctr '
    //   420: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   423: ifeq -> 488
    //   426: aload_2
    //   427: invokevirtual length : ()I
    //   430: ifle -> 456
    //   433: aload_0
    //   434: getfield b : Ljava/util/Vector;
    //   437: new gg
    //   440: dup
    //   441: aload_2
    //   442: invokevirtual toString : ()Ljava/lang/String;
    //   445: invokespecial <init> : (Ljava/lang/String;)V
    //   448: invokevirtual addElement : (Ljava/lang/Object;)V
    //   451: aload_2
    //   452: iconst_0
    //   453: invokevirtual setLength : (I)V
    //   456: aload #4
    //   458: bipush #6
    //   460: invokevirtual substring : (I)Ljava/lang/String;
    //   463: astore #4
    //   465: aload_0
    //   466: getfield b : Ljava/util/Vector;
    //   469: new gg
    //   472: dup
    //   473: aload #4
    //   475: invokespecial <init> : (Ljava/lang/String;)V
    //   478: iconst_1
    //   479: invokevirtual b : (I)Lgg;
    //   482: invokevirtual addElement : (Ljava/lang/Object;)V
    //   485: goto -> 500
    //   488: aload_2
    //   489: aload #4
    //   491: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   494: bipush #10
    //   496: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   499: pop
    //   500: iinc #3, 1
    //   503: goto -> 80
    //   506: aload_2
    //   507: invokevirtual length : ()I
    //   510: ifle -> 536
    //   513: aload_0
    //   514: getfield b : Ljava/util/Vector;
    //   517: new gg
    //   520: dup
    //   521: aload_2
    //   522: invokevirtual toString : ()Ljava/lang/String;
    //   525: invokespecial <init> : (Ljava/lang/String;)V
    //   528: invokevirtual addElement : (Ljava/lang/Object;)V
    //   531: aload_2
    //   532: iconst_0
    //   533: invokevirtual setLength : (I)V
    //   536: goto -> 540
    //   539: pop
    //   540: aload_0
    //   541: getfield b : Ljava/util/Vector;
    //   544: new hh
    //   547: dup
    //   548: ldc 'action.close'
    //   550: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   553: invokespecial <init> : (Ljava/lang/String;)V
    //   556: ldc 'close.png'
    //   558: ldc 'closes.png'
    //   560: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   563: dup
    //   564: astore #4
    //   566: iconst_1
    //   567: putfield n : Z
    //   570: aload #4
    //   572: dup
    //   573: astore #4
    //   575: iconst_1
    //   576: putfield p : Z
    //   579: aload #4
    //   581: dup
    //   582: astore #4
    //   584: iconst_1
    //   585: putfield o : Z
    //   588: aload #4
    //   590: invokevirtual addElement : (Ljava/lang/Object;)V
    //   593: getstatic fw.a : Lgz;
    //   596: aload_0
    //   597: invokevirtual b : (Lla;)V
    //   600: iconst_1
    //   601: ireturn
    //   602: iconst_0
    //   603: ireturn
    // Exception table:
    //   from	to	target	type
    //   41	536	539	java/lang/Exception
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/fw.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */