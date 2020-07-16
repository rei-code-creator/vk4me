final class bp extends r {
  private final i a;
  
  bp(i parami, String paramString) {
    super(paramString, (byte)0);
    this.a = parami;
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Li;
    //   4: getfield a : Llb;
    //   7: invokevirtual a : ()I
    //   10: invokestatic c : (I)V
    //   13: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/bp.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */