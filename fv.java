public class fv extends aj {
  public bi[] a;
  
  public lk[] a;
  
  public da a(bj parambj) {
    super.a(parambj);
    if (parambj == null)
      return this; 
    if ((parambj = parambj.a("response")) != null) {
      at at;
      if ((at = parambj.a("groups")) != null) {
        this.a = new lk[at.a.size()];
        for (byte b = 0; b < at.a.size(); b++) {
          bj bj1;
          if ((bj1 = at.a(b)) != null)
            this.a[b] = (lk)(new lk()).a(bj1); 
        } 
      } 
      if ((at = parambj.a("profiles")) != null) {
        this.a = (lk[])new bi[at.a.size()];
        for (byte b = 0; b < at.a.size(); b++) {
          bj bj1;
          if ((bj1 = at.a(b)) != null)
            this.a[b] = (lk)(new bi()).a(bj1); 
        } 
      } 
    } 
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/fv.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */