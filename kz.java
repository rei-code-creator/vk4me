public final class kz {
  public boolean a;
  
  long a;
  
  int a;
  
  int[] a;
  
  int[] b;
  
  int[] c;
  
  private byte a;
  
  public kz(int paramInt) {
    kz kz1;
    (kz1 = this).a = new int[1];
    kz1.b = new int[1];
    kz1.c = new int[1];
    this.a = (byte)paramInt;
  }
  
  public final int a() {
    return this.c[0];
  }
  
  public final void a(int paramInt) {
    this.a = paramInt;
    this.a = System.currentTimeMillis();
    this.a = 1;
    System.arraycopy(this.c, 0, this.a, 0, this.c.length);
  }
  
  public final void a() {
    System.arraycopy(this.b, 0, this.c, 0, this.c.length);
    this.a = 0;
  }
  
  public final boolean a() {
    if (this.a == 0)
      return false; 
    long l1;
    if ((l1 = System.currentTimeMillis() - this.a) >= this.a) {
      a();
      return true;
    } 
    switch (this.a) {
      case 1:
        l1 = l1 * l1 / this.a;
        break;
      case 2:
        l1 = (this.a - l1) * (this.a - l1) / this.a;
        l1 = this.a - l1;
        break;
    } 
    long l2 = this.a - l1;
    for (byte b = 0; b < this.c.length; b++)
      this.c[b] = (int)((this.a[b] * l2 + this.b[b] * l1) / this.a); 
    return false;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/kz.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */