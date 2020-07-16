final class ag extends Thread {
  public final void run() {
    // Byte code:
    //   0: getstatic bc.a : Lbc;
    //   3: ifnull -> 39
    //   6: getstatic bc.a : Lbc;
    //   9: getfield a : Ljava/util/Vector;
    //   12: ifnull -> 39
    //   15: getstatic gz.a : Lgz;
    //   18: getfield a : Lla;
    //   21: instanceof bc
    //   24: ifeq -> 39
    //   27: getstatic gz.a : Lgz;
    //   30: getfield a : Lkz;
    //   33: getfield a : Z
    //   36: ifeq -> 52
    //   39: ldc2_w 3000
    //   42: invokestatic sleep : (J)V
    //   45: goto -> 0
    //   48: pop
    //   49: goto -> 0
    //   52: iconst_0
    //   53: istore_1
    //   54: iload_1
    //   55: getstatic bc.a : Lbc;
    //   58: getfield a : Ljava/util/Vector;
    //   61: invokevirtual size : ()I
    //   64: if_icmpge -> 155
    //   67: getstatic bc.a : Lbc;
    //   70: getfield b : Ljava/util/Vector;
    //   73: iload_1
    //   74: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   77: checkcast ay
    //   80: astore_2
    //   81: aload_2
    //   82: instanceof kn
    //   85: ifeq -> 132
    //   88: aload_2
    //   89: checkcast kn
    //   92: dup
    //   93: astore_2
    //   94: getfield q : Z
    //   97: ifne -> 132
    //   100: aload_2
    //   101: getfield s : Z
    //   104: ifeq -> 132
    //   107: aload_2
    //   108: getfield a : Lis;
    //   111: ifnull -> 132
    //   114: aload_2
    //   115: aload_2
    //   116: getfield a : Lis;
    //   119: invokestatic a : (Lis;)Ljavax/microedition/lcdui/Image;
    //   122: aconst_null
    //   123: invokevirtual a : (Ljavax/microedition/lcdui/Image;Ljavax/microedition/lcdui/Image;)Lr;
    //   126: pop
    //   127: aload_2
    //   128: iconst_0
    //   129: putfield s : Z
    //   132: goto -> 136
    //   135: pop
    //   136: getstatic bc.a : Lbc;
    //   139: getfield a : Ljava/util/Vector;
    //   142: iload_1
    //   143: invokevirtual removeElementAt : (I)V
    //   146: invokestatic d : ()V
    //   149: iinc #1, 1
    //   152: goto -> 54
    //   155: ldc2_w 3000
    //   158: invokestatic sleep : (J)V
    //   161: goto -> 0
    //   164: pop
    //   165: goto -> 0
    //   168: pop
    //   169: getstatic bc.a : Lbc;
    //   172: getfield a : Ljava/util/Vector;
    //   175: invokevirtual removeAllElements : ()V
    //   178: invokestatic gc : ()V
    //   181: goto -> 0
    //   184: pop
    //   185: goto -> 0
    // Exception table:
    //   from	to	target	type
    //   0	49	168	java/lang/OutOfMemoryError
    //   0	49	184	java/lang/Exception
    //   39	45	48	java/lang/Exception
    //   52	165	168	java/lang/OutOfMemoryError
    //   52	165	184	java/lang/Exception
    //   81	132	135	java/lang/Exception
    //   155	161	164	java/lang/Exception
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ag.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */