public final class is extends da {
  public hf a;
  
  public int a;
  
  private ik a;
  
  public x a;
  
  public final int a() {
    return f() ? ((hf)this.a).a : 0;
  }
  
  private boolean e() {
    return (d() && this.a.a != 0);
  }
  
  public final boolean a() {
    return (((this.a != null)) && ((ik)this.a).a);
  }
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    bj bj1;
    if ((bj1 = parambj.a("peer")) != null)
      this.a = (x)(new hf()).a(bj1); 
    if ((bj1 = parambj.a("can_write")) != null)
      this.a = (x)(new ik()).a(bj1); 
    if ((bj1 = parambj.a("chat_settings")) != null)
      this.a = (x)(new x()).a(bj1); 
    if ((bj1 = parambj.a("push_settings")) != null)
      (new dy()).a(bj1); 
    this.a = parambj.a("in_read");
    parambj.a("out_read");
    parambj.a("unread_count");
    parambj.b("important");
    parambj.b("unanswered");
    return this;
  }
  
  public final boolean b() {
    return (f() && (((hf)this.a).a.equals("user") || ((hf)this.a).a.equals("group")) && !e());
  }
  
  public final boolean c() {
    return (!b() && !e());
  }
  
  private boolean f() {
    return (this.a != null);
  }
  
  public final String a() {
    lb lb = b() ? au.a(((hf)this.a).a) : null;
    return (String)(b() ? ((lb != null) ? lb.b("nom") : null) : (d() ? this.a.a : null));
  }
  
  public final boolean d() {
    return (this.a != null);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/is.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */