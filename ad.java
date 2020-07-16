import java.util.Enumeration;
import java.util.Vector;

public class ad extends fy {
  public static final String a(long paramLong) {
    long l1 = paramLong % 3600L / 60L;
    long l2 = paramLong % 60L;
    return l1 + ":" + ab.a(l2);
  }
  
  public static final String a(es parames) {
    StringBuffer stringBuffer = new StringBuffer();
    if (parames == null)
      return stringBuffer.toString(); 
    Class clazz;
    Enumeration enumeration = (clazz = parames.a).keys();
    while (enumeration.hasMoreElements()) {
      String str1 = (String)enumeration.nextElement();
      String str2 = (String)clazz.get(str1);
      if (stringBuffer.length() > 0)
        stringBuffer.append('&'); 
      stringBuffer.append(str1).append('=').append(str2);
    } 
    return stringBuffer.toString();
  }
  
  public static final String a(String paramString, Vector paramVector) {
    StringBuffer stringBuffer = new StringBuffer();
    if (paramVector == null || paramString == null)
      return stringBuffer.toString(); 
    for (byte b = 0; b < paramVector.size(); b++) {
      Object object;
      if ((object = paramVector.elementAt(b)) != null) {
        if (stringBuffer.length() > 0)
          stringBuffer.append(paramString); 
        stringBuffer.append(object.toString());
      } 
    } 
    return stringBuffer.toString();
  }
  
  public static final boolean b(int paramInt) {
    return (paramInt == 1);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ad.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */