public final class ge extends aj {
  public bi[] a;
  
  public final da a(bj parambj) {
    super.a(parambj);
    if (parambj == null)
      return this; 
    at at;
    if ((at = (at)(((parambj = parambj.a("response")) != null) ? parambj.a("items") : null)) != null) {
      this.a = new bi[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj1;
        if ((bj1 = at.a(b)) != null)
          this.a[b] = (bi)(new bi()).a(bj1); 
      } 
    } 
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ge.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */