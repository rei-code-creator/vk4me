public class dp extends dv implements fh {
  public int a;
  
  public int b;
  
  private int c;
  
  private int d;
  
  public String a;
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    this.a = parambj.a("src") ? parambj.a("src") : parambj.a("url");
    this.a = parambj.a("width");
    this.b = parambj.a("height");
    this.c = parambj.a("owner_id");
    this.d = parambj.a("id");
    return this;
  }
  
  public final String toString() {
    return "graffiti" + this.c + "_" + this.d;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/dp.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */