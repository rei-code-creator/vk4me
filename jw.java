public class jw extends fv {
  public bw[] a;
  
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
  
  public final boolean b() {
    return (this.a != null && this.a.length > 0);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jw.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */