public final class im extends bs {
  private static Class a;
  
  public im(int paramInt1, int paramInt2, String paramString) {
    super((a == null) ? (a = a("ks")) : a, "execute.getPlaylist");
    a("owner_id", paramInt1);
    a("id", paramInt2);
    a("access_key", paramString);
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/im.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */