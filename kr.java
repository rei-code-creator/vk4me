import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class kr extends fl implements cc {
  private static Thread a;
  
  private static Vector a = new Vector();
  
  private bw a;
  
  private int c;
  
  private boolean b;
  
  public kr(bw parambw, dv paramdv, int paramInt) {
    this.n = true;
    super.a = true;
    super.a = !(paramdv instanceof ej) ? 1 : 0;
    this.a = parambw;
    if (parambw != null)
      this.b = parambw.a; 
    super.a = paramdv;
    this.d = paramInt - a * 3;
    this.c = paramInt - a;
    kr kr1 = this;
    try {
      if ((dv)kr1.a instanceof jc) {
        eh eh;
        if ((eh = ((jc)kr1.a).a()) != null)
          kr1.a(eh.a, eh.b); 
      } else if ((dv)kr1.a instanceof dp) {
        paramdv = (dp)kr1.a;
        kr1.a(((dp)paramdv).a, ((dp)paramdv).b);
      } else {
        de de;
        if ((dv)kr1.a instanceof ej && (de = ((ej)kr1.a).a) != null)
          kr1.a(de.a, de.b); 
      } 
    } catch (Exception exception) {}
    if (kr1.c_ > 0)
      kr1.c = kr1.c_ + (a << 1); 
    a.addElement(this);
  }
  
  public final bw a() {
    return this.a;
  }
  
  public final ay d(int paramInt) {
    this.c = paramInt;
    return this;
  }
  
  public final int a() {
    return this.c;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2) {
    d();
    byte b = -1;
    paramInt2 += this.b ? (this.d - this.c) : 0;
    if (this.c > 0 && this.e > null)
      paramGraphics.drawImage(kp.b(this.c, this.e, (this.k && this.m), this.b), this.f + paramInt2, this.g + paramInt1, 20); 
    if (this.a != null) {
      byte b1 = (this.a == 4) ? 0 : ((this.a == 8) ? (this.c - this.a.getWidth()) : ((this.c - this.a.getWidth()) / 2));
      paramGraphics.drawRegion((Image)this.a, 0, (this.a.getHeight() - this.e) / 2, this.a.getWidth(), (this.a.getHeight() - this.e) / 2 + this.e, 0, this.f + paramInt2 + b1, this.g + paramInt1, 20);
      this.b = null;
    } else if (this.b != -1) {
      int i = Math.min(this.c, this.c_);
      if (this.b == null && i != 0 && this.e != null) {
        this.b = Image.createImage(i, this.e);
        Graphics graphics;
        (graphics = this.b.getGraphics()).setColor(this.b);
        graphics.fillRect(0, 0, i, this.e);
      } 
      if (this.b != null) {
        byte b1 = (this.a == 4) ? 0 : ((this.a == 8) ? (this.c - this.b.getWidth()) : ((this.c - this.b.getWidth()) / 2));
        paramGraphics.drawImage(this.b, this.f + paramInt2 + b1, this.g + paramInt1, 20);
      } 
    } 
    if (this.k && this.m && b != -1) {
      paramGraphics.setColor(4681404);
      if (this.a == null) {
        paramGraphics.drawRect(this.f + paramInt2 + b, this.g + paramInt1, this.a.getWidth(), this.a.getHeight());
        return;
      } 
      kp.b(paramGraphics, this.f + paramInt2 + b, this.g + paramInt1, this.a.getWidth(), this.a.getHeight(), ((gz)gz.a).a.getHeight() / 2, kp.a);
    } 
  }
  
  public final ay a(ba paramba) {
    return this;
  }
  
  public final void a() {}
  
  static void b() {
    // Byte code:
    //   0: getstatic kr.a : Ljava/util/Vector;
    //   3: invokevirtual isEmpty : ()Z
    //   6: ifne -> 30
    //   9: getstatic gz.a : Lgz;
    //   12: getfield a : Lla;
    //   15: ifnull -> 30
    //   18: getstatic gz.a : Lgz;
    //   21: getfield a : Lla;
    //   24: instanceof hs
    //   27: ifne -> 43
    //   30: ldc2_w 3000
    //   33: invokestatic sleep : (J)V
    //   36: goto -> 0
    //   39: pop
    //   40: goto -> 0
    //   43: iconst_0
    //   44: istore_0
    //   45: iload_0
    //   46: getstatic kr.a : Ljava/util/Vector;
    //   49: invokevirtual size : ()I
    //   52: if_icmpge -> 214
    //   55: getstatic kr.a : Ljava/util/Vector;
    //   58: iload_0
    //   59: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   62: checkcast ay
    //   65: astore_1
    //   66: aload_1
    //   67: instanceof kr
    //   70: ifeq -> 194
    //   73: aload_1
    //   74: checkcast kr
    //   77: dup
    //   78: dup
    //   79: astore_1
    //   80: getfield a : Lad;
    //   83: checkcast dv
    //   86: instanceof jc
    //   89: ifeq -> 120
    //   92: aload_1
    //   93: getfield a : Lad;
    //   96: checkcast dv
    //   99: checkcast jc
    //   102: invokevirtual a : ()Leh;
    //   105: dup
    //   106: astore_1
    //   107: ifnull -> 117
    //   110: aload_1
    //   111: getfield b : Ljava/lang/String;
    //   114: goto -> 188
    //   117: goto -> 187
    //   120: aload_1
    //   121: getfield a : Lad;
    //   124: checkcast dv
    //   127: instanceof dp
    //   130: ifeq -> 149
    //   133: aload_1
    //   134: getfield a : Lad;
    //   137: checkcast dv
    //   140: checkcast dp
    //   143: getfield a : Ljava/lang/String;
    //   146: goto -> 188
    //   149: aload_1
    //   150: getfield a : Lad;
    //   153: checkcast dv
    //   156: instanceof ej
    //   159: ifeq -> 187
    //   162: aload_1
    //   163: getfield a : Lad;
    //   166: checkcast dv
    //   169: checkcast ej
    //   172: getfield a : Lde;
    //   175: dup
    //   176: astore_1
    //   177: ifnull -> 187
    //   180: aload_1
    //   181: getfield a : Ljava/lang/String;
    //   184: goto -> 188
    //   187: aconst_null
    //   188: invokestatic b : (Ljava/lang/String;)Ljavax/microedition/lcdui/Image;
    //   191: invokevirtual a : (Ljavax/microedition/lcdui/Image;)V
    //   194: goto -> 198
    //   197: pop
    //   198: getstatic kr.a : Ljava/util/Vector;
    //   201: iload_0
    //   202: invokevirtual removeElementAt : (I)V
    //   205: invokestatic f : ()V
    //   208: iinc #0, 1
    //   211: goto -> 45
    //   214: ldc2_w 3000
    //   217: invokestatic sleep : (J)V
    //   220: goto -> 0
    //   223: pop
    //   224: goto -> 0
    //   227: pop
    //   228: getstatic kr.a : Ljava/util/Vector;
    //   231: invokevirtual removeAllElements : ()V
    //   234: invokestatic gc : ()V
    //   237: goto -> 0
    //   240: pop
    //   241: goto -> 0
    // Exception table:
    //   from	to	target	type
    //   0	40	227	java/lang/OutOfMemoryError
    //   0	40	240	java/lang/Exception
    //   30	36	39	java/lang/Exception
    //   43	224	227	java/lang/OutOfMemoryError
    //   43	224	240	java/lang/Exception
    //   66	194	197	java/lang/Exception
    //   214	220	223	java/lang/Exception
  }
  
  static {
    if (a == null) {
      (a = (bw)new bd()).setPriority(1);
      a.start();
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/kr.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */