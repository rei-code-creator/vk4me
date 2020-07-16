import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public final class by extends le {
  private static String a = "---pheonixfileuploaderpheonixtop";
  
  public final InputStream a(String paramString) {
    try {
      if (e().startsWith("http:") && paramString.startsWith("https:"))
        paramString = "http" + paramString.substring(5); 
      (new StringBuffer()).append("[OIS]: ").append(paramString);
      HttpConnection httpConnection;
      (httpConnection = (HttpConnection)Connector.open(paramString)).setRequestProperty("User-Agent", "VKAndroidApp/5.40-3906 (Android 6.0.0; SDK 23; armeabi-v7a; LGE Nexus 5; ru");
      InputStream inputStream = httpConnection.openInputStream();
      httpConnection.close();
      return inputStream;
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final String b(es parames) {
    if (parames == null)
      return null; 
    String str = parames.toString();
    (new StringBuffer()).append("[REQ]: ").append(str);
    str = b(str);
    (new StringBuffer()).append("[RES]: ").append(str);
    return str;
  }
  
  public final String a(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    int i = paramString.length();
    for (byte b = 0; b < i; b++) {
      char c = paramString.charAt(b);
      if ('A' <= c && c <= 'Z') {
        stringBuffer.append((char)c);
      } else if ('a' <= c && c <= 'z') {
        stringBuffer.append((char)c);
      } else if ('0' <= c && c <= '9') {
        stringBuffer.append((char)c);
      } else if (c == ' ') {
        stringBuffer.append('+');
      } else if (c == '-' || c == '_' || c == '.' || c == '*') {
        stringBuffer.append((char)c);
      } else if (c <= '') {
        stringBuffer.append(a(c));
      } else if (c <= '߿') {
        stringBuffer.append(a(0xC0 | c >> 6));
        stringBuffer.append(a(0x80 | c & 0x3F));
      } else {
        stringBuffer.append(a(0xE0 | c >> 12));
        stringBuffer.append(a(0x80 | c >> 6 & 0x3F));
        stringBuffer.append(a(0x80 | c & 0x3F));
      } 
    } 
    return stringBuffer.toString();
  }
  
  private static String a(int paramInt) {
    return "%00%01%02%03%04%05%06%07%08%09%0a%0b%0c%0d%0e%0f%10%11%12%13%14%15%16%17%18%19%1a%1b%1c%1d%1e%1f%20%21%22%23%24%25%26%27%28%29%2a%2b%2c%2d%2e%2f%30%31%32%33%34%35%36%37%38%39%3a%3b%3c%3d%3e%3f%40%41%42%43%44%45%46%47%48%49%4a%4b%4c%4d%4e%4f%50%51%52%53%54%55%56%57%58%59%5a%5b%5c%5d%5e%5f%60%61%62%63%64%65%66%67%68%69%6a%6b%6c%6d%6e%6f%70%71%72%73%74%75%76%77%78%79%7a%7b%7c%7d%7e%7f%80%81%82%83%84%85%86%87%88%89%8a%8b%8c%8d%8e%8f%90%91%92%93%94%95%96%97%98%99%9a%9b%9c%9d%9e%9f%a0%a1%a2%a3%a4%a5%a6%a7%a8%a9%aa%ab%ac%ad%ae%af%b0%b1%b2%b3%b4%b5%b6%b7%b8%b9%ba%bb%bc%bd%be%bf%c0%c1%c2%c3%c4%c5%c6%c7%c8%c9%ca%cb%cc%cd%ce%cf%d0%d1%d2%d3%d4%d5%d6%d7%d8%d9%da%db%dc%dd%de%df%e0%e1%e2%e3%e4%e5%e6%e7%e8%e9%ea%eb%ec%ed%ee%ef%f0%f1%f2%f3%f4%f5%f6%f7%f8%f9%fa%fb%fc%fd%fe%ff".substring(paramInt * 3, paramInt * 3 + 3);
  }
  
  public final byte[] a(String paramString) {
    try {
      return a(a(paramString));
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public final String a(String paramString1, long paramLong, String paramString2, InputStream paramInputStream) {
    String str4 = paramString1;
    if (e().startsWith("http:") && str4.startsWith("https:"))
      str4 = "http" + str4.substring(5); 
    (new StringBuffer()).append("[UPL]: ").append(str4);
    HttpConnection httpConnection;
    (httpConnection = (HttpConnection)Connector.open(str4, 3)).setRequestMethod("POST");
    httpConnection.setRequestProperty("User-Agent", "VKAndroidApp/5.40-3906 (Android 6.0.0; SDK 23; armeabi-v7a; LGE Nexus 5; ru");
    httpConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + a);
    String str3 = paramString2;
    long l2 = paramLong;
    String str2 = paramString1;
    long l1 = 0L + (("\n--" + a + "\nContent-Disposition: form-data; name=\"destination\"\n\n").getBytes("UTF-8")).length + (str2.getBytes("UTF-8")).length + (("\n--" + a + "\n").getBytes("UTF-8")).length + (("Content-Disposition: form-data; name=\"photo\"; filename=\"photo." + d(str3) + "\"").getBytes("UTF-8")).length + (("\nContent-Type: " + c(str3)).getBytes("UTF-8")).length + ("\n\n".getBytes("UTF-8")).length + (("\n--" + a + "\n").getBytes("UTF-8")).length + l2;
    httpConnection.setRequestProperty("Content-Length", String.valueOf(l1));
    OutputStream outputStream;
    a(outputStream = httpConnection.openOutputStream(), "\n--" + a + "\n");
    a(outputStream, "Content-Disposition: form-data; name=\"photo\"; filename=\"photo." + d(paramString2) + "\"");
    a(outputStream, "\nContent-Type: " + c(paramString2));
    a(outputStream, "\n\n");
    byte[] arrayOfByte = new byte[4096];
    int i;
    while ((i = paramInputStream.read(arrayOfByte)) != -1)
      outputStream.write(arrayOfByte, 0, i); 
    paramInputStream.close();
    a(outputStream, "\n--" + a + "\n");
    outputStream.flush();
    outputStream.close();
    InputStream inputStream = httpConnection.openInputStream();
    String str1 = new String(a(inputStream), "UTF-8");
    httpConnection.close();
    return str1;
  }
  
  private static String c(String paramString) {
    return (paramString.length() > 4 && paramString.substring(paramString.length() - 4).equals("jpeg")) ? "image/jpeg" : ("image/" + paramString.substring(paramString.length() - 3));
  }
  
  private static String d(String paramString) {
    return c(paramString).endsWith("jpeg") ? "jpeg" : paramString.substring(paramString.length() - 3);
  }
  
  private static void a(OutputStream paramOutputStream, String paramString) {
    paramOutputStream.write(paramString.getBytes("UTF-8"));
  }
  
  public final void a(String paramString, OutputStream paramOutputStream, ca paramca) {
    if (e().startsWith("http:") && paramString.startsWith("https:"))
      paramString = "http" + paramString.substring(5); 
    (new StringBuffer()).append("[OIS]: ").append(paramString);
    HttpConnection httpConnection;
    (httpConnection = (HttpConnection)Connector.open(paramString)).setRequestProperty("User-Agent", "VKAndroidApp/5.40-3906 (Android 6.0.0; SDK 23; armeabi-v7a; LGE Nexus 5; ru");
    InputStream inputStream = httpConnection.openInputStream();
    long l1 = httpConnection.getLength();
    byte[] arrayOfByte = new byte[4096];
    long l2 = 0L;
    int i;
    while ((i = inputStream.read(arrayOfByte)) != -1) {
      l2 += i;
      paramOutputStream.write(arrayOfByte, 0, i);
      paramOutputStream.flush();
      if (paramca != null)
        paramca.a(l2 * 100L / l1); 
    } 
    inputStream.close();
    httpConnection.close();
    paramOutputStream.close();
    if (paramca != null)
      paramca.a(100L); 
  }
  
  public final String c(es parames) {
    if (parames == null)
      return null; 
    String str2 = parames.toString();
    (new StringBuffer()).append("[REQ]: ").append(str2);
    if (e().startsWith("http:") && str2.startsWith("https:"))
      str2 = "http" + str2.substring(5); 
    (new StringBuffer()).append("[OIS]: ").append(str2);
    HttpConnection httpConnection;
    (httpConnection = (HttpConnection)Connector.open(str2)).setRequestProperty("User-Agent", "VKAndroidApp/5.40-3906 (Android 6.0.0; SDK 23; armeabi-v7a; LGE Nexus 5; ru");
    InputStream inputStream = httpConnection.openInputStream();
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte2 = new byte[1024];
    int i;
    while ((i = inputStream.read(arrayOfByte2)) != -1)
      byteArrayOutputStream.write(arrayOfByte2, 0, i); 
    inputStream.close();
    byte[] arrayOfByte1 = byteArrayOutputStream.toByteArray();
    byteArrayOutputStream.close();
    httpConnection.close();
    String str1 = new String(arrayOfByte1, "UTF-8");
    System.gc();
    (new StringBuffer()).append("[RES]: ").append(str1);
    return str1;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/by.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */