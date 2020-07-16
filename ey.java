final class ey extends r {
  private final eb a;
  
  ey(eb parameb, String paramString) {
    super(paramString);
    this.a = parameb;
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Leb;
    //   4: aconst_null
    //   5: putfield a : Lbw;
    //   8: aload_0
    //   9: getfield a : Leb;
    //   12: getfield a : Lla;
    //   15: getfield b : Ljava/util/Vector;
    //   18: aload_0
    //   19: invokevirtual removeElement : (Ljava/lang/Object;)Z
    //   22: pop
    //   23: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ey.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */