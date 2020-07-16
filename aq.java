import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;

public final class aq implements ca {
  private final cg a;
  
  aq(cg paramcg) {
    this.a = paramcg;
  }
  
  public final void a(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lcg;
    //   4: getfield a : Lea;
    //   7: invokevirtual a : ()Lcm;
    //   10: dup
    //   11: astore_3
    //   12: ifnull -> 53
    //   15: aload_3
    //   16: invokevirtual toString : ()Ljava/lang/String;
    //   19: aload_0
    //   20: getfield a : Lcg;
    //   23: getfield a : Lcm;
    //   26: invokevirtual toString : ()Ljava/lang/String;
    //   29: invokevirtual equals : (Ljava/lang/Object;)Z
    //   32: ifeq -> 53
    //   35: aload_0
    //   36: getfield a : Lcg;
    //   39: getfield a : Lea;
    //   42: getfield a : Lcj;
    //   45: lload_1
    //   46: invokevirtual a : (J)Lcj;
    //   49: pop
    //   50: invokestatic d : ()V
    //   53: return
  }
  
  public aq() {}
  
  public static boolean a() {
    return jp.a(v.a.b);
  }
  
  public static String a(cm paramcm) {
    if (paramcm == null || !a())
      return null; 
    String str;
    if (!(str = v.a.b).endsWith((String)jv.a))
      str = str + jv.a; 
    return str + (((paramcm = paramcm) == null) ? null : (((str = a(paramcm.b) + " - " + a(paramcm.c) + " - " + b(paramcm)).length() <= 46) ? str : (((str = a(paramcm.c) + " - " + b(paramcm)).length() <= 46) ? str : b(paramcm)))) + ".mp3";
  }
  
  public static boolean a(cm paramcm) {
    if (paramcm == null || !a())
      return false; 
    String str = a(paramcm);
    try {
      FileConnection fileConnection;
      boolean bool = ((fileConnection = (FileConnection)Connector.open(str, 1)).exists() && fileConnection.canRead()) ? true : false;
      fileConnection.close();
      return bool;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  private static String b(cm paramcm) {
    return a(paramcm.c) + "_" + a(paramcm.b);
  }
  
  private static String a(String paramString) {
    if (paramString == null)
      return null; 
    char[] arrayOfChar = paramString.toCharArray();
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < arrayOfChar.length; b++) {
      char c;
      if (Character.isDigit(c = arrayOfChar[b]) || Character.isLowerCase(c) || Character.isUpperCase(c)) {
        stringBuffer.append(c);
      } else {
        stringBuffer.append(' ');
      } 
    } 
    if (stringBuffer.length() > 20)
      stringBuffer.setLength(20); 
    return stringBuffer.toString().trim();
  }
  
  private static String a(long paramLong) {
    if (paramLong == 0L)
      return "0"; 
    StringBuffer stringBuffer = new StringBuffer();
    boolean bool = (paramLong < 0L) ? true : false;
    paramLong = Math.abs(paramLong);
    while (paramLong > 0L) {
      long l = paramLong % 62L;
      paramLong /= 62L;
      if (l < 10L) {
        stringBuffer.append((char)(int)(l + 48L));
        continue;
      } 
      if (l < 36L) {
        stringBuffer.append((char)(int)(l + 97L - 10L));
        continue;
      } 
      stringBuffer.append((char)(int)(l + 65L - 36L));
    } 
    if (bool)
      stringBuffer.append('-'); 
    stringBuffer.reverse();
    return stringBuffer.toString();
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/aq.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */