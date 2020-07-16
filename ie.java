public final class ie extends es {
  public String a;
  
  public String b;
  
  public String c;
  
  public boolean a = false;
  
  private static Class a;
  
  public ie(String paramString1, String paramString2) {
    super((a == null) ? (a = a("ae")) : a, "token");
    a("libverify_support", 1);
    a("grant_type", "password");
    a("client_id", "2274003");
    a("client_secret", "hHbZxrka2uZ6jB1inYsH");
    a("scope", "all");
    a("2fa_supported", 1);
    paramString1 = paramString1;
    a("username", (paramString1 == null) ? null : hk.a(paramString1));
    paramString1 = paramString2;
    a("password", (paramString1 == null) ? null : hk.a(paramString1));
  }
  
  public final aj a(iq paramiq) {
    return a();
  }
  
  public final aj a() {
    String str;
    if (ab.a(str = hk.b(this)))
      return b(); 
    try {
      bj bj = new bj(str);
    } catch (dc dc) {
      str = null;
    } 
    aj aj = b();
    return (str == null || aj == null) ? aj : (aj)aj.a((bj)str);
  }
  
  public final String toString() {
    return ((fy.i == null) ? "http://vk-oauth-proxy.xtrafrancyz.net/" : fy.i) + a();
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ie.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */