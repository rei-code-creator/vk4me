public class jg extends dv {
  public int a;
  
  public String a;
  
  private String b;
  
  public final String toString() {
    String str;
    return this.a + "\n" + (((str = this.a) >= 1073741824) ? ((str / 1073741824) + " GB") : ((str >= 1048576) ? ((str / 1048576) + " MB") : ((str >= 'Ѐ') ? ((str / 1024) + " KB") : (str + " B")))) + " - " + this.b.toUpperCase();
  }
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    parambj.a("id");
    parambj.a("owner_id");
    this.a = parambj.a("size");
    parambj.a("date");
    parambj.a("type");
    this.a = parambj.a("title");
    this.b = parambj.a("ext");
    parambj.a("url");
    if ((parambj = parambj.a("preview")) != null)
      (new bg()).a(parambj); 
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jg.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */