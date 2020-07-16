public final class aa extends da implements ca {
  private String b;
  
  public int a;
  
  public int b;
  
  public String a;
  
  public int c;
  
  private boolean a;
  
  public dv[] a;
  
  public fc a;
  
  public hy a;
  
  public ip a;
  
  public int d;
  
  public int e;
  
  public aa[] a;
  
  public final String toString() {
    return "wall" + this.a + "_" + this.e;
  }
  
  public final boolean a() {
    return (this.a != null && this.a.length > 0);
  }
  
  public final da a(bj parambj) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 6
    //   4: aload_0
    //   5: areturn
    //   6: aload_0
    //   7: aload_1
    //   8: ldc 'owner_id'
    //   10: invokevirtual a : (Ljava/lang/String;)Z
    //   13: ifeq -> 25
    //   16: aload_1
    //   17: ldc 'owner_id'
    //   19: invokevirtual a : (Ljava/lang/String;)I
    //   22: goto -> 31
    //   25: aload_1
    //   26: ldc 'source_id'
    //   28: invokevirtual a : (Ljava/lang/String;)I
    //   31: putfield a : I
    //   34: aload_0
    //   35: aload_1
    //   36: ldc 'type'
    //   38: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   41: putfield b : Ljava/lang/String;
    //   44: aload_0
    //   45: aload_1
    //   46: ldc 'id'
    //   48: invokevirtual a : (Ljava/lang/String;)Z
    //   51: ifeq -> 63
    //   54: aload_1
    //   55: ldc 'id'
    //   57: invokevirtual a : (Ljava/lang/String;)I
    //   60: goto -> 69
    //   63: aload_1
    //   64: ldc 'post_id'
    //   66: invokevirtual a : (Ljava/lang/String;)I
    //   69: putfield e : I
    //   72: aload_0
    //   73: aload_1
    //   74: ldc 'date'
    //   76: invokevirtual a : (Ljava/lang/String;)I
    //   79: putfield b : I
    //   82: aload_0
    //   83: aload_1
    //   84: ldc 'text'
    //   86: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   89: putfield a : Ljava/lang/String;
    //   92: aload_1
    //   93: ldc 'comments'
    //   95: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   98: astore_2
    //   99: aload_0
    //   100: new fc
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: aload_2
    //   108: invokevirtual a : (Lbj;)Lda;
    //   111: checkcast fc
    //   114: putfield a : Lfc;
    //   117: aload_1
    //   118: ldc 'likes'
    //   120: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   123: astore_2
    //   124: aload_0
    //   125: new hy
    //   128: dup
    //   129: invokespecial <init> : ()V
    //   132: aload_2
    //   133: invokevirtual a : (Lbj;)Lda;
    //   136: checkcast hy
    //   139: putfield a : Lhy;
    //   142: aload_1
    //   143: ldc 'reposts'
    //   145: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   148: astore_2
    //   149: aload_0
    //   150: new ip
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: aload_2
    //   158: invokevirtual a : (Lbj;)Lda;
    //   161: checkcast ip
    //   164: putfield a : Lip;
    //   167: aload_1
    //   168: ldc 'views'
    //   170: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   173: dup
    //   174: astore_2
    //   175: ifnull -> 188
    //   178: aload_0
    //   179: aload_2
    //   180: ldc 'count'
    //   182: invokevirtual a : (Ljava/lang/String;)I
    //   185: putfield d : I
    //   188: aload_1
    //   189: ldc 'post_type'
    //   191: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   194: pop
    //   195: aload_1
    //   196: ldc 'attachments'
    //   198: invokevirtual a : (Ljava/lang/String;)Lat;
    //   201: dup
    //   202: astore_2
    //   203: ifnull -> 261
    //   206: aload_0
    //   207: aload_2
    //   208: getfield a : Ljava/util/Vector;
    //   211: invokevirtual size : ()I
    //   214: anewarray dv
    //   217: putfield a : [Ldv;
    //   220: iconst_0
    //   221: istore_3
    //   222: iload_3
    //   223: aload_2
    //   224: getfield a : Ljava/util/Vector;
    //   227: invokevirtual size : ()I
    //   230: if_icmpge -> 261
    //   233: aload_2
    //   234: iload_3
    //   235: invokevirtual a : (I)Lbj;
    //   238: dup
    //   239: astore #4
    //   241: ifnull -> 255
    //   244: aload_0
    //   245: getfield a : [Ldv;
    //   248: iload_3
    //   249: aload #4
    //   251: invokestatic a : (Lbj;)Ldv;
    //   254: aastore
    //   255: iinc #3, 1
    //   258: goto -> 222
    //   261: aload_1
    //   262: ldc 'copy_history'
    //   264: invokevirtual a : (Ljava/lang/String;)Lat;
    //   267: dup
    //   268: astore_2
    //   269: ifnull -> 337
    //   272: aload_0
    //   273: aload_2
    //   274: getfield a : Ljava/util/Vector;
    //   277: invokevirtual size : ()I
    //   280: anewarray aa
    //   283: putfield a : [Laa;
    //   286: iconst_0
    //   287: istore_3
    //   288: iload_3
    //   289: aload_2
    //   290: getfield a : Ljava/util/Vector;
    //   293: invokevirtual size : ()I
    //   296: if_icmpge -> 337
    //   299: aload_2
    //   300: iload_3
    //   301: invokevirtual a : (I)Lbj;
    //   304: dup
    //   305: astore #4
    //   307: ifnull -> 331
    //   310: aload_0
    //   311: getfield a : [Laa;
    //   314: iload_3
    //   315: new aa
    //   318: dup
    //   319: invokespecial <init> : ()V
    //   322: aload #4
    //   324: invokevirtual a : (Lbj;)Lda;
    //   327: checkcast aa
    //   330: aastore
    //   331: iinc #3, 1
    //   334: goto -> 288
    //   337: aload_0
    //   338: aload_1
    //   339: ldc 'from_id'
    //   341: invokevirtual a : (Ljava/lang/String;)Z
    //   344: ifeq -> 356
    //   347: aload_1
    //   348: ldc 'from_id'
    //   350: invokevirtual a : (Ljava/lang/String;)I
    //   353: goto -> 362
    //   356: aload_1
    //   357: ldc 'signer_id'
    //   359: invokevirtual a : (Ljava/lang/String;)I
    //   362: putfield c : I
    //   365: aload_0
    //   366: aload_1
    //   367: ldc 'marked_as_ads'
    //   369: invokevirtual a : (Ljava/lang/String;)I
    //   372: invokestatic b : (I)Z
    //   375: putfield a : Z
    //   378: aload_1
    //   379: ldc 'is_favorite'
    //   381: invokevirtual b : (Ljava/lang/String;)Z
    //   384: pop
    //   385: aload_0
    //   386: getfield a : Z
    //   389: ifne -> 469
    //   392: aload_1
    //   393: ldc 'ext_id'
    //   395: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   398: invokestatic a : (Ljava/lang/String;)Z
    //   401: ifne -> 426
    //   404: aload_0
    //   405: getfield b : Ljava/lang/String;
    //   408: invokestatic a : (Ljava/lang/String;)Z
    //   411: ifeq -> 469
    //   414: aload_0
    //   415: getfield b : Ljava/lang/String;
    //   418: ldc 'post'
    //   420: invokevirtual equals : (Ljava/lang/Object;)Z
    //   423: ifne -> 469
    //   426: aload_1
    //   427: ldc 'authors_rec'
    //   429: invokevirtual a : (Ljava/lang/String;)Z
    //   432: ifne -> 469
    //   435: aload_1
    //   436: ldc 'app_widget'
    //   438: invokevirtual a : (Ljava/lang/String;)Z
    //   441: ifne -> 469
    //   444: aload_1
    //   445: ldc 'promo_button'
    //   447: invokevirtual a : (Ljava/lang/String;)Z
    //   450: ifne -> 469
    //   453: aload_1
    //   454: ldc 'friends_recomm'
    //   456: invokevirtual a : (Ljava/lang/String;)Z
    //   459: ifne -> 469
    //   462: aload_1
    //   463: ldc 'live_recommended'
    //   465: invokevirtual a : (Ljava/lang/String;)Z
    //   468: pop
    //   469: aload_0
    //   470: areturn
  }
  
  public final boolean b() {
    return (this.a != null && this.a.length > 0);
  }
  
  public final boolean c() {
    return !ab.a((String)this.a);
  }
  
  public final boolean d() {
    return (this.c != 0);
  }
  
  public final String a() {
    return "post";
  }
  
  public final int a() {
    return this.a;
  }
  
  public final int b() {
    return this.e;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/aa.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */