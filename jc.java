public class jc extends dv implements fh {
  private int a;
  
  private int b;
  
  private String a;
  
  private b a;
  
  public final eh a() {
    return ((this.a != null)) ? ((b1 = this.a).a.containsKey("r") ? (eh)b1.a.get("r") : (b1.a.containsKey("q") ? (eh)b1.a.get("q") : (b1.a.containsKey("p") ? (eh)b1.a.get("p") : (b1.a.containsKey("o") ? (eh)b1.a.get("o") : (eh)b1.a.get("s"))))) : null;
  }
  
  public final String toString() {
    jc jc1 = this;
    return "photo" + jc1.b + "_" + jc1.a + ((!ab.a((String)jc1.a)) ? ("_" + jc1.a) : "");
  }
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    this.a = parambj.a("id");
    parambj.a("album_id");
    this.b = parambj.a("owner_id");
    parambj.a("user_id");
    parambj.a("date");
    parambj.a("text");
    this.a = (b)parambj.a("access_key");
    this.a = (b)(new b()).a(parambj);
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jc.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */