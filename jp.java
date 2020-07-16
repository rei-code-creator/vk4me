import java.io.InputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class jp implements PlayerListener {
  Player a;
  
  int a;
  
  private VolumeControl a;
  
  private ea a = 100;
  
  int b = -1;
  
  private static String a;
  
  private static Boolean a;
  
  public jp(ea paramea) {
    this.a = (Boolean)paramea;
  }
  
  public final void a(int paramInt) {
    this.a = Math.max(0, Math.min(100, paramInt));
    if (this.a == null)
      return; 
    this.a.setLevel(this.a);
  }
  
  public final void playerUpdate(Player paramPlayer, String paramString, Object paramObject) {
    this.a.c();
    if (paramString.equals("endOfMedia"))
      this.a.e(); 
  }
  
  public final void a() {
    if (this.a == null)
      return; 
    this.b = -1;
    try {
      this.a.close();
      this.a = null;
    } catch (Exception exception) {}
    System.gc();
  }
  
  public final int a(int paramInt) {
    if (this.a == null)
      return -1; 
    try {
      if (this.b != -1)
        this.b = paramInt; 
      long l;
      return ((l = this.a.setMediaTime((paramInt * 1000000))) == -1L) ? -1 : (int)(l / 1000000L);
    } catch (Exception exception) {
      return -1;
    } 
  }
  
  public final int a() {
    if (this.a == null)
      return -1; 
    try {
      long l;
      return (this.b != -1) ? this.b : (((l = this.a.getMediaTime()) == -1L) ? -1 : (int)(l / 1000000L));
    } catch (Exception exception) {
      a();
      return -1;
    } 
  }
  
  public final void a(InputStream paramInputStream) {
    a();
    try {
      this.a = (Boolean)Manager.createPlayer(paramInputStream, a());
      this.a.addPlayerListener(this);
      this.a.realize();
      try {
        this.a = (Boolean)this.a.getControl("VolumeControl");
      } catch (Exception exception) {
        this.a = null;
      } 
      a(this.a);
      return;
    } catch (Exception exception) {
      a();
      return;
    } 
  }
  
  public final boolean a() {
    return (this.a == null);
  }
  
  public static String a() {
    if (a != null)
      return (String)a; 
    try {
      String[] arrayOfString = Manager.getSupportedContentTypes(null);
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (arrayOfString[b] != null && arrayOfString[b].toLowerCase().equals("audio/mp3"))
          return (String)(a = (Boolean)"audio/mp3"); 
      } 
    } catch (Exception exception) {}
    return (String)(a = (Boolean)"audio/mpeg");
  }
  
  public static boolean b() {
    if (a != null)
      return a.booleanValue(); 
    try {
      String[] arrayOfString = Manager.getSupportedProtocols(null);
      for (byte b = 0; b < arrayOfString.length; b++) {
        if (arrayOfString[b] != null && arrayOfString[b].toLowerCase().indexOf("https") != -1)
          return (a = Boolean.TRUE).booleanValue(); 
      } 
    } catch (Exception exception) {}
    return (a = Boolean.FALSE).booleanValue();
  }
  
  public final boolean c() {
    try {
      return (this.a != null && this.a.getState() == 400);
    } catch (Exception exception) {
      return false;
    } 
  }
  
  public static boolean a(String paramString) {
    try {
      FileConnection fileConnection;
      boolean bool = ((fileConnection = (FileConnection)Connector.open(paramString, 3)).exists() && fileConnection.isDirectory() && fileConnection.canWrite() && fileConnection.canRead()) ? true : false;
      fileConnection.close();
      return bool;
    } catch (Exception exception) {
      return false;
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jp.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */