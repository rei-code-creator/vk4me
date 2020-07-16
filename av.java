final class av extends la {
  final ci a;
  
  private av(ci paramci, byte paramByte) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'title.interfaceSettings'
    //   3: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   6: invokespecial <init> : (Ljava/lang/String;)V
    //   9: aload_0
    //   10: aload_1
    //   11: putfield a : Lci;
    //   14: aload_0
    //   15: iconst_1
    //   16: invokevirtual a : (Z)Lla;
    //   19: pop
    //   20: aload_0
    //   21: ldc 'action.back'
    //   23: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   26: new ld
    //   29: dup
    //   30: aload_0
    //   31: invokespecial <init> : (Lav;)V
    //   34: iconst_1
    //   35: invokestatic a : (Lla;Ljava/lang/String;Ljava/lang/Runnable;Z)V
    //   38: aload_0
    //   39: getfield b : Ljava/util/Vector;
    //   42: new ak
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: dup
    //   50: astore_2
    //   51: iconst_0
    //   52: putfield n : Z
    //   55: aload_2
    //   56: invokevirtual addElement : (Ljava/lang/Object;)V
    //   59: aload_0
    //   60: getfield b : Ljava/util/Vector;
    //   63: new gg
    //   66: dup
    //   67: ldc 'settings.graphics'
    //   69: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   72: invokespecial <init> : (Ljava/lang/String;)V
    //   75: invokevirtual b : ()Lgg;
    //   78: dup
    //   79: astore_2
    //   80: iconst_1
    //   81: putfield r : Z
    //   84: aload_2
    //   85: invokevirtual addElement : (Ljava/lang/Object;)V
    //   88: aload_0
    //   89: getfield b : Ljava/util/Vector;
    //   92: new kh
    //   95: dup
    //   96: ldc 'settings.animations'
    //   98: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   101: invokespecial <init> : (Ljava/lang/String;)V
    //   104: getstatic ci.a : Lv;
    //   107: getfield e : Z
    //   110: invokevirtual b : (Z)Lr;
    //   113: dup
    //   114: astore_2
    //   115: iconst_1
    //   116: putfield n : Z
    //   119: aload_2
    //   120: invokevirtual addElement : (Ljava/lang/Object;)V
    //   123: aload_0
    //   124: getfield b : Ljava/util/Vector;
    //   127: new kj
    //   130: dup
    //   131: ldc 'settings.smoothScroll'
    //   133: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   136: invokespecial <init> : (Ljava/lang/String;)V
    //   139: getstatic ci.a : Lv;
    //   142: getfield f : Z
    //   145: invokevirtual b : (Z)Lr;
    //   148: dup
    //   149: astore_2
    //   150: iconst_1
    //   151: putfield n : Z
    //   154: aload_2
    //   155: invokevirtual addElement : (Ljava/lang/Object;)V
    //   158: aload_0
    //   159: getfield b : Ljava/util/Vector;
    //   162: new kf
    //   165: dup
    //   166: ldc 'settings.renderDimm'
    //   168: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   171: invokespecial <init> : (Ljava/lang/String;)V
    //   174: getstatic ci.a : Lv;
    //   177: getfield c : Z
    //   180: ifne -> 187
    //   183: iconst_1
    //   184: goto -> 188
    //   187: iconst_0
    //   188: invokevirtual b : (Z)Lr;
    //   191: dup
    //   192: astore_2
    //   193: iconst_1
    //   194: putfield n : Z
    //   197: aload_2
    //   198: invokevirtual addElement : (Ljava/lang/Object;)V
    //   201: aload_0
    //   202: getfield b : Ljava/util/Vector;
    //   205: new kg
    //   208: dup
    //   209: ldc 'settings.gradients'
    //   211: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   214: invokespecial <init> : (Ljava/lang/String;)V
    //   217: getstatic ci.a : Lv;
    //   220: getfield d : Z
    //   223: invokevirtual b : (Z)Lr;
    //   226: invokevirtual addElement : (Ljava/lang/Object;)V
    //   229: aload_0
    //   230: getfield b : Ljava/util/Vector;
    //   233: new ak
    //   236: dup
    //   237: invokespecial <init> : ()V
    //   240: dup
    //   241: astore_2
    //   242: iconst_1
    //   243: putfield p : Z
    //   246: aload_2
    //   247: dup
    //   248: astore_2
    //   249: iconst_0
    //   250: putfield n : Z
    //   253: aload_2
    //   254: invokevirtual addElement : (Ljava/lang/Object;)V
    //   257: aload_0
    //   258: getfield b : Ljava/util/Vector;
    //   261: new gg
    //   264: dup
    //   265: ldc 'settings.interfaceProfiles'
    //   267: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   270: invokespecial <init> : (Ljava/lang/String;)V
    //   273: invokevirtual b : ()Lgg;
    //   276: dup
    //   277: astore_2
    //   278: iconst_1
    //   279: putfield r : Z
    //   282: aload_2
    //   283: invokevirtual addElement : (Ljava/lang/Object;)V
    //   286: aload_0
    //   287: getfield b : Ljava/util/Vector;
    //   290: new gg
    //   293: dup
    //   294: ldc 'settings.cornerRadius'
    //   296: new java/lang/StringBuffer
    //   299: dup
    //   300: invokespecial <init> : ()V
    //   303: getstatic ci.a : Lv;
    //   306: getfield a : I
    //   309: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   312: ldc '%'
    //   314: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   317: invokevirtual toString : ()Ljava/lang/String;
    //   320: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   323: invokespecial <init> : (Ljava/lang/String;)V
    //   326: dup
    //   327: astore_2
    //   328: iconst_1
    //   329: putfield r : Z
    //   332: aload_2
    //   333: checkcast gg
    //   336: dup
    //   337: astore_2
    //   338: invokevirtual addElement : (Ljava/lang/Object;)V
    //   341: aload_0
    //   342: getfield b : Ljava/util/Vector;
    //   345: new kd
    //   348: dup
    //   349: getstatic ci.a : Lv;
    //   352: getfield a : I
    //   355: iconst_5
    //   356: idiv
    //   357: aload_2
    //   358: invokespecial <init> : (ILgg;)V
    //   361: ldc2_w 20
    //   364: invokevirtual b : (J)Lcj;
    //   367: invokevirtual addElement : (Ljava/lang/Object;)V
    //   370: aload_0
    //   371: getfield b : Ljava/util/Vector;
    //   374: new ke
    //   377: dup
    //   378: ldc 'settings.reverseProfilesNames'
    //   380: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   383: invokespecial <init> : (Ljava/lang/String;)V
    //   386: getstatic ci.a : Lv;
    //   389: getfield b : Z
    //   392: invokevirtual b : (Z)Lr;
    //   395: invokevirtual addElement : (Ljava/lang/Object;)V
    //   398: aload_0
    //   399: getfield b : Ljava/util/Vector;
    //   402: new ak
    //   405: dup
    //   406: invokespecial <init> : ()V
    //   409: dup
    //   410: astore_2
    //   411: iconst_1
    //   412: putfield p : Z
    //   415: aload_2
    //   416: dup
    //   417: astore_2
    //   418: iconst_0
    //   419: putfield n : Z
    //   422: aload_2
    //   423: invokevirtual addElement : (Ljava/lang/Object;)V
    //   426: aload_0
    //   427: getfield b : Ljava/util/Vector;
    //   430: new gg
    //   433: dup
    //   434: ldc 'settings.dialogsInterface'
    //   436: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   439: invokespecial <init> : (Ljava/lang/String;)V
    //   442: invokevirtual b : ()Lgg;
    //   445: dup
    //   446: astore_2
    //   447: iconst_1
    //   448: putfield r : Z
    //   451: aload_2
    //   452: invokevirtual addElement : (Ljava/lang/Object;)V
    //   455: aload_0
    //   456: getfield b : Ljava/util/Vector;
    //   459: new jz
    //   462: dup
    //   463: ldc 'settings.drawMessagesBorder'
    //   465: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   468: invokespecial <init> : (Ljava/lang/String;)V
    //   471: getstatic ci.a : Lv;
    //   474: getfield a : Z
    //   477: invokevirtual b : (Z)Lr;
    //   480: dup
    //   481: astore_2
    //   482: iconst_1
    //   483: putfield n : Z
    //   486: aload_2
    //   487: invokevirtual addElement : (Ljava/lang/Object;)V
    //   490: aload_0
    //   491: getfield b : Ljava/util/Vector;
    //   494: new kb
    //   497: dup
    //   498: ldc 'settings.lisHeader'
    //   500: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   503: invokespecial <init> : (Ljava/lang/String;)V
    //   506: getstatic ci.a : Lv;
    //   509: getfield i : Z
    //   512: invokevirtual b : (Z)Lr;
    //   515: invokevirtual addElement : (Ljava/lang/Object;)V
    //   518: invokestatic c : ()Z
    //   521: ifeq -> 644
    //   524: aload_0
    //   525: getfield b : Ljava/util/Vector;
    //   528: new ak
    //   531: dup
    //   532: invokespecial <init> : ()V
    //   535: dup
    //   536: astore_2
    //   537: iconst_1
    //   538: putfield p : Z
    //   541: aload_2
    //   542: dup
    //   543: astore_2
    //   544: iconst_0
    //   545: putfield n : Z
    //   548: aload_2
    //   549: invokevirtual addElement : (Ljava/lang/Object;)V
    //   552: aload_0
    //   553: getfield b : Ljava/util/Vector;
    //   556: new gg
    //   559: dup
    //   560: ldc 'settings.debugging'
    //   562: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   565: invokespecial <init> : (Ljava/lang/String;)V
    //   568: invokevirtual b : ()Lgg;
    //   571: dup
    //   572: astore_2
    //   573: iconst_1
    //   574: putfield r : Z
    //   577: aload_2
    //   578: invokevirtual addElement : (Ljava/lang/Object;)V
    //   581: aload_0
    //   582: getfield b : Ljava/util/Vector;
    //   585: new fm
    //   588: dup
    //   589: ldc 'settings.drawFPS'
    //   591: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   594: invokespecial <init> : (Ljava/lang/String;)V
    //   597: getstatic ci.a : Lv;
    //   600: getfield g : Z
    //   603: invokevirtual b : (Z)Lr;
    //   606: dup
    //   607: astore_2
    //   608: iconst_1
    //   609: putfield n : Z
    //   612: aload_2
    //   613: invokevirtual addElement : (Ljava/lang/Object;)V
    //   616: aload_0
    //   617: getfield b : Ljava/util/Vector;
    //   620: new fn
    //   623: dup
    //   624: ldc 'settings.drawEmojiRed'
    //   626: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   629: invokespecial <init> : (Ljava/lang/String;)V
    //   632: getstatic ci.a : Lv;
    //   635: getfield h : Z
    //   638: invokevirtual b : (Z)Lr;
    //   641: invokevirtual addElement : (Ljava/lang/Object;)V
    //   644: aload_0
    //   645: astore_1
    //   646: getstatic gz.a : Lgz;
    //   649: aload_1
    //   650: invokevirtual b : (Lla;)V
    //   653: return
  }
  
  av(ci paramci) {
    this(paramci, (byte)0);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/av.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */