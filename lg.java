public class lg extends fv {
  public jq[] a;
  
  public final da a(bj parambj) {
    super.a(parambj);
    if (parambj == null)
      return this; 
    parambj.a("count");
    parambj.a("current_level_count");
    parambj.b("can_post");
    parambj.b("show_reply_button");
    parambj.b("groups_can_post");
    at at;
    if ((parambj = parambj.a("response")) != null && (at = parambj.a("items")) != null) {
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


/* Location:              /home/kost/Загрузки/latest.jar!/lg.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */