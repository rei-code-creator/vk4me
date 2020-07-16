public final class bw extends da {
  private static jx a;
  
  public int a;
  
  private int d;
  
  private int e;
  
  public int b;
  
  public int c;
  
  public dv[] a;
  
  public boolean a;
  
  public bw[] a;
  
  public bw a;
  
  public ku a;
  
  public String a;
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    this.e = parambj.a("update_time");
    this.a = parambj.a("id");
    this.a = b(parambj.a("out"));
    parambj.a("conversation_message_id");
    parambj.b("is_hidden");
    this.d = parambj.a("date");
    this.b = parambj.a("peer_id");
    this.c = parambj.a("from_id");
    this.a = parambj.a("text");
    if (this.a != null) {
      String str3 = "$0";
      String str2 = this.a;
      String str1 = a;
      StringBuffer stringBuffer = new StringBuffer();
      int i = 0;
      int j = str2.length();
      while (i < j && str1.a(str2, i)) {
        stringBuffer.append(str2.substring(i, str1.a(0)));
        int k = 0;
        int m = -2;
        int n = str3.length();
        while ((k = str3.indexOf("$", k)) >= 0) {
          char c;
          if ((k == 0 || str3.charAt(k - 1) != '\\') && k + 1 < n && (c = str3.charAt(k + 1)) >= '0' && c <= '9') {
            stringBuffer.append(str3.substring(m + 2, k));
            int i1 = c - 48;
            String str = str1;
            int i2 = str.b(i1);
            i1 = i2;
            if ((str = (String)((i1 < ((jx)str).a && (i2 = str.a(i1)) >= 0) ? ((cl)((jx)str).a).a.substring(i1, i2) : null)) != null)
              stringBuffer.append((((jx)str1).a != null) ? str.substring((str = str).indexOf('|') + 1, str.length() - 1) : str); 
            m = k;
          } 
          k++;
        } 
        stringBuffer.append(str3.substring(m + 2, n));
        if ((k = str1.b(0)) == i)
          k++; 
        i = k;
      } 
      if (i < j)
        stringBuffer.append(str2.substring(i)); 
      this.a = stringBuffer.toString();
    } 
    parambj.a("random_id");
    at at;
    if ((at = parambj.a("attachments")) != null) {
      this.a = (String)new dv[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj2;
        if ((bj2 = at.a(b)) != null)
          this.a[b] = (String)dv.a(bj2); 
      } 
    } 
    parambj.b("important");
    if ((at = parambj.a("fwd_messages")) != null) {
      this.a = (String)new bw[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj2;
        if ((bj2 = at.a(b)) != null)
          this.a[b] = (String)(new bw()).a(bj2); 
      } 
    } 
    bj bj1;
    if ((bj1 = parambj.a("reply_message")) != null)
      this.a = (String)(new bw()).a(bj1); 
    if ((bj1 = parambj.a("action")) != null)
      this.a = (String)(new ku()).a(bj1); 
    return this;
  }
  
  public final boolean a() {
    return (this.a != null && !ab.a(((ku)this.a).b));
  }
  
  public final boolean b() {
    return (this.a != null && this.a.length > 0);
  }
  
  public final boolean c() {
    return (this.a != null);
  }
  
  public final String a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5) {
    // Byte code:
    //   0: ldc ''
    //   2: astore #6
    //   4: iload_1
    //   5: ifeq -> 154
    //   8: aload_0
    //   9: getfield c : I
    //   12: invokestatic a : (I)Llb;
    //   15: astore #7
    //   17: iload_2
    //   18: ifne -> 87
    //   21: new java/lang/StringBuffer
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: aload #6
    //   30: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   33: aload_0
    //   34: getfield a : Z
    //   37: ifeq -> 45
    //   40: ldc 'Вы'
    //   42: goto -> 76
    //   45: aload #7
    //   47: ifnull -> 74
    //   50: iload_3
    //   51: ifeq -> 64
    //   54: aload #7
    //   56: ldc 'nom'
    //   58: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   61: goto -> 76
    //   64: aload #7
    //   66: ldc 'nom'
    //   68: invokevirtual b : (Ljava/lang/String;)Ljava/lang/String;
    //   71: goto -> 76
    //   74: ldc '*Без имени*'
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   79: invokevirtual toString : ()Ljava/lang/String;
    //   82: astore #6
    //   84: goto -> 121
    //   87: new java/lang/StringBuffer
    //   90: dup
    //   91: invokespecial <init> : ()V
    //   94: aload #6
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   99: aload_0
    //   100: getfield a : Z
    //   103: ifeq -> 111
    //   106: ldc 'Вы'
    //   108: goto -> 113
    //   111: ldc ''
    //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   116: invokevirtual toString : ()Ljava/lang/String;
    //   119: astore #6
    //   121: iload_2
    //   122: ifeq -> 132
    //   125: aload_0
    //   126: getfield a : Z
    //   129: ifeq -> 154
    //   132: new java/lang/StringBuffer
    //   135: dup
    //   136: invokespecial <init> : ()V
    //   139: aload #6
    //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   144: ldc ': '
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   149: invokevirtual toString : ()Ljava/lang/String;
    //   152: astore #6
    //   154: aload_0
    //   155: invokevirtual a : ()Z
    //   158: ifeq -> 1658
    //   161: aload_0
    //   162: getfield c : I
    //   165: invokestatic a : (I)Llb;
    //   168: astore #7
    //   170: ldc ''
    //   172: astore_2
    //   173: aload_0
    //   174: getfield a : Lku;
    //   177: getfield a : I
    //   180: aload_0
    //   181: getfield c : I
    //   184: if_icmpne -> 191
    //   187: iconst_1
    //   188: goto -> 192
    //   191: iconst_0
    //   192: istore #4
    //   194: iload_1
    //   195: ifeq -> 267
    //   198: new java/lang/StringBuffer
    //   201: dup
    //   202: invokespecial <init> : ()V
    //   205: aload_2
    //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   209: aload #7
    //   211: ifnull -> 238
    //   214: iload_3
    //   215: ifne -> 228
    //   218: aload #7
    //   220: ldc 'nom'
    //   222: invokevirtual b : (Ljava/lang/String;)Ljava/lang/String;
    //   225: goto -> 240
    //   228: aload #7
    //   230: ldc 'nom'
    //   232: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
    //   235: goto -> 240
    //   238: ldc '*Без имени*'
    //   240: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   243: invokevirtual toString : ()Ljava/lang/String;
    //   246: astore_2
    //   247: new java/lang/StringBuffer
    //   250: dup
    //   251: invokespecial <init> : ()V
    //   254: aload_2
    //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   258: ldc ' '
    //   260: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   263: invokevirtual toString : ()Ljava/lang/String;
    //   266: astore_2
    //   267: aload_0
    //   268: getfield a : Lku;
    //   271: getfield b : Ljava/lang/String;
    //   274: ldc 'chat_create'
    //   276: invokevirtual equals : (Ljava/lang/Object;)Z
    //   279: ifeq -> 383
    //   282: new java/lang/StringBuffer
    //   285: dup
    //   286: invokespecial <init> : ()V
    //   289: aload_2
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   293: ldc 'создал'
    //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   298: invokevirtual toString : ()Ljava/lang/String;
    //   301: astore_2
    //   302: aload #7
    //   304: ifnull -> 357
    //   307: new java/lang/StringBuffer
    //   310: dup
    //   311: invokespecial <init> : ()V
    //   314: aload_2
    //   315: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   318: aload #7
    //   320: getfield d : Z
    //   323: ifeq -> 331
    //   326: ldc 'о'
    //   328: goto -> 350
    //   331: aload #7
    //   333: checkcast bi
    //   336: getfield b : I
    //   339: iconst_1
    //   340: if_icmpne -> 348
    //   343: ldc 'а'
    //   345: goto -> 350
    //   348: ldc ''
    //   350: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   353: invokevirtual toString : ()Ljava/lang/String;
    //   356: astore_2
    //   357: new java/lang/StringBuffer
    //   360: dup
    //   361: invokespecial <init> : ()V
    //   364: aload_2
    //   365: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   368: ldc ' беседу "'
    //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   373: aload_0
    //   374: getfield a : Lku;
    //   377: getfield a : Ljava/lang/String;
    //   380: goto -> 1644
    //   383: aload_0
    //   384: getfield a : Lku;
    //   387: getfield b : Ljava/lang/String;
    //   390: ldc 'chat_invite_user'
    //   392: invokevirtual equals : (Ljava/lang/Object;)Z
    //   395: ifeq -> 632
    //   398: new java/lang/StringBuffer
    //   401: dup
    //   402: invokespecial <init> : ()V
    //   405: aload_2
    //   406: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   409: iload #4
    //   411: ifeq -> 419
    //   414: ldc 'присоединил'
    //   416: goto -> 421
    //   419: ldc 'пригласил'
    //   421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   424: invokevirtual toString : ()Ljava/lang/String;
    //   427: astore_2
    //   428: aload #7
    //   430: ifnull -> 541
    //   433: iload #4
    //   435: ifne -> 491
    //   438: new java/lang/StringBuffer
    //   441: dup
    //   442: invokespecial <init> : ()V
    //   445: aload_2
    //   446: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   449: aload #7
    //   451: getfield d : Z
    //   454: ifeq -> 462
    //   457: ldc 'о'
    //   459: goto -> 481
    //   462: aload #7
    //   464: checkcast bi
    //   467: getfield b : I
    //   470: iconst_1
    //   471: if_icmpne -> 479
    //   474: ldc 'а'
    //   476: goto -> 481
    //   479: ldc ''
    //   481: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   484: invokevirtual toString : ()Ljava/lang/String;
    //   487: astore_2
    //   488: goto -> 541
    //   491: new java/lang/StringBuffer
    //   494: dup
    //   495: invokespecial <init> : ()V
    //   498: aload_2
    //   499: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   502: aload #7
    //   504: getfield d : Z
    //   507: ifeq -> 515
    //   510: ldc 'ось'
    //   512: goto -> 534
    //   515: aload #7
    //   517: checkcast bi
    //   520: getfield b : I
    //   523: iconst_1
    //   524: if_icmpne -> 532
    //   527: ldc 'ась'
    //   529: goto -> 534
    //   532: ldc 'ся'
    //   534: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   537: invokevirtual toString : ()Ljava/lang/String;
    //   540: astore_2
    //   541: iload #4
    //   543: ifne -> 609
    //   546: aload_0
    //   547: getfield a : Lku;
    //   550: getfield a : I
    //   553: invokestatic a : (I)Llb;
    //   556: dup
    //   557: astore #7
    //   559: ifnull -> 1656
    //   562: new java/lang/StringBuffer
    //   565: dup
    //   566: invokespecial <init> : ()V
    //   569: aload_2
    //   570: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   573: ldc ' '
    //   575: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   578: iload_3
    //   579: ifeq -> 592
    //   582: aload #7
    //   584: ldc 'acc'
    //   586: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
    //   589: goto -> 599
    //   592: aload #7
    //   594: ldc 'acc'
    //   596: invokevirtual b : (Ljava/lang/String;)Ljava/lang/String;
    //   599: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   602: invokevirtual toString : ()Ljava/lang/String;
    //   605: astore_2
    //   606: goto -> 1656
    //   609: new java/lang/StringBuffer
    //   612: dup
    //   613: invokespecial <init> : ()V
    //   616: aload_2
    //   617: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   620: ldc ' к беседе'
    //   622: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   625: invokevirtual toString : ()Ljava/lang/String;
    //   628: astore_2
    //   629: goto -> 1656
    //   632: aload_0
    //   633: getfield a : Lku;
    //   636: getfield b : Ljava/lang/String;
    //   639: ldc 'chat_kick_user'
    //   641: invokevirtual equals : (Ljava/lang/Object;)Z
    //   644: ifeq -> 881
    //   647: new java/lang/StringBuffer
    //   650: dup
    //   651: invokespecial <init> : ()V
    //   654: aload_2
    //   655: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   658: iload #4
    //   660: ifeq -> 668
    //   663: ldc 'выш'
    //   665: goto -> 670
    //   668: ldc 'исключил'
    //   670: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   673: invokevirtual toString : ()Ljava/lang/String;
    //   676: astore_2
    //   677: aload #7
    //   679: ifnull -> 790
    //   682: iload #4
    //   684: ifne -> 740
    //   687: new java/lang/StringBuffer
    //   690: dup
    //   691: invokespecial <init> : ()V
    //   694: aload_2
    //   695: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   698: aload #7
    //   700: getfield d : Z
    //   703: ifeq -> 711
    //   706: ldc 'о'
    //   708: goto -> 730
    //   711: aload #7
    //   713: checkcast bi
    //   716: getfield b : I
    //   719: iconst_1
    //   720: if_icmpne -> 728
    //   723: ldc 'а'
    //   725: goto -> 730
    //   728: ldc ''
    //   730: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   733: invokevirtual toString : ()Ljava/lang/String;
    //   736: astore_2
    //   737: goto -> 790
    //   740: new java/lang/StringBuffer
    //   743: dup
    //   744: invokespecial <init> : ()V
    //   747: aload_2
    //   748: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   751: aload #7
    //   753: getfield d : Z
    //   756: ifeq -> 764
    //   759: ldc 'ло'
    //   761: goto -> 783
    //   764: aload #7
    //   766: checkcast bi
    //   769: getfield b : I
    //   772: iconst_1
    //   773: if_icmpne -> 781
    //   776: ldc 'ла'
    //   778: goto -> 783
    //   781: ldc 'ел'
    //   783: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   786: invokevirtual toString : ()Ljava/lang/String;
    //   789: astore_2
    //   790: iload #4
    //   792: ifne -> 858
    //   795: aload_0
    //   796: getfield a : Lku;
    //   799: getfield a : I
    //   802: invokestatic a : (I)Llb;
    //   805: dup
    //   806: astore #7
    //   808: ifnull -> 1656
    //   811: new java/lang/StringBuffer
    //   814: dup
    //   815: invokespecial <init> : ()V
    //   818: aload_2
    //   819: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   822: ldc ' '
    //   824: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   827: iload_3
    //   828: ifeq -> 841
    //   831: aload #7
    //   833: ldc 'acc'
    //   835: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
    //   838: goto -> 848
    //   841: aload #7
    //   843: ldc 'acc'
    //   845: invokevirtual b : (Ljava/lang/String;)Ljava/lang/String;
    //   848: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   851: invokevirtual toString : ()Ljava/lang/String;
    //   854: astore_2
    //   855: goto -> 1656
    //   858: new java/lang/StringBuffer
    //   861: dup
    //   862: invokespecial <init> : ()V
    //   865: aload_2
    //   866: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   869: ldc ' из беседы'
    //   871: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   874: invokevirtual toString : ()Ljava/lang/String;
    //   877: astore_2
    //   878: goto -> 1656
    //   881: aload_0
    //   882: getfield a : Lku;
    //   885: getfield b : Ljava/lang/String;
    //   888: ldc 'chat_invite_user_by_link'
    //   890: invokevirtual equals : (Ljava/lang/Object;)Z
    //   893: ifeq -> 994
    //   896: new java/lang/StringBuffer
    //   899: dup
    //   900: invokespecial <init> : ()V
    //   903: aload_2
    //   904: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   907: ldc 'присоединил'
    //   909: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   912: invokevirtual toString : ()Ljava/lang/String;
    //   915: astore_2
    //   916: aload #7
    //   918: ifnull -> 971
    //   921: new java/lang/StringBuffer
    //   924: dup
    //   925: invokespecial <init> : ()V
    //   928: aload_2
    //   929: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   932: aload #7
    //   934: getfield d : Z
    //   937: ifeq -> 945
    //   940: ldc 'ось'
    //   942: goto -> 964
    //   945: aload #7
    //   947: checkcast bi
    //   950: getfield b : I
    //   953: iconst_1
    //   954: if_icmpne -> 962
    //   957: ldc 'ась'
    //   959: goto -> 964
    //   962: ldc 'ся'
    //   964: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   967: invokevirtual toString : ()Ljava/lang/String;
    //   970: astore_2
    //   971: new java/lang/StringBuffer
    //   974: dup
    //   975: invokespecial <init> : ()V
    //   978: aload_2
    //   979: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   982: ldc ' к беседе по ссылке'
    //   984: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   987: invokevirtual toString : ()Ljava/lang/String;
    //   990: astore_2
    //   991: goto -> 1656
    //   994: aload_0
    //   995: getfield a : Lku;
    //   998: getfield b : Ljava/lang/String;
    //   1001: ldc 'chat_photo_remove'
    //   1003: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1006: ifeq -> 1107
    //   1009: new java/lang/StringBuffer
    //   1012: dup
    //   1013: invokespecial <init> : ()V
    //   1016: aload_2
    //   1017: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1020: ldc 'удалил'
    //   1022: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1025: invokevirtual toString : ()Ljava/lang/String;
    //   1028: astore_2
    //   1029: aload #7
    //   1031: ifnull -> 1084
    //   1034: new java/lang/StringBuffer
    //   1037: dup
    //   1038: invokespecial <init> : ()V
    //   1041: aload_2
    //   1042: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1045: aload #7
    //   1047: getfield d : Z
    //   1050: ifeq -> 1058
    //   1053: ldc 'о'
    //   1055: goto -> 1077
    //   1058: aload #7
    //   1060: checkcast bi
    //   1063: getfield b : I
    //   1066: iconst_1
    //   1067: if_icmpne -> 1075
    //   1070: ldc 'а'
    //   1072: goto -> 1077
    //   1075: ldc ''
    //   1077: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1080: invokevirtual toString : ()Ljava/lang/String;
    //   1083: astore_2
    //   1084: new java/lang/StringBuffer
    //   1087: dup
    //   1088: invokespecial <init> : ()V
    //   1091: aload_2
    //   1092: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1095: ldc ' фото беседы'
    //   1097: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1100: invokevirtual toString : ()Ljava/lang/String;
    //   1103: astore_2
    //   1104: goto -> 1656
    //   1107: aload_0
    //   1108: getfield a : Lku;
    //   1111: getfield b : Ljava/lang/String;
    //   1114: ldc 'chat_photo_update'
    //   1116: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1119: ifeq -> 1220
    //   1122: new java/lang/StringBuffer
    //   1125: dup
    //   1126: invokespecial <init> : ()V
    //   1129: aload_2
    //   1130: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1133: ldc 'обновил'
    //   1135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1138: invokevirtual toString : ()Ljava/lang/String;
    //   1141: astore_2
    //   1142: aload #7
    //   1144: ifnull -> 1197
    //   1147: new java/lang/StringBuffer
    //   1150: dup
    //   1151: invokespecial <init> : ()V
    //   1154: aload_2
    //   1155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1158: aload #7
    //   1160: getfield d : Z
    //   1163: ifeq -> 1171
    //   1166: ldc 'о'
    //   1168: goto -> 1190
    //   1171: aload #7
    //   1173: checkcast bi
    //   1176: getfield b : I
    //   1179: iconst_1
    //   1180: if_icmpne -> 1188
    //   1183: ldc 'а'
    //   1185: goto -> 1190
    //   1188: ldc ''
    //   1190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1193: invokevirtual toString : ()Ljava/lang/String;
    //   1196: astore_2
    //   1197: new java/lang/StringBuffer
    //   1200: dup
    //   1201: invokespecial <init> : ()V
    //   1204: aload_2
    //   1205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1208: ldc ' фото беседы'
    //   1210: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1213: invokevirtual toString : ()Ljava/lang/String;
    //   1216: astore_2
    //   1217: goto -> 1656
    //   1220: aload_0
    //   1221: getfield a : Lku;
    //   1224: getfield b : Ljava/lang/String;
    //   1227: ldc 'chat_title_update'
    //   1229: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1232: ifeq -> 1336
    //   1235: new java/lang/StringBuffer
    //   1238: dup
    //   1239: invokespecial <init> : ()V
    //   1242: aload_2
    //   1243: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1246: ldc 'обновил'
    //   1248: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1251: invokevirtual toString : ()Ljava/lang/String;
    //   1254: astore_2
    //   1255: aload #7
    //   1257: ifnull -> 1310
    //   1260: new java/lang/StringBuffer
    //   1263: dup
    //   1264: invokespecial <init> : ()V
    //   1267: aload_2
    //   1268: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1271: aload #7
    //   1273: getfield d : Z
    //   1276: ifeq -> 1284
    //   1279: ldc 'о'
    //   1281: goto -> 1303
    //   1284: aload #7
    //   1286: checkcast bi
    //   1289: getfield b : I
    //   1292: iconst_1
    //   1293: if_icmpne -> 1301
    //   1296: ldc 'а'
    //   1298: goto -> 1303
    //   1301: ldc ''
    //   1303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1306: invokevirtual toString : ()Ljava/lang/String;
    //   1309: astore_2
    //   1310: new java/lang/StringBuffer
    //   1313: dup
    //   1314: invokespecial <init> : ()V
    //   1317: aload_2
    //   1318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1321: ldc ' название беседы на "'
    //   1323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1326: aload_0
    //   1327: getfield a : Lku;
    //   1330: getfield a : Ljava/lang/String;
    //   1333: goto -> 1644
    //   1336: aload_0
    //   1337: getfield a : Lku;
    //   1340: getfield b : Ljava/lang/String;
    //   1343: ldc 'chat_unpin_message'
    //   1345: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1348: ifeq -> 1449
    //   1351: new java/lang/StringBuffer
    //   1354: dup
    //   1355: invokespecial <init> : ()V
    //   1358: aload_2
    //   1359: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1362: ldc 'открепил'
    //   1364: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1367: invokevirtual toString : ()Ljava/lang/String;
    //   1370: astore_2
    //   1371: aload #7
    //   1373: ifnull -> 1426
    //   1376: new java/lang/StringBuffer
    //   1379: dup
    //   1380: invokespecial <init> : ()V
    //   1383: aload_2
    //   1384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1387: aload #7
    //   1389: getfield d : Z
    //   1392: ifeq -> 1400
    //   1395: ldc 'о'
    //   1397: goto -> 1419
    //   1400: aload #7
    //   1402: checkcast bi
    //   1405: getfield b : I
    //   1408: iconst_1
    //   1409: if_icmpne -> 1417
    //   1412: ldc 'а'
    //   1414: goto -> 1419
    //   1417: ldc ''
    //   1419: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1422: invokevirtual toString : ()Ljava/lang/String;
    //   1425: astore_2
    //   1426: new java/lang/StringBuffer
    //   1429: dup
    //   1430: invokespecial <init> : ()V
    //   1433: aload_2
    //   1434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1437: ldc ' сообщение'
    //   1439: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1442: invokevirtual toString : ()Ljava/lang/String;
    //   1445: astore_2
    //   1446: goto -> 1656
    //   1449: aload_0
    //   1450: getfield a : Lku;
    //   1453: getfield b : Ljava/lang/String;
    //   1456: ldc 'chat_pin_message'
    //   1458: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1461: ifeq -> 1656
    //   1464: new java/lang/StringBuffer
    //   1467: dup
    //   1468: invokespecial <init> : ()V
    //   1471: aload_2
    //   1472: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1475: ldc 'закрепил'
    //   1477: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1480: invokevirtual toString : ()Ljava/lang/String;
    //   1483: astore_2
    //   1484: aload #7
    //   1486: ifnull -> 1539
    //   1489: new java/lang/StringBuffer
    //   1492: dup
    //   1493: invokespecial <init> : ()V
    //   1496: aload_2
    //   1497: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1500: aload #7
    //   1502: getfield d : Z
    //   1505: ifeq -> 1513
    //   1508: ldc 'о'
    //   1510: goto -> 1532
    //   1513: aload #7
    //   1515: checkcast bi
    //   1518: getfield b : I
    //   1521: iconst_1
    //   1522: if_icmpne -> 1530
    //   1525: ldc 'а'
    //   1527: goto -> 1532
    //   1530: ldc ''
    //   1532: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1535: invokevirtual toString : ()Ljava/lang/String;
    //   1538: astore_2
    //   1539: new java/lang/StringBuffer
    //   1542: dup
    //   1543: invokespecial <init> : ()V
    //   1546: aload_2
    //   1547: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1550: ldc ' сообщение'
    //   1552: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1555: invokevirtual toString : ()Ljava/lang/String;
    //   1558: astore_2
    //   1559: aload_0
    //   1560: getfield a : Lku;
    //   1563: getfield c : Ljava/lang/String;
    //   1566: invokestatic a : (Ljava/lang/String;)Z
    //   1569: ifne -> 1656
    //   1572: new java/lang/StringBuffer
    //   1575: dup
    //   1576: invokespecial <init> : ()V
    //   1579: aload_2
    //   1580: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1583: ldc ' "'
    //   1585: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1588: aload_0
    //   1589: getfield a : Lku;
    //   1592: getfield c : Ljava/lang/String;
    //   1595: invokevirtual length : ()I
    //   1598: bipush #24
    //   1600: if_icmple -> 1637
    //   1603: new java/lang/StringBuffer
    //   1606: dup
    //   1607: invokespecial <init> : ()V
    //   1610: aload_0
    //   1611: getfield a : Lku;
    //   1614: getfield c : Ljava/lang/String;
    //   1617: iconst_0
    //   1618: bipush #24
    //   1620: invokevirtual substring : (II)Ljava/lang/String;
    //   1623: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1626: ldc '...'
    //   1628: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1631: invokevirtual toString : ()Ljava/lang/String;
    //   1634: goto -> 1644
    //   1637: aload_0
    //   1638: getfield a : Lku;
    //   1641: getfield c : Ljava/lang/String;
    //   1644: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1647: ldc '"'
    //   1649: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1652: invokevirtual toString : ()Ljava/lang/String;
    //   1655: astore_2
    //   1656: aload_2
    //   1657: areturn
    //   1658: iload #4
    //   1660: ifeq -> 1705
    //   1663: aload_0
    //   1664: invokevirtual c : ()Z
    //   1667: ifeq -> 1705
    //   1670: aload_0
    //   1671: getfield a : Lbw;
    //   1674: getfield c : I
    //   1677: invokestatic a : (I)Llb;
    //   1680: ifnull -> 1705
    //   1683: new java/lang/StringBuffer
    //   1686: dup
    //   1687: invokespecial <init> : ()V
    //   1690: aload #6
    //   1692: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1695: ldc '[Ответ]\\n'
    //   1697: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1700: invokevirtual toString : ()Ljava/lang/String;
    //   1703: astore #6
    //   1705: aload_0
    //   1706: invokevirtual d : ()Z
    //   1709: ifeq -> 1768
    //   1712: aload_0
    //   1713: getfield a : [Ldv;
    //   1716: arraylength
    //   1717: iconst_1
    //   1718: if_icmple -> 1746
    //   1721: new java/lang/StringBuffer
    //   1724: dup
    //   1725: invokespecial <init> : ()V
    //   1728: aload #6
    //   1730: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1733: ldc '[Вложения]\\n'
    //   1735: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1738: invokevirtual toString : ()Ljava/lang/String;
    //   1741: astore #6
    //   1743: goto -> 1768
    //   1746: new java/lang/StringBuffer
    //   1749: dup
    //   1750: invokespecial <init> : ()V
    //   1753: aload #6
    //   1755: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1758: ldc '[Вложение]\\n'
    //   1760: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1763: invokevirtual toString : ()Ljava/lang/String;
    //   1766: astore #6
    //   1768: iload #5
    //   1770: ifeq -> 1836
    //   1773: aload_0
    //   1774: invokevirtual b : ()Z
    //   1777: ifeq -> 1836
    //   1780: aload_0
    //   1781: getfield a : [Lbw;
    //   1784: arraylength
    //   1785: iconst_1
    //   1786: if_icmple -> 1814
    //   1789: new java/lang/StringBuffer
    //   1792: dup
    //   1793: invokespecial <init> : ()V
    //   1796: aload #6
    //   1798: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1801: ldc '[Прикрепленные]\\n'
    //   1803: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1806: invokevirtual toString : ()Ljava/lang/String;
    //   1809: astore #6
    //   1811: goto -> 1836
    //   1814: new java/lang/StringBuffer
    //   1817: dup
    //   1818: invokespecial <init> : ()V
    //   1821: aload #6
    //   1823: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1826: ldc '[Прикрепленное]\\n'
    //   1828: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1831: invokevirtual toString : ()Ljava/lang/String;
    //   1834: astore #6
    //   1836: aload_0
    //   1837: getfield a : Ljava/lang/String;
    //   1840: invokestatic a : (Ljava/lang/String;)Z
    //   1843: ifne -> 1876
    //   1846: new java/lang/StringBuffer
    //   1849: dup
    //   1850: invokespecial <init> : ()V
    //   1853: aload #6
    //   1855: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1858: aload_0
    //   1859: getfield a : Ljava/lang/String;
    //   1862: invokevirtual trim : ()Ljava/lang/String;
    //   1865: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1868: invokevirtual toString : ()Ljava/lang/String;
    //   1871: astore #6
    //   1873: goto -> 1917
    //   1876: aload_0
    //   1877: invokevirtual d : ()Z
    //   1880: ifne -> 1917
    //   1883: iload #5
    //   1885: ifeq -> 1917
    //   1888: aload_0
    //   1889: invokevirtual b : ()Z
    //   1892: ifne -> 1917
    //   1895: new java/lang/StringBuffer
    //   1898: dup
    //   1899: invokespecial <init> : ()V
    //   1902: aload #6
    //   1904: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1907: ldc '*пусто*'
    //   1909: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   1912: invokevirtual toString : ()Ljava/lang/String;
    //   1915: astore #6
    //   1917: aload #6
    //   1919: areturn
  }
  
  public final String toString() {
    return a(false, false, false, true, true);
  }
  
  public final boolean d() {
    return (this.a != null && this.a.length > 0);
  }
  
  public final int a() {
    return (this.e > this.d) ? this.e : this.d;
  }
  
  public final boolean e() {
    return !ab.a(this.a);
  }
  
  public final boolean f() {
    return (System.currentTimeMillis() / 1000L / 86400L - (a() / 86400) < 1L);
  }
  
  static {
    dj dj = new dj();
    jx jx1;
    (jx1 = new jx("\\[[\\S]+\\|[\\s\\S]+\\]", (byte)0)).a = (int[])dj;
    a = (String)jx1;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/bw.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */