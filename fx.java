public final class fx extends bs {
  private int a;
  
  private static Class a;
  
  public fx() {
    super((a == null) ? (a = a("gs")) : a, "audio.get");
  }
  
  public final fx a(int paramInt) {
    this.a = paramInt;
    if (a()) {
      a("owner_id", this.a);
    } else {
      a("owner_id", (Object)null);
    } 
    return this;
  }
  
  public final fx b(int paramInt) {
    a("offset", (paramInt == -1) ? null : String.valueOf(paramInt));
    return this;
  }
  
  public final fx c(int paramInt) {
    a("count", (paramInt == -1) ? null : String.valueOf(paramInt));
    return this;
  }
  
  public final boolean a() {
    return (this.a != null);
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/fx.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */