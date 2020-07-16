final class gu extends jr {
  private final int a;
  
  gu(String paramString, int paramInt) {
    super(paramString);
    this.a = paramInt;
  }
  
  public final void c() {
    // Byte code:
    //   0: getstatic fw.a : Lgz;
    //   3: iconst_1
    //   4: invokevirtual b : (Z)V
    //   7: aload_0
    //   8: getfield a : Ljava/lang/Object;
    //   11: ifnonnull -> 18
    //   14: iconst_1
    //   15: goto -> 19
    //   18: iconst_0
    //   19: ifeq -> 34
    //   22: aload_0
    //   23: new java/lang/Integer
    //   26: dup
    //   27: iconst_m1
    //   28: invokespecial <init> : (I)V
    //   31: putfield a : Ljava/lang/Object;
    //   34: aload_0
    //   35: new java/lang/Integer
    //   38: dup
    //   39: aload_0
    //   40: getfield a : Ljava/lang/Object;
    //   43: checkcast java/lang/Integer
    //   46: invokevirtual intValue : ()I
    //   49: iconst_1
    //   50: iadd
    //   51: invokespecial <init> : (I)V
    //   54: putfield a : Ljava/lang/Object;
    //   57: new java/util/Vector
    //   60: dup
    //   61: invokespecial <init> : ()V
    //   64: astore_1
    //   65: new ln
    //   68: dup
    //   69: aload_0
    //   70: getfield a : I
    //   73: aload_0
    //   74: getfield a : Ljava/lang/Object;
    //   77: checkcast java/lang/Integer
    //   80: invokevirtual intValue : ()I
    //   83: bipush #20
    //   85: imul
    //   86: invokespecial <init> : (II)V
    //   89: invokevirtual a : ()Laj;
    //   92: checkcast ai
    //   95: dup
    //   96: astore_2
    //   97: ifnull -> 197
    //   100: aload_2
    //   101: invokevirtual b : ()Z
    //   104: ifeq -> 197
    //   107: aload_2
    //   108: getfield a : [Llk;
    //   111: arraylength
    //   112: bipush #20
    //   114: if_icmpge -> 122
    //   117: aload_0
    //   118: iconst_1
    //   119: putfield b : Z
    //   122: iconst_0
    //   123: istore_3
    //   124: iload_3
    //   125: aload_2
    //   126: getfield a : [Llk;
    //   129: arraylength
    //   130: if_icmpge -> 182
    //   133: aload_2
    //   134: getfield a : [Llk;
    //   137: iload_3
    //   138: aaload
    //   139: iconst_0
    //   140: iconst_0
    //   141: iconst_1
    //   142: iconst_1
    //   143: iconst_0
    //   144: invokestatic a : (Llb;ZZZZZ)Lr;
    //   147: dup
    //   148: astore #4
    //   150: iconst_1
    //   151: putfield n : Z
    //   154: aload #4
    //   156: checkcast r
    //   159: astore #4
    //   161: aload_1
    //   162: aload #4
    //   164: invokevirtual addElement : (Ljava/lang/Object;)V
    //   167: aload_0
    //   168: getfield b : Ljava/util/Vector;
    //   171: aload #4
    //   173: invokevirtual addElement : (Ljava/lang/Object;)V
    //   176: iinc #3, 1
    //   179: goto -> 124
    //   182: new hj
    //   185: dup
    //   186: aload_1
    //   187: aload_2
    //   188: invokespecial <init> : (Ljava/util/Vector;Lai;)V
    //   191: invokevirtual start : ()V
    //   194: goto -> 217
    //   197: aload_0
    //   198: iconst_1
    //   199: putfield b : Z
    //   202: aload_2
    //   203: ifnonnull -> 217
    //   206: getstatic gz.a : Lgz;
    //   209: ldc 'general.loadError'
    //   211: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   214: invokevirtual a : (Ljava/lang/String;)V
    //   217: getstatic fw.a : Lgz;
    //   220: iconst_0
    //   221: invokevirtual b : (Z)V
    //   224: return
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/gu.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */