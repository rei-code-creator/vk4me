import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public final class eb extends ar implements hv {
  hs a;
  
  public int a;
  
  private boolean b;
  
  public boolean a;
  
  public bw a;
  
  private bw b;
  
  public final Vector a;
  
  public final Vector b = new Vector();
  
  private int j;
  
  public static int b = ((gz)gz.a).a.a() * 5 / 2 + 8;
  
  public static int c = ((gz)gz.a).a.a();
  
  public static int h;
  
  public static int i = (h = ((gz)gz.a).a.a() + 8) + 6;
  
  private r a;
  
  final la a = (la)new Vector();
  
  public eb(int paramInt, hs paramhs) {
    r r1;
    (r1 = (new bz(this, u.a("action.add"))).a("pl.png", "pls.png")).o = true;
    (r1 = r1).n = true;
    this.a = (la)r1;
    this.a = (new la(u.a("title.attachments"))).a(true);
    this.b = u.a("action.writeMessageField");
    this.a = false;
    this.e = c;
    this.j = 0;
    this.a = paramInt;
    this.a = paramhs;
  }
  
  public final ay a(int paramInt) {
    if (paramInt == 2) {
      this.j = 1;
      return this;
    } 
    if (paramInt == 5) {
      this.j = 2;
      return this;
    } 
    if (paramInt == 8)
      paramInt = 1000011; 
    jy.a(paramInt, this);
    return this;
  }
  
  public final ay b(int paramInt) {
    if (paramInt == 2) {
      this.j = 1;
      return this;
    } 
    if (paramInt == 5) {
      this.j = 2;
      return this;
    } 
    if (paramInt == 8)
      paramInt = 1000011; 
    jy.b(paramInt, this);
    return this;
  }
  
  public final ay c(int paramInt) {
    if (paramInt == 2 && this.j == 1) {
      e();
    } else if (paramInt == 5 && this.j == 2) {
      f();
    } 
    this.j = 0;
    return this;
  }
  
  public final ay c(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt2 < this.g + c) {
      b();
    } else if (this.a != null && paramInt2 <= this.g + h + c && paramInt2 >= this.g + c) {
      if (paramInt1 >= this.f + c / 2 && paramInt1 < this.f + c / 2 + i) {
        this.j = 1;
      } else if (paramInt1 <= this.f - c / 2 - i + this.d && paramInt1 >= this.f + c / 2 + i) {
        gz.a(this);
      } else if (paramInt1 <= this.f - c / 2 + this.d && paramInt1 > this.f - c / 2 - i + this.d) {
        this.j = 2;
      } 
    } 
    return this;
  }
  
  public final ay b(int paramInt1, int paramInt2, int paramInt3) {
    if (this.a != null && paramInt2 <= this.g + h + c && paramInt2 >= this.g + c)
      if (paramInt1 >= this.f + c / 2 && paramInt1 <= this.f + c / 2 + i) {
        this.j = 1;
      } else if (paramInt1 <= this.f - c / 2 - i + this.d && paramInt1 >= this.f + c / 2 + i) {
        gz.a(this);
      } else if (paramInt1 <= this.f - c / 2 + this.d && paramInt1 >= this.f - c / 2 - i + this.d) {
        this.j = 2;
      }  
    return this;
  }
  
  public final ay a(int paramInt1, int paramInt2, int paramInt3) {
    if (this.j == 1) {
      e();
    } else if (this.j == 2) {
      f();
    } 
    this.j = 0;
    return this;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lhs;
    //   4: getfield a : Lis;
    //   7: invokevirtual a : ()Z
    //   10: ifne -> 14
    //   13: return
    //   14: aload_0
    //   15: invokevirtual d : ()V
    //   18: aload_1
    //   19: aload_0
    //   20: getfield d : I
    //   23: aload_0
    //   24: getfield a : Z
    //   27: aload_0
    //   28: getfield j : I
    //   31: aload_0
    //   32: getfield a : Ljava/lang/String;
    //   35: invokestatic a : (Ljava/lang/String;)Z
    //   38: ifeq -> 72
    //   41: aload_0
    //   42: getfield b : Ljava/util/Vector;
    //   45: invokevirtual isEmpty : ()Z
    //   48: ifeq -> 72
    //   51: aload_0
    //   52: getfield a : Ljava/util/Vector;
    //   55: invokevirtual isEmpty : ()Z
    //   58: ifeq -> 72
    //   61: aload_0
    //   62: getfield a : Lbw;
    //   65: ifnonnull -> 72
    //   68: iconst_1
    //   69: goto -> 73
    //   72: iconst_0
    //   73: aload_0
    //   74: getfield b : Ljava/util/Vector;
    //   77: invokevirtual isEmpty : ()Z
    //   80: ifeq -> 104
    //   83: aload_0
    //   84: getfield a : Ljava/util/Vector;
    //   87: invokevirtual isEmpty : ()Z
    //   90: ifeq -> 104
    //   93: aload_0
    //   94: getfield a : Lbw;
    //   97: ifnonnull -> 104
    //   100: iconst_1
    //   101: goto -> 105
    //   104: iconst_0
    //   105: aload_0
    //   106: getfield b : Lbw;
    //   109: ifnull -> 116
    //   112: iconst_1
    //   113: goto -> 117
    //   116: iconst_0
    //   117: invokestatic a : (IZIZZZ)Ljavax/microedition/lcdui/Image;
    //   120: aload_0
    //   121: getfield f : I
    //   124: iload_3
    //   125: iadd
    //   126: aload_0
    //   127: getfield g : I
    //   130: iload_2
    //   131: iadd
    //   132: bipush #20
    //   134: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   137: aload_0
    //   138: getfield a : Z
    //   141: ifeq -> 437
    //   144: aload_0
    //   145: getfield d : I
    //   148: ifle -> 260
    //   151: aload_0
    //   152: getfield d : I
    //   155: iconst_2
    //   156: iadd
    //   157: getstatic gz.a : Lgz;
    //   160: getfield a : Lcp;
    //   163: invokevirtual a : ()I
    //   166: isub
    //   167: getstatic eb.i : I
    //   170: iconst_1
    //   171: ishl
    //   172: isub
    //   173: istore #4
    //   175: aload_0
    //   176: getfield a : Ljava/lang/String;
    //   179: ifnull -> 223
    //   182: aload_0
    //   183: getfield d : Ljava/lang/String;
    //   186: ifnonnull -> 223
    //   189: aload_0
    //   190: getstatic gz.a : Lgz;
    //   193: getfield a : Lcp;
    //   196: aload_0
    //   197: getfield a : Ljava/lang/String;
    //   200: iload #4
    //   202: bipush #8
    //   204: isub
    //   205: iconst_0
    //   206: invokevirtual a : (Ljava/lang/String;IZ)Ljava/lang/String;
    //   209: putfield d : Ljava/lang/String;
    //   212: aload_0
    //   213: aload_0
    //   214: getfield d : Ljava/lang/String;
    //   217: invokestatic a : (Ljava/lang/String;)Z
    //   220: putfield b : Z
    //   223: aload_0
    //   224: getfield b : Ljava/lang/String;
    //   227: ifnull -> 260
    //   230: aload_0
    //   231: getfield c : Ljava/lang/String;
    //   234: ifnonnull -> 260
    //   237: aload_0
    //   238: getstatic gz.a : Lgz;
    //   241: getfield a : Lcp;
    //   244: aload_0
    //   245: getfield b : Ljava/lang/String;
    //   248: iload #4
    //   250: bipush #8
    //   252: isub
    //   253: iconst_1
    //   254: invokevirtual a : (Ljava/lang/String;IZ)Ljava/lang/String;
    //   257: putfield c : Ljava/lang/String;
    //   260: aload_0
    //   261: getfield d : Ljava/lang/String;
    //   264: ifnull -> 363
    //   267: aload_0
    //   268: getfield d : Ljava/lang/String;
    //   271: invokevirtual trim : ()Ljava/lang/String;
    //   274: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   277: ldc ''
    //   279: invokevirtual equals : (Ljava/lang/Object;)Z
    //   282: ifne -> 363
    //   285: aload_1
    //   286: iconst_0
    //   287: invokevirtual setColor : (I)V
    //   290: getstatic gz.a : Lgz;
    //   293: getfield a : Lcp;
    //   296: aload_1
    //   297: aload_0
    //   298: getfield d : Ljava/lang/String;
    //   301: aload_0
    //   302: getfield f : I
    //   305: iload_3
    //   306: iadd
    //   307: getstatic gz.a : Lgz;
    //   310: getfield a : Lcp;
    //   313: invokevirtual a : ()I
    //   316: iconst_2
    //   317: idiv
    //   318: iadd
    //   319: iconst_1
    //   320: isub
    //   321: getstatic eb.i : I
    //   324: iadd
    //   325: iconst_4
    //   326: iadd
    //   327: aload_0
    //   328: getfield g : I
    //   331: iload_2
    //   332: iadd
    //   333: getstatic gz.a : Lgz;
    //   336: getfield a : Lcp;
    //   339: invokevirtual a : ()I
    //   342: iadd
    //   343: iconst_4
    //   344: iadd
    //   345: bipush #20
    //   347: aload_0
    //   348: getfield b : Z
    //   351: ifne -> 358
    //   354: iconst_1
    //   355: goto -> 359
    //   358: iconst_0
    //   359: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIIZ)V
    //   362: return
    //   363: aload_0
    //   364: getfield c : Ljava/lang/String;
    //   367: ifnull -> 437
    //   370: aload_1
    //   371: ldc 10790052
    //   373: invokevirtual setColor : (I)V
    //   376: getstatic gz.a : Lgz;
    //   379: getfield a : Lcp;
    //   382: aload_1
    //   383: aload_0
    //   384: getfield c : Ljava/lang/String;
    //   387: aload_0
    //   388: getfield f : I
    //   391: iload_3
    //   392: iadd
    //   393: getstatic gz.a : Lgz;
    //   396: getfield a : Lcp;
    //   399: invokevirtual a : ()I
    //   402: iconst_2
    //   403: idiv
    //   404: iadd
    //   405: iconst_1
    //   406: isub
    //   407: getstatic eb.i : I
    //   410: iadd
    //   411: iconst_4
    //   412: iadd
    //   413: aload_0
    //   414: getfield g : I
    //   417: iload_2
    //   418: iadd
    //   419: getstatic gz.a : Lgz;
    //   422: getfield a : Lcp;
    //   425: invokevirtual a : ()I
    //   428: iadd
    //   429: iconst_4
    //   430: iadd
    //   431: bipush #20
    //   433: iconst_1
    //   434: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIIZ)V
    //   437: return
  }
  
  private void e() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lhs;
    //   4: getfield a : Lis;
    //   7: invokevirtual a : ()Z
    //   10: ifne -> 14
    //   13: return
    //   14: aload_0
    //   15: getfield a : Lla;
    //   18: getfield b : Ljava/util/Vector;
    //   21: invokevirtual removeAllElements : ()V
    //   24: aload_0
    //   25: getfield a : Lla;
    //   28: ldc 'action.back'
    //   30: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   33: new ev
    //   36: dup
    //   37: aload_0
    //   38: invokespecial <init> : (Leb;)V
    //   41: aload_0
    //   42: getfield a : Lbw;
    //   45: ifnonnull -> 72
    //   48: aload_0
    //   49: getfield b : Ljava/util/Vector;
    //   52: invokevirtual isEmpty : ()Z
    //   55: ifeq -> 72
    //   58: aload_0
    //   59: getfield a : Ljava/util/Vector;
    //   62: invokevirtual isEmpty : ()Z
    //   65: ifeq -> 72
    //   68: iconst_1
    //   69: goto -> 73
    //   72: iconst_0
    //   73: invokestatic a : (Lla;Ljava/lang/String;Ljava/lang/Runnable;Z)V
    //   76: aload_0
    //   77: getfield a : Lbw;
    //   80: ifnull -> 237
    //   83: aload_0
    //   84: getfield a : Lla;
    //   87: getfield b : Ljava/util/Vector;
    //   90: new gg
    //   93: dup
    //   94: ldc 'attachments.reply'
    //   96: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   99: invokespecial <init> : (Ljava/lang/String;)V
    //   102: invokevirtual b : ()Lgg;
    //   105: dup
    //   106: astore_3
    //   107: iconst_1
    //   108: putfield r : Z
    //   111: aload_3
    //   112: invokevirtual addElement : (Ljava/lang/Object;)V
    //   115: aload_0
    //   116: getfield a : Lbw;
    //   119: getfield c : I
    //   122: invokestatic a : (I)Llb;
    //   125: astore_1
    //   126: aload_0
    //   127: getfield a : Lla;
    //   130: getfield b : Ljava/util/Vector;
    //   133: new ey
    //   136: dup
    //   137: aload_0
    //   138: aload_1
    //   139: ifnonnull -> 150
    //   142: ldc 'general.unknownUser'
    //   144: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   147: goto -> 156
    //   150: aload_1
    //   151: ldc 'nom'
    //   153: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
    //   156: invokespecial <init> : (Leb;Ljava/lang/String;)V
    //   159: iconst_1
    //   160: invokevirtual a : (Z)Lr;
    //   163: aload_0
    //   164: getfield a : Lbw;
    //   167: iconst_0
    //   168: aload_0
    //   169: getfield a : Lhs;
    //   172: getfield a : Lis;
    //   175: invokevirtual c : ()Z
    //   178: ifne -> 185
    //   181: iconst_1
    //   182: goto -> 186
    //   185: iconst_0
    //   186: iconst_0
    //   187: iconst_1
    //   188: iconst_1
    //   189: invokevirtual a : (ZZZZZ)Ljava/lang/String;
    //   192: invokevirtual c : (Ljava/lang/String;)Lr;
    //   195: iconst_1
    //   196: iconst_1
    //   197: invokevirtual a : (ZZ)Lr;
    //   200: aload_0
    //   201: getfield a : Lbw;
    //   204: invokevirtual a : ()I
    //   207: i2l
    //   208: invokestatic b : (J)Ljava/lang/String;
    //   211: invokevirtual b : (Ljava/lang/String;)Lr;
    //   214: invokevirtual b : ()Lr;
    //   217: invokevirtual a : ()Lr;
    //   220: dup
    //   221: astore_3
    //   222: iconst_1
    //   223: putfield o : Z
    //   226: aload_3
    //   227: dup
    //   228: astore_3
    //   229: iconst_0
    //   230: putfield n : Z
    //   233: aload_3
    //   234: invokevirtual addElement : (Ljava/lang/Object;)V
    //   237: aload_0
    //   238: getfield b : Ljava/util/Vector;
    //   241: invokevirtual isEmpty : ()Z
    //   244: ifne -> 309
    //   247: aload_0
    //   248: getfield a : Lla;
    //   251: getfield b : Ljava/util/Vector;
    //   254: new gg
    //   257: dup
    //   258: ldc 'attachments.att'
    //   260: new java/lang/StringBuffer
    //   263: dup
    //   264: invokespecial <init> : ()V
    //   267: ldc '('
    //   269: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   272: aload_0
    //   273: getfield a : Ljava/util/Vector;
    //   276: invokevirtual size : ()I
    //   279: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   282: ldc ' / 10)'
    //   284: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   287: invokevirtual toString : ()Ljava/lang/String;
    //   290: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   293: invokespecial <init> : (Ljava/lang/String;)V
    //   296: invokevirtual b : ()Lgg;
    //   299: dup
    //   300: astore_3
    //   301: iconst_1
    //   302: putfield r : Z
    //   305: aload_3
    //   306: invokevirtual addElement : (Ljava/lang/Object;)V
    //   309: iconst_0
    //   310: istore_1
    //   311: iload_1
    //   312: aload_0
    //   313: getfield b : Ljava/util/Vector;
    //   316: invokevirtual size : ()I
    //   319: if_icmpge -> 416
    //   322: aload_0
    //   323: getfield b : Ljava/util/Vector;
    //   326: iload_1
    //   327: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   330: checkcast dv
    //   333: dup
    //   334: astore_2
    //   335: ifnonnull -> 355
    //   338: aload_0
    //   339: getfield a : Lla;
    //   342: getfield b : Ljava/util/Vector;
    //   345: iload_1
    //   346: invokevirtual removeElementAt : (I)V
    //   349: iinc #1, -1
    //   352: goto -> 410
    //   355: aload_0
    //   356: getfield a : Lla;
    //   359: getfield b : Ljava/util/Vector;
    //   362: new en
    //   365: dup
    //   366: aload_0
    //   367: aload_2
    //   368: invokespecial <init> : (Leb;Ldv;)V
    //   371: invokevirtual b : ()Lr;
    //   374: dup
    //   375: astore_3
    //   376: iconst_1
    //   377: putfield o : Z
    //   380: aload_3
    //   381: iload_1
    //   382: aload_0
    //   383: getfield b : Ljava/util/Vector;
    //   386: invokevirtual size : ()I
    //   389: iconst_1
    //   390: isub
    //   391: if_icmpeq -> 398
    //   394: iconst_1
    //   395: goto -> 399
    //   398: iconst_0
    //   399: istore_2
    //   400: dup
    //   401: astore_3
    //   402: iload_2
    //   403: putfield n : Z
    //   406: aload_3
    //   407: invokevirtual addElement : (Ljava/lang/Object;)V
    //   410: iinc #1, 1
    //   413: goto -> 311
    //   416: aload_0
    //   417: getfield a : Ljava/util/Vector;
    //   420: invokevirtual isEmpty : ()Z
    //   423: ifne -> 488
    //   426: aload_0
    //   427: getfield a : Lla;
    //   430: getfield b : Ljava/util/Vector;
    //   433: new gg
    //   436: dup
    //   437: ldc 'attachments.fwds'
    //   439: new java/lang/StringBuffer
    //   442: dup
    //   443: invokespecial <init> : ()V
    //   446: ldc '('
    //   448: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   451: aload_0
    //   452: getfield a : Ljava/util/Vector;
    //   455: invokevirtual size : ()I
    //   458: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   461: ldc ' / 100)'
    //   463: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   466: invokevirtual toString : ()Ljava/lang/String;
    //   469: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   472: invokespecial <init> : (Ljava/lang/String;)V
    //   475: invokevirtual b : ()Lgg;
    //   478: dup
    //   479: astore_3
    //   480: iconst_1
    //   481: putfield r : Z
    //   484: aload_3
    //   485: invokevirtual addElement : (Ljava/lang/Object;)V
    //   488: iconst_0
    //   489: istore_1
    //   490: iload_1
    //   491: aload_0
    //   492: getfield a : Ljava/util/Vector;
    //   495: invokevirtual size : ()I
    //   498: if_icmpge -> 651
    //   501: aload_0
    //   502: getfield a : Ljava/util/Vector;
    //   505: iload_1
    //   506: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   509: checkcast bw
    //   512: dup
    //   513: astore_2
    //   514: ifnonnull -> 531
    //   517: aload_0
    //   518: getfield a : Ljava/util/Vector;
    //   521: iload_1
    //   522: invokevirtual removeElementAt : (I)V
    //   525: iinc #1, -1
    //   528: goto -> 645
    //   531: aload_2
    //   532: getfield c : I
    //   535: invokestatic a : (I)Llb;
    //   538: astore_3
    //   539: aload_0
    //   540: getfield a : Lla;
    //   543: getfield b : Ljava/util/Vector;
    //   546: new eq
    //   549: dup
    //   550: aload_0
    //   551: aload_3
    //   552: ifnonnull -> 563
    //   555: ldc 'general.unknownUser'
    //   557: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   560: goto -> 569
    //   563: aload_3
    //   564: ldc 'nom'
    //   566: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
    //   569: aload_2
    //   570: invokespecial <init> : (Leb;Ljava/lang/String;Lbw;)V
    //   573: iconst_1
    //   574: invokevirtual a : (Z)Lr;
    //   577: aload_2
    //   578: iconst_0
    //   579: aload_0
    //   580: getfield a : Lhs;
    //   583: getfield a : Lis;
    //   586: invokevirtual c : ()Z
    //   589: ifne -> 596
    //   592: iconst_1
    //   593: goto -> 597
    //   596: iconst_0
    //   597: iconst_0
    //   598: iconst_1
    //   599: iconst_1
    //   600: invokevirtual a : (ZZZZZ)Ljava/lang/String;
    //   603: invokevirtual c : (Ljava/lang/String;)Lr;
    //   606: iconst_1
    //   607: iconst_1
    //   608: invokevirtual a : (ZZ)Lr;
    //   611: aload_2
    //   612: invokevirtual a : ()I
    //   615: i2l
    //   616: invokestatic b : (J)Ljava/lang/String;
    //   619: invokevirtual b : (Ljava/lang/String;)Lr;
    //   622: invokevirtual b : ()Lr;
    //   625: invokevirtual a : ()Lr;
    //   628: dup
    //   629: astore_3
    //   630: iconst_1
    //   631: putfield o : Z
    //   634: aload_3
    //   635: dup
    //   636: astore_3
    //   637: iconst_1
    //   638: putfield n : Z
    //   641: aload_3
    //   642: invokevirtual addElement : (Ljava/lang/Object;)V
    //   645: iinc #1, 1
    //   648: goto -> 490
    //   651: aload_0
    //   652: getfield b : Ljava/util/Vector;
    //   655: invokevirtual size : ()I
    //   658: bipush #10
    //   660: if_icmpge -> 677
    //   663: aload_0
    //   664: getfield a : Lla;
    //   667: getfield b : Ljava/util/Vector;
    //   670: aload_0
    //   671: getfield a : Lr;
    //   674: invokevirtual addElement : (Ljava/lang/Object;)V
    //   677: getstatic gz.a : Lgz;
    //   680: aload_0
    //   681: getfield a : Lla;
    //   684: invokevirtual b : (Lla;)V
    //   687: return
  }
  
  public final void c(String paramString) {
    gz.a.b(true);
    (new bx(this, paramString)).start();
    gz.a.b(false);
  }
  
  public final void a(boolean paramBoolean) {
    this.a = paramBoolean;
    if (!((hs)this.a).a.a())
      this.a = false; 
    if (this.a == null)
      this.j = 0; 
    gz.a.a();
    if (((hs)this.a).e > ((hs)this.a).j)
      ((hs)this.a).g += Math.min(((hs)this.a).e - ((hs)this.a).j, b - c) * ((this.a != null) ? 1 : -1); 
  }
  
  private void f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lhs;
    //   4: getfield a : Lis;
    //   7: invokevirtual a : ()Z
    //   10: ifne -> 14
    //   13: return
    //   14: aload_0
    //   15: getfield a : Z
    //   18: ifeq -> 65
    //   21: aload_0
    //   22: getfield a : Ljava/lang/String;
    //   25: invokestatic a : (Ljava/lang/String;)Z
    //   28: ifeq -> 70
    //   31: aload_0
    //   32: getfield b : Ljava/util/Vector;
    //   35: invokevirtual isEmpty : ()Z
    //   38: ifeq -> 70
    //   41: aload_0
    //   42: getfield a : Ljava/util/Vector;
    //   45: invokevirtual isEmpty : ()Z
    //   48: ifeq -> 70
    //   51: aload_0
    //   52: getfield a : Lbw;
    //   55: ifnonnull -> 70
    //   58: aload_0
    //   59: getfield b : Lbw;
    //   62: ifnonnull -> 70
    //   65: aload_0
    //   66: invokevirtual b : ()V
    //   69: return
    //   70: aload_0
    //   71: getfield a : Ljava/lang/String;
    //   74: invokestatic a : (Ljava/lang/String;)Z
    //   77: ifeq -> 115
    //   80: aload_0
    //   81: getfield a : Lbw;
    //   84: ifnull -> 115
    //   87: aload_0
    //   88: getfield a : Ljava/util/Vector;
    //   91: invokevirtual size : ()I
    //   94: bipush #100
    //   96: if_icmpge -> 115
    //   99: aload_0
    //   100: getfield a : Ljava/util/Vector;
    //   103: aload_0
    //   104: getfield a : Lbw;
    //   107: invokevirtual addElement : (Ljava/lang/Object;)V
    //   110: aload_0
    //   111: aconst_null
    //   112: putfield a : Lbw;
    //   115: aload_0
    //   116: getfield b : Lbw;
    //   119: ifnonnull -> 303
    //   122: new fb
    //   125: dup
    //   126: aload_0
    //   127: getfield a : I
    //   130: aload_0
    //   131: getfield a : Ljava/lang/String;
    //   134: invokespecial <init> : (ILjava/lang/String;)V
    //   137: aload_0
    //   138: getfield b : Ljava/util/Vector;
    //   141: astore_2
    //   142: astore_1
    //   143: aload_2
    //   144: ifnonnull -> 155
    //   147: aload_1
    //   148: ldc 'attachment'
    //   150: aconst_null
    //   151: invokevirtual a : (Ljava/lang/String;Ljava/lang/Object;)Les;
    //   154: pop
    //   155: new java/util/Vector
    //   158: dup
    //   159: invokespecial <init> : ()V
    //   162: astore_3
    //   163: iconst_0
    //   164: istore #4
    //   166: iload #4
    //   168: aload_2
    //   169: invokevirtual size : ()I
    //   172: if_icmpge -> 203
    //   175: aload_2
    //   176: iload #4
    //   178: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   181: ifnull -> 197
    //   184: aload_3
    //   185: aload_2
    //   186: iload #4
    //   188: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   191: invokevirtual toString : ()Ljava/lang/String;
    //   194: invokevirtual addElement : (Ljava/lang/Object;)V
    //   197: iinc #4, 1
    //   200: goto -> 166
    //   203: aload_2
    //   204: invokevirtual isEmpty : ()Z
    //   207: ifeq -> 221
    //   210: aload_1
    //   211: ldc 'attachment'
    //   213: aconst_null
    //   214: invokevirtual a : (Ljava/lang/String;Ljava/lang/Object;)Les;
    //   217: pop
    //   218: goto -> 234
    //   221: aload_1
    //   222: ldc 'attachment'
    //   224: ldc ','
    //   226: aload_3
    //   227: invokestatic a : (Ljava/lang/String;Ljava/util/Vector;)Ljava/lang/String;
    //   230: invokevirtual a : (Ljava/lang/String;Ljava/lang/Object;)Les;
    //   233: pop
    //   234: aload_1
    //   235: aload_0
    //   236: getfield a : Ljava/util/Vector;
    //   239: invokevirtual a : (Ljava/util/Vector;)Lfb;
    //   242: aload_0
    //   243: getfield a : Lbw;
    //   246: astore_2
    //   247: dup
    //   248: astore_1
    //   249: ldc 'reply_to'
    //   251: aload_2
    //   252: ifnonnull -> 259
    //   255: aconst_null
    //   256: goto -> 266
    //   259: aload_2
    //   260: getfield a : I
    //   263: invokestatic valueOf : (I)Ljava/lang/String;
    //   266: invokevirtual a : (Ljava/lang/String;Ljava/lang/Object;)Les;
    //   269: pop
    //   270: aload_1
    //   271: invokevirtual a : ()Laj;
    //   274: checkcast d
    //   277: dup
    //   278: astore_1
    //   279: ifnull -> 289
    //   282: aload_1
    //   283: invokevirtual a : ()Z
    //   286: ifne -> 300
    //   289: getstatic gz.a : Lgz;
    //   292: ldc 'element.sendError'
    //   294: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   297: invokevirtual a : (Ljava/lang/String;)V
    //   300: goto -> 465
    //   303: aload_0
    //   304: getfield a : Ljava/lang/String;
    //   307: invokestatic a : (Ljava/lang/String;)Z
    //   310: ifeq -> 323
    //   313: aload_0
    //   314: getfield b : Ljava/util/Vector;
    //   317: invokevirtual isEmpty : ()Z
    //   320: ifne -> 465
    //   323: new bm
    //   326: dup
    //   327: aload_0
    //   328: getfield a : Lhs;
    //   331: getfield a : Lis;
    //   334: invokevirtual a : ()I
    //   337: aload_0
    //   338: getfield b : Lbw;
    //   341: getfield a : I
    //   344: aload_0
    //   345: getfield a : Ljava/lang/String;
    //   348: invokespecial <init> : (IILjava/lang/String;)V
    //   351: aload_0
    //   352: getfield b : Ljava/util/Vector;
    //   355: invokevirtual a : (Ljava/util/Vector;)Lbm;
    //   358: invokevirtual a : ()Laj;
    //   361: checkcast co
    //   364: dup
    //   365: astore_1
    //   366: ifnull -> 454
    //   369: aload_1
    //   370: aload_0
    //   371: getfield b : Lbw;
    //   374: getfield a : I
    //   377: istore_2
    //   378: dup
    //   379: astore_1
    //   380: getfield a : Lbj;
    //   383: ifnull -> 450
    //   386: aload_1
    //   387: getfield a : Lbj;
    //   390: iload_2
    //   391: invokestatic valueOf : (I)Ljava/lang/String;
    //   394: invokevirtual a : (Ljava/lang/String;)I
    //   397: iconst_1
    //   398: if_icmpeq -> 446
    //   401: aload_1
    //   402: getfield a : Lbj;
    //   405: ldc 'response'
    //   407: invokevirtual a : (Ljava/lang/String;)I
    //   410: iconst_1
    //   411: if_icmpeq -> 446
    //   414: aload_1
    //   415: getfield a : Lbj;
    //   418: ldc 'response'
    //   420: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   423: ifnull -> 450
    //   426: aload_1
    //   427: getfield a : Lbj;
    //   430: ldc 'response'
    //   432: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   435: iload_2
    //   436: invokestatic valueOf : (I)Ljava/lang/String;
    //   439: invokevirtual a : (Ljava/lang/String;)I
    //   442: iconst_1
    //   443: if_icmpne -> 450
    //   446: iconst_1
    //   447: goto -> 451
    //   450: iconst_0
    //   451: ifne -> 465
    //   454: getstatic gz.a : Lgz;
    //   457: ldc 'element.editError'
    //   459: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   462: invokevirtual a : (Ljava/lang/String;)V
    //   465: aload_0
    //   466: invokevirtual c : ()V
    //   469: return
  }
  
  public final void d() {
    if (!((hs)this.a).a.a())
      this.e = Character.MIN_VALUE; 
    this.e = (this.a != null) ? b : c;
  }
  
  public final void a(bw parambw) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 12
    //   4: aload_1
    //   5: invokevirtual f : ()Z
    //   8: ifne -> 12
    //   11: return
    //   12: aload_0
    //   13: invokevirtual c : ()V
    //   16: aload_0
    //   17: aload_1
    //   18: putfield b : Lbw;
    //   21: aload_1
    //   22: ifnonnull -> 26
    //   25: return
    //   26: aload_0
    //   27: ldc 'action.editMessageField'
    //   29: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   32: invokevirtual a : (Ljava/lang/String;)V
    //   35: aload_0
    //   36: aload_1
    //   37: getfield a : Ljava/lang/String;
    //   40: invokevirtual b : (Ljava/lang/String;)V
    //   43: aload_0
    //   44: iconst_1
    //   45: invokevirtual a : (Z)V
    //   48: aload_1
    //   49: invokevirtual d : ()Z
    //   52: ifeq -> 91
    //   55: iconst_0
    //   56: istore_2
    //   57: iload_2
    //   58: aload_1
    //   59: getfield a : [Ldv;
    //   62: arraylength
    //   63: if_icmpge -> 91
    //   66: aload_1
    //   67: getfield a : [Ldv;
    //   70: iload_2
    //   71: aaload
    //   72: dup
    //   73: astore_3
    //   74: ifnull -> 85
    //   77: aload_0
    //   78: getfield b : Ljava/util/Vector;
    //   81: aload_3
    //   82: invokevirtual addElement : (Ljava/lang/Object;)V
    //   85: iinc #2, 1
    //   88: goto -> 57
    //   91: return
  }
  
  public final void b() {
    a((this.a == null));
  }
  
  public final void c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/util/Vector;
    //   4: invokevirtual removeAllElements : ()V
    //   7: aload_0
    //   8: getfield a : Ljava/util/Vector;
    //   11: invokevirtual removeAllElements : ()V
    //   14: aload_0
    //   15: aconst_null
    //   16: putfield a : Lbw;
    //   19: aload_0
    //   20: aconst_null
    //   21: invokevirtual b : (Ljava/lang/String;)V
    //   24: aload_0
    //   25: aconst_null
    //   26: putfield b : Lbw;
    //   29: aload_0
    //   30: aload_0
    //   31: getfield b : Lbw;
    //   34: ifnonnull -> 45
    //   37: ldc 'action.writeMessageField'
    //   39: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   42: goto -> 50
    //   45: ldc 'action.editMessageField'
    //   47: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   50: invokevirtual a : (Ljava/lang/String;)V
    //   53: return
  }
  
  static void a(eb parameb) {
    parameb.e();
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/eb.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */