import java.util.Vector;

public final class ic extends es {
  private Vector a = new Vector();
  
  private static Class a;
  
  public ic() {
    super((a == null) ? (a = a("fj")) : a, "users.get");
    a("extended", 1);
    a("fields", "description,can_message,ban_info,can_write_private_message,can_see_audio,followers,friend_status,common_count,blacklisted,blacklisted_by_me,fixed_post,description,ban_info,members_count,counters,photo_50,photo_100,text,views,reposts,likes,status,sex,online,online_app,online_mobile,last_seen,first_name_nom,first_name_gen,first_name_dat,first_name_acc,first_name_ins,first_name_abl,last_name_nom,last_name_gen,last_name_dat,last_name_acc,last_name_ins,last_name_abl,bdate,screen_name");
  }
  
  public ic(int paramInt) {
    this();
    int i = paramInt;
    ic ic1 = this;
    if (i < 0)
      i = -i; 
    if (ic1.a.indexOf(new Integer(i)) == -1) {
      ic1.a.addElement(new Integer(i));
      ic ic2;
      if (((ic2 = ic1 = ic1).a != null && ic2.a.size() > 0)) {
        ic1.a("user_ids", a(",", (Vector)ic1.a));
        return;
      } 
      ic1.a("user_ids", (Object)null);
    } 
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ic.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */