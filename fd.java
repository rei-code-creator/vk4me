public final class fd extends es {
  private static Class a;
  
  public fd() {
    super((a == null) ? (a = a("ia")) : a, "groups.leave");
  }
  
  public fd(int paramInt) {
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


/* Location:              /home/kost/Загрузки/latest.jar!/fd.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */