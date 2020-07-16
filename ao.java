public final class ao extends es {
  private static Class a;
  
  public ao() {
    super((a == null) ? (a = a("am")) : a, "groups.join");
  }
  
  public ao(int paramInt) {
    this();
    a("group_id", Math.abs(paramInt));
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ao.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */