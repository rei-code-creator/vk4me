public abstract class lb extends da {
  public boolean d;
  
  public boolean e;
  
  public lb(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  public abstract String d();
  
  public abstract String b();
  
  public abstract String c();
  
  public abstract String b(String paramString);
  
  public abstract int a();
  
  public final int b() {
    return this.d ? -a() : a();
  }
  
  public final boolean a() {
    return !ab.a(a());
  }
  
  public abstract String a();
  
  public abstract String a(String paramString);
  
  public final String c(String paramString) {
    return this.d ? b(paramString) : a(paramString);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/lb.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */