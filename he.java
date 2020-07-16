public class he extends fv {
  public aa[] a;
  
  public final da a(bj parambj) {
    super.a(parambj);
    if (parambj == null)
      return (da)this; 
    at at;
    if ((parambj = parambj.a("response")) != null && (at = parambj.a("items")) != null) {
      this.a = new aa[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj1;
        if ((bj1 = at.a(b)) != null)
          this.a[b] = (aa)(new aa()).a(bj1); 
      } 
    } 
    return (da)this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/he.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */