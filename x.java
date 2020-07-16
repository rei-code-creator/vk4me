public final class x extends da {
  public String a;
  
  public ir a;
  
  public boolean a;
  
  private int[] a;
  
  private int[] b;
  
  private int a;
  
  public final da a(bj parambj) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 6
    //   4: aload_0
    //   5: areturn
    //   6: aload_0
    //   7: aload_1
    //   8: ldc 'owner_id'
    //   10: invokevirtual a : (Ljava/lang/String;)I
    //   13: putfield a : I
    //   16: aload_1
    //   17: ldc 'members_count'
    //   19: invokevirtual a : (Ljava/lang/String;)I
    //   22: pop
    //   23: aload_0
    //   24: aload_1
    //   25: ldc 'title'
    //   27: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   30: putfield a : Ljava/lang/String;
    //   33: aload_1
    //   34: ldc 'state'
    //   36: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   39: pop
    //   40: aload_1
    //   41: ldc 'pinned_message'
    //   43: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   46: dup
    //   47: astore_2
    //   48: ifnull -> 63
    //   51: new bw
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: aload_2
    //   59: invokevirtual a : (Lbj;)Lda;
    //   62: pop
    //   63: aload_1
    //   64: ldc 'photo'
    //   66: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   69: dup
    //   70: astore_2
    //   71: ifnull -> 92
    //   74: aload_0
    //   75: new ir
    //   78: dup
    //   79: invokespecial <init> : ()V
    //   82: aload_2
    //   83: invokevirtual a : (Lbj;)Lda;
    //   86: checkcast ir
    //   89: putfield a : Lir;
    //   92: aload_0
    //   93: aload_1
    //   94: ldc 'is_group_channel'
    //   96: invokevirtual b : (Ljava/lang/String;)Z
    //   99: putfield a : Z
    //   102: aload_1
    //   103: ldc 'active_ids'
    //   105: invokevirtual a : (Ljava/lang/String;)Lat;
    //   108: dup
    //   109: astore_2
    //   110: ifnull -> 156
    //   113: aload_0
    //   114: aload_2
    //   115: getfield a : Ljava/util/Vector;
    //   118: invokevirtual size : ()I
    //   121: newarray int
    //   123: putfield a : [I
    //   126: iconst_0
    //   127: istore_3
    //   128: iload_3
    //   129: aload_2
    //   130: getfield a : Ljava/util/Vector;
    //   133: invokevirtual size : ()I
    //   136: if_icmpge -> 156
    //   139: aload_0
    //   140: getfield a : [I
    //   143: iload_3
    //   144: aload_2
    //   145: iload_3
    //   146: invokevirtual a : (I)I
    //   149: iastore
    //   150: iinc #3, 1
    //   153: goto -> 128
    //   156: aload_1
    //   157: ldc 'admin_ids'
    //   159: invokevirtual a : (Ljava/lang/String;)Lat;
    //   162: dup
    //   163: astore_2
    //   164: ifnull -> 210
    //   167: aload_0
    //   168: aload_2
    //   169: getfield a : Ljava/util/Vector;
    //   172: invokevirtual size : ()I
    //   175: newarray int
    //   177: putfield b : [I
    //   180: iconst_0
    //   181: istore_3
    //   182: iload_3
    //   183: aload_2
    //   184: getfield a : Ljava/util/Vector;
    //   187: invokevirtual size : ()I
    //   190: if_icmpge -> 210
    //   193: aload_0
    //   194: getfield b : [I
    //   197: iload_3
    //   198: aload_2
    //   199: iload_3
    //   200: invokevirtual a : (I)I
    //   203: iastore
    //   204: iinc #3, 1
    //   207: goto -> 182
    //   210: aload_0
    //   211: areturn
  }
  
  public final boolean a() {
    return (this.a != null);
  }
  
  public final boolean a(int paramInt) {
    if (this.a == paramInt)
      return true; 
    x x1;
    if (!(((x1 = this).b != null && x1.b.length > 0) ? 1 : 0))
      return false; 
    for (byte b = 0; b < this.b.length; b++) {
      if (paramInt == this.b[b])
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/x.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */