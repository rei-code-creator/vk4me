public final class cl {
  public final String a;
  
  public final char a(int paramInt) {
    return this.a.charAt(paramInt);
  }
  
  public final boolean a(int paramInt) {
    return (paramInt >= this.a.length());
  }
  
  public cl(String paramString) {
    this.a = paramString;
  }
  
  public cl() {}
  
  public static kl a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean) {
    paramString1 = paramString3;
    ie ie2;
    (ie2 = new ie(paramString1, paramString2)).c = paramString1;
    ie2.a("captcha_key", ie2.c);
    paramString1 = paramString4;
    (ie2 = ie2).b = paramString1;
    ie2.a("captcha_sid", ie2.b);
    paramString1 = paramString5;
    (ie2 = ie2).a = (Class)paramString1;
    ie2.a("code", ie2.a);
    (ie2 = ie2).a = paramBoolean;
    ie2.a("force_sms", (ie2.a != null) ? "1" : null);
    ie ie1;
    if (ab.a(paramString2 = hk.c(ie1 = ie2)))
      ie1.b(); 
    try {
      bj bj = new bj(paramString2);
    } catch (dc dc) {
      paramString2 = null;
    } 
    ae ae1 = (ae)ie1.b();
    if (paramString2 == null || ae1 == null) {
      ae1 = null;
    } else {
      ae1 = (ae)ae1.a((bj)paramString2);
    } 
    if (ae1 == null)
      return new kl(0, ae1); 
    if (ae1.b() && paramBoolean)
      (new gb(ae1.f)).a(); 
    if (ae1.a()) {
      try {
        fy.a = (ca)new iq(ae1.a);
      } catch (Exception exception) {}
      return new kl(4, ae1);
    } 
    ae ae2;
    return (((!ab.a((ae2 = ae1).e)) || (!ab.a(ae2.d)) || ae2.b())) ? new kl(2, ae1) : ((((!ab.a((ae2 = ae1).b)) || (!ab.a(ae2.c)))) ? new kl(1, ae1) : ((((ae2 = ae1).c() && ae2.g.equals("username_or_password_is_incorrect"))) ? new kl(3, ae1) : ((((ae2 = ae1).c() && ae2.g.equals("wrong_otp"))) ? new kl(-2, ae1) : ((((ae2 = ae1).c() && ae2.g.equals("otp_format_is_incorrect"))) ? new kl(-1, ae1) : new kl(0, ae1)))));
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/cl.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */