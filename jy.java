public final class jy {
  public static void a(int paramInt, ar paramar) {
    // Byte code:
    //   0: iload_0
    //   1: invokestatic a : (I)Z
    //   4: ifne -> 8
    //   7: return
    //   8: aload_1
    //   9: ifnonnull -> 13
    //   12: return
    //   13: iload_0
    //   14: i2c
    //   15: dup
    //   16: istore_2
    //   17: invokestatic isDigit : (C)Z
    //   20: ifeq -> 73
    //   23: aload_1
    //   24: iload_2
    //   25: invokestatic valueOf : (C)Ljava/lang/String;
    //   28: invokestatic parseInt : (Ljava/lang/String;)I
    //   31: istore_1
    //   32: dup
    //   33: astore_0
    //   34: new java/lang/StringBuffer
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: aload_0
    //   42: getfield a : Ljava/lang/String;
    //   45: ifnonnull -> 53
    //   48: ldc ''
    //   50: goto -> 57
    //   53: aload_0
    //   54: getfield a : Ljava/lang/String;
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   60: iload_1
    //   61: invokevirtual append : (I)Ljava/lang/StringBuffer;
    //   64: invokevirtual toString : ()Ljava/lang/String;
    //   67: invokevirtual b : (Ljava/lang/String;)V
    //   70: goto -> 215
    //   73: iload_0
    //   74: bipush #32
    //   76: if_icmpne -> 120
    //   79: aload_1
    //   80: new java/lang/StringBuffer
    //   83: dup
    //   84: invokespecial <init> : ()V
    //   87: aload_1
    //   88: getfield a : Ljava/lang/String;
    //   91: ifnonnull -> 99
    //   94: ldc ''
    //   96: goto -> 103
    //   99: aload_1
    //   100: getfield a : Ljava/lang/String;
    //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   106: bipush #32
    //   108: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   111: invokevirtual toString : ()Ljava/lang/String;
    //   114: invokevirtual b : (Ljava/lang/String;)V
    //   117: goto -> 215
    //   120: iload_0
    //   121: ldc 1000011
    //   123: if_icmpeq -> 215
    //   126: iload_0
    //   127: ldc 1000010
    //   129: if_icmpne -> 178
    //   132: aload_1
    //   133: aload_1
    //   134: getfield a : Ljava/lang/String;
    //   137: ifnull -> 150
    //   140: aload_1
    //   141: getfield a : Ljava/lang/String;
    //   144: invokevirtual length : ()I
    //   147: ifne -> 155
    //   150: ldc ''
    //   152: goto -> 172
    //   155: aload_1
    //   156: getfield a : Ljava/lang/String;
    //   159: iconst_0
    //   160: aload_1
    //   161: getfield a : Ljava/lang/String;
    //   164: invokevirtual length : ()I
    //   167: iconst_1
    //   168: isub
    //   169: invokevirtual substring : (II)Ljava/lang/String;
    //   172: invokevirtual b : (Ljava/lang/String;)V
    //   175: goto -> 215
    //   178: aload_1
    //   179: new java/lang/StringBuffer
    //   182: dup
    //   183: invokespecial <init> : ()V
    //   186: aload_1
    //   187: getfield a : Ljava/lang/String;
    //   190: ifnonnull -> 198
    //   193: ldc ''
    //   195: goto -> 202
    //   198: aload_1
    //   199: getfield a : Ljava/lang/String;
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   205: iload_2
    //   206: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   209: invokevirtual toString : ()Ljava/lang/String;
    //   212: invokevirtual b : (Ljava/lang/String;)V
    //   215: invokestatic a : ()V
    //   218: return
  }
  
  public static void b(int paramInt, ar paramar) {
    if (!a(paramInt))
      return; 
    if (paramar == null)
      return; 
    char c;
    if (Character.isDigit(c = (char)paramInt)) {
      Integer.parseInt(String.valueOf(c));
    } else if (paramInt == 1000011) {
      gz.a(paramar);
    } else {
      a(paramInt, paramar);
    } 
    a();
  }
  
  static boolean a(int paramInt) {
    switch (paramInt) {
      case 32:
      case 1000010:
      case 1000011:
        return true;
    } 
    return (paramInt >= 32 || Character.isDigit((char)paramInt) || Character.isLowerCase((char)paramInt) || Character.isUpperCase((char)paramInt));
  }
  
  private static void a() {
    if (v.a.j)
      gz.a.vibrate(100); 
  }
  
  static {
    (new char[2][][])[0] = new char[0][];
    (new char[2][][])[1] = new char[0][];
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jy.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */