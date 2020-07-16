import java.util.Vector;

public final class bn extends es {
  private Vector a = new Vector();
  
  private static Class a;
  
  public bn() {
    super((a == null) ? (a = a("lc")) : a, "messages.getConversationsById");
    a("extended", 1);
    a("fields", "description,can_message,ban_info,can_write_private_message,can_see_audio,followers,friend_status,common_count,blacklisted,blacklisted_by_me,fixed_post,description,ban_info,members_count,counters,photo_50,photo_100,text,views,reposts,likes,status,sex,online,online_app,online_mobile,last_seen,first_name_nom,first_name_gen,first_name_dat,first_name_acc,first_name_ins,first_name_abl,last_name_nom,last_name_gen,last_name_dat,last_name_acc,last_name_ins,last_name_abl,bdate,screen_name");
  }
  
  public final bn a(int paramInt) {
    if (paramInt < 0)
      paramInt = -paramInt; 
    if (this.a.indexOf(new Integer(paramInt)) != -1)
      return this; 
    this.a.addElement(new Integer(paramInt));
    bn bn1;
    bn bn2;
    if (((bn2 = bn1 = this).a != null && bn2.a.size() > 0)) {
      bn1.a("peer_ids", a(",", (Vector)bn1.a));
    } else {
      bn1.a("peer_ids", (Object)null);
    } 
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


/* Location:              /home/kost/Загрузки/latest.jar!/bn.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */