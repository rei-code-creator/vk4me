public final class z extends es {
  private static Class a;
  
  public z() {
    super((a == null) ? (a = a("j")) : a, "likes.add");
  }
  
  public z(ca paramca) {
    this();
    ca ca1 = paramca;
    z z1;
    (z1 = this).a("type", ca1.a());
    z1.a("owner_id", ca1.a());
    z1.a("item_id", ca1.b());
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/z.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */