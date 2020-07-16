import java.util.Hashtable;

public final class ih {
  private char[] a;
  
  private int a;
  
  private String a = (String)new char[128];
  
  private int b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private static Hashtable a;
  
  public ih() {
    this.a = false;
  }
  
  private void a(int paramInt) {
    int i = this.a.length;
    if (this.a + paramInt >= i) {
      while (this.a + paramInt >= i)
        i <<= 1; 
      char[] arrayOfChar = new char[i];
      System.arraycopy(this.a, 0, arrayOfChar, 0, this.a);
      this.a = (Hashtable)arrayOfChar;
    } 
  }
  
  private void a(char paramChar) {
    a(1);
    this.a[this.a++] = paramChar;
  }
  
  private void a(char paramChar, int paramInt) {
    a(3);
    System.arraycopy(this.a, paramInt, this.a, paramInt + 3, this.a - paramInt);
    this.a[paramInt] = paramChar;
    this.a[paramInt + 1] = false;
    this.a[paramInt + 2] = false;
    this.a += 3;
  }
  
  private void a(int paramInt1, int paramInt2) {
    Hashtable hashtable1;
    for (Hashtable hashtable2 = this.a[paramInt1 + 2]; hashtable2 != null && paramInt1 < this.a; hashtable2 = this.a[paramInt1 + 2]) {
      if (paramInt1 == paramInt2)
        hashtable1 = this.a; 
      paramInt1 += hashtable2;
    } 
    if (paramInt1 < this.a) {
      int i;
      if (hashtable1 - paramInt1 != (short)(i = hashtable1 - paramInt1))
        throw new jt("Exceeded short jump range."); 
      this.a[paramInt1 + 2] = (char)i;
    } 
  }
  
  private int a(char paramChar, int paramInt) {
    a(3);
    this.a[this.a] = paramChar;
    this.a[this.a + 1] = (char)paramInt;
    this.a[this.a + 2] = false;
    this.a += 3;
    return this.a - 3;
  }
  
  private static void a() {
    throw new Error("Internal error!");
  }
  
  private static void a(String paramString) {
    throw new jt(paramString);
  }
  
  private int a() {
    int i;
    int j;
    if (this.a.charAt(this.c) != '\\')
      a(); 
    if (this.c + 1 == this.b)
      a("Escape terminates string"); 
    this.c += 2;
    char c;
    switch (c = this.a.charAt(this.c - 1)) {
      case 'B':
      case 'b':
        return 1048574;
      case 'D':
      case 'S':
      case 'W':
      case 'd':
      case 's':
      case 'w':
        return 1048573;
      case 'u':
      case 'x':
        i = (c == 'u') ? 4 : 2;
        j = 0;
        while (this.c < this.b && i-- > 0) {
          char c1;
          if ((c1 = this.a.charAt(this.c)) >= '0' && c1 <= '9') {
            j = (j << 4) + c1 - 48;
          } else if ((c1 = Character.toLowerCase(c1)) >= 'a' && c1 <= 'f') {
            j = (j << 4) + c1 - 97 + 10;
          } else {
            a("Expected " + i + " hexadecimal digits after \\" + c);
          } 
          this.c++;
        } 
        return j;
      case 't':
        return 9;
      case 'n':
        return 10;
      case 'r':
        return 13;
      case 'f':
        return 12;
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        if ((this.c < this.b && Character.isDigit(this.a.charAt(this.c))) || c == '0') {
          i = c - 48;
          if (this.c < this.b && Character.isDigit(this.a.charAt(this.c))) {
            i = (i << 3) + this.a.charAt(this.c++) - 48;
            if (this.c < this.b && Character.isDigit(this.a.charAt(this.c)))
              i = (i << 3) + this.a.charAt(this.c++) - 48; 
          } 
          return i;
        } 
        return 1048575;
    } 
    return c;
  }
  
  private int b() {
    int i = a('A', 0);
    byte b;
    for (b = 0; this.c < this.b; b++) {
      int j;
      int k;
      if (this.c + 1 < this.b) {
        char c = this.a.charAt(this.c + 1);
        if (this.a.charAt(this.c) == '\\') {
          int m = this.c;
          a();
          if (this.c < this.b)
            c = this.a.charAt(this.c); 
          this.c = m;
        } 
        switch (c) {
          case '*':
          case '+':
          case '?':
          case '{':
            if (!b)
              break; 
            break;
        } 
      } 
      switch (this.a.charAt(this.c)) {
        case '$':
        case '(':
        case ')':
        case '.':
        case '[':
        case ']':
        case '^':
        case '|':
          break;
        case '*':
        case '+':
        case '?':
        case '{':
          if (!b)
            a("Missing operand to closure"); 
          break;
        case '\\':
          j = this.c;
          if (((k = a()) & 0xFFFF0) == 1048560) {
            this.c = j;
            break;
          } 
          a((char)k);
          b++;
          continue;
      } 
      a(this.a.charAt(this.c++));
    } 
    if (b == 0)
      a(); 
    this.a[i + 1] = (char)b;
    return i;
  }
  
  private int a(int[] paramArrayOfint) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Ljava/lang/String;
    //   4: aload_0
    //   5: getfield c : I
    //   8: invokevirtual charAt : (I)C
    //   11: lookupswitch default -> 1343, 0 -> 1212, 36 -> 132, 40 -> 1193, 41 -> 1199, 42 -> 1217, 43 -> 1217, 46 -> 132, 63 -> 1217, 91 -> 156, 92 -> 1222, 93 -> 1207, 94 -> 132, 123 -> 1217, 124 -> 1204
    //   132: aload_0
    //   133: aload_0
    //   134: getfield a : Ljava/lang/String;
    //   137: aload_0
    //   138: dup
    //   139: getfield c : I
    //   142: dup_x1
    //   143: iconst_1
    //   144: iadd
    //   145: putfield c : I
    //   148: invokevirtual charAt : (I)C
    //   151: iconst_0
    //   152: invokespecial a : (CI)I
    //   155: ireturn
    //   156: aload_0
    //   157: dup
    //   158: astore_1
    //   159: getfield a : Ljava/lang/String;
    //   162: aload_1
    //   163: getfield c : I
    //   166: invokevirtual charAt : (I)C
    //   169: bipush #91
    //   171: if_icmpeq -> 177
    //   174: invokestatic a : ()V
    //   177: aload_1
    //   178: getfield c : I
    //   181: iconst_1
    //   182: iadd
    //   183: aload_1
    //   184: getfield b : I
    //   187: if_icmpge -> 213
    //   190: aload_1
    //   191: getfield a : Ljava/lang/String;
    //   194: aload_1
    //   195: dup
    //   196: getfield c : I
    //   199: iconst_1
    //   200: iadd
    //   201: dup_x1
    //   202: putfield c : I
    //   205: invokevirtual charAt : (I)C
    //   208: bipush #93
    //   210: if_icmpne -> 218
    //   213: ldc 'Empty or unterminated class'
    //   215: invokestatic a : (Ljava/lang/String;)V
    //   218: aload_1
    //   219: getfield c : I
    //   222: aload_1
    //   223: getfield b : I
    //   226: if_icmpge -> 444
    //   229: aload_1
    //   230: getfield a : Ljava/lang/String;
    //   233: aload_1
    //   234: getfield c : I
    //   237: invokevirtual charAt : (I)C
    //   240: bipush #58
    //   242: if_icmpne -> 444
    //   245: aload_1
    //   246: dup
    //   247: getfield c : I
    //   250: iconst_1
    //   251: iadd
    //   252: putfield c : I
    //   255: aload_1
    //   256: getfield c : I
    //   259: istore_2
    //   260: aload_1
    //   261: getfield c : I
    //   264: aload_1
    //   265: getfield b : I
    //   268: if_icmpge -> 316
    //   271: aload_1
    //   272: getfield a : Ljava/lang/String;
    //   275: aload_1
    //   276: getfield c : I
    //   279: invokevirtual charAt : (I)C
    //   282: bipush #97
    //   284: if_icmplt -> 316
    //   287: aload_1
    //   288: getfield a : Ljava/lang/String;
    //   291: aload_1
    //   292: getfield c : I
    //   295: invokevirtual charAt : (I)C
    //   298: bipush #122
    //   300: if_icmpgt -> 316
    //   303: aload_1
    //   304: dup
    //   305: getfield c : I
    //   308: iconst_1
    //   309: iadd
    //   310: putfield c : I
    //   313: goto -> 260
    //   316: aload_1
    //   317: getfield c : I
    //   320: iconst_1
    //   321: iadd
    //   322: aload_1
    //   323: getfield b : I
    //   326: if_icmpge -> 439
    //   329: aload_1
    //   330: getfield a : Ljava/lang/String;
    //   333: aload_1
    //   334: getfield c : I
    //   337: invokevirtual charAt : (I)C
    //   340: bipush #58
    //   342: if_icmpne -> 439
    //   345: aload_1
    //   346: getfield a : Ljava/lang/String;
    //   349: aload_1
    //   350: getfield c : I
    //   353: iconst_1
    //   354: iadd
    //   355: invokevirtual charAt : (I)C
    //   358: bipush #93
    //   360: if_icmpne -> 439
    //   363: aload_1
    //   364: getfield a : Ljava/lang/String;
    //   367: iload_2
    //   368: aload_1
    //   369: getfield c : I
    //   372: invokevirtual substring : (II)Ljava/lang/String;
    //   375: astore_2
    //   376: getstatic ih.a : Ljava/util/Hashtable;
    //   379: aload_2
    //   380: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   383: checkcast java/lang/Character
    //   386: dup
    //   387: astore_3
    //   388: ifnull -> 412
    //   391: aload_1
    //   392: dup
    //   393: getfield c : I
    //   396: iconst_2
    //   397: iadd
    //   398: putfield c : I
    //   401: aload_1
    //   402: bipush #80
    //   404: aload_3
    //   405: invokevirtual charValue : ()C
    //   408: invokespecial a : (CI)I
    //   411: ireturn
    //   412: new java/lang/StringBuffer
    //   415: dup
    //   416: invokespecial <init> : ()V
    //   419: ldc 'Invalid POSIX character class ''
    //   421: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   424: aload_2
    //   425: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   428: ldc '''
    //   430: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   433: invokevirtual toString : ()Ljava/lang/String;
    //   436: invokestatic a : (Ljava/lang/String;)V
    //   439: ldc 'Invalid POSIX character class syntax'
    //   441: invokestatic a : (Ljava/lang/String;)V
    //   444: aload_1
    //   445: bipush #91
    //   447: iconst_0
    //   448: invokespecial a : (CI)I
    //   451: istore_2
    //   452: ldc 65535
    //   454: istore_3
    //   455: iconst_1
    //   456: istore #4
    //   458: iconst_0
    //   459: istore #5
    //   461: aload_1
    //   462: getfield c : I
    //   465: istore #6
    //   467: iconst_0
    //   468: istore #7
    //   470: new lo
    //   473: dup
    //   474: invokespecial <init> : ()V
    //   477: astore #8
    //   479: aload_1
    //   480: getfield c : I
    //   483: aload_1
    //   484: getfield b : I
    //   487: if_icmpge -> 1110
    //   490: aload_1
    //   491: getfield a : Ljava/lang/String;
    //   494: aload_1
    //   495: getfield c : I
    //   498: invokevirtual charAt : (I)C
    //   501: bipush #93
    //   503: if_icmpeq -> 1110
    //   506: aload_1
    //   507: getfield a : Ljava/lang/String;
    //   510: aload_1
    //   511: getfield c : I
    //   514: invokevirtual charAt : (I)C
    //   517: lookupswitch default -> 1018, 45 -> 950, 92 -> 595, 94 -> 552
    //   552: iload #4
    //   554: ifne -> 561
    //   557: iconst_1
    //   558: goto -> 562
    //   561: iconst_0
    //   562: istore #4
    //   564: aload_1
    //   565: getfield c : I
    //   568: iload #6
    //   570: if_icmpne -> 582
    //   573: aload #8
    //   575: iconst_0
    //   576: ldc 65535
    //   578: iconst_1
    //   579: invokevirtual a : (IIZ)V
    //   582: aload_1
    //   583: dup
    //   584: getfield c : I
    //   587: iconst_1
    //   588: iadd
    //   589: putfield c : I
    //   592: goto -> 479
    //   595: aload_1
    //   596: invokespecial a : ()I
    //   599: dup
    //   600: istore_3
    //   601: tableswitch default -> 944, 1048573 -> 633, 1048574 -> 628, 1048575 -> 628
    //   628: ldc 'Bad character class'
    //   630: invokestatic a : (Ljava/lang/String;)V
    //   633: iload #5
    //   635: ifeq -> 643
    //   638: ldc 'Bad character class'
    //   640: invokestatic a : (Ljava/lang/String;)V
    //   643: aload_1
    //   644: getfield a : Ljava/lang/String;
    //   647: aload_1
    //   648: getfield c : I
    //   651: iconst_1
    //   652: isub
    //   653: invokevirtual charAt : (I)C
    //   656: lookupswitch default -> 938, 68 -> 815, 83 -> 716, 87 -> 760, 100 -> 927, 115 -> 839, 119 -> 896
    //   716: aload #8
    //   718: iconst_0
    //   719: bipush #7
    //   721: iload #4
    //   723: invokevirtual a : (IIZ)V
    //   726: aload #8
    //   728: bipush #11
    //   730: iload #4
    //   732: invokevirtual a : (CZ)V
    //   735: aload #8
    //   737: bipush #14
    //   739: bipush #31
    //   741: iload #4
    //   743: invokevirtual a : (IIZ)V
    //   746: aload #8
    //   748: bipush #33
    //   750: ldc 65535
    //   752: iload #4
    //   754: invokevirtual a : (IIZ)V
    //   757: goto -> 938
    //   760: aload #8
    //   762: iconst_0
    //   763: bipush #47
    //   765: iload #4
    //   767: invokevirtual a : (IIZ)V
    //   770: aload #8
    //   772: bipush #58
    //   774: bipush #64
    //   776: iload #4
    //   778: invokevirtual a : (IIZ)V
    //   781: aload #8
    //   783: bipush #91
    //   785: bipush #94
    //   787: iload #4
    //   789: invokevirtual a : (IIZ)V
    //   792: aload #8
    //   794: bipush #96
    //   796: iload #4
    //   798: invokevirtual a : (CZ)V
    //   801: aload #8
    //   803: bipush #123
    //   805: ldc 65535
    //   807: iload #4
    //   809: invokevirtual a : (IIZ)V
    //   812: goto -> 938
    //   815: aload #8
    //   817: iconst_0
    //   818: bipush #47
    //   820: iload #4
    //   822: invokevirtual a : (IIZ)V
    //   825: aload #8
    //   827: bipush #58
    //   829: ldc 65535
    //   831: iload #4
    //   833: invokevirtual a : (IIZ)V
    //   836: goto -> 938
    //   839: aload #8
    //   841: bipush #9
    //   843: iload #4
    //   845: invokevirtual a : (CZ)V
    //   848: aload #8
    //   850: bipush #13
    //   852: iload #4
    //   854: invokevirtual a : (CZ)V
    //   857: aload #8
    //   859: bipush #12
    //   861: iload #4
    //   863: invokevirtual a : (CZ)V
    //   866: aload #8
    //   868: bipush #10
    //   870: iload #4
    //   872: invokevirtual a : (CZ)V
    //   875: aload #8
    //   877: bipush #8
    //   879: iload #4
    //   881: invokevirtual a : (CZ)V
    //   884: aload #8
    //   886: bipush #32
    //   888: iload #4
    //   890: invokevirtual a : (CZ)V
    //   893: goto -> 938
    //   896: aload #8
    //   898: bipush #97
    //   900: bipush #122
    //   902: iload #4
    //   904: invokevirtual a : (IIZ)V
    //   907: aload #8
    //   909: bipush #65
    //   911: bipush #90
    //   913: iload #4
    //   915: invokevirtual a : (IIZ)V
    //   918: aload #8
    //   920: bipush #95
    //   922: iload #4
    //   924: invokevirtual a : (CZ)V
    //   927: aload #8
    //   929: bipush #48
    //   931: bipush #57
    //   933: iload #4
    //   935: invokevirtual a : (IIZ)V
    //   938: ldc 65535
    //   940: istore_3
    //   941: goto -> 479
    //   944: iload_3
    //   945: i2c
    //   946: istore_3
    //   947: goto -> 1037
    //   950: iload #5
    //   952: ifeq -> 960
    //   955: ldc 'Bad class range'
    //   957: invokestatic a : (Ljava/lang/String;)V
    //   960: iconst_1
    //   961: istore #5
    //   963: iload_3
    //   964: ldc 65535
    //   966: if_icmpne -> 973
    //   969: iconst_0
    //   970: goto -> 974
    //   973: iload_3
    //   974: istore #7
    //   976: aload_1
    //   977: getfield c : I
    //   980: iconst_1
    //   981: iadd
    //   982: aload_1
    //   983: getfield b : I
    //   986: if_icmpge -> 479
    //   989: aload_1
    //   990: getfield a : Ljava/lang/String;
    //   993: aload_1
    //   994: dup
    //   995: getfield c : I
    //   998: iconst_1
    //   999: iadd
    //   1000: dup_x1
    //   1001: putfield c : I
    //   1004: invokevirtual charAt : (I)C
    //   1007: bipush #93
    //   1009: if_icmpne -> 479
    //   1012: ldc 65535
    //   1014: istore_3
    //   1015: goto -> 1037
    //   1018: aload_1
    //   1019: getfield a : Ljava/lang/String;
    //   1022: aload_1
    //   1023: dup
    //   1024: getfield c : I
    //   1027: dup_x1
    //   1028: iconst_1
    //   1029: iadd
    //   1030: putfield c : I
    //   1033: invokevirtual charAt : (I)C
    //   1036: istore_3
    //   1037: iload #5
    //   1039: ifeq -> 1072
    //   1042: iload #7
    //   1044: iload_3
    //   1045: if_icmplt -> 1053
    //   1048: ldc 'Bad character class'
    //   1050: invokestatic a : (Ljava/lang/String;)V
    //   1053: aload #8
    //   1055: iload #7
    //   1057: iload_3
    //   1058: iload #4
    //   1060: invokevirtual a : (IIZ)V
    //   1063: ldc 65535
    //   1065: istore_3
    //   1066: iconst_0
    //   1067: istore #5
    //   1069: goto -> 479
    //   1072: aload_1
    //   1073: getfield c : I
    //   1076: aload_1
    //   1077: getfield b : I
    //   1080: if_icmpge -> 1099
    //   1083: aload_1
    //   1084: getfield a : Ljava/lang/String;
    //   1087: aload_1
    //   1088: getfield c : I
    //   1091: invokevirtual charAt : (I)C
    //   1094: bipush #45
    //   1096: if_icmpeq -> 1107
    //   1099: aload #8
    //   1101: iload_3
    //   1102: iload #4
    //   1104: invokevirtual a : (CZ)V
    //   1107: goto -> 479
    //   1110: aload_1
    //   1111: getfield c : I
    //   1114: aload_1
    //   1115: getfield b : I
    //   1118: if_icmpne -> 1126
    //   1121: ldc 'Unterminated character class'
    //   1123: invokestatic a : (Ljava/lang/String;)V
    //   1126: aload_1
    //   1127: dup
    //   1128: getfield c : I
    //   1131: iconst_1
    //   1132: iadd
    //   1133: putfield c : I
    //   1136: aload_1
    //   1137: getfield a : [C
    //   1140: iload_2
    //   1141: iconst_1
    //   1142: iadd
    //   1143: aload #8
    //   1145: getfield a : I
    //   1148: i2c
    //   1149: castore
    //   1150: iconst_0
    //   1151: istore_3
    //   1152: iload_3
    //   1153: aload #8
    //   1155: getfield a : I
    //   1158: if_icmpge -> 1191
    //   1161: aload_1
    //   1162: aload #8
    //   1164: getfield a : [I
    //   1167: iload_3
    //   1168: iaload
    //   1169: i2c
    //   1170: invokespecial a : (C)V
    //   1173: aload_1
    //   1174: aload #8
    //   1176: getfield b : [I
    //   1179: iload_3
    //   1180: iaload
    //   1181: i2c
    //   1182: invokespecial a : (C)V
    //   1185: iinc #3, 1
    //   1188: goto -> 1152
    //   1191: iload_2
    //   1192: ireturn
    //   1193: aload_0
    //   1194: aload_1
    //   1195: invokespecial d : ([I)I
    //   1198: ireturn
    //   1199: ldc 'Unexpected close paren'
    //   1201: invokestatic a : (Ljava/lang/String;)V
    //   1204: invokestatic a : ()V
    //   1207: ldc 'Mismatched class'
    //   1209: invokestatic a : (Ljava/lang/String;)V
    //   1212: ldc 'Unexpected end of input'
    //   1214: invokestatic a : (Ljava/lang/String;)V
    //   1217: ldc 'Missing operand to closure'
    //   1219: invokestatic a : (Ljava/lang/String;)V
    //   1222: aload_0
    //   1223: getfield c : I
    //   1226: istore_2
    //   1227: aload_0
    //   1228: invokespecial a : ()I
    //   1231: tableswitch default -> 1330, 1048573 -> 1256, 1048574 -> 1256, 1048575 -> 1284
    //   1256: aload_1
    //   1257: iconst_0
    //   1258: dup2
    //   1259: iaload
    //   1260: bipush #-2
    //   1262: iand
    //   1263: iastore
    //   1264: aload_0
    //   1265: bipush #92
    //   1267: aload_0
    //   1268: getfield a : Ljava/lang/String;
    //   1271: aload_0
    //   1272: getfield c : I
    //   1275: iconst_1
    //   1276: isub
    //   1277: invokevirtual charAt : (I)C
    //   1280: invokespecial a : (CI)I
    //   1283: ireturn
    //   1284: aload_0
    //   1285: getfield a : Ljava/lang/String;
    //   1288: aload_0
    //   1289: getfield c : I
    //   1292: iconst_1
    //   1293: isub
    //   1294: invokevirtual charAt : (I)C
    //   1297: bipush #48
    //   1299: isub
    //   1300: i2c
    //   1301: istore_2
    //   1302: aload_0
    //   1303: getfield d : I
    //   1306: iload_2
    //   1307: if_icmpgt -> 1315
    //   1310: ldc 'Bad backreference'
    //   1312: invokestatic a : (Ljava/lang/String;)V
    //   1315: aload_1
    //   1316: iconst_0
    //   1317: dup2
    //   1318: iaload
    //   1319: iconst_1
    //   1320: ior
    //   1321: iastore
    //   1322: aload_0
    //   1323: bipush #35
    //   1325: iload_2
    //   1326: invokespecial a : (CI)I
    //   1329: ireturn
    //   1330: aload_0
    //   1331: iload_2
    //   1332: putfield c : I
    //   1335: aload_1
    //   1336: iconst_0
    //   1337: dup2
    //   1338: iaload
    //   1339: bipush #-2
    //   1341: iand
    //   1342: iastore
    //   1343: aload_1
    //   1344: iconst_0
    //   1345: dup2
    //   1346: iaload
    //   1347: bipush #-2
    //   1349: iand
    //   1350: iastore
    //   1351: aload_0
    //   1352: invokespecial b : ()I
    //   1355: ireturn
  }
  
  private int b(int[] paramArrayOfint) {
    Hashtable hashtable;
    int i = this.c;
    int[] arrayOfInt = { 0 };
    int j = a(arrayOfInt);
    paramArrayOfint[0] = paramArrayOfint[0] | arrayOfInt[0];
    if (this.c >= this.b)
      return j; 
    boolean bool = true;
    int k;
    switch (k = this.a.charAt(this.c)) {
      case '*':
      case '?':
        paramArrayOfint[0] = paramArrayOfint[0] | 0x1;
      case '+':
        this.c++;
      case '{':
        if ((hashtable = this.a[j]) == 94 || hashtable == 36)
          a("Bad closure operand"); 
        if ((arrayOfInt[0] & 0x1) != 0)
          a("Closure operand can't be nullable"); 
        break;
    } 
    if (this.c < this.b && this.a.charAt(this.c) == '?') {
      this.c++;
      bool = false;
    } 
    if (bool) {
      ih ih1;
      int m;
      StringBuffer stringBuffer;
      int n;
      int i1;
      byte b;
      switch (k) {
        case '{':
          if ((ih1 = this).c >= ih1.b || ih1.a.charAt(ih1.c++) != '{')
            a(); 
          if (ih1.c >= ih1.b || !Character.isDigit(ih1.a.charAt(ih1.c)))
            a("Expected digit"); 
          stringBuffer = new StringBuffer();
          while (ih1.c < ih1.b && Character.isDigit(ih1.a.charAt(ih1.c)))
            stringBuffer.append(ih1.a.charAt(ih1.c++)); 
          try {
            ih1.e = Integer.parseInt(stringBuffer.toString());
          } catch (NumberFormatException numberFormatException) {
            a("Expected valid number");
          } 
          if (ih1.c >= ih1.b)
            a("Expected comma or right bracket"); 
          if (ih1.a.charAt(ih1.c) == '}') {
            ih1.c++;
            ih1.f = 0;
          } else {
            if (ih1.c >= ih1.b || ih1.a.charAt(ih1.c++) != ',')
              a("Expected comma"); 
            if (ih1.c >= ih1.b)
              a("Expected comma or right bracket"); 
            if (ih1.a.charAt(ih1.c) == '}') {
              ih1.c++;
              ih1.f = -1;
            } else {
              if (ih1.c >= ih1.b || !Character.isDigit(ih1.a.charAt(ih1.c)))
                a("Expected digit"); 
              stringBuffer.setLength(0);
              while (ih1.c < ih1.b && Character.isDigit(ih1.a.charAt(ih1.c)))
                stringBuffer.append(ih1.a.charAt(ih1.c++)); 
              try {
                ih1.f = Integer.parseInt(stringBuffer.toString()) - ih1.e;
              } catch (NumberFormatException numberFormatException) {
                a("Expected valid number");
              } 
              if (ih1.f < 0)
                a("Bad range"); 
              if (ih1.c >= ih1.b || ih1.a.charAt(ih1.c++) != '}')
                a("Missing close brace"); 
            } 
          } 
          m = this.c;
          n = this.e;
          k = this.f;
          i1 = j;
          for (b = 0; b < n; b++) {
            this.c = i;
            a(i1, i1 = a(arrayOfInt));
          } 
          if (k == -1) {
            this.c = m;
            a('*', i1);
            a(i1 + 3, i1);
            break;
          } 
          if (k > 0) {
            int[] arrayOfInt1 = new int[k + 1];
            a('?', i1);
            arrayOfInt1[0] = i1;
            for (n = 1; n < k; n++) {
              arrayOfInt1[n] = a('?', 0);
              this.c = i;
              a(arrayOfInt);
            } 
            n = arrayOfInt1[k] = a('N', 0);
            for (i = 0; i < k; i++) {
              a(arrayOfInt1[i], n);
              a(arrayOfInt1[i] + 3, arrayOfInt1[i + 1]);
            } 
          } else {
            this.a = i1;
            a('N', 0);
          } 
          this.c = m;
          break;
        case '?':
          a('?', j);
          m = a('N', 0);
          a(j, m);
          a(j + 3, m);
          break;
        case '*':
          a('*', j);
          a(j + 3, j);
          break;
        case '+':
          a('C', j);
          m = a('+', 0);
          a(j + 3, m);
          a(m, j);
          break;
      } 
    } else {
      int m;
      switch (k) {
        case 63:
          a('/', j);
          m = a('N', 0);
          a(j, m);
          a(j + 3, m);
          break;
        case 42:
          a('8', j);
          a(j + 3, j);
          break;
        case 43:
          a('C', j);
          m = a('=', 0);
          a(m, j);
          a(j + 3, m);
          break;
      } 
    } 
    return j;
  }
  
  private int c(int[] paramArrayOfint) {
    int i = -1;
    int j = -1;
    int[] arrayOfInt = new int[1];
    boolean bool = true;
    while (this.c < this.b && this.a.charAt(this.c) != '|' && this.a.charAt(this.c) != ')') {
      arrayOfInt[0] = 0;
      int k = b(arrayOfInt);
      if (arrayOfInt[0] == 0)
        bool = false; 
      if (j != -1)
        a(j, k); 
      j = k;
      if (i == -1)
        i = k; 
    } 
    if (i == -1)
      i = a('N', 0); 
    if (bool)
      paramArrayOfint[0] = paramArrayOfint[0] | 0x1; 
    return i;
  }
  
  private int d(int[] paramArrayOfint) {
    int i;
    int j = -1;
    int k = -1;
    int m = this.d;
    if ((paramArrayOfint[0] & 0x2) == 0 && this.a.charAt(this.c) == '(')
      if (this.c + 2 < this.b && this.a.charAt(this.c + 1) == '?' && this.a.charAt(this.c + 2) == ':') {
        j = 2;
        this.c += 3;
        k = a('<', 0);
      } else {
        j = 1;
        this.c++;
        k = a('(', this.d++);
      }  
    paramArrayOfint[0] = paramArrayOfint[0] & 0xFFFFFFFD;
    boolean bool = false;
    int n = c(paramArrayOfint);
    if (k == -1) {
      k = n;
    } else {
      a(k, n);
    } 
    while (this.c < this.b && this.a.charAt(this.c) == '|') {
      if (!bool) {
        a('|', n);
        bool = true;
      } 
      this.c++;
      a(n, n = a('|', 0));
      c(paramArrayOfint);
    } 
    if (j > 0) {
      if (this.c < this.b && this.a.charAt(this.c) == ')') {
        this.c++;
      } else {
        a("Missing close paren");
      } 
      if (j == 1) {
        i = a(')', m);
      } else {
        i = a('>', 0);
      } 
    } else {
      i = a('E', 0);
    } 
    a(k, i);
    j = k;
    Hashtable hashtable = this.a[j + 2];
    while (hashtable != null && j < this.a) {
      if (this.a[j] == 124)
        a(j + 3, i); 
      hashtable = this.a[j + 2];
      j += hashtable;
    } 
    return k;
  }
  
  public final ki a(String paramString) {
    this.a = (Hashtable)paramString;
    this.b = paramString.length();
    this.c = 0;
    this.a = false;
    this.d = 1;
    int[] arrayOfInt = { 2 };
    d(arrayOfInt);
    if (this.c != this.b) {
      if (paramString.charAt(this.c) == ')')
        a("Unmatched close paren"); 
      a("Unexpected input remains");
    } 
    char[] arrayOfChar = new char[this.a];
    System.arraycopy(this.a, 0, arrayOfChar, 0, this.a);
    return new ki(this.d, arrayOfChar);
  }
  
  static {
    (a = new Hashtable()).put("alnum", new Character('w'));
    a.put("alpha", new Character('a'));
    a.put("blank", new Character('b'));
    a.put("cntrl", new Character('c'));
    a.put("digit", new Character('d'));
    a.put("graph", new Character('g'));
    a.put("lower", new Character('l'));
    a.put("print", new Character('p'));
    a.put("punct", new Character('!'));
    a.put("space", new Character('s'));
    a.put("upper", new Character('u'));
    a.put("xdigit", new Character('x'));
    a.put("javastart", new Character('j'));
    a.put("javapart", new Character('k'));
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ih.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */