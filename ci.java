import ru.curoviyxru.phoenix.midlet.Midlet;

public final class ci extends la {
  public static final v a = new v();
  
  static boolean a;
  
  static String a;
  
  static void a() {
    String str;
    if (!ab.a(str = hk.b((fy.e().startsWith("http:") ? "http://" : "https://") + "vk4me.curoviyx.ru/next/latest")) && str.indexOf("Not Found") == -1 && str.indexOf("Moved") == -1 && !str.equals(Midlet.a)) {
      a = '\001';
      a = str;
    } 
  }
  
  public ci(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'title.settings'
    //   3: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   6: invokespecial <init> : (Ljava/lang/String;)V
    //   9: aload_0
    //   10: iconst_1
    //   11: invokevirtual a : (Z)Lla;
    //   14: pop
    //   15: aload_0
    //   16: iconst_1
    //   17: putfield d : Z
    //   20: aload_0
    //   21: ldc 'action.back'
    //   23: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   26: new c
    //   29: dup
    //   30: iload_1
    //   31: invokespecial <init> : (Z)V
    //   34: iconst_1
    //   35: invokestatic a : (Lla;Ljava/lang/String;Ljava/lang/Runnable;Z)V
    //   38: aload_0
    //   39: getfield b : Ljava/util/Vector;
    //   42: new ak
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: invokevirtual addElement : (Ljava/lang/Object;)V
    //   52: aload_0
    //   53: getfield b : Ljava/util/Vector;
    //   56: new k
    //   59: dup
    //   60: aload_0
    //   61: ldc 'element.interface'
    //   63: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   66: invokespecial <init> : (Lci;Ljava/lang/String;)V
    //   69: ldc 'sui.png'
    //   71: ldc 'suis.png'
    //   73: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   76: dup
    //   77: astore_2
    //   78: iconst_1
    //   79: putfield n : Z
    //   82: aload_2
    //   83: dup
    //   84: astore_2
    //   85: iconst_1
    //   86: putfield o : Z
    //   89: aload_2
    //   90: invokevirtual addElement : (Ljava/lang/Object;)V
    //   93: aload_0
    //   94: getfield b : Ljava/util/Vector;
    //   97: new l
    //   100: dup
    //   101: aload_0
    //   102: ldc 'element.behavior'
    //   104: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   107: iload_1
    //   108: invokespecial <init> : (Lci;Ljava/lang/String;Z)V
    //   111: ldc 'wid.png'
    //   113: ldc 'wids.png'
    //   115: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   118: dup
    //   119: astore_2
    //   120: iconst_1
    //   121: putfield n : Z
    //   124: aload_2
    //   125: dup
    //   126: astore_2
    //   127: iconst_1
    //   128: putfield o : Z
    //   131: aload_2
    //   132: invokevirtual addElement : (Ljava/lang/Object;)V
    //   135: aload_0
    //   136: getfield b : Ljava/util/Vector;
    //   139: new m
    //   142: dup
    //   143: aload_0
    //   144: ldc 'element.localization'
    //   146: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   149: invokespecial <init> : (Lci;Ljava/lang/String;)V
    //   152: ldc 'l.png'
    //   154: ldc 'ls.png'
    //   156: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   159: dup
    //   160: astore_2
    //   161: iconst_1
    //   162: putfield n : Z
    //   165: aload_2
    //   166: dup
    //   167: astore_2
    //   168: iconst_1
    //   169: putfield o : Z
    //   172: aload_2
    //   173: invokevirtual addElement : (Ljava/lang/Object;)V
    //   176: aload_0
    //   177: getfield b : Ljava/util/Vector;
    //   180: new ak
    //   183: dup
    //   184: invokespecial <init> : ()V
    //   187: invokevirtual addElement : (Ljava/lang/Object;)V
    //   190: aload_0
    //   191: getfield b : Ljava/util/Vector;
    //   194: new n
    //   197: dup
    //   198: aload_0
    //   199: ldc 'element.about'
    //   201: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   204: iload_1
    //   205: invokespecial <init> : (Lci;Ljava/lang/String;Z)V
    //   208: ldc 'info.png'
    //   210: ldc 'infos.png'
    //   212: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   215: iconst_1
    //   216: iconst_0
    //   217: invokevirtual a : (ZZ)Lr;
    //   220: ldc 'general.buildNumber'
    //   222: new java/lang/StringBuffer
    //   225: dup
    //   226: invokespecial <init> : ()V
    //   229: getstatic ru/curoviyxru/phoenix/midlet/Midlet.a : Ljava/lang/String;
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   235: ldc ''
    //   237: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   240: invokevirtual toString : ()Ljava/lang/String;
    //   243: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   246: invokevirtual b : (Ljava/lang/String;)Lr;
    //   249: dup
    //   250: astore_2
    //   251: iconst_1
    //   252: putfield n : Z
    //   255: aload_2
    //   256: dup
    //   257: astore_2
    //   258: iconst_1
    //   259: putfield o : Z
    //   262: aload_2
    //   263: checkcast r
    //   266: dup
    //   267: astore_2
    //   268: invokevirtual addElement : (Ljava/lang/Object;)V
    //   271: invokestatic a : ()V
    //   274: getstatic ci.a : Z
    //   277: ifeq -> 289
    //   280: aload_2
    //   281: ldc 'infon.png'
    //   283: ldc 'infons.png'
    //   285: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   288: pop
    //   289: iload_1
    //   290: ifeq -> 329
    //   293: aload_0
    //   294: getfield b : Ljava/util/Vector;
    //   297: new f
    //   300: dup
    //   301: ldc 'action.logOut'
    //   303: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   306: invokespecial <init> : (Ljava/lang/String;)V
    //   309: iconst_1
    //   310: invokevirtual a : (Z)Lr;
    //   313: ldc 'logout.png'
    //   315: ldc 'logouts.png'
    //   317: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   320: invokevirtual b : ()Lr;
    //   323: invokevirtual addElement : (Ljava/lang/Object;)V
    //   326: goto -> 422
    //   329: new bj
    //   332: dup
    //   333: new java/lang/String
    //   336: dup
    //   337: ldc 'vk4me_confign'
    //   339: invokestatic b : (Ljava/lang/String;)[B
    //   342: ldc 'UTF-8'
    //   344: invokespecial <init> : ([BLjava/lang/String;)V
    //   347: invokespecial <init> : (Ljava/lang/String;)V
    //   350: ldc 'account'
    //   352: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   355: ldc 'token'
    //   357: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   360: invokestatic a : (Ljava/lang/String;)Z
    //   363: ifeq -> 374
    //   366: new java/lang/Exception
    //   369: dup
    //   370: invokespecial <init> : ()V
    //   373: athrow
    //   374: aload_0
    //   375: getfield b : Ljava/util/Vector;
    //   378: new g
    //   381: dup
    //   382: ldc 'element.vk4meMigration'
    //   384: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   387: invokespecial <init> : (Ljava/lang/String;)V
    //   390: iconst_1
    //   391: invokevirtual a : (Z)Lr;
    //   394: ldc 'mig.png'
    //   396: ldc 'migs.png'
    //   398: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   401: invokevirtual addElement : (Ljava/lang/Object;)V
    //   404: goto -> 422
    //   407: pop
    //   408: aload_0
    //   409: getfield b : Ljava/util/Vector;
    //   412: invokevirtual lastElement : ()Ljava/lang/Object;
    //   415: checkcast ay
    //   418: iconst_0
    //   419: putfield n : Z
    //   422: aload_0
    //   423: getfield b : Ljava/util/Vector;
    //   426: new gg
    //   429: dup
    //   430: ldc 'element.settingsRestartDisclaimer'
    //   432: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   435: invokespecial <init> : (Ljava/lang/String;)V
    //   438: iconst_1
    //   439: invokevirtual b : (I)Lgg;
    //   442: ldc 6579300
    //   444: invokevirtual a : (I)Lgg;
    //   447: invokevirtual addElement : (Ljava/lang/Object;)V
    //   450: aload_0
    //   451: iload_1
    //   452: istore_2
    //   453: astore_1
    //   454: invokestatic d : ()V
    //   457: iload_2
    //   458: ifne -> 468
    //   461: getstatic gz.a : Lgz;
    //   464: iconst_1
    //   465: putfield d : Z
    //   468: getstatic gz.a : Lgz;
    //   471: aload_1
    //   472: invokevirtual b : (Lla;)V
    //   475: return
    // Exception table:
    //   from	to	target	type
    //   329	404	407	java/lang/Exception
  }
  
  public final void b() {
    gz.a.a(this);
  }
  
  public static void a(la paramla, String paramString, Runnable paramRunnable, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/util/Vector;
    //   4: new h
    //   7: dup
    //   8: aload_1
    //   9: aload_2
    //   10: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Runnable;)V
    //   13: ldc 'bk.png'
    //   15: ldc 'bks.png'
    //   17: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   20: dup
    //   21: astore_0
    //   22: iconst_1
    //   23: putfield o : Z
    //   26: aload_0
    //   27: iload_3
    //   28: istore_1
    //   29: dup
    //   30: astore_0
    //   31: iload_1
    //   32: putfield n : Z
    //   35: aload_0
    //   36: invokevirtual addElement : (Ljava/lang/Object;)V
    //   39: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ci.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */