public final class ju extends es {
  private static Class a;
  
  public ju() {
    super((a == null) ? (a = a("fi")) : a, "photos.getMessagesUploadServer");
  }
  
  public ju(int paramInt) {
    this();
    a("peer_id", paramInt);
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ju.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */