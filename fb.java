import java.util.Random;
import java.util.Vector;

public final class fb extends es {
  private static Class a;
  
  public fb() {
    super((a == null) ? (a = a("d")) : a, "messages.send");
    long l = (new Random()).nextLong();
    a("random_id", String.valueOf((l > 0L) ? l : -l));
  }
  
  public fb(int paramInt, String paramString) {
    this();
    a("peer_id", paramInt);
    String str = paramString;
    a("message", (str != null) ? hk.a(str) : null);
  }
  
  public final fb a(Vector paramVector) {
    if (paramVector == null)
      a("forward_messages", (Object)null); 
    Vector vector = new Vector();
    for (byte b = 0; b < paramVector.size(); b++) {
      if (paramVector.elementAt(b) != null)
        vector.addElement(String.valueOf(((bw)paramVector.elementAt(b)).a)); 
    } 
    if (paramVector.isEmpty()) {
      a("forward_messages", (Object)null);
    } else {
      a("forward_messages", ab.a(",", vector));
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


/* Location:              /home/kost/Загрузки/latest.jar!/fb.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */