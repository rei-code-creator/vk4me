import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class le extends ad {
  public abstract String b(es parames);
  
  public abstract String c(es parames);
  
  public abstract byte[] a(String paramString);
  
  public final String b(String paramString) {
    try {
      return new String(a(paramString), "UTF-8");
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public abstract String a(String paramString);
  
  public abstract InputStream a(String paramString);
  
  public static final byte[] a(InputStream paramInputStream) {
    if (paramInputStream == null)
      return null; 
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      byte[] arrayOfByte2 = new byte[1024];
      int i;
      while ((i = paramInputStream.read(arrayOfByte2)) != -1)
        byteArrayOutputStream.write(arrayOfByte2, 0, i); 
      paramInputStream.close();
      byte[] arrayOfByte1 = byteArrayOutputStream.toByteArray();
      byteArrayOutputStream.close();
      System.gc();
      return arrayOfByte1;
    } catch (Throwable throwable) {
      if (null instanceof OutOfMemoryError)
        System.gc(); 
      return null;
    } 
  }
  
  public abstract String a(String paramString1, long paramLong, String paramString2, InputStream paramInputStream);
  
  public abstract void a(String paramString, OutputStream paramOutputStream, ca paramca);
}


/* Location:              /home/kost/Загрузки/latest.jar!/le.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */