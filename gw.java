public final class gw extends es {
  private static Class a;
  
  public gw() {
    super((a == null) ? (a = a("an")) : a, "messages.delete");
  }
  
  public gw(int paramInt) {
    this();
    a("message_ids", paramInt);
  }
  
  public final gw a(boolean paramBoolean) {
    a("delete_for_all", paramBoolean ? "1" : null);
    return this;
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/gw.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */