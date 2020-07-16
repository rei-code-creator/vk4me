public class kk extends aj {
  public int a;
  
  public final da a(bj parambj) {
    super.a(parambj);
    if (parambj == null)
      return this; 
    if ((parambj = parambj.a("response")) != null) {
      parambj.a("success");
      if (parambj.a("friend_deleted") == 1) {
        this.a = 10;
      } else if (parambj.a("out_request_deleted") == 1) {
        this.a = 20;
      } else if (parambj.a("in_request_deleted") == 1) {
        this.a = 30;
      } else if (parambj.a("suggestion_deleted") == 1) {
        this.a = 40;
      } 
    } 
    return this;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/kk.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */