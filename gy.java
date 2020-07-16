public final class gy extends es {
  private static Class a;
  
  public gy() {
    super((a == null) ? (a = a("gk")) : a, "wall.repost");
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/gy.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */