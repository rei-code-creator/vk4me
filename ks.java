public class ks extends aj {
  public cm[] a;
  
  public final da a(bj parambj) {
    super.a(parambj);
    if (parambj == null)
      return this; 
    at at;
    if (parambj.a("response") != null && (at = parambj.a("items")) != null) {
      this.a = new cm[at.a.size()];
      for (byte b = 0; b < at.a.size(); b++) {
        if (at.a(b) != null)
          this.a[b] = (cm)(new cm()).a(parambj); 
      } 
    } 
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ks.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */