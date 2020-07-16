import java.util.Hashtable;

public class es extends ad {
  private String a;
  
  public Hashtable a;
  
  private Class a;
  
  public final es a(String paramString, Object paramObject) {
    if (paramObject != null && !ab.a(paramObject.toString()) && !ab.a(paramString)) {
      this.a.put(paramString, paramObject.toString());
    } else {
      paramObject = paramString;
      es es1 = this;
      if (!ab.a((String)paramObject) && es1.a.containsKey(paramObject))
        es1.a.remove(paramObject); 
    } 
    return this;
  }
  
  public final es a(String paramString, int paramInt) {
    return a(paramString, String.valueOf(paramInt));
  }
  
  public aj a() {
    return a((iq)null);
  }
  
  public aj a(iq paramiq) {
    ca ca1;
    if (paramiq == null && fy.a == null) {
      a.b();
      return b();
    } 
    if (paramiq == null)
      ca1 = fy.a; 
    ca ca2 = ca1;
    iz iz;
    String str2;
    if (this instanceof bs && ((iq)ca1).a == 0 && !ab.a(str2 = hk.a()) && (iz = (iz)(new jn(str2)).a((iq)ca2)) != null && (!ab.a(iz.a))) {
      ((iq)ca2).a = iz.a;
      ((iq)ca2).a = 1;
      fy.a.a();
    } 
    if (this instanceof hg && !((hg)this).a()) {
      int j = ((iq)ca1).a;
      hg hg;
      (hg = (hg)this).a = j;
      if (hg.a()) {
        hg.a("owner_id", hg.a);
      } else {
        hg.a("owner_id", (Object)null);
      } 
    } 
    if (this instanceof fx && !((fx)this).a())
      ((fx)this).a(((iq)ca1).a); 
    int i = ((iq)ca1).a;
    es es1;
    (es1 = this).a("access_token", i);
    String str1;
    if (ab.a(str1 = hk.b(es1)))
      return b(); 
    try {
      bj bj = new bj(str1);
    } catch (dc dc) {
      es1 = null;
      if (this instanceof cf)
        try {
          bj bj = (new bj()).a("response", new at(str1));
        } catch (dc dc1) {
          es1 = null;
        }  
    } 
    aj aj = b();
    if (es1 == null || aj == null)
      return aj; 
    au.a(aj = (aj)aj.a((bj)es1));
    return aj;
  }
  
  public final aj b() {
    try {
      return this.a.newInstance();
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public es(Class paramClass, String paramString) {
    this.a = paramClass;
    this.a = (Class)new Hashtable();
    a("v", "5.102");
    if (!ab.a(paramString))
      this.a = (Class)paramString; 
  }
  
  public final String a() {
    return this.a + "?" + a(this);
  }
  
  public String toString() {
    return e() + "method/" + a();
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/es.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */