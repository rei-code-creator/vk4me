final class bv extends fe {
  private final bi a;
  
  private final i a;
  
  bv(i parami, String paramString, bi parambi) {
    super(paramString);
    this.a = parami;
    this.a = (i)parambi;
  }
  
  public final void a() {
    kk kk;
    switch (((bi)this.a).g) {
      case 1:
      case 3:
        if ((kk = (kk)(new ha(this.a.a())).a((iq)fy.a)) != null) {
          switch (kk.a) {
            case 10:
              a(u.a("action.acceptFriendsRequest"));
              ((bi)this.a).g = 2;
              au.a((lb)this.a);
              this.a.a = this.a;
              return;
          } 
          a(u.a("action.addToFriends"));
          ((bi)this.a).g = 0;
          au.a((lb)this.a);
          this.a.a = this.a;
          return;
        } 
        gz.a.a(u.a("element.friendRemoveError"));
        return;
    } 
    it it;
    if ((it = (it)(new ah(this.a.a())).a((iq)fy.a)) != null) {
      switch (it.a) {
        case 1:
        case 4:
          a(u.a("action.cancelFriendsRequest"));
          ((bi)this.a).g = 1;
          au.a((lb)this.a);
          this.a.a = this.a;
          return;
        case 2:
          a(u.a("action.removeFromFriends"));
          ((bi)this.a).g = 3;
          au.a((lb)this.a);
          this.a.a = this.a;
          break;
      } 
      return;
    } 
    gz.a.a(u.a("element.friendSendError"));
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/bv.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */