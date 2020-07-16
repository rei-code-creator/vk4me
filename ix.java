public final class ix extends es {
  private static Class a;
  
  public ix() {
    super((a == null) ? (a = a("fq")) : a, "messages.markAsRead");
  }
  
  public ix(int paramInt1, int paramInt2) {
    this();
    a("peer_id", paramInt1);
    a("start_message_id", paramInt2);
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ix.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */