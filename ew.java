final class ew extends r {
  private final boolean s;
  
  private final String h;
  
  private final String i;
  
  private final jv a;
  
  ew(jv paramjv, String paramString1, boolean paramBoolean, String paramString2, String paramString3) {
    super(paramString1, (byte)2);
    this.a = paramjv;
    this.s = paramBoolean;
    this.h = paramString2;
    this.i = paramString3;
  }
  
  public final void a() {
    if (this.s) {
      jv.d(this.a);
    } else {
      jv.d(this.a, this.h);
    } 
    this.a.b(this.i.substring(this.h.length() + jv.a.length(), this.i.length() - jv.a.length()));
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ew.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */