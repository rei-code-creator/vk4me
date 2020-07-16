import java.util.Vector;

final class gq extends jr {
  private final aa a;
  
  private final jq a;
  
  gq(String paramString, aa paramaa, jq paramjq) {
    super(paramString);
    this.a = (jq)paramaa;
    this.a = paramjq;
  }
  
  public final void c() {
    fw.a.b(true);
    boolean bool = (this.a == null) ? true : false;
    Vector vector = new Vector();
    jq jq1 = this.a;
    q q2;
    (q2 = new q()).a("owner_id", ((aa)jq1).a);
    q2.a("post_id", ((aa)jq1).e);
    (q2 = q2).a("count", 20);
    q q1 = q2;
    if (this.a != null) {
      hy hy = this.a.a;
      q1.a("comment_id", hy);
    } 
    if (!bool) {
      int i = ((Integer)this.a).intValue();
      q1.a("start_comment_id", i);
    } else {
      this.a = (jq)new Integer(2147483647);
    } 
    lg lg1;
    lg lg2;
    if ((lg1 = (lg)q1.a()) != null && (((lg2 = lg1).a != null && lg2.a.length > 0))) {
      if (lg1.a.length < 20)
        this.b = true; 
      for (byte b = 0; b < lg1.a.length; b++) {
        jq1 = lg1.a[b];
        if (bool && ((Integer)this.a).intValue() > jq1.a)
          this.a = (jq)new Integer(jq1.a); 
        r r = fw.a(this, (aa)this.a, jq1);
        vector.addElement(r);
      } 
      (new p(vector)).start();
    } else {
      this.b = true;
      if (lg1 == null)
        gz.a.a(u.a("general.loadError")); 
    } 
    fw.a.b(false);
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/gq.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */