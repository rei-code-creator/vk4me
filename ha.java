public final class ha extends es {
  private static Class a;
  
  public ha() {
    super((a == null) ? (a = a("kk")) : a, "friends.delete");
  }
  
  public ha(int paramInt) {
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


/* Location:              /home/kost/Загрузки/latest.jar!/ha.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */