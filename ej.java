public class ej extends dv implements fh {
  private int a;
  
  public de a;
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    parambj.a("product_id");
    this.a = parambj.a("sticker_id");
    at at;
    if ((at = parambj.a("images")) != null)
      for (byte b = 0; b < at.a.size(); b++) {
        bj bj1;
        de de1;
        if ((bj1 = at.a(b)) != null && ((de1 = (de)(new de()).a(bj1)).a == 100 || de1.a == 128)) {
          this.a = de1;
          break;
        } 
      }  
    return this;
  }
  
  public final String toString() {
    return this.a + "";
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ej.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */