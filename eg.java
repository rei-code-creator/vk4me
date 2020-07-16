import java.util.Vector;

public final class eg extends jr {
  private static Thread a;
  
  public Vector a = new Vector();
  
  public static eg a;
  
  public eg() {
    super(u.a("title.newsfeed"));
    a = this;
    if (a == null) {
      (a = (eg)new gd()).setPriority(1);
      a.start();
    } 
  }
  
  public final void c() {
    gz.a.b(true);
    Vector vector = new Vector();
    String str = (this.a == null) ? null : this.a.toString();
    fk fk;
    (fk = (new fk()).a()).a("start_from", str);
    io io1;
    io io2;
    if ((io1 = (io)fk.a()) != null && (((io2 = io1).a != null && io2.a.length > 0)) && (!ab.a(io1.a)) && io1.a.length >= 20) {
      if (this.a != null && this.a.equals(io1.a)) {
        this.b = true;
        gz.a.b(false);
        return;
      } 
      this.a = (eg)io1.a;
      for (byte b = 0; b < io1.a.length; b++) {
        r[] arrayOfR = a((aa)io1.a[b]);
        for (byte b1 = 0; b1 < arrayOfR.length; b1++) {
          r r;
          if ((r = arrayOfR[b1]) != null)
            vector.addElement(r); 
        } 
      } 
      (new ga(vector)).start();
    } else {
      this.b = true;
      if (io1 == null)
        gz.a.a(u.a("general.loadError")); 
    } 
    gz.a.b(false);
  }
  
  private r[] a(aa paramaa) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 9
    //   4: iconst_0
    //   5: anewarray r
    //   8: areturn
    //   9: aload_0
    //   10: getfield b : Ljava/util/Vector;
    //   13: invokevirtual size : ()I
    //   16: iconst_1
    //   17: if_icmpne -> 34
    //   20: aload_0
    //   21: getfield b : Ljava/util/Vector;
    //   24: new ak
    //   27: dup
    //   28: invokespecial <init> : ()V
    //   31: invokevirtual addElement : (Ljava/lang/Object;)V
    //   34: iconst_4
    //   35: anewarray r
    //   38: astore_2
    //   39: aload_0
    //   40: getfield b : Ljava/util/Vector;
    //   43: aload_2
    //   44: iconst_0
    //   45: aload_1
    //   46: getfield a : I
    //   49: invokestatic a : (I)Llb;
    //   52: iconst_0
    //   53: iconst_1
    //   54: iconst_1
    //   55: iconst_0
    //   56: iconst_1
    //   57: invokestatic a : (Llb;ZZZZZ)Lr;
    //   60: aload_1
    //   61: getfield b : I
    //   64: invokestatic c : (I)Ljava/lang/String;
    //   67: invokevirtual c : (Ljava/lang/String;)Lr;
    //   70: aload_1
    //   71: invokevirtual d : ()Z
    //   74: ifne -> 98
    //   77: aload_1
    //   78: invokevirtual c : ()Z
    //   81: ifne -> 102
    //   84: aload_1
    //   85: invokevirtual b : ()Z
    //   88: ifne -> 102
    //   91: aload_1
    //   92: invokevirtual a : ()Z
    //   95: ifeq -> 102
    //   98: iconst_1
    //   99: goto -> 103
    //   102: iconst_0
    //   103: istore #6
    //   105: dup
    //   106: astore #5
    //   108: iload #6
    //   110: putfield n : Z
    //   113: aload #5
    //   115: checkcast r
    //   118: dup_x2
    //   119: aastore
    //   120: invokevirtual addElement : (Ljava/lang/Object;)V
    //   123: aload_1
    //   124: invokevirtual d : ()Z
    //   127: ifeq -> 187
    //   130: aload_1
    //   131: getfield c : I
    //   134: aload_1
    //   135: getfield a : I
    //   138: if_icmpeq -> 187
    //   141: aload_0
    //   142: getfield b : Ljava/util/Vector;
    //   145: aload_2
    //   146: iconst_1
    //   147: aload_1
    //   148: getfield c : I
    //   151: invokestatic a : (I)Llb;
    //   154: iconst_1
    //   155: iconst_1
    //   156: iconst_1
    //   157: iconst_0
    //   158: iconst_1
    //   159: invokestatic a : (Llb;ZZZZZ)Lr;
    //   162: ldc 'general.author'
    //   164: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   167: invokevirtual b : (Ljava/lang/String;)Lr;
    //   170: dup
    //   171: astore #5
    //   173: iconst_0
    //   174: putfield n : Z
    //   177: aload #5
    //   179: checkcast r
    //   182: dup_x2
    //   183: aastore
    //   184: invokevirtual addElement : (Ljava/lang/Object;)V
    //   187: aload_1
    //   188: invokevirtual c : ()Z
    //   191: ifeq -> 212
    //   194: aload_0
    //   195: getfield b : Ljava/util/Vector;
    //   198: new gg
    //   201: dup
    //   202: aload_1
    //   203: getfield a : Ljava/lang/String;
    //   206: invokespecial <init> : (Ljava/lang/String;)V
    //   209: invokevirtual addElement : (Ljava/lang/Object;)V
    //   212: aload_1
    //   213: invokevirtual b : ()Z
    //   216: ifeq -> 445
    //   219: iconst_0
    //   220: istore_3
    //   221: iload_3
    //   222: aload_1
    //   223: getfield a : [Ldv;
    //   226: arraylength
    //   227: if_icmpge -> 445
    //   230: aload_1
    //   231: getfield a : [Ldv;
    //   234: iload_3
    //   235: aaload
    //   236: dup
    //   237: astore #4
    //   239: ifnull -> 439
    //   242: aload #4
    //   244: instanceof jc
    //   247: ifeq -> 334
    //   250: aload #4
    //   252: checkcast jc
    //   255: invokevirtual a : ()Leh;
    //   258: astore #5
    //   260: aload_0
    //   261: getfield b : Ljava/util/Vector;
    //   264: new fl
    //   267: dup
    //   268: invokespecial <init> : ()V
    //   271: aload #5
    //   273: getfield a : I
    //   276: aload #5
    //   278: getfield b : I
    //   281: invokevirtual a : (II)Lfl;
    //   284: aload #4
    //   286: astore #6
    //   288: dup
    //   289: astore #5
    //   291: aload #6
    //   293: putfield a : Lad;
    //   296: aload #5
    //   298: dup
    //   299: astore #5
    //   301: iconst_1
    //   302: putfield a : B
    //   305: aload #5
    //   307: dup
    //   308: astore #5
    //   310: iconst_1
    //   311: putfield a : Z
    //   314: aload #5
    //   316: dup
    //   317: astore #5
    //   319: invokevirtual addElement : (Ljava/lang/Object;)V
    //   322: aload_0
    //   323: getfield a : Ljava/util/Vector;
    //   326: aload #5
    //   328: invokevirtual addElement : (Ljava/lang/Object;)V
    //   331: goto -> 439
    //   334: aload #4
    //   336: instanceof dp
    //   339: ifeq -> 423
    //   342: aload #4
    //   344: checkcast dp
    //   347: astore #5
    //   349: aload_0
    //   350: getfield b : Ljava/util/Vector;
    //   353: new fl
    //   356: dup
    //   357: invokespecial <init> : ()V
    //   360: aload #5
    //   362: getfield a : I
    //   365: aload #5
    //   367: getfield b : I
    //   370: invokevirtual a : (II)Lfl;
    //   373: aload #5
    //   375: astore #6
    //   377: dup
    //   378: astore #5
    //   380: aload #6
    //   382: putfield a : Lad;
    //   385: aload #5
    //   387: dup
    //   388: astore #5
    //   390: iconst_1
    //   391: putfield a : B
    //   394: aload #5
    //   396: dup
    //   397: astore #5
    //   399: iconst_1
    //   400: putfield a : Z
    //   403: aload #5
    //   405: dup
    //   406: astore #5
    //   408: invokevirtual addElement : (Ljava/lang/Object;)V
    //   411: aload_0
    //   412: getfield a : Ljava/util/Vector;
    //   415: aload #5
    //   417: invokevirtual addElement : (Ljava/lang/Object;)V
    //   420: goto -> 439
    //   423: aload_0
    //   424: getfield b : Ljava/util/Vector;
    //   427: new iv
    //   430: dup
    //   431: aload #4
    //   433: invokespecial <init> : (Ldv;)V
    //   436: invokevirtual addElement : (Ljava/lang/Object;)V
    //   439: iinc #3, 1
    //   442: goto -> 221
    //   445: aload_1
    //   446: astore_3
    //   447: aload_1
    //   448: invokevirtual a : ()Z
    //   451: ifeq -> 882
    //   454: aload_1
    //   455: getfield a : [Laa;
    //   458: iconst_0
    //   459: aaload
    //   460: dup
    //   461: astore_1
    //   462: ifnull -> 882
    //   465: aload_0
    //   466: getfield b : Ljava/util/Vector;
    //   469: aload_2
    //   470: iconst_2
    //   471: aload_1
    //   472: getfield a : I
    //   475: invokestatic a : (I)Llb;
    //   478: iconst_0
    //   479: iconst_1
    //   480: iconst_1
    //   481: iconst_0
    //   482: iconst_1
    //   483: invokestatic a : (Llb;ZZZZZ)Lr;
    //   486: ldc 'general.repost'
    //   488: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   491: invokevirtual b : (Ljava/lang/String;)Lr;
    //   494: aload_1
    //   495: getfield b : I
    //   498: invokestatic c : (I)Ljava/lang/String;
    //   501: invokevirtual c : (Ljava/lang/String;)Lr;
    //   504: aload_1
    //   505: invokevirtual d : ()Z
    //   508: ifne -> 532
    //   511: aload_1
    //   512: invokevirtual c : ()Z
    //   515: ifne -> 536
    //   518: aload_1
    //   519: invokevirtual b : ()Z
    //   522: ifne -> 536
    //   525: aload_1
    //   526: invokevirtual a : ()Z
    //   529: ifeq -> 536
    //   532: iconst_1
    //   533: goto -> 537
    //   536: iconst_0
    //   537: istore #6
    //   539: dup
    //   540: astore #5
    //   542: iload #6
    //   544: putfield n : Z
    //   547: aload #5
    //   549: checkcast r
    //   552: dup_x2
    //   553: aastore
    //   554: invokevirtual addElement : (Ljava/lang/Object;)V
    //   557: aload_1
    //   558: invokevirtual d : ()Z
    //   561: ifeq -> 621
    //   564: aload_1
    //   565: getfield c : I
    //   568: aload_1
    //   569: getfield a : I
    //   572: if_icmpeq -> 621
    //   575: aload_0
    //   576: getfield b : Ljava/util/Vector;
    //   579: aload_2
    //   580: iconst_3
    //   581: aload_1
    //   582: getfield c : I
    //   585: invokestatic a : (I)Llb;
    //   588: iconst_1
    //   589: iconst_1
    //   590: iconst_1
    //   591: iconst_0
    //   592: iconst_1
    //   593: invokestatic a : (Llb;ZZZZZ)Lr;
    //   596: ldc 'general.author'
    //   598: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   601: invokevirtual b : (Ljava/lang/String;)Lr;
    //   604: dup
    //   605: astore #5
    //   607: iconst_0
    //   608: putfield n : Z
    //   611: aload #5
    //   613: checkcast r
    //   616: dup_x2
    //   617: aastore
    //   618: invokevirtual addElement : (Ljava/lang/Object;)V
    //   621: aload_1
    //   622: invokevirtual c : ()Z
    //   625: ifeq -> 646
    //   628: aload_0
    //   629: getfield b : Ljava/util/Vector;
    //   632: new gg
    //   635: dup
    //   636: aload_1
    //   637: getfield a : Ljava/lang/String;
    //   640: invokespecial <init> : (Ljava/lang/String;)V
    //   643: invokevirtual addElement : (Ljava/lang/Object;)V
    //   646: aload_1
    //   647: invokevirtual b : ()Z
    //   650: ifeq -> 882
    //   653: iconst_0
    //   654: istore #4
    //   656: iload #4
    //   658: aload_1
    //   659: getfield a : [Ldv;
    //   662: arraylength
    //   663: if_icmpge -> 882
    //   666: aload_1
    //   667: getfield a : [Ldv;
    //   670: iload #4
    //   672: aaload
    //   673: dup
    //   674: astore #5
    //   676: ifnull -> 876
    //   679: aload #5
    //   681: instanceof jc
    //   684: ifeq -> 771
    //   687: aload #5
    //   689: checkcast jc
    //   692: invokevirtual a : ()Leh;
    //   695: astore #6
    //   697: aload_0
    //   698: getfield b : Ljava/util/Vector;
    //   701: new fl
    //   704: dup
    //   705: invokespecial <init> : ()V
    //   708: aload #6
    //   710: getfield a : I
    //   713: aload #6
    //   715: getfield b : I
    //   718: invokevirtual a : (II)Lfl;
    //   721: aload #5
    //   723: astore #6
    //   725: dup
    //   726: astore #5
    //   728: aload #6
    //   730: putfield a : Lad;
    //   733: aload #5
    //   735: dup
    //   736: astore #5
    //   738: iconst_1
    //   739: putfield a : B
    //   742: aload #5
    //   744: dup
    //   745: astore #5
    //   747: iconst_1
    //   748: putfield a : Z
    //   751: aload #5
    //   753: dup
    //   754: astore #5
    //   756: invokevirtual addElement : (Ljava/lang/Object;)V
    //   759: aload_0
    //   760: getfield a : Ljava/util/Vector;
    //   763: aload #5
    //   765: invokevirtual addElement : (Ljava/lang/Object;)V
    //   768: goto -> 876
    //   771: aload #5
    //   773: instanceof dp
    //   776: ifeq -> 860
    //   779: aload #5
    //   781: checkcast dp
    //   784: astore #6
    //   786: aload_0
    //   787: getfield b : Ljava/util/Vector;
    //   790: new fl
    //   793: dup
    //   794: invokespecial <init> : ()V
    //   797: aload #6
    //   799: getfield a : I
    //   802: aload #6
    //   804: getfield b : I
    //   807: invokevirtual a : (II)Lfl;
    //   810: aload #6
    //   812: astore #6
    //   814: dup
    //   815: astore #5
    //   817: aload #6
    //   819: putfield a : Lad;
    //   822: aload #5
    //   824: dup
    //   825: astore #5
    //   827: iconst_1
    //   828: putfield a : B
    //   831: aload #5
    //   833: dup
    //   834: astore #5
    //   836: iconst_1
    //   837: putfield a : Z
    //   840: aload #5
    //   842: dup
    //   843: astore #5
    //   845: invokevirtual addElement : (Ljava/lang/Object;)V
    //   848: aload_0
    //   849: getfield a : Ljava/util/Vector;
    //   852: aload #5
    //   854: invokevirtual addElement : (Ljava/lang/Object;)V
    //   857: goto -> 876
    //   860: aload_0
    //   861: getfield b : Ljava/util/Vector;
    //   864: new iv
    //   867: dup
    //   868: aload #5
    //   870: invokespecial <init> : (Ldv;)V
    //   873: invokevirtual addElement : (Ljava/lang/Object;)V
    //   876: iinc #4, 1
    //   879: goto -> 656
    //   882: aload_3
    //   883: astore_1
    //   884: aload_0
    //   885: getfield b : Ljava/util/Vector;
    //   888: new fo
    //   891: dup
    //   892: aload_1
    //   893: invokespecial <init> : (Laa;)V
    //   896: invokevirtual addElement : (Ljava/lang/Object;)V
    //   899: aload_0
    //   900: getfield b : Ljava/util/Vector;
    //   903: new ak
    //   906: dup
    //   907: invokespecial <init> : ()V
    //   910: invokevirtual addElement : (Ljava/lang/Object;)V
    //   913: aload_2
    //   914: areturn
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/eg.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */