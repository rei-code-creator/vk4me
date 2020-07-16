public final class jn extends es {
  private static Class a;
  
  public jn() {
    super((a == null) ? (a = a("iz")) : a, "auth.refreshToken");
    a("v", "5.90");
  }
  
  public jn(String paramString) {
    this();
    paramString = paramString;
    a("receipt", paramString);
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jn.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */