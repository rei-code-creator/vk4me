import java.util.TimeZone;
import java.util.Vector;

public final class ab {
  private static final byte[] a = new byte[] { 
      31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 
      30, 31 };
  
  private static int a = TimeZone.getDefault().getRawOffset() / 1000;
  
  public static long a() {
    return System.currentTimeMillis() / 1000L + a;
  }
  
  public static int[] a(long paramLong) {
    int j = (int)(paramLong % 60L);
    int k = (int)(paramLong / 60L % 60L);
    int m = (int)((paramLong -= (k * 60)) / 3600L % 24L);
    int i = (int)((paramLong - (m * 3600)) / 86400L);
    char c = '޲';
    while (true) {
      int n;
      if ((n = i - ((c % 4 == 0 && c != 'ߐ') ? 366 : 365)) > 0) {
        i = n;
        c++;
        continue;
      } 
      byte b3 = (c % 4 == 0 && c != 'ߐ') ? 29 : 28;
      byte b2 = 1;
      byte b1 = 0;
      while (b1 < 12) {
        if ((n = i - ((b1 == 1) ? b3 : a[b1])) > 0) {
          b2++;
          i = n;
          b1++;
        } 
      } 
      return new int[] { j, k, m, i, b2, c };
    } 
  }
  
  public static String a(long paramLong) {
    return (paramLong < 10L) ? ("0" + String.valueOf(paramLong)) : String.valueOf(paramLong);
  }
  
  public static boolean a(String paramString) {
    return (paramString == null || paramString.trim().length() == 0);
  }
  
  public static String a(String paramString1, String paramString2, String paramString3) {
    paramString2 = paramString2;
    int i;
    String[] arrayOfString2 = new String[((i = paramString1.indexOf(paramString2)) != -1) ? 2 : 1];
    arrayOfString2[0] = paramString1;
    arrayOfString2[1] = paramString1.substring(i + paramString2.length());
    arrayOfString2[0] = paramString1.substring(0, paramString1.length() - paramString2.length() - arrayOfString2[1].length());
    String[] arrayOfString1;
    return ((arrayOfString1 = (String[])(((paramString1 = paramString1) == null || paramString2 == null) ? null : ((i == -1) ? arrayOfString2 : arrayOfString2))) == null) ? paramString3 : ((arrayOfString1.length == 1) ? arrayOfString1[0] : (arrayOfString1[0] + paramString3 + arrayOfString1[1]));
  }
  
  public static Vector a(String paramString1, String paramString2) {
    StringBuffer stringBuffer = new StringBuffer();
    Vector vector = new Vector();
    char[] arrayOfChar = paramString1.toCharArray();
    for (byte b = 0; b < arrayOfChar.length; b++) {
      stringBuffer.append(arrayOfChar[b]);
      if (stringBuffer.toString().indexOf(paramString2) != -1) {
        stringBuffer.setLength(stringBuffer.length() - paramString2.length());
        vector.addElement(stringBuffer.toString());
        stringBuffer.setLength(0);
      } 
    } 
    if (stringBuffer.length() > 0)
      vector.addElement(stringBuffer.toString()); 
    return vector;
  }
  
  public static String a(String paramString, Vector paramVector) {
    StringBuffer stringBuffer = new StringBuffer();
    if (paramVector != null)
      for (byte b = 0; b < paramVector.size(); b++) {
        stringBuffer.append(paramVector.elementAt(b));
        if (b != paramVector.size() - 1)
          stringBuffer.append(paramString); 
      }  
    return stringBuffer.toString();
  }
  
  public static String b(long paramLong) {
    long l;
    if ((l = paramLong + a) == 0L)
      return "[incorrect data]"; 
    int[] arrayOfInt = a(l);
    StringBuffer stringBuffer;
    (stringBuffer = new StringBuffer()).append(a(arrayOfInt[2])).append(':').append(a(arrayOfInt[1]));
    return stringBuffer.toString();
  }
  
  public static int[] a(String paramString) {
    if (paramString == null)
      return null; 
    int[] arrayOfInt = new int[6];
    Vector vector;
    if ((vector = a(paramString, ".")).size() > 2)
      try {
        arrayOfInt[5] = Integer.parseInt((String)vector.elementAt(2));
      } catch (Exception exception) {} 
    if (vector.size() > 1)
      try {
        arrayOfInt[4] = Integer.parseInt((String)vector.elementAt(1));
      } catch (Exception exception) {} 
    if (vector.size() > 0)
      try {
        arrayOfInt[3] = Integer.parseInt((String)vector.elementAt(0));
      } catch (Exception exception) {} 
    return arrayOfInt;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ab.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */