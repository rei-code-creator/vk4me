public class jr extends la {
  public Object a;
  
  public Object b;
  
  public r a;
  
  public boolean a;
  
  public boolean b;
  
  public jr() {
    r r1;
    (r1 = (new ii(this, u.a("action.refresh"))).a("lirefr.png", "lirefrs.png")).n = true;
    this.a = r1;
    this.a = false;
    this.b = false;
    a(true);
    b();
  }
  
  public final la a() {
    this.b = true;
    return super.a();
  }
  
  public jr(String paramString) {
    this();
    c(paramString);
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Z
    //   4: ifeq -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield b : Ljava/util/Vector;
    //   12: invokevirtual removeAllElements : ()V
    //   15: aload_0
    //   16: getfield b : Ljava/util/Vector;
    //   19: aload_0
    //   20: getfield a : Lr;
    //   23: invokevirtual addElement : (Ljava/lang/Object;)V
    //   26: aload_0
    //   27: aconst_null
    //   28: putfield a : Ljava/lang/Object;
    //   31: aload_0
    //   32: aconst_null
    //   33: putfield b : Ljava/lang/Object;
    //   36: aload_0
    //   37: iconst_0
    //   38: putfield b : Z
    //   41: return
  }
  
  public void b() {
    if (this.a)
      return; 
    a();
    g();
  }
  
  public final void a_() {
    if (this.e - this.g - this.j < ((gz)gz.a).a.a() + i)
      g(); 
  }
  
  public void c() {}
  
  public final void g() {
    if (this.a || this.b)
      return; 
    this.a = true;
    (new ig(this)).start();
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jr.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */