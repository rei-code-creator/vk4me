public final class dw extends es {
  private static Class a;
  
  public dw() {
    super((a == null) ? (a = a("gj")) : a, "likes.delete");
  }
  
  public dw(ca paramca) {
    this();
    ca ca1 = paramca;
    dw dw1;
    (dw1 = this).a("type", ca1.a());
    dw1.a("owner_id", ca1.a());
    dw1.a("item_id", ca1.b());
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/dw.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */