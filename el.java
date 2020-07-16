final class el extends fe {
  private final i a;
  
  el(i parami, String paramString) {
    super(paramString);
    this.a = parami;
  }
  
  public final void a() {
    // Byte code:
    //   0: new bn
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: aload_0
    //   8: getfield a : Li;
    //   11: getfield a : Llb;
    //   14: invokevirtual a : ()I
    //   17: invokevirtual a : (I)Lbn;
    //   20: invokevirtual a : ()Laj;
    //   23: checkcast lc
    //   26: dup
    //   27: astore_1
    //   28: ifnull -> 38
    //   31: aload_1
    //   32: invokevirtual b : ()Z
    //   35: ifne -> 39
    //   38: return
    //   39: aload_0
    //   40: getfield a : Li;
    //   43: getfield a : Llb;
    //   46: invokevirtual a : ()I
    //   49: invokestatic a : (I)V
    //   52: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/el.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */