public final class hm extends dv {
  private int a;
  
  private int b;
  
  private String a;
  
  public hm(String paramString) {
    this.a = paramString;
  }
  
  public final String toString() {
    return this.a + this.b + "_" + this.a;
  }
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    this.a = parambj.a("id");
    this.b = parambj.a("owner_id");
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/hm.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */