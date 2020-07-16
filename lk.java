public final class lk extends lb {
  public int a;
  
  public int b;
  
  public int c;
  
  private String c;
  
  private String d;
  
  public String a;
  
  private String e;
  
  private String f;
  
  public String b;
  
  public boolean a;
  
  public boolean b;
  
  public boolean c;
  
  public int d;
  
  public int e;
  
  public lk() {
    super(true);
  }
  
  public final String a() {
    return this.b;
  }
  
  public final String b() {
    return (String)(!ab.a(this.e) ? this.e : "https://vk.com/images/community_50.png");
  }
  
  public final String c() {
    return !ab.a(this.f) ? this.f : "https://vk.com/images/community_100.png";
  }
  
  public final String b(String paramString) {
    return this.c;
  }
  
  public final int a() {
    return -this.a;
  }
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    this.a = parambj.a("id");
    this.b = parambj.a("is_closed");
    parambj.a("admin_level");
    this.c = parambj.a("invited_by");
    this.c = parambj.a("name");
    this.d = parambj.a("screen_name");
    this.a = parambj.a("deactivated");
    parambj.a("type");
    this.e = parambj.a("photo_50");
    this.f = parambj.a("photo_100");
    this.d = parambj.a("members_count");
    this.b = b(parambj.a("is_member"));
    parambj.a("is_admin");
    parambj.a("is_advertiser");
    this.b = parambj.a("status");
    this.c = parambj.b("can_message");
    parambj.a("description");
    bj bj1;
    if ((bj1 = parambj.a("ban_info")) != null) {
      this.a = true;
      bj1.a("comment");
      bj1.a("reason", -1);
      bj1.a("end_date");
    } 
    if ((bj1 = parambj.a("counters")) != null)
      this.e = bj1.a("audios"); 
    return this;
  }
  
  public final String a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/lang/String;
    //   4: ifnull -> 17
    //   7: aload_0
    //   8: getfield c : Ljava/lang/String;
    //   11: invokevirtual length : ()I
    //   14: ifgt -> 22
    //   17: aload_0
    //   18: getfield c : Ljava/lang/String;
    //   21: areturn
    //   22: new java/lang/StringBuffer
    //   25: dup
    //   26: invokespecial <init> : ()V
    //   29: aload_0
    //   30: getfield c : Ljava/lang/String;
    //   33: iconst_0
    //   34: invokevirtual charAt : (I)C
    //   37: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   40: ldc '.'
    //   42: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   45: invokevirtual toString : ()Ljava/lang/String;
    //   48: areturn
  }
  
  public final String d() {
    return this.d;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/lk.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */