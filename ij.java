public final class ij extends da {
  public int a;
  
  private jq[] a;
  
  public boolean a;
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    this.a = parambj.a("count");
    this.a = parambj.b("can_post");
    parambj.b("show_reply_button");
    parambj.b("groups_can_post");
    at at;
    if ((at = parambj.a("items")) != null) {
      this.a = new jq[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj1;
        if ((bj1 = at.a(b)) != null)
          this.a[b] = (jq)(new jq()).a(bj1); 
      } 
    } 
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ij.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */