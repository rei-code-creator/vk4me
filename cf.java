public final class cf extends es {
  private static Class a;
  
  public cf() {
    super((a == null) ? (a = a("hl")) : a, "photos.saveMessagesPhoto");
  }
  
  public cf(String paramString1, long paramLong, String paramString2) {
    this();
    String str2 = paramString2;
    long l = paramLong;
    String str1 = paramString1;
    cf cf1;
    (cf1 = this).a("photo", (str1 != null) ? hk.a(str1) : null);
    cf1.a("server", String.valueOf((float)l));
    cf1.a("hash", str2);
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/cf.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */