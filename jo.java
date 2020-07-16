public final class jo extends la {
  final ci a;
  
  private jo(ci paramci, boolean paramBoolean, byte paramByte) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'title.aboutSettings'
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
    //   26: new lp
    //   29: dup
    //   30: aload_0
    //   31: invokespecial <init> : (Ljo;)V
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
    //   59: getstatic gz.a : Lgz;
    //   62: astore_3
    //   63: aload_0
    //   64: getfield b : Ljava/util/Vector;
    //   67: new fl
    //   70: dup
    //   71: ldc 'ph.png'
    //   73: invokestatic a : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   76: aload_3
    //   77: invokevirtual getWidth : ()I
    //   80: iconst_2
    //   81: idiv
    //   82: aload_3
    //   83: invokevirtual getHeight : ()I
    //   86: iconst_2
    //   87: idiv
    //   88: invokestatic min : (II)I
    //   91: invokestatic a : (Ljavax/microedition/lcdui/Image;I)Ljavax/microedition/lcdui/Image;
    //   94: invokespecial <init> : (Ljavax/microedition/lcdui/Image;)V
    //   97: dup
    //   98: astore_3
    //   99: iconst_1
    //   100: putfield a : B
    //   103: aload_3
    //   104: invokevirtual addElement : (Ljava/lang/Object;)V
    //   107: aload_0
    //   108: getfield b : Ljava/util/Vector;
    //   111: new gg
    //   114: dup
    //   115: ldc 'VK4ME Next'
    //   117: invokespecial <init> : (Ljava/lang/String;)V
    //   120: invokevirtual b : ()Lgg;
    //   123: iconst_1
    //   124: invokevirtual b : (I)Lgg;
    //   127: invokevirtual addElement : (Ljava/lang/Object;)V
    //   130: aload_0
    //   131: getfield b : Ljava/util/Vector;
    //   134: new gg
    //   137: dup
    //   138: ldc 'general.buildNumber'
    //   140: new java/lang/StringBuffer
    //   143: dup
    //   144: invokespecial <init> : ()V
    //   147: getstatic ru/curoviyxru/phoenix/midlet/Midlet.a : Ljava/lang/String;
    //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   153: ldc ''
    //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   158: invokevirtual toString : ()Ljava/lang/String;
    //   161: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   164: invokespecial <init> : (Ljava/lang/String;)V
    //   167: ldc 6579300
    //   169: invokevirtual a : (I)Lgg;
    //   172: iconst_1
    //   173: invokevirtual b : (I)Lgg;
    //   176: invokevirtual addElement : (Ljava/lang/Object;)V
    //   179: aload_0
    //   180: getfield b : Ljava/util/Vector;
    //   183: new gg
    //   186: dup
    //   187: ldc 'curoviyxru, 2020'
    //   189: invokespecial <init> : (Ljava/lang/String;)V
    //   192: iconst_1
    //   193: invokevirtual b : (I)Lgg;
    //   196: invokevirtual addElement : (Ljava/lang/Object;)V
    //   199: aload_0
    //   200: getfield b : Ljava/util/Vector;
    //   203: new ak
    //   206: dup
    //   207: invokespecial <init> : ()V
    //   210: dup
    //   211: astore_3
    //   212: iconst_1
    //   213: putfield p : Z
    //   216: aload_3
    //   217: invokevirtual addElement : (Ljava/lang/Object;)V
    //   220: getstatic ci.a : Z
    //   223: ifeq -> 281
    //   226: aload_0
    //   227: getfield b : Ljava/util/Vector;
    //   230: new lj
    //   233: dup
    //   234: ldc 'settings.downloadUpdate'
    //   236: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   239: invokespecial <init> : (Ljava/lang/String;)V
    //   242: ldc 'settings.updateToVersion'
    //   244: new java/lang/StringBuffer
    //   247: dup
    //   248: invokespecial <init> : ()V
    //   251: getstatic ci.a : Ljava/lang/String;
    //   254: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   257: ldc ''
    //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   262: invokevirtual toString : ()Ljava/lang/String;
    //   265: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   268: invokevirtual c : (Ljava/lang/String;)Lr;
    //   271: ldc 'upd.png'
    //   273: ldc 'upds.png'
    //   275: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   278: invokevirtual addElement : (Ljava/lang/Object;)V
    //   281: aload_0
    //   282: getfield b : Ljava/util/Vector;
    //   285: new li
    //   288: dup
    //   289: ldc '@curoviyxru'
    //   291: iload_2
    //   292: ifeq -> 299
    //   295: iconst_2
    //   296: goto -> 300
    //   299: iconst_0
    //   300: iload_2
    //   301: invokespecial <init> : (Ljava/lang/String;BZ)V
    //   304: ldc 'settings.applicationsAuthor'
    //   306: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   309: invokevirtual c : (Ljava/lang/String;)Lr;
    //   312: ldc 'mf.png'
    //   314: ldc 'mfs.png'
    //   316: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   319: invokevirtual addElement : (Ljava/lang/Object;)V
    //   322: aload_0
    //   323: getfield b : Ljava/util/Vector;
    //   326: new lm
    //   329: dup
    //   330: ldc 'vk4me.curoviyx.ru'
    //   332: invokespecial <init> : (Ljava/lang/String;)V
    //   335: ldc 'settings.applicationsWebsite'
    //   337: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   340: invokevirtual c : (Ljava/lang/String;)Lr;
    //   343: ldc 'web.png'
    //   345: ldc 'webs.png'
    //   347: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   350: invokevirtual addElement : (Ljava/lang/Object;)V
    //   353: aload_0
    //   354: getfield b : Ljava/util/Vector;
    //   357: new ll
    //   360: dup
    //   361: ldc 'vk.com/vk4me_app'
    //   363: iload_2
    //   364: ifeq -> 371
    //   367: iconst_2
    //   368: goto -> 372
    //   371: iconst_0
    //   372: iload_2
    //   373: invokespecial <init> : (Ljava/lang/String;BZ)V
    //   376: ldc 'settings.vkGroup'
    //   378: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   381: invokevirtual c : (Ljava/lang/String;)Lr;
    //   384: ldc 'vk.png'
    //   386: ldc 'vks.png'
    //   388: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   391: invokevirtual addElement : (Ljava/lang/Object;)V
    //   394: aload_0
    //   395: getfield b : Ljava/util/Vector;
    //   398: new r
    //   401: dup
    //   402: ldc '4276 1300 1104 2128'
    //   404: iconst_0
    //   405: invokespecial <init> : (Ljava/lang/String;B)V
    //   408: ldc 'settings.donationWithCard'
    //   410: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   413: invokevirtual c : (Ljava/lang/String;)Lr;
    //   416: ldc 'don.png'
    //   418: ldc 'dons.png'
    //   420: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   423: invokevirtual addElement : (Ljava/lang/Object;)V
    //   426: aload_0
    //   427: getfield b : Ljava/util/Vector;
    //   430: new lf
    //   433: dup
    //   434: ldc 'qiwi.me/curoviyxru'
    //   436: invokespecial <init> : (Ljava/lang/String;)V
    //   439: ldc 'settings.donationWithQIWI'
    //   441: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   444: invokevirtual c : (Ljava/lang/String;)Lr;
    //   447: ldc 'qiwi.png'
    //   449: ldc 'qiwis.png'
    //   451: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)Lr;
    //   454: dup
    //   455: astore_3
    //   456: iconst_0
    //   457: putfield n : Z
    //   460: aload_3
    //   461: invokevirtual addElement : (Ljava/lang/Object;)V
    //   464: aload_0
    //   465: getfield b : Ljava/util/Vector;
    //   468: new ak
    //   471: dup
    //   472: invokespecial <init> : ()V
    //   475: dup
    //   476: astore_3
    //   477: iconst_1
    //   478: putfield p : Z
    //   481: aload_3
    //   482: dup
    //   483: astore_3
    //   484: iconst_0
    //   485: putfield n : Z
    //   488: aload_3
    //   489: invokevirtual addElement : (Ljava/lang/Object;)V
    //   492: aload_0
    //   493: getfield b : Ljava/util/Vector;
    //   496: new gg
    //   499: dup
    //   500: ldc 'settings.specialThanks'
    //   502: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   505: invokespecial <init> : (Ljava/lang/String;)V
    //   508: iconst_1
    //   509: invokevirtual b : (I)Lgg;
    //   512: invokevirtual b : ()Lgg;
    //   515: invokevirtual addElement : (Ljava/lang/Object;)V
    //   518: aload_0
    //   519: getfield b : Ljava/util/Vector;
    //   522: new gg
    //   525: dup
    //   526: ldc 'rmn20\\nuninterestingrunt\\nBodyZR\\nKyrtovich\\nMuseCat\\nmostwantedcheater\\nJSON.org\\nregexp-me authors'
    //   528: invokespecial <init> : (Ljava/lang/String;)V
    //   531: iconst_1
    //   532: invokevirtual b : (I)Lgg;
    //   535: invokevirtual addElement : (Ljava/lang/Object;)V
    //   538: aload_0
    //   539: getfield b : Ljava/util/Vector;
    //   542: new gg
    //   545: dup
    //   546: ldc 'settings.thanksTesters'
    //   548: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   551: invokespecial <init> : (Ljava/lang/String;)V
    //   554: iconst_1
    //   555: invokevirtual b : (I)Lgg;
    //   558: invokevirtual addElement : (Ljava/lang/Object;)V
    //   561: aload_0
    //   562: getfield b : Ljava/util/Vector;
    //   565: new gg
    //   568: dup
    //   569: ldc 'settings.thanksYou'
    //   571: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   574: invokespecial <init> : (Ljava/lang/String;)V
    //   577: iconst_1
    //   578: invokevirtual b : (I)Lgg;
    //   581: invokevirtual addElement : (Ljava/lang/Object;)V
    //   584: aload_0
    //   585: getfield b : Ljava/util/Vector;
    //   588: new gg
    //   591: dup
    //   592: ldc 'vk4me. vk4you. vk4everyone.'
    //   594: invokespecial <init> : (Ljava/lang/String;)V
    //   597: iconst_1
    //   598: invokevirtual b : (I)Lgg;
    //   601: invokevirtual b : ()Lgg;
    //   604: invokevirtual addElement : (Ljava/lang/Object;)V
    //   607: aload_0
    //   608: astore_1
    //   609: getstatic gz.a : Lgz;
    //   612: aload_1
    //   613: invokevirtual b : (Lla;)V
    //   616: return
  }
  
  jo(ci paramci, boolean paramBoolean) {
    this(paramci, paramBoolean, (byte)0);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */