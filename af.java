import java.util.Timer;
import java.util.TimerTask;
import ru.curoviyxru.phoenix.midlet.Midlet;

public final class af extends TimerTask {
  private static Timer a;
  
  private static int a;
  
  private String a;
  
  private String b;
  
  public static void a(boolean paramBoolean) {
    try {
      if (a != null)
        a.cancel(); 
    } catch (Exception exception) {}
    try {
      if (!paramBoolean && fy.a != null)
        a(); 
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  private static void b() {
    a(false);
  }
  
  public static void a() {
    af af1 = new af();
    boolean bool;
    if (bool = (a == null) ? true : false)
      a = v.a(); 
    dl dl;
    if ((dl = (dl)(new ko(a)).a(1000000).a()) != null) {
      dl dl1;
      if (((dl1 = dl).a != null && dl1.a.a.size() > 0))
        a(dl.a, bool); 
    } else {
      a(false);
      return;
    } 
    ac ac;
    if ((ac = (ac)(new kv()).a()) != null && ac.a()) {
      a = ac.a;
      af1.a = ac.b;
      af1.b = ac.a;
      v.a(a);
      (a = (String)new Timer()).schedule(af1, 0L, 2000L);
      return;
    } 
    b();
  }
  
  public final void run() {
    String str;
    if (ab.a(str = hk.b((fy.e().startsWith("http:") ? "http://" : "https://") + this.b + "?act=a_check&key=" + this.a + "&ts=" + a + "&wait=2&mode=202&version=3"))) {
      b();
      return;
    } 
    try {
      bj bj;
      int i;
      if ((i = (bj = new bj(str)).a("failed")) == 2 || i == 3 || i == 4) {
        b();
        return;
      } 
      if ((i = bj.a("ts")) != 0)
        v.a(a = i); 
      at at = bj.a("updates");
      try {
        a(at, false);
      } catch (Exception exception) {}
      if (Midlet.a.a != null)
        try {
          Thread.sleep(10000L);
          return;
        } catch (Exception exception) {} 
      return;
    } catch (Exception exception) {
      b();
      return;
    } 
  }
  
  private static void a(at paramat, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 5
    //   4: return
    //   5: iconst_0
    //   6: istore_2
    //   7: iload_2
    //   8: aload_0
    //   9: getfield a : Ljava/util/Vector;
    //   12: invokevirtual size : ()I
    //   15: if_icmpge -> 1194
    //   18: aload_0
    //   19: iload_2
    //   20: invokevirtual a : (I)Lat;
    //   23: dup
    //   24: astore_3
    //   25: ifnull -> 1188
    //   28: aload_3
    //   29: iconst_0
    //   30: invokevirtual a : (I)I
    //   33: lookupswitch default -> 1188, 1 -> 140, 2 -> 140, 4 -> 486, 5 -> 796, 6 -> 1035, 7 -> 1051, 8 -> 1054, 9 -> 1054, 61 -> 1137, 62 -> 1153, 63 -> 1169, 114 -> 1188
    //   140: aload_3
    //   141: iconst_2
    //   142: invokevirtual a : (I)I
    //   145: dup
    //   146: istore #4
    //   148: ldc 131072
    //   150: iand
    //   151: ldc 131072
    //   153: if_icmpeq -> 168
    //   156: iload #4
    //   158: sipush #128
    //   161: iand
    //   162: sipush #128
    //   165: if_icmpne -> 1188
    //   168: aload_3
    //   169: iconst_1
    //   170: invokevirtual a : (I)I
    //   173: aload_3
    //   174: iconst_3
    //   175: invokevirtual a : (I)I
    //   178: istore #5
    //   180: istore #4
    //   182: getstatic bc.a : Lbc;
    //   185: ifnull -> 407
    //   188: invokestatic e : ()V
    //   191: getstatic bc.a : Lbc;
    //   194: iconst_1
    //   195: putfield a : Z
    //   198: iload #5
    //   200: invokestatic a : (I)Lkn;
    //   203: dup
    //   204: astore #6
    //   206: iload #4
    //   208: invokevirtual a : (I)Lkn;
    //   211: pop
    //   212: aload #6
    //   214: getfield a : Ljava/util/Vector;
    //   217: invokevirtual isEmpty : ()Z
    //   220: ifne -> 250
    //   223: aload #6
    //   225: getfield a : Ljava/util/Vector;
    //   228: aload #6
    //   230: getfield a : Ljava/util/Vector;
    //   233: invokevirtual size : ()I
    //   236: iconst_1
    //   237: isub
    //   238: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   241: checkcast java/lang/Integer
    //   244: invokevirtual intValue : ()I
    //   247: goto -> 251
    //   250: iconst_m1
    //   251: dup
    //   252: istore #7
    //   254: iconst_m1
    //   255: if_icmpne -> 307
    //   258: new s
    //   261: dup
    //   262: iload #5
    //   264: invokespecial <init> : (I)V
    //   267: invokevirtual a : ()Laj;
    //   270: checkcast jw
    //   273: dup
    //   274: astore #5
    //   276: ifnull -> 301
    //   279: aload #5
    //   281: invokevirtual b : ()Z
    //   284: ifeq -> 297
    //   287: aload #5
    //   289: getfield a : [Lbw;
    //   292: iconst_0
    //   293: aaload
    //   294: goto -> 302
    //   297: aconst_null
    //   298: goto -> 302
    //   301: aconst_null
    //   302: astore #8
    //   304: goto -> 342
    //   307: new y
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: iload #7
    //   316: invokevirtual a : (I)Ly;
    //   319: invokevirtual a : ()Laj;
    //   322: checkcast ho
    //   325: dup
    //   326: astore #5
    //   328: ifnull -> 339
    //   331: aload #5
    //   333: invokevirtual a : ()Lbw;
    //   336: goto -> 340
    //   339: aconst_null
    //   340: astore #8
    //   342: aload #8
    //   344: ifnonnull -> 397
    //   347: aload #6
    //   349: getfield h : I
    //   352: iload #4
    //   354: if_icmpne -> 391
    //   357: aload #6
    //   359: dup
    //   360: astore #6
    //   362: iconst_0
    //   363: putfield j : I
    //   366: aload #6
    //   368: iconst_0
    //   369: putfield h : I
    //   372: aload #6
    //   374: invokevirtual g : ()V
    //   377: aload #6
    //   379: ldc 'element.messageDeleted'
    //   381: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   384: invokevirtual c : (Ljava/lang/String;)Lr;
    //   387: iconst_0
    //   388: putfield q : Z
    //   391: invokestatic d : ()V
    //   394: goto -> 407
    //   397: aload #6
    //   399: aload #8
    //   401: invokestatic a : (Lkn;Lbw;)V
    //   404: invokestatic d : ()V
    //   407: aload_3
    //   408: iconst_1
    //   409: invokevirtual a : (I)I
    //   412: aload_3
    //   413: iconst_3
    //   414: invokevirtual a : (I)I
    //   417: istore #5
    //   419: istore #4
    //   421: getstatic gz.a : Lgz;
    //   424: getfield a : Lla;
    //   427: dup
    //   428: astore #6
    //   430: ifnull -> 483
    //   433: aload #6
    //   435: instanceof hs
    //   438: ifeq -> 483
    //   441: aload #6
    //   443: checkcast hs
    //   446: dup
    //   447: astore #7
    //   449: getfield a : Lis;
    //   452: invokevirtual a : ()I
    //   455: iload #5
    //   457: if_icmpne -> 483
    //   460: aload #7
    //   462: invokevirtual e : ()V
    //   465: aload #7
    //   467: aload #7
    //   469: iload #4
    //   471: invokevirtual a : (I)[I
    //   474: invokevirtual a : ([I)Z
    //   477: ifeq -> 483
    //   480: invokestatic f : ()V
    //   483: goto -> 1188
    //   486: aload_3
    //   487: iconst_1
    //   488: invokevirtual a : (I)I
    //   491: aload_3
    //   492: iconst_3
    //   493: invokevirtual a : (I)I
    //   496: istore #5
    //   498: istore #4
    //   500: getstatic bc.a : Lbc;
    //   503: ifnull -> 776
    //   506: invokestatic e : ()V
    //   509: getstatic bc.a : Lbc;
    //   512: iconst_1
    //   513: putfield a : Z
    //   516: new y
    //   519: dup
    //   520: invokespecial <init> : ()V
    //   523: iload #4
    //   525: invokevirtual a : (I)Ly;
    //   528: invokevirtual a : ()Laj;
    //   531: checkcast ho
    //   534: dup
    //   535: astore #7
    //   537: ifnull -> 548
    //   540: aload #7
    //   542: invokevirtual a : ()Lbw;
    //   545: goto -> 549
    //   548: aconst_null
    //   549: dup
    //   550: astore #8
    //   552: ifnull -> 773
    //   555: iload #5
    //   557: invokestatic a : (I)Lkn;
    //   560: astore #5
    //   562: aload #8
    //   564: getfield a : Z
    //   567: ifne -> 660
    //   570: aload #5
    //   572: aload #8
    //   574: getfield a : I
    //   577: istore #6
    //   579: dup
    //   580: astore #7
    //   582: getfield a : Ljava/util/Vector;
    //   585: new java/lang/Integer
    //   588: dup
    //   589: iload #6
    //   591: invokespecial <init> : (I)V
    //   594: invokevirtual indexOf : (Ljava/lang/Object;)I
    //   597: iconst_m1
    //   598: if_icmpne -> 618
    //   601: aload #7
    //   603: getfield a : Ljava/util/Vector;
    //   606: new java/lang/Integer
    //   609: dup
    //   610: iload #6
    //   612: invokespecial <init> : (I)V
    //   615: invokevirtual addElement : (Ljava/lang/Object;)V
    //   618: aload #7
    //   620: invokevirtual g : ()V
    //   623: invokestatic d : ()V
    //   626: iload_1
    //   627: ifne -> 660
    //   630: getstatic v.a : Lv;
    //   633: getfield k : Z
    //   636: ifeq -> 648
    //   639: getstatic gz.a : Ljavax/microedition/lcdui/Display;
    //   642: bipush #100
    //   644: invokevirtual vibrate : (I)Z
    //   647: pop
    //   648: getstatic v.a : Lv;
    //   651: getfield l : Z
    //   654: ifeq -> 660
    //   657: invokestatic e : ()V
    //   660: aload #5
    //   662: getfield q : Z
    //   665: ifeq -> 714
    //   668: new bn
    //   671: dup
    //   672: invokespecial <init> : ()V
    //   675: aload #5
    //   677: getfield i : I
    //   680: invokevirtual a : (I)Lbn;
    //   683: invokevirtual a : ()Laj;
    //   686: checkcast lc
    //   689: dup
    //   690: astore #6
    //   692: ifnull -> 703
    //   695: aload #6
    //   697: invokevirtual a : ()Lis;
    //   700: goto -> 704
    //   703: aconst_null
    //   704: astore #6
    //   706: aload #5
    //   708: aload #6
    //   710: invokevirtual a : (Lis;)Lkn;
    //   713: pop
    //   714: aload #5
    //   716: getfield h : I
    //   719: iload #4
    //   721: if_icmpge -> 731
    //   724: aload #5
    //   726: aload #8
    //   728: invokestatic a : (Lkn;Lbw;)V
    //   731: aload #5
    //   733: astore #7
    //   735: getstatic bc.a : Lbc;
    //   738: ifnull -> 746
    //   741: aload #7
    //   743: ifnonnull -> 749
    //   746: goto -> 773
    //   749: getstatic bc.a : Lbc;
    //   752: getfield b : Ljava/util/Vector;
    //   755: aload #7
    //   757: invokevirtual removeElement : (Ljava/lang/Object;)Z
    //   760: pop
    //   761: getstatic bc.a : Lbc;
    //   764: getfield b : Ljava/util/Vector;
    //   767: aload #7
    //   769: iconst_1
    //   770: invokevirtual insertElementAt : (Ljava/lang/Object;I)V
    //   773: invokestatic d : ()V
    //   776: iload_1
    //   777: ifne -> 1188
    //   780: aload_3
    //   781: iconst_1
    //   782: invokevirtual a : (I)I
    //   785: aload_3
    //   786: iconst_3
    //   787: invokevirtual a : (I)I
    //   790: invokestatic e : (II)V
    //   793: goto -> 1188
    //   796: aload_3
    //   797: iconst_1
    //   798: invokevirtual a : (I)I
    //   801: aload_3
    //   802: iconst_3
    //   803: invokevirtual a : (I)I
    //   806: istore #5
    //   808: istore #4
    //   810: getstatic bc.a : Lbc;
    //   813: ifnull -> 891
    //   816: invokestatic e : ()V
    //   819: getstatic bc.a : Lbc;
    //   822: iconst_1
    //   823: putfield a : Z
    //   826: iload #5
    //   828: invokestatic a : (I)Lkn;
    //   831: dup
    //   832: astore #6
    //   834: getfield h : I
    //   837: iload #4
    //   839: if_icmpne -> 888
    //   842: new y
    //   845: dup
    //   846: invokespecial <init> : ()V
    //   849: iload #4
    //   851: invokevirtual a : (I)Ly;
    //   854: invokevirtual a : ()Laj;
    //   857: checkcast ho
    //   860: dup
    //   861: astore #7
    //   863: ifnull -> 874
    //   866: aload #7
    //   868: invokevirtual a : ()Lbw;
    //   871: goto -> 875
    //   874: aconst_null
    //   875: dup
    //   876: astore #8
    //   878: ifnull -> 888
    //   881: aload #6
    //   883: aload #8
    //   885: invokestatic a : (Lkn;Lbw;)V
    //   888: invokestatic d : ()V
    //   891: aload_3
    //   892: iconst_1
    //   893: invokevirtual a : (I)I
    //   896: aload_3
    //   897: iconst_3
    //   898: invokevirtual a : (I)I
    //   901: istore #5
    //   903: istore #4
    //   905: getstatic gz.a : Lgz;
    //   908: getfield a : Lla;
    //   911: dup
    //   912: astore #6
    //   914: ifnull -> 1032
    //   917: aload #6
    //   919: instanceof hs
    //   922: ifeq -> 1032
    //   925: aload #6
    //   927: checkcast hs
    //   930: dup
    //   931: astore #7
    //   933: getfield a : Lis;
    //   936: invokevirtual a : ()I
    //   939: iload #5
    //   941: if_icmpne -> 1032
    //   944: aload #7
    //   946: invokevirtual e : ()V
    //   949: new y
    //   952: dup
    //   953: invokespecial <init> : ()V
    //   956: iload #4
    //   958: invokevirtual a : (I)Ly;
    //   961: invokevirtual a : ()Laj;
    //   964: checkcast ho
    //   967: dup
    //   968: astore #8
    //   970: ifnull -> 1032
    //   973: aload #8
    //   975: invokevirtual b : ()Z
    //   978: ifeq -> 1032
    //   981: aload #8
    //   983: invokevirtual a : ()Lbw;
    //   986: astore #5
    //   988: aload #7
    //   990: aload #5
    //   992: getfield a : I
    //   995: invokevirtual a : (I)[I
    //   998: astore #6
    //   1000: aload #7
    //   1002: aload #6
    //   1004: invokevirtual a : ([I)Z
    //   1007: ifeq -> 1032
    //   1010: aload #7
    //   1012: aload #6
    //   1014: iconst_0
    //   1015: iaload
    //   1016: aload #7
    //   1018: aload #8
    //   1020: invokevirtual a : ()Lbw;
    //   1023: invokevirtual a : (Lbw;)Ljava/util/Vector;
    //   1026: invokevirtual a : (ILjava/util/Vector;)V
    //   1029: invokestatic f : ()V
    //   1032: goto -> 1188
    //   1035: aload_3
    //   1036: iconst_1
    //   1037: invokevirtual a : (I)I
    //   1040: aload_3
    //   1041: iconst_2
    //   1042: invokevirtual a : (I)I
    //   1045: invokestatic d : (II)V
    //   1048: goto -> 1188
    //   1051: goto -> 1188
    //   1054: aload_3
    //   1055: iconst_1
    //   1056: invokevirtual a : (I)I
    //   1059: ineg
    //   1060: istore #4
    //   1062: getstatic bc.a : Lbc;
    //   1065: ifnull -> 1134
    //   1068: invokestatic e : ()V
    //   1071: getstatic bc.a : Lbc;
    //   1074: iconst_1
    //   1075: putfield a : Z
    //   1078: iload #4
    //   1080: invokestatic a : (I)Lkn;
    //   1083: astore #5
    //   1085: new bn
    //   1088: dup
    //   1089: invokespecial <init> : ()V
    //   1092: aload #5
    //   1094: getfield i : I
    //   1097: invokevirtual a : (I)Lbn;
    //   1100: invokevirtual a : ()Laj;
    //   1103: checkcast lc
    //   1106: dup
    //   1107: astore #6
    //   1109: ifnull -> 1120
    //   1112: aload #6
    //   1114: invokevirtual a : ()Lis;
    //   1117: goto -> 1121
    //   1120: aconst_null
    //   1121: astore #7
    //   1123: aload #5
    //   1125: aload #7
    //   1127: invokevirtual a : (Lis;)Lkn;
    //   1130: pop
    //   1131: invokestatic d : ()V
    //   1134: goto -> 1188
    //   1137: aload_3
    //   1138: iconst_1
    //   1139: invokevirtual a : (I)I
    //   1142: aload_3
    //   1143: iconst_1
    //   1144: invokevirtual a : (I)I
    //   1147: invokestatic d : (II)V
    //   1150: goto -> 1188
    //   1153: aload_3
    //   1154: iconst_2
    //   1155: invokevirtual a : (I)I
    //   1158: aload_3
    //   1159: iconst_1
    //   1160: invokevirtual a : (I)I
    //   1163: invokestatic d : (II)V
    //   1166: goto -> 1188
    //   1169: aload_3
    //   1170: iconst_1
    //   1171: invokevirtual a : (I)Lat;
    //   1174: aload_3
    //   1175: iconst_2
    //   1176: invokevirtual a : (I)I
    //   1179: aload_3
    //   1180: iconst_4
    //   1181: invokevirtual a : (I)I
    //   1184: pop
    //   1185: invokestatic a : (Lat;I)V
    //   1188: iinc #2, 1
    //   1191: goto -> 7
    //   1194: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/af.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */