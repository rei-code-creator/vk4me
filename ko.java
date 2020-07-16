public final class ko extends es {
  private static Class a;
  
  public ko() {
    super((a == null) ? (a = a("dl")) : a, "messages.getLongPollHistory");
    a("lp_version", 3);
    a(1000);
    a("msgs_limit", String.valueOf(200));
    a("credentials", 0);
    a("onlines", 0);
  }
  
  public ko(int paramInt) {
    this();
    a("ts", paramInt);
  }
  
  public final ko a(int paramInt) {
    a("events_limit", (paramInt == -1) ? null : String.valueOf(paramInt));
    return this;
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ko.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */