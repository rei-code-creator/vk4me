import java.util.Enumeration;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.io.file.FileSystemRegistry;

public class jv extends la {
  la a;
  
  boolean a;
  
  public static String a = null;
  
  private r a;
  
  private r b;
  
  private r c;
  
  private ba b;
  
  String b;
  
  public jv(boolean paramBoolean, la paramla) {
    a(true);
    this.a = (r)paramla;
    this.a = paramBoolean;
    jv jv1;
    c(u.a(((jv1 = this).a != null) ? "title.chooseFolder" : "title.chooseFile"));
    jv1.b = (String)new ba(u.a("general.actions"));
    jv1.b.a(new df(jv1, u.a((jv1.a != null) ? "fm.chooseThisFolder" : "fm.chooseThisFile")), true);
    jv1.b.a(new cw(jv1, u.a("fm.createFolder")), true);
    jv1.b.a(new cx(jv1, u.a("fm.rename")), true);
    jv1.b.a(new cy(jv1, u.a("fm.delete")), true);
    jv1.b.a(new cz(jv1, u.a("action.cancelChoosing")), true);
    jv1.e();
  }
  
  private void d() {
    ba ba1 = new ba();
    r r1 = (r)a();
    String str = u.a("fm.deleteConfirm", r1.f);
    gg gg;
    (gg = (new gg(str)).b().a(13948116)).r = true;
    ba1.a(gg, false);
    ba1.a(new dr(this, u.a("action.ok"), r1), true);
    ba1.a(new ds(u.a("action.cancel")), true);
    gz.a.a(ba1);
    ba1.h = 2;
  }
  
  public final void c() {
    ((ba)this.b).h = 0;
    ((ba)this.b).f = ((ba)this.b).g = 0;
    gz.a.a((ba)this.b);
  }
  
  public final void a(int paramInt) {
    if (paramInt == 2) {
      if (this.a != null) {
        this.a.a();
        return;
      } 
      this.b.a();
      return;
    } 
    if (paramInt == 1000010) {
      if (this.h == 0) {
        gz.a.a(u.a("fm.pleaseSelectFile"));
        return;
      } 
      d();
      return;
    } 
    super.a((paramInt == 5) ? 8 : paramInt);
  }
  
  public void a(String paramString) {
    gz.a.a((la)this.a);
  }
  
  private void e() {
    c(u.a("title.chooseFile"));
    this.a = null;
    this.b = "file://";
    this.b.removeAllElements();
    this.a = null;
    this.c = null;
    if (this.b == null) {
      r r1;
      (r1 = (new dt(this, u.a("action.back"))).c(u.a("action.goBack")).a("bk.png", "bks.png")).n = true;
      this.b = (String)r1;
    } 
    this.b.addElement(this.b);
    this.h = 0;
    this.f = 0;
    this.g = 0;
    Enumeration enumeration = FileSystemRegistry.listRoots();
    while (enumeration.hasMoreElements()) {
      String str;
      if ((str = enumeration.nextElement()) != null) {
        if (str.endsWith("/") && !a.equals("/"))
          a = (r)"/"; 
        if (str.endsWith("/") || str.endsWith("\\"))
          str = str.substring(0, str.length() - 1); 
        str = str;
        r r1;
        (r1 = (new ez(this, str, str)).c(u.a("general.root")).a("sd.png", "sds.png")).n = true;
        r1 = r1;
        this.b.addElement(r1);
      } 
    } 
  }
  
  private void d(String paramString) {
    String str;
    boolean bool = (str = (paramString = (paramString.startsWith("file://") ? "" : (paramString.startsWith((String)a) ? "file://" : ("file://" + a))) + paramString + (!paramString.endsWith((String)a) ? (String)a : "")).substring(0, paramString.length() - 1).substring(0, paramString.substring(0, paramString.length() - 1).lastIndexOf(a.charAt(0)))).equals("file://");
    c(paramString.substring(7));
    this.a = (r)this.b;
    this.b = paramString;
    this.b.removeAllElements();
    this.h = 0;
    this.f = 0;
    this.g = 0;
    r r1;
    (r1 = (new ew(this, ".." + a, bool, str, paramString)).c(u.a("action.goUpwards")).a("ua.png", "uas.png")).n = true;
    this.a = r1;
    this.b.addElement(this.a);
    if (this.a != null) {
      (r1 = (new er(this, u.a("fm.chooseThisFolder"), paramString)).c(paramString.substring(str.length() + 1)).a("of.png", "ofs.png")).n = true;
      this.c = r1;
      this.b.addElement(this.c);
    } else {
      this.c = null;
    } 
    try {
      byte b = 1;
      FileConnection fileConnection;
      if ((fileConnection = (FileConnection)Connector.open(paramString, 1)).isDirectory()) {
        Enumeration enumeration = fileConnection.list();
        while (enumeration.hasMoreElements()) {
          String str1;
          if ((str1 = enumeration.nextElement()) != null) {
            boolean bool1 = (str1 = str1).endsWith((String)a);
            String str2 = str1;
            if (bool1)
              str2 = str1.substring(0, str1.length() - a.length()); 
            r r2;
            (r2 = (new eo(this, str2, bool1 ? 2 : 0, bool1, paramString, str1)).c(a(str1)).a(b(str1) + ".png", b(str1) + "s.png")).n = true;
            r2 = r2;
            if (bool1) {
              this.b.insertElementAt(r2, b);
              b++;
              continue;
            } 
            this.b.addElement(r2);
          } 
        } 
      } 
      fileConnection.close();
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  public final void b(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: astore_2
    //   3: astore_1
    //   4: iconst_0
    //   5: istore_3
    //   6: iload_3
    //   7: aload_1
    //   8: getfield b : Ljava/util/Vector;
    //   11: invokevirtual size : ()I
    //   14: if_icmpge -> 59
    //   17: aload_1
    //   18: getfield b : Ljava/util/Vector;
    //   21: iload_3
    //   22: invokevirtual elementAt : (I)Ljava/lang/Object;
    //   25: dup
    //   26: astore #4
    //   28: instanceof fe
    //   31: ifeq -> 53
    //   34: aload #4
    //   36: checkcast fe
    //   39: getfield f : Ljava/lang/String;
    //   42: aload_2
    //   43: invokevirtual equals : (Ljava/lang/Object;)Z
    //   46: ifeq -> 53
    //   49: iload_3
    //   50: goto -> 60
    //   53: iinc #3, 1
    //   56: goto -> 6
    //   59: iconst_m1
    //   60: dup
    //   61: istore_1
    //   62: iconst_m1
    //   63: if_icmpeq -> 90
    //   66: aload_0
    //   67: aload_0
    //   68: invokevirtual b : ()I
    //   71: iload_1
    //   72: iconst_1
    //   73: iadd
    //   74: invokevirtual g : (II)V
    //   77: aload_0
    //   78: iload_1
    //   79: invokevirtual d : (I)V
    //   82: aload_0
    //   83: aload_0
    //   84: getfield g : I
    //   87: putfield f : I
    //   90: return
  }
  
  public static boolean a(String paramString) {
    return (paramString.endsWith(".png") || paramString.endsWith(".jpg") || paramString.endsWith(".jpeg") || paramString.endsWith(".bmp"));
  }
  
  private static String a(String paramString) {
    return (paramString = b(paramString)).equals("dc") ? "файл" : (paramString.equals("mm") ? "аудио" : (paramString.equals("mi") ? "фото" : (paramString.equals("mv") ? "видео" : (paramString.equals("fl") ? "папка" : null))));
  }
  
  private static String b(String paramString) {
    return (paramString == null) ? "dc" : ((paramString = paramString.toLowerCase()).endsWith((String)a) ? "fl" : ((paramString.endsWith(".mp3") || paramString.endsWith(".aac") || paramString.endsWith(".ogg") || paramString.endsWith(".wav")) ? "mm" : (a(paramString) ? "mi" : ((paramString.endsWith(".3gp") || paramString.endsWith(".avi") || paramString.endsWith(".mkv") || paramString.endsWith(".mp4")) ? "mv" : "dc"))));
  }
  
  public static boolean a(r paramr) {
    return paramr.a.equals(a((String)a));
  }
  
  static void a(jv paramjv, String paramString) {
    paramjv.a(paramString);
  }
  
  static void a(jv paramjv) {
    paramjv = paramjv;
    gg gg;
    (gg = (new gg(u.a("fm.enterFolderName"))).b().a(13948116)).r = true;
    ba ba1;
    (ba1 = new ba()).a(gg, false);
    ar ar = new ar((String)paramjv.c, u.a("fm.newFolder"));
    ba1.a(ar, false);
    ba1.a(new cs(paramjv, u.a("action.ok"), ar), true);
    ba1.a(new ct(u.a("action.cancel")), true);
    gz.a.a(ba1);
    ba1.h = 1;
  }
  
  static void b(jv paramjv) {
    paramjv = paramjv;
    ba ba1 = new ba();
    r r1 = (r)paramjv.a();
    String str = u.a("fm.enterNewName", r1.f);
    gg gg;
    (gg = (new gg(str)).b().a(13948116)).r = true;
    ba1.a(gg, false);
    ar ar = new ar(str, r1.f);
    ba1.a(ar, false);
    ba1.a(new cu(paramjv, u.a("action.ok"), ar, r1), true);
    ba1.a(new cv(u.a("action.cancel")), true);
    gz.a.a(ba1);
    ba1.h = 1;
  }
  
  static void c(jv paramjv) {
    paramjv.d();
  }
  
  static void b(jv paramjv, String paramString) {
    paramString = paramString;
    paramjv = paramjv;
    FileConnection fileConnection = null;
    try {
      if (!(fileConnection = (FileConnection)Connector.open(paramString)).exists()) {
        fileConnection.mkdir();
      } else {
        throw new Exception(u.a("fm.folderExists"));
      } 
      fileConnection.close();
      gz.a.c();
      paramjv.d(paramjv.b);
      paramjv.b(paramString.substring(paramjv.b.length(), paramString.length() - a.length()));
      return;
    } catch (Exception exception) {
      try {
        if (fileConnection != null)
          fileConnection.close(); 
      } catch (Exception exception1) {}
      gz.a.a(exception);
      return;
    } 
  }
  
  static void a(jv paramjv, String paramString1, String paramString2) {
    paramString2 = paramString2;
    paramString1 = paramString1;
    paramjv = paramjv;
    FileConnection fileConnection = null;
    try {
      (fileConnection = (FileConnection)Connector.open(paramString2)).rename(paramString1);
      fileConnection.close();
      gz.a.c();
      paramjv.d(paramjv.b);
      paramjv.b(paramString1);
      return;
    } catch (Exception exception) {
      try {
        if (fileConnection != null)
          fileConnection.close(); 
      } catch (Exception exception1) {}
      gz.a.a(exception);
      return;
    } 
  }
  
  static void c(jv paramjv, String paramString) {
    paramString = paramString;
    paramjv = paramjv;
    System.out.println(paramString);
    FileConnection fileConnection = null;
    try {
      (fileConnection = (FileConnection)Connector.open(paramString)).delete();
      fileConnection.close();
      gz.a.c();
      int i = paramjv.h;
      paramjv.d(paramjv.b);
      paramjv.h = i;
      if (paramjv.h >= paramjv.b.size())
        paramjv.h = paramjv.b.size() - 1; 
      paramjv.g(paramjv.b(), paramjv.h + 1);
      paramjv.d(paramjv.h);
      paramjv.f = paramjv.g;
      return;
    } catch (Exception exception) {
      try {
        if (fileConnection != null)
          fileConnection.close(); 
      } catch (Exception exception1) {}
      gz.a.a(exception);
      return;
    } 
  }
  
  static void d(jv paramjv, String paramString) {
    paramjv.d(paramString);
  }
  
  static void d(jv paramjv) {
    paramjv.e();
  }
  
  static {
    if ((a = (r)System.getProperty("file.separator")) == null)
      a = (r)"/"; 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jv.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */