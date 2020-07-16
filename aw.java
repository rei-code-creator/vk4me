final class aw extends w {
  private final ea a;
  
  aw(ea paramea) {
    this.a = paramea;
  }
  
  public final void a(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lea;
    //   4: lload_1
    //   5: l2i
    //   6: putfield b : I
    //   9: aload_0
    //   10: getfield a : Lea;
    //   13: getfield a : Ljp;
    //   16: aload_0
    //   17: getfield a : Lea;
    //   20: getfield b : I
    //   23: bipush #10
    //   25: imul
    //   26: invokevirtual a : (I)V
    //   29: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/aw.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */