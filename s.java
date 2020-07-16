public final class s extends es {
  private static Class a;
  
  public s(int paramInt1, int paramInt2) {
    super((a == null) ? (a = a("jw")) : a, "messages.getHistory");
    a("extended", 1);
    a("fields", "description,can_message,ban_info,can_write_private_message,can_see_audio,followers,friend_status,common_count,blacklisted,blacklisted_by_me,fixed_post,description,ban_info,members_count,counters,photo_50,photo_100,text,views,reposts,likes,status,sex,online,online_app,online_mobile,last_seen,first_name_nom,first_name_gen,first_name_dat,first_name_acc,first_name_ins,first_name_abl,last_name_nom,last_name_gen,last_name_dat,last_name_acc,last_name_ins,last_name_abl,bdate,screen_name");
    a("peer_id", paramInt1);
    a("count", paramInt2);
    a("offset", 0);
  }
  
  public s(int paramInt) {
    this(paramInt, 1);
  }
  
  private static Class a(String paramString) {
    try {
      return Class.forName(paramString);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new NoClassDefFoundError(classNotFoundException.getMessage());
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/s.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */