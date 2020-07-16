public class ee extends aj {
  public lk[] a;
  
  public final boolean b() {
    return (this.a != null && this.a.length > 0);
  }
  
  public final lk a() {
    return b() ? this.a[0] : null;
  }
  
  public final da a(bj parambj) {
    super.a(parambj);
    if (parambj == null)
      return this; 
    at at;
    if ((at = parambj.a("response")) != null) {
      this.a = new lk[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj1;
        if ((bj1 = at.a(b)) != null)
          this.a[b] = (lk)(new lk()).a(bj1); 
      } 
    } 
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ee.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */