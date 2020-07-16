public class io extends fv {
  public aa[] a;
  
  public String a;
  
  public final da a(bj parambj) {
    super.a(parambj);
    if (parambj == null)
      return (da)this; 
    this.a = parambj.a("next_from");
    at at;
    if ((parambj = parambj.a("response")) != null && (at = parambj.a("items")) != null) {
      this.a = (String)new aa[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj1;
        if ((bj1 = at.a(b)) != null)
          this.a[b] = (String)(new aa()).a(bj1); 
      } 
    } 
    return (da)this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/io.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */