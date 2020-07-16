public class ho extends fv {
  private bw[] a;
  
  public final bw a() {
    ho ho1;
    return (((ho1 = this).a != null && ho1.a.length > 0)) ? this.a[0] : null;
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
      this.a = new bw[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj1;
        if ((bj1 = at.a(b)) != null)
          this.a[b] = (bw)(new bw()).a(bj1); 
      } 
    } 
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ho.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */