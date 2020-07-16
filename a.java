public final class a {
  private static byte[] a = new byte[] { 
      15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 
      15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 
      15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 
      15, 15, 12, 23, 23, 23, 25, 23, 23, 23, 
      20, 21, 23, 24, 23, 19, 23, 23, 9, 9, 
      9, 9, 9, 9, 9, 9, 9, 9, 23, 23, 
      24, 24, 24, 23, 23, 1, 1, 1, 1, 1, 
      1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
      1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
      1, 20, 23, 21, 26, 22, 26, 2, 2, 2, 
      2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
      2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
      2, 2, 2, 20, 24, 21, 24, 15, 15, 15, 
      15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 
      15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 
      15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 
      12, 23, 25, 25, 25, 25, 27, 27, 26, 27, 
      2, 28, 24, 16, 27, 26, 27, 24, 11, 11, 
      26, 2, 27, 23, 26, 11, 2, 29, 11, 11, 
      11, 23, 1, 1, 1, 1, 1, 1, 1, 1, 
      1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
      1, 1, 1, 1, 1, 24, 1, 1, 1, 1, 
      1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 
      2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 
      2, 2, 2, 2, 2, 2, 2, 24, 2, 2, 
      2, 2, 2, 2, 2, 2 };
  
  public static boolean a(char paramChar) {
    byte b;
    return ((((b = a(paramChar)) == 12 || b == 13 || b == 14) && paramChar != ' ' && paramChar != ' ' && paramChar != ' ') || paramChar == '\t' || paramChar == '\n' || paramChar == '\013' || paramChar == '\f' || paramChar == '\r' || paramChar == '\t' || paramChar == '\034' || paramChar == '\035' || paramChar == '\036' || paramChar == '\037');
  }
  
  public static boolean b(char paramChar) {
    return (a(paramChar) == 9);
  }
  
  public static boolean c(char paramChar) {
    byte b;
    return ((b = a(paramChar)) == 2 || b == 1 || b == 3 || b == 5);
  }
  
  public static boolean d(char paramChar) {
    return (b(paramChar) || c(paramChar));
  }
  
  public static boolean e(char paramChar) {
    byte b;
    return ((b = a(paramChar)) == 12 || b == 13 || b == 14);
  }
  
  public static boolean f(char paramChar) {
    byte b = a(paramChar);
    return (c(paramChar) || b == 10 || paramChar == '$' || paramChar == '_');
  }
  
  public static boolean g(char paramChar) {
    return (f(paramChar) || Character.isDigit(paramChar));
  }
  
  public static byte a(char paramChar) {
    return (paramChar < a.length) ? a[paramChar] : 0;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/a.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */