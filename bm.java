import java.util.Vector;

public final class bm extends es {
  private static Class a;
  
  public bm() {
    super((a == null) ? (a = a("co")) : a, "messages.edit");
    a("keep_forward_messages", "1");
  }
  
  public bm(int paramInt1, int paramInt2, String paramString) {
    this();
    a("peer_id", paramInt1);
    a("message_id", paramInt2);
    String str = paramString;
    a("message", !ab.a(str) ? hk.a(str) : null);
  }
  
  public final bm a(Vector paramVector) {
    if (paramVector == null)
      a("attachment", (Object)null); 
    Vector vector = new Vector();
    for (byte b = 0; b < paramVector.size(); b++) {
      if (paramVector.elementAt(b) != null)
        vector.addElement(paramVector.elementAt(b).toString()); 
    } 
    if (paramVector.isEmpty()) {
      a("attachment", (Object)null);
    } else {
      a("attachment", ab.a(",", vector));
    } 
    return this;
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/bm.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */