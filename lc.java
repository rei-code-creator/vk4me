public class lc extends fv {
  private is[] a;
  
  public final is a() {
    lc lc1;
    return (((lc1 = this).a != null && lc1.a.length > 0)) ? this.a[0] : null;
  }
  
  public final boolean b() {
    return (a() != null);
  }
  
  public final da a(bj parambj) {
    super.a(parambj);
    if (parambj == null)
      return this; 
    parambj.a("count");
    at at;
    if ((parambj = parambj.a("response")) != null && (at = parambj.a("items")) != null) {
      this.a = new is[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj1;
        if ((bj1 = at.a(b)) != null)
          this.a[b] = (is)(new is()).a(bj1); 
      } 
    } 
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/lc.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */