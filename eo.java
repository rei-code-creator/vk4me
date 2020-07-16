final class eo extends r {
  private final boolean s;
  
  private final String h;
  
  private final String i;
  
  private final jv a;
  
  eo(jv paramjv, String paramString1, byte paramByte, boolean paramBoolean, String paramString2, String paramString3) {
    super(paramString1, paramByte);
    this.a = paramjv;
    this.s = paramBoolean;
    this.h = paramString2;
    this.i = paramString3;
  }
  
  public final void a() {
    if (this.s) {
      jv.d(this.a, this.h + this.i);
      return;
    } 
    jv.a(this.a, this.h + this.i + ((this.s && !this.i.endsWith((String)jv.a)) ? (String)jv.a : ""));
  }
  
  public final void e() {
    this.a.c();
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/eo.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */