final class h extends r {
  private final Runnable a;
  
  h(String paramString, Runnable paramRunnable) {
    super(paramString, (byte)0);
    this.a = paramRunnable;
  }
  
  public final void a() {
    if (this.a != null)
      this.a.run(); 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/h.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */