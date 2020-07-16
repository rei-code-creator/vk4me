import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

final class kq implements PlayerListener {
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    if (paramString.equals("endOfMedia")) {
      if (gz.a != null)
        try {
          gz.a.close();
        } catch (Exception exception) {} 
      gz.a = null;
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/kq.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */