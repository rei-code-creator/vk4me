import javax.microedition.lcdui.Graphics;

public final class ba extends la {
  int a;
  
  int b;
  
  public boolean a;
  
  public boolean b = true;
  
  public ba(String paramString) {
    super(paramString);
    a(true);
  }
  
  public ba() {
    this((String)null);
  }
  
  public final la a(ay paramay, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 14
    //   4: aload_1
    //   5: iconst_1
    //   6: putfield l : Z
    //   9: aload_1
    //   10: iload_2
    //   11: putfield n : Z
    //   14: aload_0
    //   15: getfield b : Ljava/util/Vector;
    //   18: aload_1
    //   19: invokevirtual addElement : (Ljava/lang/Object;)V
    //   22: aload_0
    //   23: areturn
  }
  
  public final int a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : I
    //   4: ifne -> 22
    //   7: aload_0
    //   8: aload_0
    //   9: invokevirtual b : ()I
    //   12: aload_0
    //   13: getfield b : Ljava/util/Vector;
    //   16: invokevirtual size : ()I
    //   19: invokevirtual g : (II)V
    //   22: aload_0
    //   23: getfield e : I
    //   26: getstatic gz.a : Lgz;
    //   29: getfield b : Ljavax/microedition/lcdui/Font;
    //   32: invokevirtual getHeight : ()I
    //   35: iadd
    //   36: getstatic gz.a : Lgz;
    //   39: invokevirtual getHeight : ()I
    //   42: invokestatic min : (II)I
    //   45: ireturn
  }
  
  private int c() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : I
    //   4: ifne -> 22
    //   7: aload_0
    //   8: aload_0
    //   9: invokevirtual b : ()I
    //   12: aload_0
    //   13: getfield b : Ljava/util/Vector;
    //   16: invokevirtual size : ()I
    //   19: invokevirtual g : (II)V
    //   22: aload_0
    //   23: getfield e : I
    //   26: getstatic gz.a : Lgz;
    //   29: invokevirtual getHeight : ()I
    //   32: getstatic gz.a : Lgz;
    //   35: getfield b : Ljavax/microedition/lcdui/Font;
    //   38: invokevirtual getHeight : ()I
    //   41: isub
    //   42: invokestatic min : (II)I
    //   45: ireturn
  }
  
  public final int b() {
    return (gz.a.getWidth() << 1) / 3;
  }
  
  public final void a(Graphics paramGraphics, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Z
    //   4: ifeq -> 17
    //   7: aload_0
    //   8: getfield b : Ljava/util/Vector;
    //   11: invokevirtual isEmpty : ()Z
    //   14: ifeq -> 18
    //   17: return
    //   18: aload_1
    //   19: aload_0
    //   20: invokevirtual a : ()I
    //   23: aload_0
    //   24: invokevirtual b : ()I
    //   27: invokestatic b : (II)Ljavax/microedition/lcdui/Image;
    //   30: aload_0
    //   31: getfield a : I
    //   34: aload_0
    //   35: getfield b : I
    //   38: bipush #20
    //   40: invokevirtual drawImage : (Ljavax/microedition/lcdui/Image;III)V
    //   43: aload_0
    //   44: aload_1
    //   45: aload_0
    //   46: getfield a : I
    //   49: aload_0
    //   50: getfield b : I
    //   53: getstatic gz.a : Lgz;
    //   56: getfield b : Ljavax/microedition/lcdui/Font;
    //   59: invokevirtual getHeight : ()I
    //   62: iconst_2
    //   63: idiv
    //   64: iadd
    //   65: aload_0
    //   66: invokevirtual b : ()I
    //   69: aload_0
    //   70: invokespecial c : ()I
    //   73: aload_0
    //   74: invokespecial c : ()I
    //   77: invokevirtual a : (Ljavax/microedition/lcdui/Graphics;IIIII)V
    //   80: return
  }
  
  public final void a(int paramInt) {
    super.a(paramInt);
    this.a = (paramInt == 6 || paramInt == 1 || paramInt == 1000011 || paramInt == 8 || paramInt == 56 || paramInt == 50);
  }
  
  private boolean a(int paramInt1, int paramInt2) {
    return (paramInt2 >= this.b + ((gz)gz.a).b.getHeight() / 2 && paramInt1 >= this.a && paramInt2 < this.b + ((gz)gz.a).b.getHeight() / 2 + c() && paramInt1 < this.a + b());
  }
  
  public final void a(int paramInt1, int paramInt2) {
    if (a(paramInt1, paramInt2))
      super.a(paramInt1 - this.a, paramInt2 + ((gz)gz.a).g - this.b - ((gz)gz.a).b.getHeight() / 2); 
  }
  
  public final void b(int paramInt1, int paramInt2) {
    if (a(paramInt1, paramInt2)) {
      super.b(paramInt1 - this.a, paramInt2 + ((gz)gz.a).g - this.b - ((gz)gz.a).b.getHeight() / 2);
      return;
    } 
    int i = paramInt2;
    paramInt2 = paramInt1;
    ba ba1 = this;
    if (!((i >= ba1.b && paramInt2 >= ba1.a && i < ba1.b + ba1.a() && paramInt2 < ba1.a + ba1.b()) ? 1 : 0))
      this.a = false; 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    if (a(paramInt1, paramInt2))
      super.c(paramInt1 - this.a, paramInt2 + ((gz)gz.a).g - this.b - ((gz)gz.a).b.getHeight() / 2); 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ba.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */