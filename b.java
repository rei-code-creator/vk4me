import java.util.Hashtable;

public final class b extends da {
  public Hashtable a = new Hashtable();
  
  public final da a(bj parambj) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 6
    //   4: aload_0
    //   5: areturn
    //   6: aload_0
    //   7: new java/util/Hashtable
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: putfield a : Ljava/util/Hashtable;
    //   17: aload_1
    //   18: ldc 'sizes'
    //   20: invokevirtual a : (Ljava/lang/String;)Lat;
    //   23: dup
    //   24: astore_1
    //   25: ifnull -> 139
    //   28: iconst_0
    //   29: istore_2
    //   30: iload_2
    //   31: aload_1
    //   32: getfield a : Ljava/util/Vector;
    //   35: invokevirtual size : ()I
    //   38: if_icmpge -> 139
    //   41: aload_1
    //   42: iload_2
    //   43: invokevirtual a : (I)Lbj;
    //   46: dup
    //   47: astore_3
    //   48: ifnull -> 133
    //   51: new eh
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: aload_3
    //   59: invokevirtual a : (Lbj;)Lda;
    //   62: checkcast eh
    //   65: dup
    //   66: astore_3
    //   67: getfield a : Ljava/lang/String;
    //   70: invokestatic a : (Ljava/lang/String;)Z
    //   73: ifne -> 80
    //   76: iconst_1
    //   77: goto -> 81
    //   80: iconst_0
    //   81: ifeq -> 133
    //   84: aload_3
    //   85: getfield a : Ljava/lang/String;
    //   88: ldc 's'
    //   90: invokevirtual equals : (Ljava/lang/Object;)Z
    //   93: ifne -> 120
    //   96: aload_3
    //   97: getfield a : Ljava/lang/String;
    //   100: ldc 'o'
    //   102: invokevirtual equals : (Ljava/lang/Object;)Z
    //   105: ifne -> 120
    //   108: aload_3
    //   109: getfield a : Ljava/lang/String;
    //   112: ldc 'p'
    //   114: invokevirtual equals : (Ljava/lang/Object;)Z
    //   117: ifeq -> 133
    //   120: aload_0
    //   121: getfield a : Ljava/util/Hashtable;
    //   124: aload_3
    //   125: getfield a : Ljava/lang/String;
    //   128: aload_3
    //   129: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   132: pop
    //   133: iinc #2, 1
    //   136: goto -> 30
    //   139: aload_0
    //   140: areturn
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/b.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */