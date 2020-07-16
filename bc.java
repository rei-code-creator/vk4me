import java.util.Vector;

public final class bc extends jr {
  public Vector a = new Vector();
  
  public static bc a;
  
  private static Thread a;
  
  public static void d() {
    if (a == null)
      return; 
    ((bc)a).a = false;
    if (((gz)gz.a).a instanceof bc)
      gz.a.b(); 
  }
  
  public static void e() {
    while (((bc)a).a != null) {
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {}
    } 
  }
  
  public static void d(int paramInt1, int paramInt2) {
    if (a == null)
      return; 
    e();
    ((bc)a).a = true;
    kn kn;
    for (int i = (kn = a(paramInt1)).a.size() - 1; i >= 0; i--) {
      Integer integer;
      if ((integer = kn.a.elementAt(i)).intValue() <= paramInt2)
        kn.a(integer.intValue()); 
    } 
    d();
  }
  
  public bc() {
    super(u.a("title.messaging"));
    if (a == null) {
      (a = new ag()).setPriority(1);
      a.start();
    } 
  }
  
  public final void c() {
    // Byte code:
    //   0: getstatic gz.a : Lgz;
    //   3: dup
    //   4: astore_1
    //   5: iconst_1
    //   6: invokevirtual b : (Z)V
    //   9: aload_0
    //   10: getfield a : Ljava/lang/Object;
    //   13: ifnonnull -> 20
    //   16: iconst_1
    //   17: goto -> 21
    //   20: iconst_0
    //   21: dup
    //   22: istore_2
    //   23: ifeq -> 39
    //   26: aload_0
    //   27: new java/lang/Integer
    //   30: dup
    //   31: bipush #-20
    //   33: invokespecial <init> : (I)V
    //   36: putfield a : Ljava/lang/Object;
    //   39: aload_0
    //   40: new java/lang/Integer
    //   43: dup
    //   44: aload_0
    //   45: getfield a : Ljava/lang/Object;
    //   48: checkcast java/lang/Integer
    //   51: invokevirtual intValue : ()I
    //   54: bipush #20
    //   56: iadd
    //   57: invokespecial <init> : (I)V
    //   60: putfield a : Ljava/lang/Object;
    //   63: new il
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: aload_0
    //   71: getfield a : Ljava/lang/Object;
    //   74: checkcast java/lang/Integer
    //   77: invokevirtual intValue : ()I
    //   80: istore #6
    //   82: dup
    //   83: astore #5
    //   85: ldc 'offset'
    //   87: iload #6
    //   89: invokevirtual a : (Ljava/lang/String;I)Les;
    //   92: pop
    //   93: aload #5
    //   95: astore_3
    //   96: iload_2
    //   97: ifne -> 124
    //   100: aload_3
    //   101: aload_0
    //   102: getfield b : Ljava/lang/Object;
    //   105: checkcast java/lang/Integer
    //   108: invokevirtual intValue : ()I
    //   111: istore #6
    //   113: ldc 'start_message_id'
    //   115: iload #6
    //   117: invokevirtual a : (Ljava/lang/String;I)Les;
    //   120: pop
    //   121: goto -> 137
    //   124: aload_0
    //   125: new java/lang/Integer
    //   128: dup
    //   129: ldc -2147483648
    //   131: invokespecial <init> : (I)V
    //   134: putfield b : Ljava/lang/Object;
    //   137: aload_3
    //   138: invokevirtual a : ()Laj;
    //   141: checkcast cn
    //   144: dup
    //   145: astore_3
    //   146: ifnull -> 356
    //   149: aload_3
    //   150: dup
    //   151: astore #5
    //   153: getfield a : [Lff;
    //   156: ifnull -> 172
    //   159: aload #5
    //   161: getfield a : [Lff;
    //   164: arraylength
    //   165: ifle -> 172
    //   168: iconst_1
    //   169: goto -> 173
    //   172: iconst_0
    //   173: ifeq -> 356
    //   176: aload_3
    //   177: getfield a : [Lff;
    //   180: arraylength
    //   181: bipush #20
    //   183: if_icmpge -> 191
    //   186: aload_0
    //   187: iconst_1
    //   188: putfield b : Z
    //   191: iconst_0
    //   192: istore #4
    //   194: iload #4
    //   196: aload_3
    //   197: getfield a : [Lff;
    //   200: arraylength
    //   201: if_icmpge -> 353
    //   204: aload_3
    //   205: getfield a : [Lff;
    //   208: iload #4
    //   210: aaload
    //   211: dup
    //   212: astore #5
    //   214: getfield a : Lis;
    //   217: astore #6
    //   219: aload #5
    //   221: getfield a : Lbw;
    //   224: astore #5
    //   226: aload #6
    //   228: ifnull -> 347
    //   231: aload #5
    //   233: ifnull -> 347
    //   236: aload #6
    //   238: invokevirtual b : ()Z
    //   241: ifeq -> 253
    //   244: aload #6
    //   246: invokevirtual a : ()I
    //   249: invokestatic a : (I)Llb;
    //   252: pop
    //   253: iload_2
    //   254: ifeq -> 291
    //   257: aload_0
    //   258: getfield b : Ljava/lang/Object;
    //   261: checkcast java/lang/Integer
    //   264: invokevirtual intValue : ()I
    //   267: aload #5
    //   269: getfield a : I
    //   272: if_icmpge -> 291
    //   275: aload_0
    //   276: new java/lang/Integer
    //   279: dup
    //   280: aload #5
    //   282: getfield a : I
    //   285: invokespecial <init> : (I)V
    //   288: putfield b : Ljava/lang/Object;
    //   291: aload #6
    //   293: invokevirtual a : ()I
    //   296: invokestatic a : (I)Lkn;
    //   299: astore #7
    //   301: aload_0
    //   302: getfield b : Ljava/util/Vector;
    //   305: aload #7
    //   307: invokevirtual removeElement : (Ljava/lang/Object;)Z
    //   310: pop
    //   311: aload #7
    //   313: aload #6
    //   315: aload #5
    //   317: astore #8
    //   319: astore #6
    //   321: dup
    //   322: astore #5
    //   324: aload #6
    //   326: invokevirtual a : (Lis;)Lkn;
    //   329: pop
    //   330: aload #5
    //   332: aload #8
    //   334: invokevirtual a : (Lbw;)Lkn;
    //   337: pop
    //   338: aload_0
    //   339: getfield b : Ljava/util/Vector;
    //   342: aload #7
    //   344: invokevirtual addElement : (Ljava/lang/Object;)V
    //   347: iinc #4, 1
    //   350: goto -> 194
    //   353: goto -> 376
    //   356: aload_0
    //   357: iconst_1
    //   358: putfield b : Z
    //   361: aload_3
    //   362: ifnonnull -> 376
    //   365: getstatic gz.a : Lgz;
    //   368: ldc 'general.loadError'
    //   370: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   373: invokevirtual a : (Ljava/lang/String;)V
    //   376: aload_1
    //   377: iconst_0
    //   378: invokevirtual b : (Z)V
    //   381: return
  }
  
  public static kn a(int paramInt) {
    // Byte code:
    //   0: getstatic bc.a : Lbc;
    //   3: ifnonnull -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: iconst_0
    //   9: istore_1
    //   10: iload_1
    //   11: getstatic bc.a : Lbc;
    //   14: getfield b : Ljava/util/Vector;
    //   17: invokevirtual size : ()I
    //   20: if_icmpge -> 66
    //   23: getstatic bc.a : Lbc;
    //   26: getfield b : Ljava/util/Vector;
    //   29: iload_1
    //   30: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   33: checkcast ay
    //   36: dup
    //   37: astore_2
    //   38: instanceof kn
    //   41: ifeq -> 60
    //   44: aload_2
    //   45: checkcast kn
    //   48: getfield i : I
    //   51: iload_0
    //   52: if_icmpne -> 60
    //   55: aload_2
    //   56: checkcast kn
    //   59: areturn
    //   60: iinc #1, 1
    //   63: goto -> 10
    //   66: aconst_null
    //   67: astore_1
    //   68: new bj
    //   71: dup
    //   72: new java/lang/String
    //   75: dup
    //   76: ldc 'unreadCount'
    //   78: invokestatic a : (Ljava/lang/String;)[B
    //   81: ldc 'UTF-8'
    //   83: invokespecial <init> : ([BLjava/lang/String;)V
    //   86: invokespecial <init> : (Ljava/lang/String;)V
    //   89: iload_0
    //   90: invokestatic valueOf : (I)Ljava/lang/String;
    //   93: invokevirtual a : (Ljava/lang/String;)Lat;
    //   96: astore_1
    //   97: goto -> 101
    //   100: pop
    //   101: new kn
    //   104: dup
    //   105: iload_0
    //   106: aload_1
    //   107: invokespecial <init> : (ILat;)V
    //   110: areturn
    // Exception table:
    //   from	to	target	type
    //   68	97	100	java/lang/Exception
  }
  
  public static void f() {
    // Byte code:
    //   0: getstatic bc.a : Lbc;
    //   3: ifnonnull -> 7
    //   6: return
    //   7: new bj
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: astore_0
    //   15: iconst_0
    //   16: istore_1
    //   17: iload_1
    //   18: getstatic bc.a : Lbc;
    //   21: getfield b : Ljava/util/Vector;
    //   24: invokevirtual size : ()I
    //   27: if_icmpge -> 137
    //   30: getstatic bc.a : Lbc;
    //   33: getfield b : Ljava/util/Vector;
    //   36: iload_1
    //   37: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   40: checkcast ay
    //   43: dup
    //   44: astore_2
    //   45: instanceof kn
    //   48: ifeq -> 131
    //   51: aload_2
    //   52: checkcast kn
    //   55: dup
    //   56: astore_2
    //   57: getfield a : Ljava/util/Vector;
    //   60: invokevirtual size : ()I
    //   63: ifle -> 131
    //   66: new at
    //   69: dup
    //   70: invokespecial <init> : ()V
    //   73: astore_3
    //   74: iconst_0
    //   75: istore #4
    //   77: iload #4
    //   79: aload_2
    //   80: getfield a : Ljava/util/Vector;
    //   83: invokevirtual size : ()I
    //   86: if_icmpge -> 118
    //   89: aload_3
    //   90: aload_2
    //   91: getfield a : Ljava/util/Vector;
    //   94: iload #4
    //   96: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   99: checkcast java/lang/Integer
    //   102: astore #5
    //   104: getfield a : Ljava/util/Vector;
    //   107: aload #5
    //   109: invokevirtual addElement : (Ljava/lang/Object;)V
    //   112: iinc #4, 1
    //   115: goto -> 77
    //   118: aload_0
    //   119: aload_2
    //   120: getfield i : I
    //   123: invokestatic valueOf : (I)Ljava/lang/String;
    //   126: aload_3
    //   127: invokevirtual a : (Ljava/lang/String;Ljava/lang/Object;)Lbj;
    //   130: pop
    //   131: iinc #1, 1
    //   134: goto -> 17
    //   137: ldc 'unreadCount'
    //   139: aload_0
    //   140: invokevirtual toString : ()Ljava/lang/String;
    //   143: ldc 'UTF-8'
    //   145: invokevirtual getBytes : (Ljava/lang/String;)[B
    //   148: invokestatic a : (Ljava/lang/String;[B)Z
    //   151: pop
    //   152: return
    //   153: pop
    //   154: ldc 'unreadCount'
    //   156: invokestatic a : (Ljava/lang/String;)Z
    //   159: pop
    //   160: return
    // Exception table:
    //   from	to	target	type
    //   7	152	153	java/lang/Exception
  }
  
  public static void a(kn paramkn, bw parambw) {
    if (paramkn == null)
      return; 
    if (parambw.a() && (((ku)parambw.a).a != null || ((ku)parambw.a).a != null)) {
      lc lc;
      is is = ((lc = (lc)(new bn()).a(paramkn.i).a()) != null) ? lc.a() : null;
      paramkn.a(is);
    } 
    paramkn.a(parambw);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/bc.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */