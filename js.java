public class js extends dv {
  private int b;
  
  public int a;
  
  private ec[] a;
  
  private kc[] a;
  
  public String a;
  
  public final String toString() {
    return "audio_playlist" + this.a + "_" + this.b;
  }
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    this.b = parambj.a("id");
    this.a = parambj.a("owner_id");
    parambj.a("type");
    this.a = parambj.a("access_key");
    bj bj1;
    if ((bj1 = parambj.a("photo")) != null)
      (new o()).a(bj1); 
    at at;
    if ((at = parambj.a("main_artists")) != null) {
      this.a = (String)new kc[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj2;
        if ((bj2 = at.a(b)) != null)
          this.a[b] = (String)(new kc()).a(bj2); 
      } 
    } 
    if ((at = parambj.a("genres")) != null) {
      this.a = (String)new ec[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj2;
        if ((bj2 = at.a(b)) != null)
          this.a[b] = (String)(new ec()).a(bj2); 
      } 
    } 
    return this;
  }
  
  public final String a() {
    js js1;
    if (!(((js1 = this).a != null && js1.a.length > 0) ? 1 : 0))
      return null; 
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < this.a.length; b++) {
      String str;
      if ((str = this.a[b]) != null && ((kc)str).a != null) {
        stringBuffer.append(((kc)str).a);
        if (b != this.a.length - 1)
          stringBuffer.append(", "); 
      } 
    } 
    return stringBuffer.toString();
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/js.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */