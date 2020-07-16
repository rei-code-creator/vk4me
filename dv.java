import java.util.Hashtable;

public abstract class dv extends da {
  private static Hashtable a;
  
  private static Class a;
  
  private static Class b;
  
  private static Class c;
  
  private static Class d;
  
  private static Class e;
  
  private static Class f;
  
  private static Class g;
  
  public abstract String toString();
  
  public static dv a(bj parambj) {
    if (a == null) {
      (a = (Class)new Hashtable()).put("photo", (a == null) ? (a = a("jc")) : a);
      a.put("sticker", (b == null) ? (b = a("ej")) : b);
      a.put("audio", (c == null) ? (c = a("cm")) : c);
      a.put("graffiti", (d == null) ? (d = a("dp")) : d);
      a.put("doc", (e == null) ? (e = a("jg")) : e);
      a.put("audio_message", (f == null) ? (f = a("ht")) : f);
      a.put("audio_playlist", (g == null) ? (g = a("js")) : g);
    } 
    String str;
    if (!ab.a(str = parambj.a("type")) && a.containsKey(str)) {
      Class clazz;
      if ((clazz = (Class)a.get(str)) != null)
        try {
          return (dv)((dv)clazz.newInstance()).a(parambj.a(str));
        } catch (Exception exception) {} 
    } else {
      return (dv)(new hm(str)).a(parambj.a(str));
    } 
    return null;
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/dv.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */