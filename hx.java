import java.util.Hashtable;
import javax.microedition.lcdui.Image;

public final class hx {
  private static Hashtable a = new Hashtable();
  
  public static final Image a;
  
  public static final Image b;
  
  public static final int a;
  
  public static final int b;
  
  public static void a() {
    // Byte code:
    //   0: getstatic hx.a : Ljava/util/Hashtable;
    //   3: invokevirtual clear : ()V
    //   6: return
  }
  
  public static Image a(cm paramcm) {
    // Byte code:
    //   0: getstatic hx.a : Ljava/util/Hashtable;
    //   3: new java/lang/StringBuffer
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: ldc 'a'
    //   12: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   15: aload_0
    //   16: invokevirtual a : ()Ljava/lang/String;
    //   19: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   22: invokevirtual toString : ()Ljava/lang/String;
    //   25: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   28: ifeq -> 63
    //   31: getstatic hx.a : Ljava/util/Hashtable;
    //   34: new java/lang/StringBuffer
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: ldc 'a'
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   46: aload_0
    //   47: invokevirtual a : ()Ljava/lang/String;
    //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   53: invokevirtual toString : ()Ljava/lang/String;
    //   56: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   59: checkcast javax/microedition/lcdui/Image
    //   62: areturn
    //   63: getstatic hx.a : I
    //   66: bipush #50
    //   68: if_icmple -> 78
    //   71: aload_0
    //   72: invokevirtual c : ()Ljava/lang/String;
    //   75: goto -> 82
    //   78: aload_0
    //   79: invokevirtual b : ()Ljava/lang/String;
    //   82: invokestatic b : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   85: dup
    //   86: astore_1
    //   87: ifnonnull -> 94
    //   90: invokestatic a : ()Ljavax/microedition/lcdui/Image;
    //   93: astore_1
    //   94: aload_1
    //   95: getstatic hx.a : I
    //   98: invokestatic a : (Ljavax/microedition/lcdui/Image;I)Ljavax/microedition/lcdui/Image;
    //   101: dup
    //   102: astore_1
    //   103: ifnull -> 136
    //   106: getstatic hx.a : Ljava/util/Hashtable;
    //   109: new java/lang/StringBuffer
    //   112: dup
    //   113: invokespecial <init> : ()V
    //   116: ldc 'a'
    //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   121: aload_0
    //   122: invokevirtual a : ()Ljava/lang/String;
    //   125: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   128: invokevirtual toString : ()Ljava/lang/String;
    //   131: aload_1
    //   132: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   135: pop
    //   136: aload_1
    //   137: areturn
  }
  
  public static Image a(int paramInt) {
    return a(paramInt, true);
  }
  
  public static Image a(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic hx.a : Ljava/util/Hashtable;
    //   3: new java/lang/StringBuffer
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: ldc 'p'
    //   12: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   15: iload_1
    //   16: ifeq -> 24
    //   19: bipush #98
    //   21: goto -> 26
    //   24: bipush #115
    //   26: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   29: iload_0
    //   30: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   33: invokevirtual toString : ()Ljava/lang/String;
    //   36: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   39: ifeq -> 85
    //   42: getstatic hx.a : Ljava/util/Hashtable;
    //   45: new java/lang/StringBuffer
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: ldc 'p'
    //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   57: iload_1
    //   58: ifeq -> 66
    //   61: bipush #98
    //   63: goto -> 68
    //   66: bipush #115
    //   68: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   71: iload_0
    //   72: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   75: invokevirtual toString : ()Ljava/lang/String;
    //   78: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   81: checkcast javax/microedition/lcdui/Image
    //   84: areturn
    //   85: iload_0
    //   86: invokestatic a : (I)Llb;
    //   89: astore_2
    //   90: iload_1
    //   91: ifeq -> 100
    //   94: getstatic hx.a : I
    //   97: goto -> 103
    //   100: getstatic hx.b : I
    //   103: bipush #50
    //   105: if_icmple -> 115
    //   108: aload_2
    //   109: invokevirtual c : ()Ljava/lang/String;
    //   112: goto -> 119
    //   115: aload_2
    //   116: invokevirtual b : ()Ljava/lang/String;
    //   119: invokestatic b : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   122: dup
    //   123: astore_3
    //   124: ifnonnull -> 182
    //   127: aload_2
    //   128: getfield d : Z
    //   131: ifeq -> 159
    //   134: aload_2
    //   135: checkcast lk
    //   138: getfield a : Ljava/lang/String;
    //   141: invokestatic a : (Ljava/lang/String;)Z
    //   144: ifne -> 153
    //   147: invokestatic d : ()Ljavax/microedition/lcdui/Image;
    //   150: goto -> 181
    //   153: invokestatic b : ()Ljavax/microedition/lcdui/Image;
    //   156: goto -> 181
    //   159: aload_2
    //   160: checkcast bi
    //   163: getfield b : Ljava/lang/String;
    //   166: invokestatic a : (Ljava/lang/String;)Z
    //   169: ifne -> 178
    //   172: invokestatic d : ()Ljavax/microedition/lcdui/Image;
    //   175: goto -> 181
    //   178: invokestatic c : ()Ljavax/microedition/lcdui/Image;
    //   181: astore_3
    //   182: aload_3
    //   183: iload_1
    //   184: ifeq -> 193
    //   187: getstatic hx.a : I
    //   190: goto -> 196
    //   193: getstatic hx.b : I
    //   196: invokestatic a : (Ljavax/microedition/lcdui/Image;I)Ljavax/microedition/lcdui/Image;
    //   199: astore_3
    //   200: iload_1
    //   201: ifeq -> 210
    //   204: getstatic hx.a : I
    //   207: goto -> 213
    //   210: getstatic hx.b : I
    //   213: getstatic v.a : Lv;
    //   216: getfield a : I
    //   219: imul
    //   220: sipush #200
    //   223: idiv
    //   224: aload_3
    //   225: invokestatic a : (ILjavax/microedition/lcdui/Image;)Ljavax/microedition/lcdui/Image;
    //   228: dup
    //   229: astore_3
    //   230: ifnull -> 274
    //   233: getstatic hx.a : Ljava/util/Hashtable;
    //   236: new java/lang/StringBuffer
    //   239: dup
    //   240: invokespecial <init> : ()V
    //   243: ldc 'p'
    //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   248: iload_1
    //   249: ifeq -> 257
    //   252: bipush #98
    //   254: goto -> 259
    //   257: bipush #115
    //   259: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   262: iload_0
    //   263: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   266: invokevirtual toString : ()Ljava/lang/String;
    //   269: aload_3
    //   270: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   273: pop
    //   274: aload_3
    //   275: areturn
  }
  
  public static Image a(is paramis) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_0
    //   7: invokevirtual b : ()Z
    //   10: ifeq -> 22
    //   13: aload_0
    //   14: invokevirtual a : ()I
    //   17: iconst_1
    //   18: invokestatic a : (IZ)Ljavax/microedition/lcdui/Image;
    //   21: areturn
    //   22: aload_0
    //   23: astore_0
    //   24: getstatic hx.a : Ljava/util/Hashtable;
    //   27: new java/lang/StringBuffer
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: ldc 'c'
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   39: aload_0
    //   40: invokevirtual a : ()I
    //   43: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   46: invokevirtual toString : ()Ljava/lang/String;
    //   49: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   52: ifeq -> 87
    //   55: getstatic hx.a : Ljava/util/Hashtable;
    //   58: new java/lang/StringBuffer
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: ldc 'c'
    //   67: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   70: aload_0
    //   71: invokevirtual a : ()I
    //   74: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   77: invokevirtual toString : ()Ljava/lang/String;
    //   80: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   83: checkcast javax/microedition/lcdui/Image
    //   86: areturn
    //   87: getstatic hx.a : I
    //   90: bipush #50
    //   92: if_icmple -> 201
    //   95: aload_0
    //   96: dup
    //   97: astore_1
    //   98: invokevirtual b : ()Z
    //   101: ifeq -> 117
    //   104: aload_1
    //   105: getfield a : Lhf;
    //   108: getfield a : I
    //   111: invokestatic a : (I)Llb;
    //   114: goto -> 118
    //   117: aconst_null
    //   118: astore_2
    //   119: aload_1
    //   120: invokevirtual b : ()Z
    //   123: ifeq -> 142
    //   126: aload_2
    //   127: ifnull -> 137
    //   130: aload_2
    //   131: invokevirtual c : ()Ljava/lang/String;
    //   134: goto -> 304
    //   137: ldc 'https://vk.com/images/camera_100.png'
    //   139: goto -> 304
    //   142: aload_1
    //   143: invokevirtual d : ()Z
    //   146: ifeq -> 196
    //   149: aload_1
    //   150: getfield a : Lx;
    //   153: invokevirtual a : ()Z
    //   156: ifeq -> 196
    //   159: aload_1
    //   160: getfield a : Lx;
    //   163: getfield a : Lir;
    //   166: getfield b : Ljava/lang/String;
    //   169: invokestatic a : (Ljava/lang/String;)Z
    //   172: ifne -> 179
    //   175: iconst_1
    //   176: goto -> 180
    //   179: iconst_0
    //   180: ifeq -> 196
    //   183: aload_1
    //   184: getfield a : Lx;
    //   187: getfield a : Lir;
    //   190: getfield b : Ljava/lang/String;
    //   193: goto -> 304
    //   196: ldc 'https://vk.com/images/icons/im_multichat_100.png'
    //   198: goto -> 304
    //   201: aload_0
    //   202: dup
    //   203: astore_1
    //   204: invokevirtual b : ()Z
    //   207: ifeq -> 223
    //   210: aload_1
    //   211: getfield a : Lhf;
    //   214: getfield a : I
    //   217: invokestatic a : (I)Llb;
    //   220: goto -> 224
    //   223: aconst_null
    //   224: astore_2
    //   225: aload_1
    //   226: invokevirtual b : ()Z
    //   229: ifeq -> 248
    //   232: aload_2
    //   233: ifnull -> 243
    //   236: aload_2
    //   237: invokevirtual b : ()Ljava/lang/String;
    //   240: goto -> 304
    //   243: ldc 'https://vk.com/images/camera_50.png'
    //   245: goto -> 304
    //   248: aload_1
    //   249: invokevirtual d : ()Z
    //   252: ifeq -> 302
    //   255: aload_1
    //   256: getfield a : Lx;
    //   259: invokevirtual a : ()Z
    //   262: ifeq -> 302
    //   265: aload_1
    //   266: getfield a : Lx;
    //   269: getfield a : Lir;
    //   272: getfield a : Ljava/lang/String;
    //   275: invokestatic a : (Ljava/lang/String;)Z
    //   278: ifne -> 285
    //   281: iconst_1
    //   282: goto -> 286
    //   285: iconst_0
    //   286: ifeq -> 302
    //   289: aload_1
    //   290: getfield a : Lx;
    //   293: getfield a : Lir;
    //   296: getfield a : Ljava/lang/String;
    //   299: goto -> 304
    //   302: ldc 'https://vk.com/images/icons/im_multichat_50.png'
    //   304: invokestatic b : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   307: dup
    //   308: astore_1
    //   309: ifnonnull -> 316
    //   312: invokestatic e : ()Ljavax/microedition/lcdui/Image;
    //   315: astore_1
    //   316: aload_1
    //   317: getstatic hx.a : I
    //   320: invokestatic a : (Ljavax/microedition/lcdui/Image;I)Ljavax/microedition/lcdui/Image;
    //   323: astore_1
    //   324: getstatic hx.a : I
    //   327: getstatic v.a : Lv;
    //   330: getfield a : I
    //   333: imul
    //   334: sipush #200
    //   337: idiv
    //   338: aload_1
    //   339: invokestatic a : (ILjavax/microedition/lcdui/Image;)Ljavax/microedition/lcdui/Image;
    //   342: dup
    //   343: astore_1
    //   344: ifnull -> 377
    //   347: getstatic hx.a : Ljava/util/Hashtable;
    //   350: new java/lang/StringBuffer
    //   353: dup
    //   354: invokespecial <init> : ()V
    //   357: ldc 'c'
    //   359: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   362: aload_0
    //   363: invokevirtual a : ()I
    //   366: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   369: invokevirtual toString : ()Ljava/lang/String;
    //   372: aload_1
    //   373: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   376: pop
    //   377: aload_1
    //   378: areturn
  }
  
  static {
    int i;
    int j;
    a = (j = (i = ((gz)gz.a).a.a() * 13 / 4) - ((gz)gz.a).a.a()) - ((i % 2 != j % 2) ? 1 : 0);
    b = (j = (i = ((gz)gz.a).a.a() << 1) - ((gz)gz.a).a.a() / 2) - ((i % 2 != j % 2) ? 1 : 0);
    int[] arrayOfInt = new int[a * a];
    for (j = 0; j < arrayOfInt.length; j++)
      arrayOfInt[j] = -2829100; 
    b = Image.createRGBImage(arrayOfInt, a, a, true);
    a = kp.a(a * v.a.a / 200, Image.createRGBImage(arrayOfInt, a, a, true));
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/hx.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */