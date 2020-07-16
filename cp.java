import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class cp {
  private Font a;
  
  private static jx a = new jx("((©|®|[?-?][퀀-?])+([ -㌀])(©|®|[?-?][퀀-?])+)|((©|®|[?-?][퀀-?])(©|®|?[퀀-?])?([ -㌀])*)", (byte)0);
  
  private static Thread a;
  
  private static boolean a = 0;
  
  private static Hashtable a = new Hashtable();
  
  private static Vector a = new Vector();
  
  private int a;
  
  public cp(Font paramFont) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield a : Ljavax/microedition/lcdui/Font;
    //   9: aload_1
    //   10: invokevirtual getHeight : ()I
    //   13: pop
    //   14: aload_0
    //   15: bipush #16
    //   17: aload_0
    //   18: getfield a : Ljavax/microedition/lcdui/Font;
    //   21: invokevirtual getHeight : ()I
    //   24: invokestatic max : (II)I
    //   27: putfield a : I
    //   30: getstatic cp.a : Ljava/lang/Thread;
    //   33: ifnonnull -> 57
    //   36: new lh
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: dup
    //   44: putstatic cp.a : Ljava/lang/Thread;
    //   47: iconst_1
    //   48: invokevirtual setPriority : (I)V
    //   51: getstatic cp.a : Ljava/lang/Thread;
    //   54: invokevirtual start : ()V
    //   57: return
  }
  
  public final String a(String paramString, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 11
    //   4: aload_1
    //   5: invokevirtual length : ()I
    //   8: ifne -> 14
    //   11: ldc ''
    //   13: areturn
    //   14: aload_1
    //   15: bipush #10
    //   17: bipush #32
    //   19: invokevirtual replace : (CC)Ljava/lang/String;
    //   22: bipush #10
    //   24: bipush #32
    //   26: invokevirtual replace : (CC)Ljava/lang/String;
    //   29: astore_1
    //   30: getstatic cp.a : Ljx;
    //   33: aload_1
    //   34: invokevirtual a : (Ljava/lang/String;)Ljava/util/Vector;
    //   37: dup
    //   38: astore #4
    //   40: invokevirtual size : ()I
    //   43: iconst_1
    //   44: if_icmpne -> 58
    //   47: aload_1
    //   48: iload_2
    //   49: iload_3
    //   50: aload_0
    //   51: getfield a : Ljavax/microedition/lcdui/Font;
    //   54: invokestatic a : (Ljava/lang/String;IZLjavax/microedition/lcdui/Font;)Ljava/lang/String;
    //   57: areturn
    //   58: aload_0
    //   59: aload #4
    //   61: invokespecial a : (Ljava/util/Vector;)I
    //   64: iload_2
    //   65: if_icmpgt -> 70
    //   68: aload_1
    //   69: areturn
    //   70: aload #4
    //   72: dup
    //   73: astore #6
    //   75: ifnonnull -> 82
    //   78: iconst_0
    //   79: goto -> 156
    //   82: aload #6
    //   84: invokevirtual size : ()I
    //   87: ifle -> 100
    //   90: aload #6
    //   92: invokevirtual size : ()I
    //   95: iconst_1
    //   96: isub
    //   97: goto -> 101
    //   100: iconst_0
    //   101: istore #7
    //   103: iconst_0
    //   104: istore #5
    //   106: iload #5
    //   108: aload #6
    //   110: invokevirtual size : ()I
    //   113: if_icmpge -> 154
    //   116: iload #7
    //   118: aload #6
    //   120: iload #5
    //   122: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   125: ifnonnull -> 132
    //   128: iconst_0
    //   129: goto -> 145
    //   132: aload #6
    //   134: iload #5
    //   136: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   139: checkcast java/lang/String
    //   142: invokevirtual length : ()I
    //   145: iadd
    //   146: istore #7
    //   148: iinc #5, 1
    //   151: goto -> 106
    //   154: iload #7
    //   156: istore #5
    //   158: iload #5
    //   160: ifle -> 318
    //   163: aload #4
    //   165: dup
    //   166: astore #6
    //   168: ifnull -> 243
    //   171: aload #6
    //   173: invokevirtual isEmpty : ()Z
    //   176: ifne -> 243
    //   179: aload #6
    //   181: aload #6
    //   183: invokevirtual size : ()I
    //   186: iconst_1
    //   187: isub
    //   188: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   191: checkcast java/lang/String
    //   194: dup
    //   195: astore #7
    //   197: invokevirtual length : ()I
    //   200: ifne -> 218
    //   203: aload #6
    //   205: aload #6
    //   207: invokevirtual size : ()I
    //   210: iconst_1
    //   211: isub
    //   212: invokevirtual removeElementAt : (I)V
    //   215: goto -> 243
    //   218: aload #6
    //   220: aload #7
    //   222: iconst_0
    //   223: aload #7
    //   225: invokevirtual length : ()I
    //   228: iconst_1
    //   229: isub
    //   230: invokevirtual substring : (II)Ljava/lang/String;
    //   233: aload #6
    //   235: invokevirtual size : ()I
    //   238: iconst_1
    //   239: isub
    //   240: invokevirtual setElementAt : (Ljava/lang/Object;I)V
    //   243: aload #6
    //   245: astore #4
    //   247: aload_0
    //   248: aload #4
    //   250: invokespecial a : (Ljava/util/Vector;)I
    //   253: iload_3
    //   254: ifeq -> 269
    //   257: aload_0
    //   258: getfield a : Ljavax/microedition/lcdui/Font;
    //   261: ldc '...'
    //   263: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   266: goto -> 270
    //   269: iconst_0
    //   270: iadd
    //   271: iload_2
    //   272: if_icmpgt -> 312
    //   275: new java/lang/StringBuffer
    //   278: dup
    //   279: invokespecial <init> : ()V
    //   282: aload_1
    //   283: aload #4
    //   285: invokestatic a : (Ljava/lang/String;Ljava/util/Vector;)Ljava/lang/String;
    //   288: invokevirtual trim : ()Ljava/lang/String;
    //   291: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   294: iload_3
    //   295: ifeq -> 303
    //   298: ldc '...'
    //   300: goto -> 305
    //   303: ldc ''
    //   305: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   308: invokevirtual toString : ()Ljava/lang/String;
    //   311: areturn
    //   312: iinc #5, -1
    //   315: goto -> 158
    //   318: iload_3
    //   319: ifeq -> 359
    //   322: iconst_3
    //   323: istore #5
    //   325: iload #5
    //   327: ifle -> 359
    //   330: ldc '...'
    //   332: iconst_0
    //   333: iload #5
    //   335: invokevirtual substring : (II)Ljava/lang/String;
    //   338: astore_1
    //   339: aload_0
    //   340: getfield a : Ljavax/microedition/lcdui/Font;
    //   343: aload_1
    //   344: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   347: iload_2
    //   348: if_icmpgt -> 353
    //   351: aload_1
    //   352: areturn
    //   353: iinc #5, -1
    //   356: goto -> 325
    //   359: ldc ''
    //   361: areturn
  }
  
  private int a(Vector paramVector) {
    if (paramVector == null)
      return 0; 
    int i = (paramVector.size() > 0) ? (paramVector.size() - 1 << 4) : 0;
    for (byte b = 0; b < paramVector.size(); b++)
      i += (paramVector.elementAt(b) == null) ? 0 : this.a.stringWidth(paramVector.elementAt(b)); 
    return i;
  }
  
  public final int a(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: iload_2
    //   1: ifeq -> 13
    //   4: aload_0
    //   5: getfield a : Ljavax/microedition/lcdui/Font;
    //   8: aload_1
    //   9: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   12: ireturn
    //   13: aload_0
    //   14: getstatic cp.a : Ljx;
    //   17: aload_1
    //   18: invokevirtual a : (Ljava/lang/String;)[Ljava/lang/String;
    //   21: astore_2
    //   22: astore_1
    //   23: aload_2
    //   24: ifnonnull -> 29
    //   27: iconst_0
    //   28: ireturn
    //   29: aload_2
    //   30: arraylength
    //   31: ifle -> 43
    //   34: aload_2
    //   35: arraylength
    //   36: iconst_1
    //   37: isub
    //   38: iconst_4
    //   39: ishl
    //   40: goto -> 44
    //   43: iconst_0
    //   44: istore_3
    //   45: iconst_0
    //   46: istore #4
    //   48: iload #4
    //   50: aload_2
    //   51: arraylength
    //   52: if_icmpge -> 86
    //   55: iload_3
    //   56: aload_2
    //   57: iload #4
    //   59: aaload
    //   60: ifnonnull -> 67
    //   63: iconst_0
    //   64: goto -> 78
    //   67: aload_1
    //   68: getfield a : Ljavax/microedition/lcdui/Font;
    //   71: aload_2
    //   72: iload #4
    //   74: aaload
    //   75: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   78: iadd
    //   79: istore_3
    //   80: iinc #4, 1
    //   83: goto -> 48
    //   86: iload_3
    //   87: ireturn
  }
  
  public final void a(Graphics paramGraphics, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 8
    //   4: aload_1
    //   5: ifnonnull -> 9
    //   8: return
    //   9: aload_1
    //   10: aload_0
    //   11: getfield a : Ljavax/microedition/lcdui/Font;
    //   14: invokevirtual setFont : (Ljavax/microedition/lcdui/Font;)V
    //   17: iload #6
    //   19: ifeq -> 48
    //   22: aload_1
    //   23: aload_2
    //   24: iload_3
    //   25: iload #4
    //   27: aload_0
    //   28: getfield a : I
    //   31: aload_0
    //   32: getfield a : Ljavax/microedition/lcdui/Font;
    //   35: invokevirtual getHeight : ()I
    //   38: isub
    //   39: iconst_2
    //   40: idiv
    //   41: iadd
    //   42: iload #5
    //   44: invokevirtual drawString : (Ljava/lang/String;III)V
    //   47: return
    //   48: iconst_m1
    //   49: istore #7
    //   51: getstatic v.a : Lv;
    //   54: getfield h : Z
    //   57: ifeq -> 72
    //   60: aload_1
    //   61: invokevirtual getColor : ()I
    //   64: istore #7
    //   66: aload_1
    //   67: ldc 16711680
    //   69: invokevirtual setColor : (I)V
    //   72: iload #5
    //   74: bipush #8
    //   76: iand
    //   77: bipush #8
    //   79: if_icmpne -> 92
    //   82: iload_3
    //   83: aload_0
    //   84: aload_2
    //   85: iload #6
    //   87: invokevirtual a : (Ljava/lang/String;Z)I
    //   90: isub
    //   91: istore_3
    //   92: iload #5
    //   94: iconst_1
    //   95: iand
    //   96: iconst_1
    //   97: if_icmpne -> 112
    //   100: iload_3
    //   101: aload_0
    //   102: aload_2
    //   103: iload #6
    //   105: invokevirtual a : (Ljava/lang/String;Z)I
    //   108: iconst_2
    //   109: idiv
    //   110: isub
    //   111: istore_3
    //   112: iload #5
    //   114: bipush #32
    //   116: iand
    //   117: bipush #32
    //   119: if_icmpne -> 131
    //   122: iload #4
    //   124: aload_0
    //   125: getfield a : I
    //   128: isub
    //   129: istore #4
    //   131: getstatic cp.a : Ljx;
    //   134: aload_2
    //   135: invokevirtual a : (Ljava/lang/String;)[Ljava/lang/String;
    //   138: astore #5
    //   140: iconst_0
    //   141: istore #6
    //   143: iconst_0
    //   144: istore #8
    //   146: iload #8
    //   148: aload #5
    //   150: arraylength
    //   151: if_icmpge -> 404
    //   154: aload_1
    //   155: aload #5
    //   157: iload #8
    //   159: aaload
    //   160: iload_3
    //   161: iload #6
    //   163: iadd
    //   164: iload #4
    //   166: aload_0
    //   167: getfield a : I
    //   170: aload_0
    //   171: getfield a : Ljavax/microedition/lcdui/Font;
    //   174: invokevirtual getHeight : ()I
    //   177: isub
    //   178: iconst_2
    //   179: idiv
    //   180: iadd
    //   181: bipush #20
    //   183: invokevirtual drawString : (Ljava/lang/String;III)V
    //   186: iload #6
    //   188: aload_0
    //   189: getfield a : Ljavax/microedition/lcdui/Font;
    //   192: aload #5
    //   194: iload #8
    //   196: aaload
    //   197: invokevirtual stringWidth : (Ljava/lang/String;)I
    //   200: iadd
    //   201: istore #6
    //   203: aload_2
    //   204: aload #5
    //   206: iload #8
    //   208: aaload
    //   209: invokevirtual length : ()I
    //   212: invokevirtual substring : (I)Ljava/lang/String;
    //   215: astore_2
    //   216: iload #8
    //   218: aload #5
    //   220: arraylength
    //   221: iconst_1
    //   222: isub
    //   223: if_icmpeq -> 398
    //   226: getstatic cp.a : Ljx;
    //   229: aload_2
    //   230: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   233: dup
    //   234: astore #9
    //   236: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   239: astore #10
    //   241: getstatic cp.a : Z
    //   244: ifne -> 385
    //   247: aload #10
    //   249: ifnull -> 385
    //   252: getstatic cp.a : Ljava/util/Hashtable;
    //   255: aload #10
    //   257: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   260: ifne -> 285
    //   263: getstatic cp.a : Ljava/util/Vector;
    //   266: aload #10
    //   268: invokevirtual contains : (Ljava/lang/Object;)Z
    //   271: ifne -> 285
    //   274: getstatic cp.a : Ljava/util/Vector;
    //   277: aload #10
    //   279: invokevirtual addElement : (Ljava/lang/Object;)V
    //   282: goto -> 385
    //   285: getstatic cp.a : Ljava/util/Hashtable;
    //   288: aload #10
    //   290: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   293: ifeq -> 385
    //   296: getstatic cp.a : Ljava/util/Hashtable;
    //   299: aload #10
    //   301: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   304: checkcast javax/microedition/lcdui/Image
    //   307: dup
    //   308: astore #11
    //   310: ifnull -> 376
    //   313: iload #7
    //   315: iconst_m1
    //   316: if_icmpeq -> 349
    //   319: aload_1
    //   320: iload_3
    //   321: iload #6
    //   323: iadd
    //   324: iload #4
    //   326: aload_0
    //   327: getfield a : I
    //   330: bipush #16
    //   332: isub
    //   333: iconst_2
    //   334: idiv
    //   335: iadd
    //   336: aload #11
    //   338: invokevirtual getWidth : ()I
    //   341: aload #11
    //   343: invokevirtual getHeight : ()I
    //   346: invokevirtual fillRect : (IIII)V
    //   349: aload_1
    //   350: aload #11
    //   352: iload_3
    //   353: iload #6
    //   355: iadd
    //   356: iload #4
    //   358: aload_0
    //   359: getfield a : I
    //   362: bipush #16
    //   364: isub
    //   365: iconst_2
    //   366: idiv
    //   367: iadd
    //   368: bipush #20
    //   370: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   373: goto -> 385
    //   376: getstatic cp.a : Ljava/util/Hashtable;
    //   379: aload #10
    //   381: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   384: pop
    //   385: iinc #6, 16
    //   388: aload_2
    //   389: aload #9
    //   391: invokevirtual length : ()I
    //   394: invokevirtual substring : (I)Ljava/lang/String;
    //   397: astore_2
    //   398: iinc #8, 1
    //   401: goto -> 146
    //   404: iload #7
    //   406: iconst_m1
    //   407: if_icmpeq -> 416
    //   410: aload_1
    //   411: iload #7
    //   413: invokevirtual setColor : (I)V
    //   416: return
  }
  
  private static String a(String paramString) {
    byte[] arrayOfByte;
    try {
      arrayOfByte = paramString.getBytes("UTF-8");
    } catch (Exception exception) {
      return null;
    } 
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < arrayOfByte.length; b++) {
      String str;
      if ((str = Integer.toHexString(0xFF & arrayOfByte[b])).length() == 1)
        stringBuffer.append('0'); 
      stringBuffer.append(str);
    } 
    return stringBuffer.toString();
  }
  
  public final int a() {
    return this.a;
  }
  
  public static boolean a(String paramString) {
    return (paramString == null) ? false : ((a.a(paramString).size() > 1));
  }
  
  public static void a() {
    // Byte code:
    //   0: getstatic cp.a : Ljava/util/Vector;
    //   3: invokevirtual isEmpty : ()Z
    //   6: ifne -> 30
    //   9: getstatic gz.a : Lgz;
    //   12: getfield a : Lla;
    //   15: ifnull -> 30
    //   18: getstatic gz.a : Lgz;
    //   21: getfield a : Lkz;
    //   24: getfield a : Z
    //   27: ifeq -> 43
    //   30: ldc2_w 3000
    //   33: invokestatic sleep : (J)V
    //   36: goto -> 0
    //   39: pop
    //   40: goto -> 0
    //   43: iconst_0
    //   44: istore_0
    //   45: iload_0
    //   46: getstatic cp.a : Ljava/util/Vector;
    //   49: invokevirtual size : ()I
    //   52: if_icmpge -> 266
    //   55: getstatic cp.a : Ljava/util/Vector;
    //   58: iload_0
    //   59: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   62: checkcast java/lang/String
    //   65: astore_1
    //   66: aconst_null
    //   67: astore_2
    //   68: new java/lang/StringBuffer
    //   71: dup
    //   72: invokespecial <init> : ()V
    //   75: ldc 'emoji/'
    //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   80: aload_1
    //   81: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   84: invokevirtual toString : ()Ljava/lang/String;
    //   87: iconst_0
    //   88: invokestatic a : (Ljava/lang/String;Z)Ljavax/microedition/lcdui/Image;
    //   91: dup
    //   92: astore_2
    //   93: ifnonnull -> 104
    //   96: new java/lang/NullPointerException
    //   99: dup
    //   100: invokespecial <init> : ()V
    //   103: athrow
    //   104: goto -> 207
    //   107: athrow
    //   108: pop
    //   109: new java/lang/StringBuffer
    //   112: dup
    //   113: invokespecial <init> : ()V
    //   116: ldc 'http://vk4me.curoviyx.ru/next/res/emoji/'
    //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   121: getstatic cp.a : Ljava/util/Vector;
    //   124: iload_0
    //   125: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   128: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   131: ldc '.png'
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   136: invokevirtual toString : ()Ljava/lang/String;
    //   139: invokestatic a : (Ljava/lang/String;)[B
    //   142: astore_3
    //   143: new java/io/ByteArrayInputStream
    //   146: dup
    //   147: aload_3
    //   148: invokespecial <init> : ([B)V
    //   151: invokestatic createImage : (Ljava/io/InputStream;)Ljavax/microedition/lcdui/Image;
    //   154: astore_2
    //   155: new java/lang/StringBuffer
    //   158: dup
    //   159: invokespecial <init> : ()V
    //   162: ldc 'emoji/'
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   167: aload_1
    //   168: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   171: invokevirtual toString : ()Ljava/lang/String;
    //   174: aload_3
    //   175: invokestatic a : (Ljava/lang/String;[B)Z
    //   178: pop
    //   179: goto -> 207
    //   182: athrow
    //   183: pop
    //   184: new java/lang/StringBuffer
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: ldc 'emoji/'
    //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   196: aload_1
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   200: invokevirtual toString : ()Ljava/lang/String;
    //   203: invokestatic a : (Ljava/lang/String;)Z
    //   206: pop
    //   207: aload_2
    //   208: ifnonnull -> 214
    //   211: goto -> 260
    //   214: getstatic cp.a : Ljava/util/Hashtable;
    //   217: getstatic cp.a : Ljava/util/Vector;
    //   220: iload_0
    //   221: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   224: checkcast java/lang/String
    //   227: aload_2
    //   228: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   231: pop
    //   232: getstatic cp.a : Ljava/util/Vector;
    //   235: iload_0
    //   236: invokevirtual removeElementAt : (I)V
    //   239: getstatic gz.a : Lgz;
    //   242: invokevirtual b : ()V
    //   245: goto -> 260
    //   248: athrow
    //   249: astore_1
    //   250: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   253: aload_1
    //   254: invokevirtual toString : ()Ljava/lang/String;
    //   257: invokevirtual println : (Ljava/lang/String;)V
    //   260: iinc #0, 1
    //   263: goto -> 45
    //   266: goto -> 0
    //   269: pop
    //   270: getstatic cp.a : Ljava/util/Vector;
    //   273: invokevirtual removeAllElements : ()V
    //   276: getstatic cp.a : Ljava/util/Hashtable;
    //   279: invokevirtual clear : ()V
    //   282: iconst_1
    //   283: putstatic cp.a : Z
    //   286: invokestatic gc : ()V
    //   289: goto -> 0
    // Exception table:
    //   from	to	target	type
    //   0	40	269	java/lang/OutOfMemoryError
    //   30	36	39	java/lang/Exception
    //   43	266	269	java/lang/OutOfMemoryError
    //   55	211	248	java/lang/OutOfMemoryError
    //   55	211	249	java/lang/Exception
    //   68	104	107	java/lang/OutOfMemoryError
    //   68	104	108	java/lang/Exception
    //   109	179	182	java/lang/OutOfMemoryError
    //   109	179	183	java/lang/Exception
    //   214	245	248	java/lang/OutOfMemoryError
    //   214	245	249	java/lang/Exception
  }
  
  private static String a(String paramString, Vector paramVector) {
    // Byte code:
    //   0: ldc ''
    //   2: astore_2
    //   3: iconst_0
    //   4: istore_3
    //   5: iload_3
    //   6: aload_1
    //   7: invokevirtual size : ()I
    //   10: if_icmpge -> 107
    //   13: new java/lang/StringBuffer
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: aload_2
    //   21: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   24: aload_1
    //   25: iload_3
    //   26: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   29: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
    //   32: invokevirtual toString : ()Ljava/lang/String;
    //   35: astore_2
    //   36: aload_0
    //   37: aload_1
    //   38: iload_3
    //   39: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   42: checkcast java/lang/String
    //   45: invokevirtual length : ()I
    //   48: invokevirtual substring : (I)Ljava/lang/String;
    //   51: astore_0
    //   52: iload_3
    //   53: aload_1
    //   54: invokevirtual size : ()I
    //   57: iconst_1
    //   58: isub
    //   59: if_icmpeq -> 101
    //   62: getstatic cp.a : Ljx;
    //   65: aload_0
    //   66: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   69: astore #4
    //   71: new java/lang/StringBuffer
    //   74: dup
    //   75: invokespecial <init> : ()V
    //   78: aload_2
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   82: aload #4
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   87: invokevirtual toString : ()Ljava/lang/String;
    //   90: astore_2
    //   91: aload_0
    //   92: aload #4
    //   94: invokevirtual length : ()I
    //   97: invokevirtual substring : (I)Ljava/lang/String;
    //   100: astore_0
    //   101: iinc #3, 1
    //   104: goto -> 5
    //   107: aload_2
    //   108: areturn
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/cp.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */