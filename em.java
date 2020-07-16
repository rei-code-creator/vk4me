final class em extends fe {
  private final lk a;
  
  private final i a;
  
  em(i parami, String paramString, lk paramlk) {
    super(paramString);
    this.a = parami;
    this.a = (i)paramlk;
  }
  
  public final void a() {
    if (((lk)this.a).b) {
      ia ia;
      if ((ia = (ia)(new fd(this.a.b())).a((iq)fy.a)) != null) {
        if (ia.a) {
          a(!((lk)this.a).b ? "Вступить в группу" : "Отправить заявку");
          ((lk)this.a).b = false;
          ((lk)this.a).c = false;
          au.a((lb)this.a);
          this.a.a = this.a;
          return;
        } 
      } else {
        gz.a.a(u.a("element.groupLeaveError"));
      } 
      return;
    } 
    am am;
    if ((am = (am)(new ao(this.a.b())).a((iq)fy.a)) != null) {
      if (am.a) {
        a("Покинуть группу");
        ((lk)this.a).b = true;
        au.a((lb)this.a);
        this.a.a = this.a;
        return;
      } 
    } else {
      gz.a.a(u.a("element.groupJoinError"));
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/em.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */