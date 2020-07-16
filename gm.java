final class gm extends r {
  gm(String paramString) {
    super(paramString, (byte)1);
  }
  
  public final void b() {
    boolean bool = false;
    try {
      bool = jp.a(((v)ci.a).b);
    } catch (Throwable throwable) {}
    if (!bool)
      gz.a.a(u.a("settings.cachingFolderNotExists")); 
    this.e = ((v)ci.a).m = (this.e && bool);
    ci.a.a();
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/gm.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */