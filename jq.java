public final class jq extends da implements ca {
  public int a;
  
  public int b;
  
  public String a;
  
  private int[] a;
  
  public dv[] a;
  
  public ij a;
  
  public hy a;
  
  private int c;
  
  public final da a(bj parambj) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 6
    //   4: aload_0
    //   5: areturn
    //   6: aload_0
    //   7: aload_1
    //   8: ldc 'id'
    //   10: invokevirtual a : (Ljava/lang/String;)I
    //   13: putfield a : I
    //   16: aload_0
    //   17: aload_1
    //   18: ldc 'from_id'
    //   20: invokevirtual a : (Ljava/lang/String;)I
    //   23: putfield b : I
    //   26: aload_1
    //   27: ldc 'date'
    //   29: invokevirtual a : (Ljava/lang/String;)I
    //   32: pop
    //   33: aload_1
    //   34: ldc 'reply_to_user'
    //   36: invokevirtual a : (Ljava/lang/String;)I
    //   39: pop
    //   40: aload_1
    //   41: ldc 'reply_to_comment'
    //   43: invokevirtual a : (Ljava/lang/String;)I
    //   46: pop
    //   47: aload_0
    //   48: aload_1
    //   49: ldc 'text'
    //   51: invokevirtual a : (Ljava/lang/String;)Ljava/lang/String;
    //   54: putfield a : Ljava/lang/String;
    //   57: aload_1
    //   58: ldc 'post_id'
    //   60: invokevirtual a : (Ljava/lang/String;)I
    //   63: pop
    //   64: aload_0
    //   65: aload_1
    //   66: ldc 'owner_id'
    //   68: invokevirtual a : (Ljava/lang/String;)I
    //   71: putfield c : I
    //   74: aload_1
    //   75: ldc 'thread'
    //   77: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   80: astore_2
    //   81: aload_0
    //   82: new ij
    //   85: dup
    //   86: invokespecial <init> : ()V
    //   89: aload_2
    //   90: invokevirtual a : (Lbj;)Lda;
    //   93: checkcast ij
    //   96: putfield a : Lij;
    //   99: aload_1
    //   100: ldc 'likes'
    //   102: invokevirtual a : (Ljava/lang/String;)Lbj;
    //   105: dup
    //   106: astore_2
    //   107: ifnull -> 128
    //   110: aload_0
    //   111: new hy
    //   114: dup
    //   115: invokespecial <init> : ()V
    //   118: aload_2
    //   119: invokevirtual a : (Lbj;)Lda;
    //   122: checkcast hy
    //   125: putfield a : Lhy;
    //   128: aload_1
    //   129: ldc 'parents_stack'
    //   131: invokevirtual a : (Ljava/lang/String;)Lat;
    //   134: dup
    //   135: astore_2
    //   136: ifnull -> 182
    //   139: aload_0
    //   140: aload_2
    //   141: getfield a : Ljava/util/Vector;
    //   144: invokevirtual size : ()I
    //   147: newarray int
    //   149: putfield a : [I
    //   152: iconst_0
    //   153: istore_3
    //   154: iload_3
    //   155: aload_2
    //   156: getfield a : Ljava/util/Vector;
    //   159: invokevirtual size : ()I
    //   162: if_icmpge -> 182
    //   165: aload_0
    //   166: getfield a : [I
    //   169: iload_3
    //   170: aload_2
    //   171: iload_3
    //   172: invokevirtual a : (I)I
    //   175: iastore
    //   176: iinc #3, 1
    //   179: goto -> 154
    //   182: aload_1
    //   183: ldc 'attachments'
    //   185: invokevirtual a : (Ljava/lang/String;)Lat;
    //   188: dup
    //   189: astore_2
    //   190: ifnull -> 246
    //   193: aload_0
    //   194: aload_2
    //   195: getfield a : Ljava/util/Vector;
    //   198: invokevirtual size : ()I
    //   201: anewarray dv
    //   204: putfield a : [Ldv;
    //   207: iconst_0
    //   208: istore_3
    //   209: iload_3
    //   210: aload_2
    //   211: getfield a : Ljava/util/Vector;
    //   214: invokevirtual size : ()I
    //   217: if_icmpge -> 246
    //   220: aload_2
    //   221: iload_3
    //   222: invokevirtual a : (I)Lbj;
    //   225: dup
    //   226: astore_1
    //   227: ifnull -> 240
    //   230: aload_0
    //   231: getfield a : [Ldv;
    //   234: iload_3
    //   235: aload_1
    //   236: invokestatic a : (Lbj;)Ldv;
    //   239: aastore
    //   240: iinc #3, 1
    //   243: goto -> 209
    //   246: aload_0
    //   247: areturn
  }
  
  public final String a() {
    return "comment";
  }
  
  public final int a() {
    return this.c;
  }
  
  public final int b() {
    return this.a;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jq.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */