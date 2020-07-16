public final class kv extends es {
  private static Class a;
  
  public kv() {
    super((a == null) ? (a = a("ac")) : a, "messages.getLongPollServer");
    a("lp_version", 3);
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/kv.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */