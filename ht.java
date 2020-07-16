public class ht extends dv {
  public int a;
  
  public int[] a;
  
  private String a;
  
  public int b = Integer.MAX_VALUE;
  
  public int c = Integer.MIN_VALUE;
  
  public final da a(bj parambj) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 6
    //   4: aload_0
    //   5: areturn
    //   6: aload_0
    //   7: aload_1
    //   8: ldc 'duration'
    //   10: invokevirtual a : (Ljava/lang/String;)I
    //   13: putfield a : I
    //   16: aload_1
    //   17: ldc 'link_ogg'
    //   19: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   22: pop
    //   23: aload_0
    //   24: aload_1
    //   25: ldc 'link_mp3'
    //   27: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   30: putfield a : Ljava/lang/String;
    //   33: aload_1
    //   34: ldc 'waveform'
    //   36: invokevirtual a : (Ljava/lang/String;)Lat;
    //   39: dup
    //   40: astore_1
    //   41: ifnull -> 121
    //   44: aload_0
    //   45: aload_1
    //   46: getfield a : Ljava/util/Vector;
    //   49: invokevirtual size : ()I
    //   52: newarray int
    //   54: putfield a : [I
    //   57: iconst_0
    //   58: istore_2
    //   59: iload_2
    //   60: aload_1
    //   61: getfield a : Ljava/util/Vector;
    //   64: invokevirtual size : ()I
    //   67: if_icmpge -> 121
    //   70: aload_0
    //   71: getfield a : [I
    //   74: iload_2
    //   75: aload_1
    //   76: iload_2
    //   77: invokevirtual a : (I)I
    //   80: iastore
    //   81: aload_0
    //   82: aload_0
    //   83: getfield b : I
    //   86: aload_0
    //   87: getfield a : [I
    //   90: iload_2
    //   91: iaload
    //   92: invokestatic min : (II)I
    //   95: putfield b : I
    //   98: aload_0
    //   99: aload_0
    //   100: getfield c : I
    //   103: aload_0
    //   104: getfield a : [I
    //   107: iload_2
    //   108: iaload
    //   109: invokestatic max : (II)I
    //   112: putfield c : I
    //   115: iinc #2, 1
    //   118: goto -> 59
    //   121: aload_0
    //   122: areturn
  }
  
  public final String toString() {
    return this.a;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ht.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */