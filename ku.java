public final class ku extends da {
  public String a;
  
  public String b;
  
  public String c;
  
  public int a;
  
  public ir a;
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    this.a = (ir)parambj.a("text");
    parambj.a("email");
    this.b = parambj.a("type");
    this.a = parambj.a("member_id");
    this.c = parambj.a("message");
    if ((parambj = parambj.a("photo")) != null)
      this.a = (ir)(new ir()).a(parambj); 
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ku.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */