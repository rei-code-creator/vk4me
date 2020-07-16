import javax.microedition.lcdui.Graphics;

public class iv extends r {
  private int[] a;
  
  private int h;
  
  private int i;
  
  public iv(dv paramdv) {
    super(null, (byte)0);
    this.a = (int[])paramdv;
    a();
    if (paramdv == null)
      return; 
    a(true);
    dv dv1 = paramdv;
    iv iv1 = this;
    if (dv1 instanceof jc) {
      iv1.a(u.a("attachment.photo"));
    } else if (dv1 instanceof ej) {
      iv1.a(u.a("attachment.sticker"));
    } else if (dv1 instanceof cm) {
      dv1 = dv1;
      iv1.a(((cm)dv1).c);
    } else if (dv1 instanceof dp) {
      iv1.a(u.a("attachment.graffiti"));
    } else if (dv1 instanceof jg) {
      dv1 = dv1;
      iv1.a(((jg)dv1).a);
    } else if (dv1 instanceof ht) {
      dv1 = dv1;
      iv1.a = (int[])((ht)dv1).a;
      iv1.h = ((ht)dv1).b;
      iv1.i = ((ht)dv1).c;
      iv1.a((iv1.a == null) ? u.a("attachment.audioMessage") : "");
    } else if (dv1 instanceof js) {
      iv1.a((String)null);
    } else {
      iv1.a(u.a("attachment.general"));
    } 
    dv1 = paramdv;
    iv1 = this;
    if (dv1 instanceof cm) {
      dv1 = dv1;
      iv1.c(((cm)dv1).b);
    } else {
      String str;
      if (dv1 instanceof jg) {
        dv1 = dv1;
        iv1.c(((str = ((jg)dv1).a) >= 1073741824) ? (((int)(str / 1.07374182E9F * 10.0F) / 10.0F) + " GiB") : ((str >= 1048576) ? (((int)(str / 1048576.0F * 10.0F) / 10.0F) + " MiB") : ((str >= 'Ѐ') ? (((int)(str / 1024.0F * 10.0F) / 10.0F) + " KiB") : (str + " B"))));
      } else if (dv1 instanceof ht) {
        dv1 = dv1;
        str.c(ad.a(((ht)dv1).a));
      } else if (dv1 instanceof js) {
        str.a(((js)dv1).a());
      } else {
        str.c(dv1.toString());
      } 
    } 
    dv1 = paramdv;
    iv1 = this;
    if (dv1 instanceof jc) {
      iv1.a("avu_image.png", "av_image.png");
      return;
    } 
    if (dv1 instanceof ej) {
      iv1.a("avu_sticker.png", "av_sticker.png");
      return;
    } 
    if (dv1 instanceof cm) {
      iv1.a("avu_audio.png", "av_audio.png");
      return;
    } 
    if (dv1 instanceof dp) {
      iv1.a("avu_graffiti.png", "av_graffiti.png");
      return;
    } 
    if (dv1 instanceof jg) {
      iv1.a("avu_file.png", "av_file.png");
      return;
    } 
    if (dv1 instanceof ht) {
      iv1.a("avu_voice.png", "av_voice.png");
      return;
    } 
    if (dv1 instanceof js) {
      iv1.a("avu_playlist.png", "av_playlist.png");
      return;
    } 
    iv1.a("avu_attach.png", "av_attach.png");
  }
  
  public void a() {
    if (this.a instanceof cm) {
      ea.a(new jm((cm)this.a), 0);
      return;
    } 
    if (this.a instanceof js)
      ea.a(new jm((js)this.a), 0); 
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : B
    //   4: ifeq -> 54
    //   7: aload_0
    //   8: getfield a : B
    //   11: iconst_1
    //   12: if_icmpne -> 26
    //   15: iconst_0
    //   16: aload_0
    //   17: getfield e : Z
    //   20: invokestatic a : (ZZ)Ljavax/microedition/lcdui/Image;
    //   23: goto -> 48
    //   26: aload_0
    //   27: getfield k : Z
    //   30: ifeq -> 44
    //   33: aload_0
    //   34: getfield m : Z
    //   37: ifeq -> 44
    //   40: iconst_1
    //   41: goto -> 45
    //   44: iconst_0
    //   45: invokestatic b : (Z)Ljavax/microedition/lcdui/Image;
    //   48: invokevirtual getWidth : ()I
    //   51: goto -> 55
    //   54: iconst_0
    //   55: getstatic gz.a : Lgz;
    //   58: getfield a : Lcp;
    //   61: invokevirtual a : ()I
    //   64: iconst_2
    //   65: idiv
    //   66: iadd
    //   67: istore #4
    //   69: aload_0
    //   70: getfield d : I
    //   73: ifle -> 620
    //   76: aload_0
    //   77: getfield e : I
    //   80: ifle -> 620
    //   83: aload_0
    //   84: getfield c : Ljava/lang/String;
    //   87: ifnull -> 189
    //   90: aload_0
    //   91: getfield d : Ljava/lang/String;
    //   94: ifnonnull -> 189
    //   97: aload_0
    //   98: getstatic gz.a : Lgz;
    //   101: getfield b : Lcp;
    //   104: aload_0
    //   105: getfield c : Ljava/lang/String;
    //   108: aload_0
    //   109: getfield d : I
    //   112: iload #4
    //   114: isub
    //   115: aload_0
    //   116: getfield a : Ljavax/microedition/lcdui/Image;
    //   119: ifnull -> 142
    //   122: aload_0
    //   123: getfield a : Ljavax/microedition/lcdui/Image;
    //   126: invokevirtual getWidth : ()I
    //   129: getstatic gz.a : Lgz;
    //   132: getfield a : Lcp;
    //   135: invokevirtual a : ()I
    //   138: iadd
    //   139: goto -> 143
    //   142: iconst_0
    //   143: isub
    //   144: getstatic gz.a : Lgz;
    //   147: getfield a : Lcp;
    //   150: invokevirtual a : ()I
    //   153: iconst_2
    //   154: idiv
    //   155: isub
    //   156: iconst_1
    //   157: invokevirtual a : (Ljava/lang/String;IZ)Ljava/lang/String;
    //   160: putfield d : Ljava/lang/String;
    //   163: aload_0
    //   164: aload_0
    //   165: getfield a : Z
    //   168: ifne -> 181
    //   171: aload_0
    //   172: getfield d : Ljava/lang/String;
    //   175: invokestatic a : (Ljava/lang/String;)Z
    //   178: ifeq -> 185
    //   181: iconst_1
    //   182: goto -> 186
    //   185: iconst_0
    //   186: putfield a : Z
    //   189: aload_0
    //   190: getfield a : Ljava/lang/String;
    //   193: ifnull -> 381
    //   196: aload_0
    //   197: getfield b : Ljava/lang/String;
    //   200: ifnonnull -> 381
    //   203: aload_0
    //   204: getstatic gz.a : Lgz;
    //   207: getfield a : Lcp;
    //   210: aload_0
    //   211: getfield a : Ljava/lang/String;
    //   214: aload_0
    //   215: getfield d : I
    //   218: iload #4
    //   220: isub
    //   221: aload_0
    //   222: getfield a : Ljavax/microedition/lcdui/Image;
    //   225: ifnull -> 250
    //   228: aload_0
    //   229: getfield a : Ljavax/microedition/lcdui/Image;
    //   232: invokevirtual getWidth : ()I
    //   235: getstatic gz.a : Lgz;
    //   238: getfield a : Lcp;
    //   241: invokevirtual a : ()I
    //   244: iconst_2
    //   245: idiv
    //   246: iadd
    //   247: goto -> 251
    //   250: iconst_0
    //   251: isub
    //   252: getstatic gz.a : Lgz;
    //   255: getfield a : Lcp;
    //   258: invokevirtual a : ()I
    //   261: iconst_2
    //   262: idiv
    //   263: isub
    //   264: aload_0
    //   265: getfield d : Ljava/lang/String;
    //   268: ifnull -> 325
    //   271: aload_0
    //   272: getfield d : Z
    //   275: ifeq -> 325
    //   278: aload_0
    //   279: getfield c : Z
    //   282: ifne -> 325
    //   285: getstatic gz.a : Lgz;
    //   288: getfield b : Lcp;
    //   291: aload_0
    //   292: getfield d : Ljava/lang/String;
    //   295: aload_0
    //   296: getfield a : Z
    //   299: ifne -> 306
    //   302: iconst_1
    //   303: goto -> 307
    //   306: iconst_0
    //   307: invokevirtual a : (Ljava/lang/String;Z)I
    //   310: getstatic gz.a : Lgz;
    //   313: getfield a : Lcp;
    //   316: invokevirtual a : ()I
    //   319: iconst_2
    //   320: idiv
    //   321: iadd
    //   322: goto -> 326
    //   325: iconst_0
    //   326: isub
    //   327: iconst_1
    //   328: invokevirtual a : (Ljava/lang/String;IZ)Ljava/lang/String;
    //   331: putfield b : Ljava/lang/String;
    //   334: aload_0
    //   335: getstatic gz.a : Lgz;
    //   338: getfield a : Lcp;
    //   341: invokevirtual a : ()I
    //   344: bipush #13
    //   346: imul
    //   347: iconst_4
    //   348: idiv
    //   349: putfield e : I
    //   352: aload_0
    //   353: aload_0
    //   354: getfield a : Z
    //   357: ifne -> 370
    //   360: aload_0
    //   361: getfield b : Ljava/lang/String;
    //   364: invokestatic a : (Ljava/lang/String;)Z
    //   367: ifeq -> 374
    //   370: iconst_1
    //   371: goto -> 375
    //   374: iconst_0
    //   375: putfield a : Z
    //   378: goto -> 403
    //   381: aload_0
    //   382: getfield a : Ljava/lang/String;
    //   385: ifnonnull -> 403
    //   388: aload_0
    //   389: getstatic gz.a : Lgz;
    //   392: getfield a : Lcp;
    //   395: invokevirtual a : ()I
    //   398: iconst_1
    //   399: ishl
    //   400: putfield e : I
    //   403: aload_0
    //   404: getfield f : Ljava/lang/String;
    //   407: ifnull -> 620
    //   410: aload_0
    //   411: getfield g : Ljava/lang/String;
    //   414: ifnonnull -> 620
    //   417: aload_0
    //   418: aload_0
    //   419: getfield b : Z
    //   422: ifeq -> 434
    //   425: getstatic gz.a : Lgz;
    //   428: getfield b : Lcp;
    //   431: goto -> 440
    //   434: getstatic gz.a : Lgz;
    //   437: getfield a : Lcp;
    //   440: aload_0
    //   441: getfield f : Ljava/lang/String;
    //   444: aload_0
    //   445: getfield d : I
    //   448: iload #4
    //   450: isub
    //   451: aload_0
    //   452: getfield a : Ljavax/microedition/lcdui/Image;
    //   455: ifnull -> 480
    //   458: aload_0
    //   459: getfield a : Ljavax/microedition/lcdui/Image;
    //   462: invokevirtual getWidth : ()I
    //   465: getstatic gz.a : Lgz;
    //   468: getfield a : Lcp;
    //   471: invokevirtual a : ()I
    //   474: iconst_2
    //   475: idiv
    //   476: iadd
    //   477: goto -> 481
    //   480: iconst_0
    //   481: isub
    //   482: getstatic gz.a : Lgz;
    //   485: getfield a : Lcp;
    //   488: invokevirtual a : ()I
    //   491: iconst_2
    //   492: idiv
    //   493: isub
    //   494: aload_0
    //   495: getfield d : Ljava/lang/String;
    //   498: ifnull -> 541
    //   501: getstatic gz.a : Lgz;
    //   504: getfield b : Lcp;
    //   507: aload_0
    //   508: getfield d : Ljava/lang/String;
    //   511: aload_0
    //   512: getfield a : Z
    //   515: ifne -> 522
    //   518: iconst_1
    //   519: goto -> 523
    //   522: iconst_0
    //   523: invokevirtual a : (Ljava/lang/String;Z)I
    //   526: getstatic gz.a : Lgz;
    //   529: getfield a : Lcp;
    //   532: invokevirtual a : ()I
    //   535: iconst_2
    //   536: idiv
    //   537: iadd
    //   538: goto -> 542
    //   541: iconst_0
    //   542: isub
    //   543: aload_0
    //   544: getfield b : I
    //   547: ifeq -> 585
    //   550: aload_0
    //   551: getfield f : Z
    //   554: ifne -> 585
    //   557: getstatic iv.a : [Ljavax/microedition/lcdui/Image;
    //   560: aload_0
    //   561: getfield b : I
    //   564: iconst_1
    //   565: isub
    //   566: aaload
    //   567: invokevirtual getWidth : ()I
    //   570: getstatic gz.a : Lgz;
    //   573: getfield a : Lcp;
    //   576: invokevirtual a : ()I
    //   579: iconst_2
    //   580: idiv
    //   581: iadd
    //   582: goto -> 586
    //   585: iconst_0
    //   586: isub
    //   587: iconst_1
    //   588: invokevirtual a : (Ljava/lang/String;IZ)Ljava/lang/String;
    //   591: putfield g : Ljava/lang/String;
    //   594: aload_0
    //   595: aload_0
    //   596: getfield a : Z
    //   599: ifne -> 612
    //   602: aload_0
    //   603: getfield g : Ljava/lang/String;
    //   606: invokestatic a : (Ljava/lang/String;)Z
    //   609: ifeq -> 616
    //   612: iconst_1
    //   613: goto -> 617
    //   616: iconst_0
    //   617: putfield a : Z
    //   620: aload_0
    //   621: getfield m : Z
    //   624: ifeq -> 667
    //   627: aload_0
    //   628: getfield k : Z
    //   631: ifeq -> 667
    //   634: aload_1
    //   635: aload_0
    //   636: getfield d : I
    //   639: aload_0
    //   640: getfield e : I
    //   643: aload_0
    //   644: getfield g : Z
    //   647: invokestatic b : (IIZ)Ljavax/microedition/lcdui/Image;
    //   650: aload_0
    //   651: getfield f : I
    //   654: iload_3
    //   655: iadd
    //   656: aload_0
    //   657: getfield g : I
    //   660: iload_2
    //   661: iadd
    //   662: bipush #20
    //   664: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   667: aload_0
    //   668: getfield g : Ljava/lang/String;
    //   671: ifnull -> 1277
    //   674: aload_0
    //   675: getfield a : [I
    //   678: ifnonnull -> 841
    //   681: aload_1
    //   682: aload_0
    //   683: getfield k : Z
    //   686: ifeq -> 701
    //   689: aload_0
    //   690: getfield m : Z
    //   693: ifeq -> 701
    //   696: ldc 16777215
    //   698: goto -> 724
    //   701: aload_0
    //   702: getfield g : Z
    //   705: ifeq -> 720
    //   708: aload_0
    //   709: getfield i : Z
    //   712: ifne -> 720
    //   715: ldc 12339015
    //   717: goto -> 724
    //   720: aload_0
    //   721: getfield c : I
    //   724: invokevirtual setColor : (I)V
    //   727: aload_0
    //   728: getfield b : Z
    //   731: ifeq -> 743
    //   734: getstatic gz.a : Lgz;
    //   737: getfield b : Lcp;
    //   740: goto -> 749
    //   743: getstatic gz.a : Lgz;
    //   746: getfield a : Lcp;
    //   749: aload_1
    //   750: aload_0
    //   751: getfield g : Ljava/lang/String;
    //   754: aload_0
    //   755: getfield f : I
    //   758: iload_3
    //   759: iadd
    //   760: aload_0
    //   761: getfield a : Ljavax/microedition/lcdui/Image;
    //   764: ifnull -> 789
    //   767: aload_0
    //   768: getfield a : Ljavax/microedition/lcdui/Image;
    //   771: invokevirtual getWidth : ()I
    //   774: getstatic gz.a : Lgz;
    //   777: getfield a : Lcp;
    //   780: invokevirtual a : ()I
    //   783: iconst_2
    //   784: idiv
    //   785: iadd
    //   786: goto -> 790
    //   789: iconst_0
    //   790: iadd
    //   791: getstatic gz.a : Lgz;
    //   794: getfield a : Lcp;
    //   797: invokevirtual a : ()I
    //   800: iconst_2
    //   801: idiv
    //   802: iadd
    //   803: aload_0
    //   804: getfield g : I
    //   807: iload_2
    //   808: iadd
    //   809: getstatic gz.a : Lgz;
    //   812: getfield a : Lcp;
    //   815: invokevirtual a : ()I
    //   818: iconst_2
    //   819: idiv
    //   820: iadd
    //   821: bipush #20
    //   823: aload_0
    //   824: getfield a : Z
    //   827: ifne -> 834
    //   830: iconst_1
    //   831: goto -> 835
    //   834: iconst_0
    //   835: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIIZ)V
    //   838: goto -> 1277
    //   841: aload_0
    //   842: getfield f : I
    //   845: iload_3
    //   846: iadd
    //   847: aload_0
    //   848: getfield a : Ljavax/microedition/lcdui/Image;
    //   851: ifnull -> 876
    //   854: aload_0
    //   855: getfield a : Ljavax/microedition/lcdui/Image;
    //   858: invokevirtual getWidth : ()I
    //   861: getstatic gz.a : Lgz;
    //   864: getfield a : Lcp;
    //   867: invokevirtual a : ()I
    //   870: iconst_2
    //   871: idiv
    //   872: iadd
    //   873: goto -> 877
    //   876: iconst_0
    //   877: iadd
    //   878: getstatic gz.a : Lgz;
    //   881: getfield a : Lcp;
    //   884: invokevirtual a : ()I
    //   887: iconst_2
    //   888: idiv
    //   889: iadd
    //   890: istore #5
    //   892: aload_0
    //   893: getfield g : I
    //   896: iload_2
    //   897: iadd
    //   898: getstatic gz.a : Lgz;
    //   901: getfield a : Lcp;
    //   904: invokevirtual a : ()I
    //   907: iconst_2
    //   908: idiv
    //   909: iadd
    //   910: istore #6
    //   912: aload_0
    //   913: getfield d : I
    //   916: iload #4
    //   918: isub
    //   919: aload_0
    //   920: getfield a : Ljavax/microedition/lcdui/Image;
    //   923: ifnull -> 948
    //   926: aload_0
    //   927: getfield a : Ljavax/microedition/lcdui/Image;
    //   930: invokevirtual getWidth : ()I
    //   933: getstatic gz.a : Lgz;
    //   936: getfield a : Lcp;
    //   939: invokevirtual a : ()I
    //   942: iconst_2
    //   943: idiv
    //   944: iadd
    //   945: goto -> 949
    //   948: iconst_0
    //   949: isub
    //   950: getstatic gz.a : Lgz;
    //   953: getfield a : Lcp;
    //   956: invokevirtual a : ()I
    //   959: iconst_2
    //   960: idiv
    //   961: isub
    //   962: aload_0
    //   963: getfield d : Ljava/lang/String;
    //   966: ifnull -> 1009
    //   969: getstatic gz.a : Lgz;
    //   972: getfield b : Lcp;
    //   975: aload_0
    //   976: getfield d : Ljava/lang/String;
    //   979: aload_0
    //   980: getfield a : Z
    //   983: ifne -> 990
    //   986: iconst_1
    //   987: goto -> 991
    //   990: iconst_0
    //   991: invokevirtual a : (Ljava/lang/String;Z)I
    //   994: getstatic gz.a : Lgz;
    //   997: getfield a : Lcp;
    //   1000: invokevirtual a : ()I
    //   1003: iconst_2
    //   1004: idiv
    //   1005: iadd
    //   1006: goto -> 1010
    //   1009: iconst_0
    //   1010: isub
    //   1011: aload_0
    //   1012: getfield b : I
    //   1015: ifeq -> 1053
    //   1018: aload_0
    //   1019: getfield f : Z
    //   1022: ifne -> 1053
    //   1025: getstatic iv.a : [Ljavax/microedition/lcdui/Image;
    //   1028: aload_0
    //   1029: getfield b : I
    //   1032: iconst_1
    //   1033: isub
    //   1034: aaload
    //   1035: invokevirtual getWidth : ()I
    //   1038: getstatic gz.a : Lgz;
    //   1041: getfield a : Lcp;
    //   1044: invokevirtual a : ()I
    //   1047: iconst_2
    //   1048: idiv
    //   1049: iadd
    //   1050: goto -> 1054
    //   1053: iconst_0
    //   1054: isub
    //   1055: istore #7
    //   1057: getstatic gz.a : Lgz;
    //   1060: getfield a : Lcp;
    //   1063: invokevirtual a : ()I
    //   1066: istore #8
    //   1068: aload_0
    //   1069: getfield i : I
    //   1072: aload_0
    //   1073: getfield h : I
    //   1076: isub
    //   1077: i2d
    //   1078: iload #8
    //   1080: i2d
    //   1081: ddiv
    //   1082: dstore #9
    //   1084: iconst_0
    //   1085: istore #11
    //   1087: aload_1
    //   1088: aload_0
    //   1089: getfield k : Z
    //   1092: ifeq -> 1107
    //   1095: aload_0
    //   1096: getfield m : Z
    //   1099: ifeq -> 1107
    //   1102: ldc 16777215
    //   1104: goto -> 1109
    //   1107: ldc 7708140
    //   1109: invokevirtual setColor : (I)V
    //   1112: iload #7
    //   1114: iconst_4
    //   1115: idiv
    //   1116: istore #7
    //   1118: dconst_0
    //   1119: aload_0
    //   1120: getfield a : [I
    //   1123: arraylength
    //   1124: i2d
    //   1125: iload #7
    //   1127: i2d
    //   1128: ddiv
    //   1129: invokestatic max : (DD)D
    //   1132: dstore #12
    //   1134: dconst_0
    //   1135: dstore #14
    //   1137: dload #12
    //   1139: aload_0
    //   1140: getfield a : [I
    //   1143: arraylength
    //   1144: iconst_1
    //   1145: isub
    //   1146: i2d
    //   1147: dcmpg
    //   1148: ifge -> 1277
    //   1151: iconst_0
    //   1152: istore #7
    //   1154: iload #7
    //   1156: aload_0
    //   1157: getfield a : [I
    //   1160: arraylength
    //   1161: if_icmpge -> 1277
    //   1164: iload #7
    //   1166: iflt -> 1194
    //   1169: aload_1
    //   1170: aload_0
    //   1171: getfield k : Z
    //   1174: ifeq -> 1189
    //   1177: aload_0
    //   1178: getfield m : Z
    //   1181: ifeq -> 1189
    //   1184: ldc 13948116
    //   1186: goto -> 1191
    //   1189: ldc 4681404
    //   1191: invokevirtual setColor : (I)V
    //   1194: iconst_2
    //   1195: iload #8
    //   1197: i2d
    //   1198: aload_0
    //   1199: getfield a : [I
    //   1202: iload #7
    //   1204: iaload
    //   1205: aload_0
    //   1206: getfield h : I
    //   1209: isub
    //   1210: i2d
    //   1211: dload #9
    //   1213: ddiv
    //   1214: dmul
    //   1215: d2i
    //   1216: iload #8
    //   1218: invokestatic min : (II)I
    //   1221: invokestatic max : (II)I
    //   1224: dup
    //   1225: istore #7
    //   1227: iconst_2
    //   1228: irem
    //   1229: ifeq -> 1235
    //   1232: iinc #7, 1
    //   1235: aload_1
    //   1236: iload #11
    //   1238: iload #5
    //   1240: iadd
    //   1241: iload #6
    //   1243: iload #8
    //   1245: iload #7
    //   1247: isub
    //   1248: iconst_2
    //   1249: idiv
    //   1250: iadd
    //   1251: iconst_2
    //   1252: iload #7
    //   1254: invokevirtual fillRect : (IIII)V
    //   1257: iinc #11, 4
    //   1260: dload #14
    //   1262: dload #12
    //   1264: dadd
    //   1265: dup2
    //   1266: dstore #14
    //   1268: invokestatic a : (D)J
    //   1271: l2i
    //   1272: istore #7
    //   1274: goto -> 1154
    //   1277: aload_0
    //   1278: getfield d : Ljava/lang/String;
    //   1281: ifnull -> 1565
    //   1284: aload_1
    //   1285: aload_0
    //   1286: getfield k : Z
    //   1289: ifeq -> 1304
    //   1292: aload_0
    //   1293: getfield m : Z
    //   1296: ifeq -> 1304
    //   1299: ldc 16777215
    //   1301: goto -> 1308
    //   1304: aload_0
    //   1305: getfield b_ : I
    //   1308: invokevirtual setColor : (I)V
    //   1311: aload_0
    //   1312: getfield d : Z
    //   1315: ifeq -> 1405
    //   1318: getstatic gz.a : Lgz;
    //   1321: getfield b : Lcp;
    //   1324: aload_1
    //   1325: aload_0
    //   1326: getfield d : Ljava/lang/String;
    //   1329: aload_0
    //   1330: getfield f : I
    //   1333: iload_3
    //   1334: iadd
    //   1335: aload_0
    //   1336: getfield d : I
    //   1339: iadd
    //   1340: iload #4
    //   1342: isub
    //   1343: aload_0
    //   1344: getfield g : I
    //   1347: iload_2
    //   1348: iadd
    //   1349: aload_0
    //   1350: getfield c : Z
    //   1353: ifeq -> 1368
    //   1356: getstatic gz.a : Lgz;
    //   1359: getfield a : Lcp;
    //   1362: invokevirtual a : ()I
    //   1365: goto -> 1382
    //   1368: aload_0
    //   1369: getfield e : I
    //   1372: getstatic gz.a : Lgz;
    //   1375: getfield a : Lcp;
    //   1378: invokevirtual a : ()I
    //   1381: isub
    //   1382: iconst_2
    //   1383: idiv
    //   1384: iadd
    //   1385: bipush #24
    //   1387: aload_0
    //   1388: getfield a : Z
    //   1391: ifne -> 1398
    //   1394: iconst_1
    //   1395: goto -> 1399
    //   1398: iconst_0
    //   1399: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIIZ)V
    //   1402: goto -> 1565
    //   1405: getstatic gz.a : Lgz;
    //   1408: getfield b : Lcp;
    //   1411: aload_1
    //   1412: aload_0
    //   1413: getfield d : Ljava/lang/String;
    //   1416: aload_0
    //   1417: getfield f : I
    //   1420: iload_3
    //   1421: iadd
    //   1422: aload_0
    //   1423: getfield a : Ljavax/microedition/lcdui/Image;
    //   1426: ifnull -> 1451
    //   1429: aload_0
    //   1430: getfield a : Ljavax/microedition/lcdui/Image;
    //   1433: invokevirtual getWidth : ()I
    //   1436: getstatic gz.a : Lgz;
    //   1439: getfield a : Lcp;
    //   1442: invokevirtual a : ()I
    //   1445: iconst_2
    //   1446: idiv
    //   1447: iadd
    //   1448: goto -> 1452
    //   1451: iconst_0
    //   1452: iadd
    //   1453: getstatic gz.a : Lgz;
    //   1456: getfield a : Lcp;
    //   1459: invokevirtual a : ()I
    //   1462: iconst_2
    //   1463: idiv
    //   1464: iadd
    //   1465: aload_0
    //   1466: getfield g : Ljava/lang/String;
    //   1469: ifnull -> 1528
    //   1472: aload_0
    //   1473: getfield b : Z
    //   1476: ifeq -> 1488
    //   1479: getstatic gz.a : Lgz;
    //   1482: getfield b : Lcp;
    //   1485: goto -> 1494
    //   1488: getstatic gz.a : Lgz;
    //   1491: getfield a : Lcp;
    //   1494: aload_0
    //   1495: getfield g : Ljava/lang/String;
    //   1498: aload_0
    //   1499: getfield a : Z
    //   1502: ifne -> 1509
    //   1505: iconst_1
    //   1506: goto -> 1510
    //   1509: iconst_0
    //   1510: invokevirtual a : (Ljava/lang/String;Z)I
    //   1513: getstatic gz.a : Lgz;
    //   1516: getfield a : Lcp;
    //   1519: invokevirtual a : ()I
    //   1522: iconst_3
    //   1523: idiv
    //   1524: iadd
    //   1525: goto -> 1529
    //   1528: iconst_0
    //   1529: iadd
    //   1530: aload_0
    //   1531: getfield g : I
    //   1534: iload_2
    //   1535: iadd
    //   1536: getstatic gz.a : Lgz;
    //   1539: getfield a : Lcp;
    //   1542: invokevirtual a : ()I
    //   1545: iconst_2
    //   1546: idiv
    //   1547: iadd
    //   1548: bipush #20
    //   1550: aload_0
    //   1551: getfield a : Z
    //   1554: ifne -> 1561
    //   1557: iconst_1
    //   1558: goto -> 1562
    //   1561: iconst_0
    //   1562: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIIZ)V
    //   1565: aload_0
    //   1566: getfield b : Ljava/lang/String;
    //   1569: ifnull -> 1695
    //   1572: aload_1
    //   1573: aload_0
    //   1574: getfield k : Z
    //   1577: ifeq -> 1592
    //   1580: aload_0
    //   1581: getfield m : Z
    //   1584: ifeq -> 1592
    //   1587: ldc 16777215
    //   1589: goto -> 1594
    //   1592: ldc 5134694
    //   1594: invokevirtual setColor : (I)V
    //   1597: getstatic gz.a : Lgz;
    //   1600: getfield a : Lcp;
    //   1603: aload_1
    //   1604: aload_0
    //   1605: getfield b : Ljava/lang/String;
    //   1608: aload_0
    //   1609: getfield f : I
    //   1612: iload_3
    //   1613: iadd
    //   1614: aload_0
    //   1615: getfield a : Ljavax/microedition/lcdui/Image;
    //   1618: ifnull -> 1643
    //   1621: aload_0
    //   1622: getfield a : Ljavax/microedition/lcdui/Image;
    //   1625: invokevirtual getWidth : ()I
    //   1628: getstatic gz.a : Lgz;
    //   1631: getfield a : Lcp;
    //   1634: invokevirtual a : ()I
    //   1637: iconst_2
    //   1638: idiv
    //   1639: iadd
    //   1640: goto -> 1644
    //   1643: iconst_0
    //   1644: iadd
    //   1645: getstatic gz.a : Lgz;
    //   1648: getfield a : Lcp;
    //   1651: invokevirtual a : ()I
    //   1654: iconst_2
    //   1655: idiv
    //   1656: iadd
    //   1657: aload_0
    //   1658: getfield g : I
    //   1661: iload_2
    //   1662: iadd
    //   1663: getstatic gz.a : Lgz;
    //   1666: getfield a : Lcp;
    //   1669: invokevirtual a : ()I
    //   1672: bipush #7
    //   1674: imul
    //   1675: iconst_4
    //   1676: idiv
    //   1677: iadd
    //   1678: bipush #20
    //   1680: aload_0
    //   1681: getfield a : Z
    //   1684: ifne -> 1691
    //   1687: iconst_1
    //   1688: goto -> 1692
    //   1691: iconst_0
    //   1692: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIIZ)V
    //   1695: aload_0
    //   1696: getfield a : B
    //   1699: ifeq -> 1794
    //   1702: aload_1
    //   1703: aload_0
    //   1704: getfield a : B
    //   1707: iconst_1
    //   1708: if_icmpne -> 1740
    //   1711: aload_0
    //   1712: getfield m : Z
    //   1715: ifeq -> 1729
    //   1718: aload_0
    //   1719: getfield k : Z
    //   1722: ifeq -> 1729
    //   1725: iconst_1
    //   1726: goto -> 1730
    //   1729: iconst_0
    //   1730: aload_0
    //   1731: getfield e : Z
    //   1734: invokestatic a : (ZZ)Ljavax/microedition/lcdui/Image;
    //   1737: goto -> 1762
    //   1740: aload_0
    //   1741: getfield k : Z
    //   1744: ifeq -> 1758
    //   1747: aload_0
    //   1748: getfield m : Z
    //   1751: ifeq -> 1758
    //   1754: iconst_1
    //   1755: goto -> 1759
    //   1758: iconst_0
    //   1759: invokestatic b : (Z)Ljavax/microedition/lcdui/Image;
    //   1762: aload_0
    //   1763: getfield f : I
    //   1766: iload_3
    //   1767: iadd
    //   1768: aload_0
    //   1769: getfield d : I
    //   1772: iadd
    //   1773: iload #4
    //   1775: isub
    //   1776: aload_0
    //   1777: getfield g : I
    //   1780: iload_2
    //   1781: iadd
    //   1782: aload_0
    //   1783: getfield e : I
    //   1786: iconst_2
    //   1787: idiv
    //   1788: iadd
    //   1789: bipush #6
    //   1791: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   1794: aload_0
    //   1795: getfield k : Z
    //   1798: ifeq -> 1856
    //   1801: aload_0
    //   1802: getfield m : Z
    //   1805: ifeq -> 1856
    //   1808: aload_0
    //   1809: getfield b : Ljavax/microedition/lcdui/Image;
    //   1812: ifnull -> 1856
    //   1815: aload_1
    //   1816: aload_0
    //   1817: getfield b : Ljavax/microedition/lcdui/Image;
    //   1820: aload_0
    //   1821: getfield f : I
    //   1824: iload_3
    //   1825: iadd
    //   1826: getstatic gz.a : Lgz;
    //   1829: getfield a : Lcp;
    //   1832: invokevirtual a : ()I
    //   1835: iconst_2
    //   1836: idiv
    //   1837: iadd
    //   1838: aload_0
    //   1839: getfield g : I
    //   1842: iload_2
    //   1843: iadd
    //   1844: aload_0
    //   1845: getfield e : I
    //   1848: iconst_2
    //   1849: idiv
    //   1850: iadd
    //   1851: bipush #6
    //   1853: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   1856: aload_0
    //   1857: getfield k : Z
    //   1860: ifeq -> 1870
    //   1863: aload_0
    //   1864: getfield m : Z
    //   1867: ifne -> 1918
    //   1870: aload_0
    //   1871: getfield a : Ljavax/microedition/lcdui/Image;
    //   1874: ifnull -> 1918
    //   1877: aload_1
    //   1878: aload_0
    //   1879: getfield a : Ljavax/microedition/lcdui/Image;
    //   1882: aload_0
    //   1883: getfield f : I
    //   1886: iload_3
    //   1887: iadd
    //   1888: getstatic gz.a : Lgz;
    //   1891: getfield a : Lcp;
    //   1894: invokevirtual a : ()I
    //   1897: iconst_2
    //   1898: idiv
    //   1899: iadd
    //   1900: aload_0
    //   1901: getfield g : I
    //   1904: iload_2
    //   1905: iadd
    //   1906: aload_0
    //   1907: getfield e : I
    //   1910: iconst_2
    //   1911: idiv
    //   1912: iadd
    //   1913: bipush #6
    //   1915: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   1918: aload_0
    //   1919: getfield b : I
    //   1922: ifle -> 2250
    //   1925: aload_0
    //   1926: getfield f : Z
    //   1929: ifne -> 2109
    //   1932: aload_1
    //   1933: getstatic iv.b : [Ljavax/microedition/lcdui/Image;
    //   1936: aload_0
    //   1937: getfield b : I
    //   1940: iconst_1
    //   1941: isub
    //   1942: aaload
    //   1943: aload_0
    //   1944: getfield f : I
    //   1947: iload_3
    //   1948: iadd
    //   1949: aload_0
    //   1950: getfield a : Ljavax/microedition/lcdui/Image;
    //   1953: ifnull -> 1978
    //   1956: aload_0
    //   1957: getfield a : Ljavax/microedition/lcdui/Image;
    //   1960: invokevirtual getWidth : ()I
    //   1963: getstatic gz.a : Lgz;
    //   1966: getfield a : Lcp;
    //   1969: invokevirtual a : ()I
    //   1972: iconst_2
    //   1973: idiv
    //   1974: iadd
    //   1975: goto -> 1979
    //   1978: iconst_0
    //   1979: iadd
    //   1980: getstatic gz.a : Lgz;
    //   1983: getfield a : Lcp;
    //   1986: invokevirtual a : ()I
    //   1989: iconst_2
    //   1990: idiv
    //   1991: iadd
    //   1992: aload_0
    //   1993: getfield g : Ljava/lang/String;
    //   1996: ifnull -> 2055
    //   1999: aload_0
    //   2000: getfield b : Z
    //   2003: ifeq -> 2015
    //   2006: getstatic gz.a : Lgz;
    //   2009: getfield b : Lcp;
    //   2012: goto -> 2021
    //   2015: getstatic gz.a : Lgz;
    //   2018: getfield a : Lcp;
    //   2021: aload_0
    //   2022: getfield g : Ljava/lang/String;
    //   2025: aload_0
    //   2026: getfield a : Z
    //   2029: ifne -> 2036
    //   2032: iconst_1
    //   2033: goto -> 2037
    //   2036: iconst_0
    //   2037: invokevirtual a : (Ljava/lang/String;Z)I
    //   2040: getstatic gz.a : Lgz;
    //   2043: getfield a : Lcp;
    //   2046: invokevirtual a : ()I
    //   2049: iconst_3
    //   2050: idiv
    //   2051: iadd
    //   2052: goto -> 2056
    //   2055: iconst_0
    //   2056: iadd
    //   2057: aload_0
    //   2058: getfield g : I
    //   2061: iload_2
    //   2062: iadd
    //   2063: getstatic gz.a : Lgz;
    //   2066: getfield a : Lcp;
    //   2069: invokevirtual a : ()I
    //   2072: iconst_2
    //   2073: idiv
    //   2074: iadd
    //   2075: getstatic gz.a : Lgz;
    //   2078: getfield a : Lcp;
    //   2081: invokevirtual a : ()I
    //   2084: getstatic iv.b : [Ljavax/microedition/lcdui/Image;
    //   2087: aload_0
    //   2088: getfield b : I
    //   2091: iconst_1
    //   2092: isub
    //   2093: aaload
    //   2094: invokevirtual getHeight : ()I
    //   2097: isub
    //   2098: iconst_2
    //   2099: idiv
    //   2100: iadd
    //   2101: bipush #20
    //   2103: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   2106: goto -> 2250
    //   2109: aload_0
    //   2110: getfield a : Ljavax/microedition/lcdui/Image;
    //   2113: ifnonnull -> 2123
    //   2116: aload_0
    //   2117: getfield b : Ljavax/microedition/lcdui/Image;
    //   2120: ifnull -> 2250
    //   2123: aload_1
    //   2124: getstatic iv.a : [Ljavax/microedition/lcdui/Image;
    //   2127: aload_0
    //   2128: getfield b : I
    //   2131: iconst_1
    //   2132: isub
    //   2133: aaload
    //   2134: aload_0
    //   2135: getfield f : I
    //   2138: iload_3
    //   2139: iadd
    //   2140: getstatic gz.a : Lgz;
    //   2143: getfield a : Lcp;
    //   2146: invokevirtual a : ()I
    //   2149: iconst_2
    //   2150: idiv
    //   2151: iadd
    //   2152: getstatic iv.a : [Ljavax/microedition/lcdui/Image;
    //   2155: aload_0
    //   2156: getfield b : I
    //   2159: iconst_1
    //   2160: isub
    //   2161: aaload
    //   2162: invokevirtual getWidth : ()I
    //   2165: isub
    //   2166: aload_0
    //   2167: getfield a : Ljavax/microedition/lcdui/Image;
    //   2170: ifnull -> 2183
    //   2173: aload_0
    //   2174: getfield a : Ljavax/microedition/lcdui/Image;
    //   2177: invokevirtual getWidth : ()I
    //   2180: goto -> 2190
    //   2183: aload_0
    //   2184: getfield b : Ljavax/microedition/lcdui/Image;
    //   2187: invokevirtual getWidth : ()I
    //   2190: iadd
    //   2191: aload_0
    //   2192: getfield g : I
    //   2195: iload_2
    //   2196: iadd
    //   2197: aload_0
    //   2198: getfield e : I
    //   2201: iconst_2
    //   2202: idiv
    //   2203: iadd
    //   2204: aload_0
    //   2205: getfield a : Ljavax/microedition/lcdui/Image;
    //   2208: ifnull -> 2221
    //   2211: aload_0
    //   2212: getfield a : Ljavax/microedition/lcdui/Image;
    //   2215: invokevirtual getHeight : ()I
    //   2218: goto -> 2228
    //   2221: aload_0
    //   2222: getfield b : Ljavax/microedition/lcdui/Image;
    //   2225: invokevirtual getHeight : ()I
    //   2228: iconst_2
    //   2229: idiv
    //   2230: iadd
    //   2231: getstatic iv.a : [Ljavax/microedition/lcdui/Image;
    //   2234: aload_0
    //   2235: getfield b : I
    //   2238: iconst_1
    //   2239: isub
    //   2240: aaload
    //   2241: invokevirtual getHeight : ()I
    //   2244: isub
    //   2245: bipush #20
    //   2247: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   2250: aload_0
    //   2251: getfield a : B
    //   2254: iconst_1
    //   2255: if_icmpne -> 2262
    //   2258: aload_0
    //   2259: invokevirtual c : ()V
    //   2262: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/iv.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */