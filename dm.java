public final class dm extends la {
  private r a;
  
  final ci a;
  
  private dm(ci paramci, boolean paramBoolean, byte paramByte) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'title.behaviorSettings'
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
    //   26: new fs
    //   29: dup
    //   30: aload_0
    //   31: invokespecial <init> : (Ldm;)V
    //   34: iconst_1
    //   35: invokestatic a : (Lla;Ljava/lang/String;Ljava/lang/Runnable;Z)V
    //   38: aload_0
    //   39: getfield b : Ljava/util/Vector;
    //   42: new ak
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: dup
    //   50: astore_3
    //   51: iconst_0
    //   52: putfield n : Z
    //   55: aload_3
    //   56: invokevirtual addElement : (Ljava/lang/Object;)V
    //   59: aload_0
    //   60: getfield b : Ljava/util/Vector;
    //   63: new gg
    //   66: dup
    //   67: ldc 'settings.networkSettings'
    //   69: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   72: invokespecial <init> : (Ljava/lang/String;)V
    //   75: invokevirtual b : ()Lgg;
    //   78: dup
    //   79: astore_3
    //   80: iconst_1
    //   81: putfield r : Z
    //   84: aload_3
    //   85: invokevirtual addElement : (Ljava/lang/Object;)V
    //   88: aload_0
    //   89: getfield b : Ljava/util/Vector;
    //   92: aload_0
    //   93: new fr
    //   96: dup
    //   97: aload_0
    //   98: ldc 'settings.networkMode'
    //   100: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   103: invokespecial <init> : (Ldm;Ljava/lang/String;)V
    //   106: iconst_1
    //   107: iconst_0
    //   108: invokevirtual a : (ZZ)Lr;
    //   111: getstatic ci.a : Lv;
    //   114: getfield b : I
    //   117: iconst_1
    //   118: if_icmpne -> 126
    //   121: ldc 'settings.https'
    //   123: goto -> 128
    //   126: ldc 'settings.http'
    //   128: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   131: invokevirtual b : (Ljava/lang/String;)Lr;
    //   134: dup_x1
    //   135: putfield a : Lr;
    //   138: invokevirtual addElement : (Ljava/lang/Object;)V
    //   141: aload_0
    //   142: getfield b : Ljava/util/Vector;
    //   145: new ak
    //   148: dup
    //   149: invokespecial <init> : ()V
    //   152: dup
    //   153: astore_3
    //   154: iconst_1
    //   155: putfield p : Z
    //   158: aload_3
    //   159: dup
    //   160: astore_3
    //   161: iconst_0
    //   162: putfield n : Z
    //   165: aload_3
    //   166: invokevirtual addElement : (Ljava/lang/Object;)V
    //   169: aload_0
    //   170: getfield b : Ljava/util/Vector;
    //   173: new gg
    //   176: dup
    //   177: ldc 'settings.feedback'
    //   179: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   182: invokespecial <init> : (Ljava/lang/String;)V
    //   185: invokevirtual b : ()Lgg;
    //   188: dup
    //   189: astore_3
    //   190: iconst_1
    //   191: putfield r : Z
    //   194: aload_3
    //   195: invokevirtual addElement : (Ljava/lang/Object;)V
    //   198: aload_0
    //   199: getfield b : Ljava/util/Vector;
    //   202: new fu
    //   205: dup
    //   206: ldc 'settings.keyboardVibration'
    //   208: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   211: invokespecial <init> : (Ljava/lang/String;)V
    //   214: getstatic ci.a : Lv;
    //   217: getfield j : Z
    //   220: invokevirtual b : (Z)Lr;
    //   223: dup
    //   224: astore_3
    //   225: iconst_1
    //   226: putfield n : Z
    //   229: aload_3
    //   230: invokevirtual addElement : (Ljava/lang/Object;)V
    //   233: aload_0
    //   234: getfield b : Ljava/util/Vector;
    //   237: new ft
    //   240: dup
    //   241: ldc 'settings.notificationVibration'
    //   243: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   246: invokespecial <init> : (Ljava/lang/String;)V
    //   249: getstatic ci.a : Lv;
    //   252: getfield k : Z
    //   255: invokevirtual b : (Z)Lr;
    //   258: dup
    //   259: astore_3
    //   260: iconst_1
    //   261: putfield n : Z
    //   264: aload_3
    //   265: invokevirtual addElement : (Ljava/lang/Object;)V
    //   268: aload_0
    //   269: getfield b : Ljava/util/Vector;
    //   272: new gl
    //   275: dup
    //   276: ldc 'settings.notificationSound'
    //   278: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   281: invokespecial <init> : (Ljava/lang/String;)V
    //   284: getstatic ci.a : Lv;
    //   287: getfield l : Z
    //   290: invokevirtual b : (Z)Lr;
    //   293: invokevirtual addElement : (Ljava/lang/Object;)V
    //   296: aload_0
    //   297: getfield b : Ljava/util/Vector;
    //   300: new ak
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: dup
    //   308: astore_3
    //   309: iconst_1
    //   310: putfield p : Z
    //   313: aload_3
    //   314: dup
    //   315: astore_3
    //   316: iconst_0
    //   317: putfield n : Z
    //   320: aload_3
    //   321: invokevirtual addElement : (Ljava/lang/Object;)V
    //   324: aload_0
    //   325: getfield b : Ljava/util/Vector;
    //   328: new gg
    //   331: dup
    //   332: ldc 'settings.caching'
    //   334: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   337: invokespecial <init> : (Ljava/lang/String;)V
    //   340: invokevirtual b : ()Lgg;
    //   343: dup
    //   344: astore_3
    //   345: iconst_1
    //   346: putfield r : Z
    //   349: aload_3
    //   350: invokevirtual addElement : (Ljava/lang/Object;)V
    //   353: getstatic ci.a : Lv;
    //   356: getfield m : Z
    //   359: ifeq -> 403
    //   362: getstatic ci.a : Lv;
    //   365: getfield b : Ljava/lang/String;
    //   368: invokestatic a : (Ljava/lang/String;)Z
    //   371: ifne -> 399
    //   374: getstatic ci.a : Lv;
    //   377: iconst_0
    //   378: putfield m : Z
    //   381: getstatic ci.a : Lv;
    //   384: invokevirtual a : ()Lv;
    //   387: pop
    //   388: getstatic gz.a : Lgz;
    //   391: ldc 'settings.cachingFolderNotExists'
    //   393: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   396: invokevirtual a : (Ljava/lang/String;)V
    //   399: goto -> 403
    //   402: pop
    //   403: aload_0
    //   404: getfield b : Ljava/util/Vector;
    //   407: new gm
    //   410: dup
    //   411: ldc 'settings.cacheAudio'
    //   413: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   416: invokespecial <init> : (Ljava/lang/String;)V
    //   419: getstatic ci.a : Lv;
    //   422: getfield m : Z
    //   425: invokevirtual b : (Z)Lr;
    //   428: dup
    //   429: astore_3
    //   430: iconst_1
    //   431: putfield n : Z
    //   434: aload_3
    //   435: invokevirtual addElement : (Ljava/lang/Object;)V
    //   438: aload_0
    //   439: getfield b : Ljava/util/Vector;
    //   442: new gn
    //   445: dup
    //   446: ldc 'settings.cacheOnly'
    //   448: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   451: invokespecial <init> : (Ljava/lang/String;)V
    //   454: getstatic ci.a : Lv;
    //   457: getfield n : Z
    //   460: invokevirtual b : (Z)Lr;
    //   463: dup
    //   464: astore_3
    //   465: iconst_1
    //   466: putfield n : Z
    //   469: aload_3
    //   470: invokevirtual addElement : (Ljava/lang/Object;)V
    //   473: new go
    //   476: dup
    //   477: aload_0
    //   478: ldc 'settings.cachingFolder'
    //   480: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   483: invokespecial <init> : (Ldm;Ljava/lang/String;)V
    //   486: iconst_1
    //   487: iconst_0
    //   488: invokevirtual a : (ZZ)Lr;
    //   491: astore_3
    //   492: aload_0
    //   493: getfield b : Ljava/util/Vector;
    //   496: aload_3
    //   497: invokevirtual addElement : (Ljava/lang/Object;)V
    //   500: aload_3
    //   501: getstatic ci.a : Lv;
    //   504: getfield b : Ljava/lang/String;
    //   507: invokestatic a : (Ljava/lang/String;)Z
    //   510: ifeq -> 521
    //   513: ldc 'settings.cachingFolderSelected'
    //   515: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   518: goto -> 522
    //   521: aconst_null
    //   522: invokevirtual b : (Ljava/lang/String;)Lr;
    //   525: pop
    //   526: goto -> 530
    //   529: pop
    //   530: iload_2
    //   531: ifeq -> 616
    //   534: invokestatic c : ()Z
    //   537: ifeq -> 616
    //   540: aload_0
    //   541: getfield b : Ljava/util/Vector;
    //   544: new ak
    //   547: dup
    //   548: invokespecial <init> : ()V
    //   551: dup
    //   552: astore_3
    //   553: iconst_1
    //   554: putfield p : Z
    //   557: aload_3
    //   558: dup
    //   559: astore_3
    //   560: iconst_0
    //   561: putfield n : Z
    //   564: aload_3
    //   565: invokevirtual addElement : (Ljava/lang/Object;)V
    //   568: aload_0
    //   569: getfield b : Ljava/util/Vector;
    //   572: new gg
    //   575: dup
    //   576: ldc 'settings.debugging'
    //   578: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   581: invokespecial <init> : (Ljava/lang/String;)V
    //   584: invokevirtual b : ()Lgg;
    //   587: dup
    //   588: astore_3
    //   589: iconst_1
    //   590: putfield r : Z
    //   593: aload_3
    //   594: invokevirtual addElement : (Ljava/lang/Object;)V
    //   597: aload_0
    //   598: getfield b : Ljava/util/Vector;
    //   601: new gi
    //   604: dup
    //   605: ldc 'settings.showToken'
    //   607: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   610: invokespecial <init> : (Ljava/lang/String;)V
    //   613: invokevirtual addElement : (Ljava/lang/Object;)V
    //   616: aload_0
    //   617: astore_1
    //   618: getstatic gz.a : Lgz;
    //   621: aload_1
    //   622: invokevirtual b : (Lla;)V
    //   625: return
    // Exception table:
    //   from	to	target	type
    //   362	399	402	java/lang/Throwable
    //   500	526	529	java/lang/Throwable
  }
  
  public final void a() {
    gz.a.a(this);
    this.a.b(u.a((((v)ci.a).b == '\001') ? "settings.https" : "settings.http"));
  }
  
  dm(ci paramci, boolean paramBoolean) {
    this(paramci, paramBoolean, (byte)0);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/dm.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */