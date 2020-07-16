public final class dz implements ca {
  private final ce a;
  
  dz(ce paramce) {
    this.a = paramce;
  }
  
  public final void a(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lce;
    //   4: getfield a : Lea;
    //   7: invokevirtual a : ()Lcm;
    //   10: dup
    //   11: astore_3
    //   12: ifnull -> 53
    //   15: aload_3
    //   16: invokevirtual toString : ()Ljava/lang/String;
    //   19: aload_0
    //   20: getfield a : Lce;
    //   23: getfield a : Lcm;
    //   26: invokevirtual toString : ()Ljava/lang/String;
    //   29: invokevirtual equals : (Ljava/lang/Object;)Z
    //   32: ifeq -> 53
    //   35: aload_0
    //   36: getfield a : Lce;
    //   39: getfield a : Lea;
    //   42: getfield a : Lcj;
    //   45: lload_1
    //   46: invokevirtual a : (J)Lcj;
    //   49: pop
    //   50: invokestatic d : ()V
    //   53: return
  }
  
  public dz() {}
}


/* Location:              /home/kost/Загрузки/latest.jar!/dz.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */