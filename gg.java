import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public class gg extends ay {
  public static int a_ = ((gz)gz.a).a.charWidth(' ');
  
  private String a;
  
  private Vector a;
  
  private boolean a;
  
  private int b;
  
  private boolean b;
  
  private int c;
  
  public final gg a() {
    return this;
  }
  
  public final gg a(int paramInt) {
    this.b = Math.abs(paramInt);
    return this;
  }
  
  public final gg b(int paramInt) {
    this.c = paramInt;
    return this;
  }
  
  public gg(String paramString) {
    a(paramString);
    this.m = false;
  }
  
  public final gg b() {
    this.b = true;
    return this;
  }
  
  public final gg a(String paramString) {
    this.a = paramString;
    this.a = null;
    this.a = false;
    return this;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : I
    //   4: iconst_1
    //   5: if_icmpeq -> 22
    //   8: aload_0
    //   9: getfield c : I
    //   12: bipush #8
    //   14: if_icmpeq -> 22
    //   17: aload_0
    //   18: iconst_4
    //   19: putfield c : I
    //   22: aload_0
    //   23: invokevirtual d : ()V
    //   26: aload_1
    //   27: aload_0
    //   28: getfield b : I
    //   31: invokevirtual setColor : (I)V
    //   34: iconst_0
    //   35: istore #4
    //   37: aload_0
    //   38: getfield a : Ljava/util/Vector;
    //   41: ifnull -> 366
    //   44: aload_0
    //   45: dup
    //   46: astore #7
    //   48: getfield g : I
    //   51: iload_2
    //   52: iadd
    //   53: aload #7
    //   55: getfield l : Z
    //   58: ifne -> 70
    //   61: getstatic gz.a : Lgz;
    //   64: getfield g : I
    //   67: goto -> 76
    //   70: getstatic gz.a : Lgz;
    //   73: invokevirtual a : ()I
    //   76: isub
    //   77: istore #8
    //   79: iconst_0
    //   80: istore #7
    //   82: iload #8
    //   84: ifge -> 108
    //   87: iconst_0
    //   88: iload #8
    //   90: ineg
    //   91: getstatic gg.a_ : I
    //   94: getstatic gz.a : Lgz;
    //   97: getfield a : Lcp;
    //   100: invokevirtual a : ()I
    //   103: iadd
    //   104: idiv
    //   105: iadd
    //   106: istore #7
    //   108: iload #7
    //   110: istore #5
    //   112: iconst_0
    //   113: istore #6
    //   115: iload #6
    //   117: aload_0
    //   118: dup
    //   119: astore #7
    //   121: getfield g : I
    //   124: iload_2
    //   125: iadd
    //   126: aload #7
    //   128: getfield l : Z
    //   131: ifne -> 143
    //   134: getstatic gz.a : Lgz;
    //   137: getfield g : I
    //   140: goto -> 149
    //   143: getstatic gz.a : Lgz;
    //   146: invokevirtual a : ()I
    //   149: isub
    //   150: aload #7
    //   152: getfield e : I
    //   155: iadd
    //   156: aload #7
    //   158: getfield l : Z
    //   161: ifne -> 173
    //   164: getstatic gz.a : Lgz;
    //   167: getfield h : I
    //   170: goto -> 179
    //   173: getstatic gz.a : Lgz;
    //   176: invokevirtual b : ()I
    //   179: isub
    //   180: istore #8
    //   182: aload #7
    //   184: getfield a : Ljava/util/Vector;
    //   187: invokevirtual size : ()I
    //   190: istore #7
    //   192: iload #8
    //   194: ifle -> 219
    //   197: iload #7
    //   199: iload #8
    //   201: ineg
    //   202: getstatic gg.a_ : I
    //   205: getstatic gz.a : Lgz;
    //   208: getfield a : Lcp;
    //   211: invokevirtual a : ()I
    //   214: iadd
    //   215: idiv
    //   216: iadd
    //   217: istore #7
    //   219: iload #7
    //   221: if_icmpge -> 366
    //   224: aload_0
    //   225: getfield c : I
    //   228: iconst_1
    //   229: if_icmpne -> 241
    //   232: aload_0
    //   233: getfield d : I
    //   236: iconst_2
    //   237: idiv
    //   238: goto -> 258
    //   241: aload_0
    //   242: getfield c : I
    //   245: bipush #8
    //   247: if_icmpne -> 257
    //   250: aload_0
    //   251: getfield d : I
    //   254: goto -> 258
    //   257: iconst_0
    //   258: istore #7
    //   260: aload_0
    //   261: getfield b : Z
    //   264: ifeq -> 276
    //   267: getstatic gz.a : Lgz;
    //   270: getfield b : Lcp;
    //   273: goto -> 282
    //   276: getstatic gz.a : Lgz;
    //   279: getfield a : Lcp;
    //   282: astore #8
    //   284: iload #6
    //   286: iload #5
    //   288: if_icmplt -> 346
    //   291: aload #8
    //   293: aload_1
    //   294: aload_0
    //   295: getfield a : Ljava/util/Vector;
    //   298: iload #6
    //   300: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   303: checkcast java/lang/String
    //   306: aload_0
    //   307: getfield f : I
    //   310: iload_3
    //   311: iadd
    //   312: iload #7
    //   314: iadd
    //   315: aload_0
    //   316: getfield g : I
    //   319: iload_2
    //   320: iadd
    //   321: iload #4
    //   323: iadd
    //   324: bipush #16
    //   326: aload_0
    //   327: getfield c : I
    //   330: ior
    //   331: aload_0
    //   332: getfield a : Z
    //   335: ifne -> 342
    //   338: iconst_1
    //   339: goto -> 343
    //   342: iconst_0
    //   343: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;Ljava/lang/String;IIIZ)V
    //   346: iload #4
    //   348: getstatic gg.a_ : I
    //   351: aload #8
    //   353: invokevirtual a : ()I
    //   356: iadd
    //   357: iadd
    //   358: istore #4
    //   360: iinc #6, 1
    //   363: goto -> 115
    //   366: aload_0
    //   367: getfield k : Z
    //   370: ifeq -> 410
    //   373: aload_0
    //   374: getfield m : Z
    //   377: ifeq -> 410
    //   380: aload_1
    //   381: ldc 4681404
    //   383: invokevirtual setColor : (I)V
    //   386: aload_1
    //   387: aload_0
    //   388: getfield f : I
    //   391: iload_3
    //   392: iadd
    //   393: aload_0
    //   394: getfield g : I
    //   397: iload_2
    //   398: iadd
    //   399: aload_0
    //   400: getfield d : I
    //   403: aload_0
    //   404: getfield e : I
    //   407: invokevirtual drawRect : (IIII)V
    //   410: return
  }
  
  public final void d() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : I
    //   4: ifle -> 102
    //   7: aload_0
    //   8: getfield a : Ljava/util/Vector;
    //   11: ifnonnull -> 102
    //   14: aload_0
    //   15: getfield a : Ljava/lang/String;
    //   18: ifnull -> 102
    //   21: aload_0
    //   22: aload_0
    //   23: getfield a : Ljava/lang/String;
    //   26: aload_0
    //   27: getfield d : I
    //   30: getstatic gz.a : Lgz;
    //   33: getfield a : Lcp;
    //   36: invokestatic a : (Ljava/lang/String;ILjava/lang/Object;)Ljava/util/Vector;
    //   39: putfield a : Ljava/util/Vector;
    //   42: aload_0
    //   43: aload_0
    //   44: getfield a : Ljava/util/Vector;
    //   47: invokevirtual size : ()I
    //   50: getstatic gz.a : Lgz;
    //   53: getfield a : Lcp;
    //   56: invokevirtual a : ()I
    //   59: imul
    //   60: aload_0
    //   61: getfield a : Ljava/util/Vector;
    //   64: invokevirtual isEmpty : ()Z
    //   67: ifeq -> 74
    //   70: iconst_0
    //   71: goto -> 87
    //   74: aload_0
    //   75: getfield a : Ljava/util/Vector;
    //   78: invokevirtual size : ()I
    //   81: iconst_1
    //   82: isub
    //   83: getstatic gg.a_ : I
    //   86: imul
    //   87: iadd
    //   88: putfield e : I
    //   91: aload_0
    //   92: aload_0
    //   93: getfield a : Ljava/lang/String;
    //   96: invokestatic a : (Ljava/lang/String;)Z
    //   99: putfield a : Z
    //   102: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/gg.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */