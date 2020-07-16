public final class ah extends es {
  private static Class a;
  
  public ah() {
    super((a == null) ? (a = a("it")) : a, "friends.add");
    a("follow", 0);
  }
  
  public ah(int paramInt) {
    this();
    a("user_id", paramInt);
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ah.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */