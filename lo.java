final class lo {
  private int b;
  
  int[] a;
  
  int[] b = 16;
  
  int a = new int[this.b];
  
  lo() {
    this.b = new int[this.b];
    this.a = 0;
  }
  
  private void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : I
    //   4: ifeq -> 15
    //   7: iload_1
    //   8: aload_0
    //   9: getfield a : I
    //   12: if_icmplt -> 16
    //   15: return
    //   16: iinc #1, 1
    //   19: iload_1
    //   20: aload_0
    //   21: getfield a : I
    //   24: if_icmpge -> 64
    //   27: iload_1
    //   28: iconst_1
    //   29: isub
    //   30: iflt -> 16
    //   33: aload_0
    //   34: getfield a : [I
    //   37: iload_1
    //   38: iconst_1
    //   39: isub
    //   40: aload_0
    //   41: getfield a : [I
    //   44: iload_1
    //   45: iaload
    //   46: iastore
    //   47: aload_0
    //   48: getfield b : [I
    //   51: iload_1
    //   52: iconst_1
    //   53: isub
    //   54: aload_0
    //   55: getfield b : [I
    //   58: iload_1
    //   59: iaload
    //   60: iastore
    //   61: goto -> 16
    //   64: aload_0
    //   65: dup
    //   66: getfield a : I
    //   69: iconst_1
    //   70: isub
    //   71: putfield a : I
    //   74: return
  }
  
  private void a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iload_3
    //   3: aload_0
    //   4: getfield a : I
    //   7: if_icmpge -> 141
    //   10: iload_1
    //   11: aload_0
    //   12: getfield a : [I
    //   15: iload_3
    //   16: iaload
    //   17: if_icmplt -> 31
    //   20: iload_2
    //   21: aload_0
    //   22: getfield b : [I
    //   25: iload_3
    //   26: iaload
    //   27: if_icmpgt -> 31
    //   30: return
    //   31: iload_1
    //   32: aload_0
    //   33: getfield a : [I
    //   36: iload_3
    //   37: iaload
    //   38: if_icmpgt -> 61
    //   41: iload_2
    //   42: aload_0
    //   43: getfield b : [I
    //   46: iload_3
    //   47: iaload
    //   48: if_icmplt -> 61
    //   51: aload_0
    //   52: iload_3
    //   53: invokespecial a : (I)V
    //   56: aload_0
    //   57: astore_0
    //   58: goto -> 0
    //   61: iload_1
    //   62: aload_0
    //   63: getfield a : [I
    //   66: iload_3
    //   67: iaload
    //   68: if_icmplt -> 98
    //   71: iload_1
    //   72: aload_0
    //   73: getfield b : [I
    //   76: iload_3
    //   77: iaload
    //   78: if_icmpgt -> 98
    //   81: aload_0
    //   82: getfield a : [I
    //   85: iload_3
    //   86: iaload
    //   87: istore_1
    //   88: aload_0
    //   89: iload_3
    //   90: invokespecial a : (I)V
    //   93: aload_0
    //   94: astore_0
    //   95: goto -> 0
    //   98: iload_2
    //   99: aload_0
    //   100: getfield a : [I
    //   103: iload_3
    //   104: iaload
    //   105: if_icmplt -> 135
    //   108: iload_2
    //   109: aload_0
    //   110: getfield b : [I
    //   113: iload_3
    //   114: iaload
    //   115: if_icmpgt -> 135
    //   118: aload_0
    //   119: getfield b : [I
    //   122: iload_3
    //   123: iaload
    //   124: istore_2
    //   125: aload_0
    //   126: iload_3
    //   127: invokespecial a : (I)V
    //   130: aload_0
    //   131: astore_0
    //   132: goto -> 0
    //   135: iinc #3, 1
    //   138: goto -> 2
    //   141: aload_0
    //   142: getfield a : I
    //   145: aload_0
    //   146: getfield b : I
    //   149: if_icmplt -> 217
    //   152: aload_0
    //   153: dup
    //   154: getfield b : I
    //   157: iconst_1
    //   158: ishl
    //   159: putfield b : I
    //   162: aload_0
    //   163: getfield b : I
    //   166: newarray int
    //   168: astore_3
    //   169: aload_0
    //   170: getfield b : I
    //   173: newarray int
    //   175: astore #4
    //   177: aload_0
    //   178: getfield a : [I
    //   181: iconst_0
    //   182: aload_3
    //   183: iconst_0
    //   184: aload_0
    //   185: getfield a : I
    //   188: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   191: aload_0
    //   192: getfield b : [I
    //   195: iconst_0
    //   196: aload #4
    //   198: iconst_0
    //   199: aload_0
    //   200: getfield a : I
    //   203: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   206: aload_0
    //   207: aload_3
    //   208: putfield a : [I
    //   211: aload_0
    //   212: aload #4
    //   214: putfield b : [I
    //   217: aload_0
    //   218: getfield a : [I
    //   221: aload_0
    //   222: getfield a : I
    //   225: iload_1
    //   226: iastore
    //   227: aload_0
    //   228: getfield b : [I
    //   231: aload_0
    //   232: getfield a : I
    //   235: iload_2
    //   236: iastore
    //   237: aload_0
    //   238: dup
    //   239: getfield a : I
    //   242: iconst_1
    //   243: iadd
    //   244: putfield a : I
    //   247: return
  }
  
  final void a(int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: iload_3
    //   1: ifeq -> 11
    //   4: aload_0
    //   5: iload_1
    //   6: iload_2
    //   7: invokespecial a : (II)V
    //   10: return
    //   11: aload_0
    //   12: iload_1
    //   13: iload_2
    //   14: istore_3
    //   15: istore_2
    //   16: astore_1
    //   17: iconst_0
    //   18: istore #4
    //   20: iload #4
    //   22: aload_1
    //   23: getfield a : I
    //   26: if_icmpge -> 207
    //   29: aload_1
    //   30: getfield a : [I
    //   33: iload #4
    //   35: iaload
    //   36: iload_2
    //   37: if_icmplt -> 58
    //   40: aload_1
    //   41: getfield b : [I
    //   44: iload #4
    //   46: iaload
    //   47: iload_3
    //   48: if_icmpgt -> 58
    //   51: aload_1
    //   52: iload #4
    //   54: invokespecial a : (I)V
    //   57: return
    //   58: iload_2
    //   59: aload_1
    //   60: getfield a : [I
    //   63: iload #4
    //   65: iaload
    //   66: if_icmplt -> 135
    //   69: iload_3
    //   70: aload_1
    //   71: getfield b : [I
    //   74: iload #4
    //   76: iaload
    //   77: if_icmpgt -> 135
    //   80: aload_1
    //   81: getfield a : [I
    //   84: iload #4
    //   86: iaload
    //   87: istore #5
    //   89: aload_1
    //   90: getfield b : [I
    //   93: iload #4
    //   95: iaload
    //   96: istore #6
    //   98: aload_1
    //   99: iload #4
    //   101: invokespecial a : (I)V
    //   104: iload #5
    //   106: iload_2
    //   107: if_icmpge -> 119
    //   110: aload_1
    //   111: iload #5
    //   113: iload_2
    //   114: iconst_1
    //   115: isub
    //   116: invokespecial a : (II)V
    //   119: iload_3
    //   120: iload #6
    //   122: if_icmpge -> 134
    //   125: aload_1
    //   126: iload_3
    //   127: iconst_1
    //   128: iadd
    //   129: iload #6
    //   131: invokespecial a : (II)V
    //   134: return
    //   135: aload_1
    //   136: getfield a : [I
    //   139: iload #4
    //   141: iaload
    //   142: iload_2
    //   143: if_icmplt -> 168
    //   146: aload_1
    //   147: getfield a : [I
    //   150: iload #4
    //   152: iaload
    //   153: iload_3
    //   154: if_icmpgt -> 168
    //   157: aload_1
    //   158: getfield a : [I
    //   161: iload #4
    //   163: iload_3
    //   164: iconst_1
    //   165: iadd
    //   166: iastore
    //   167: return
    //   168: aload_1
    //   169: getfield b : [I
    //   172: iload #4
    //   174: iaload
    //   175: iload_2
    //   176: if_icmplt -> 201
    //   179: aload_1
    //   180: getfield b : [I
    //   183: iload #4
    //   185: iaload
    //   186: iload_3
    //   187: if_icmpgt -> 201
    //   190: aload_1
    //   191: getfield b : [I
    //   194: iload #4
    //   196: iload_2
    //   197: iconst_1
    //   198: isub
    //   199: iastore
    //   200: return
    //   201: iinc #4, 1
    //   204: goto -> 20
    //   207: return
  }
  
  final void a(char paramChar, boolean paramBoolean) {
    a(paramChar, paramChar, paramBoolean);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/lo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */