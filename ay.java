import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public abstract class ay {
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public boolean k;
  
  public boolean l;
  
  public boolean m = true;
  
  public String e;
  
  public boolean n;
  
  boolean o;
  
  boolean p;
  
  public boolean q;
  
  public boolean r;
  
  private int a;
  
  private int b;
  
  private int c;
  
  public ay a(int paramInt) {
    return this;
  }
  
  public ay c(int paramInt) {
    if ((paramInt == 8 || paramInt == 1000011) && this.k && this.m)
      a(); 
    return this;
  }
  
  public ay b(int paramInt) {
    return this;
  }
  
  public ay c(int paramInt1, int paramInt2, int paramInt3) {
    this.k = (this.m && paramInt1 < this.f + this.d && paramInt1 > this.f && paramInt2 < this.g + this.e + ((gz)gz.a).g - paramInt3 && paramInt2 > this.g + ((gz)gz.a).g - paramInt3);
    this.a = paramInt1;
    this.b = paramInt2 - paramInt3;
    this.c = 0;
    return this;
  }
  
  public ay b(int paramInt1, int paramInt2, int paramInt3) {
    this.c += (this.a - paramInt1) * (this.a - paramInt1) + (paramInt2 - paramInt3 - this.b) * (paramInt2 - paramInt3 - this.b);
    if (this.c > ((gz)gz.a).a)
      this.k = false; 
    this.a = paramInt1;
    this.b = paramInt2 - paramInt3;
    return this;
  }
  
  public ay a(int paramInt1, int paramInt2, int paramInt3) {
    if (this.k && this.m)
      a(); 
    this.k = false;
    return this;
  }
  
  public abstract void d();
  
  public abstract void a(Graphics paramGraphics, int paramInt1, int paramInt2);
  
  public static String a(String paramString, int paramInt, boolean paramBoolean, Font paramFont) {
    if (paramString == null || paramString.length() == 0)
      return ""; 
    paramString = paramString.replace('\n', ' ');
    if (a(paramFont, paramString) <= paramInt)
      return paramString; 
    int i;
    for (i = paramString.length(); i > 0; i--) {
      String str = paramString.substring(0, i).trim() + (paramBoolean ? "..." : "");
      if (a(paramFont, str) <= paramInt)
        return str; 
    } 
    if (paramBoolean)
      for (i = 3; i > 0; i--) {
        String str = "...".substring(0, i);
        if (a(paramFont, str) <= paramInt)
          return str; 
      }  
    return "";
  }
  
  private static int a(Object paramObject, String paramString) {
    return (paramObject instanceof cp) ? ((cp)paramObject).a(paramString, false) : ((Font)paramObject).stringWidth(paramString);
  }
  
  public static Vector a(String paramString, int paramInt, Object paramObject) {
    Vector vector = new Vector();
    if (paramString == null)
      return vector; 
    StringBuffer stringBuffer = new StringBuffer();
    char[] arrayOfChar = paramString.toCharArray();
    for (byte b = 0; b < arrayOfChar.length; b++) {
      stringBuffer.append(arrayOfChar[b]);
      if (arrayOfChar[b] == '\n') {
        stringBuffer.setLength(stringBuffer.length() - 1);
        vector.addElement(stringBuffer.toString());
        stringBuffer.setLength(0);
      } else if (a(paramObject, stringBuffer.toString()) > paramInt) {
        if (stringBuffer.toString().lastIndexOf(' ') != -1) {
          String str = stringBuffer.toString();
          stringBuffer.setLength(0);
          int i = str.toString().lastIndexOf(' ');
          vector.addElement(str.substring(0, i));
          stringBuffer.append(str.substring(i + 1, str.length()));
        } else {
          stringBuffer.setLength(stringBuffer.length() - 1);
          vector.addElement(stringBuffer.toString());
          stringBuffer.setLength(0);
          stringBuffer.append(arrayOfChar[b]);
        } 
      } 
    } 
    if (stringBuffer.length() > 0) {
      vector.addElement(stringBuffer.toString());
      stringBuffer.setLength(0);
    } 
    return vector;
  }
  
  public void a() {}
}


/* Location:              /home/kost/Загрузки/latest.jar!/ay.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */