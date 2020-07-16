public final class gb extends es {
  private static Class a;
  
  public gb(String paramString) {
    super((a == null) ? (a = a("al")) : a, "auth.validatePhone");
    a("api_id", "2274003");
    a("client_id", "2274003");
    a("client_secret", "hHbZxrka2uZ6jB1inYsH");
    a("sid", paramString);
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
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/gb.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */