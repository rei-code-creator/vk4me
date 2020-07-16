import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.rms.RecordStore;

public final class u {
  public static u a;
  
  private Hashtable a;
  
  private static Vector a;
  
  public u(String paramString) {
    this.a = (Vector)new Hashtable();
    a(paramString);
  }
  
  private void a(String paramString) {
    if (paramString == null)
      return; 
    try {
      Vector vector = ab.a(paramString, "\n");
      for (byte b = 0; b < vector.size(); b++) {
        String str1;
        int i = (str1 = vector.elementAt(b)).indexOf('=');
        String str2 = str1.substring(i + 1);
        if ((str1 = str1.substring(0, str1.length() - 1 - str2.length())) != null && str2 != null) {
          if (this.a.containsKey(str1))
            System.out.println("Warning: duplicated key " + str1); 
          str2 = ab.a(str2, "\\n", "\n");
          this.a.put(str1, str2);
        } 
      } 
      return;
    } catch (OutOfMemoryError outOfMemoryError) {
      this.a = (Vector)new Hashtable();
      System.gc();
      return;
    } 
  }
  
  public static Vector a() {
    if (a != null)
      return a; 
    a = new Vector();
    try {
      Vector vector = ab.a(new String(le.a(Runtime.getRuntime().getClass().getResourceAsStream("/lang/list.langs")), "UTF-8"), "\n");
      for (byte b = 0; b < vector.size(); b++) {
        Vector vector1 = ab.a(vector.elementAt(b), ";");
        fg fg = new fg();
        if (vector1.size() > 3)
          fg.c = vector1.elementAt(3); 
        if (vector1.size() > 2)
          fg.d = vector1.elementAt(2); 
        if (vector1.size() > 1)
          fg.b = vector1.elementAt(1); 
        if (vector1.size() > 0)
          fg.a = vector1.elementAt(0); 
        if (!ab.a(fg.a) && b(fg.a))
          a.addElement(fg); 
      } 
    } catch (Exception exception) {
    
    } catch (OutOfMemoryError outOfMemoryError) {
      a = new Vector();
      System.gc();
    } 
    return a;
  }
  
  public static String a(String paramString) {
    if (paramString == null)
      return paramString; 
    if (a == null)
      return paramString; 
    String str2 = paramString;
    Vector vector = a;
    if (str2 == null)
      return null; 
    String str1;
    if ((str1 = (String)((u)vector).a.get(str2)) == null) {
      System.out.println("Warning: key not found " + str2);
      return str2;
    } 
    return str1;
  }
  
  public static String a(String paramString1, String paramString2) {
    String str;
    return (paramString1 == null) ? paramString1 : (((str = a(paramString1)).equals(paramString1) || paramString2 == null) ? str : ab.a(str, "%%", paramString2));
  }
  
  private static boolean b(String paramString) {
    try {
      Runtime.getRuntime().getClass().getResourceAsStream("/lang/" + paramString + ".lang").close();
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public u() {}
  
  public static boolean a(String paramString) {
    try {
      RecordStore.deleteRecordStore("ph_" + paramString);
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public static byte[] a(String paramString) {
    byte[] arrayOfByte = null;
    try {
      RecordStore recordStore;
      if ((recordStore = RecordStore.openRecordStore("ph_" + paramString, true, 0, false)).getNumRecords() > 0)
        arrayOfByte = recordStore.getRecord(1); 
      recordStore.closeRecordStore();
    } catch (Exception exception) {}
    return arrayOfByte;
  }
  
  public static boolean a(String paramString, byte[] paramArrayOfbyte) {
    try {
      a(paramString);
      RecordStore recordStore;
      (recordStore = RecordStore.openRecordStore("ph_" + paramString, true, 0, false)).addRecord(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      recordStore.closeRecordStore();
      return true;
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public static byte[] b(String paramString) {
    byte[] arrayOfByte = null;
    try {
      RecordStore recordStore;
      if ((recordStore = RecordStore.openRecordStore(paramString, true)).getNumRecords() > 0)
        arrayOfByte = recordStore.getRecord(1); 
      recordStore.closeRecordStore();
    } catch (Exception exception) {}
    return arrayOfByte;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/u.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */