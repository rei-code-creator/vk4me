final class ax extends w {
  private final ea a;
  
  ax(ea paramea) {
    this.a = paramea;
  }
  
  public final void a(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lea;
    //   4: lload_1
    //   5: lstore_3
    //   6: dup
    //   7: astore_1
    //   8: getfield a : Ljm;
    //   11: ifnull -> 21
    //   14: aload_1
    //   15: getfield b : Z
    //   18: ifeq -> 22
    //   21: return
    //   22: aload_1
    //   23: getfield a : Ljp;
    //   26: lload_3
    //   27: l2i
    //   28: invokevirtual a : (I)I
    //   31: pop
    //   32: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ax.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */