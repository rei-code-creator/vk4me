public class aj extends da {
  private String a;
  
  private String b;
  
  public String g;
  
  private String c;
  
  private int a = -1;
  
  public boolean a() {
    return (!(!ab.a(this.a) ? 1 : 0) && !c() && !(!ab.a(this.b) ? 1 : 0) && !((this.a != -1) ? 1 : 0) && !(!ab.a(this.c) ? 1 : 0));
  }
  
  public final boolean c() {
    return !ab.a(this.g);
  }
  
  public da a(bj parambj) {
    if (parambj == null)
      return this; 
    if (parambj.a("error")) {
      bj bj1;
      if ((bj1 = parambj.a("error")) != null) {
        this.a = bj1.a("error_code", -1);
        this.c = bj1.a("error_msg");
      } else {
        this.a = parambj.a("error");
      } 
    } 
    this.b = parambj.a("error_description");
    this.g = parambj.a("error_type");
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/aj.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */