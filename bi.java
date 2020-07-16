import java.util.Hashtable;

public final class bi extends lb {
  public static boolean a = false;
  
  public int a;
  
  public int b;
  
  public String a;
  
  private String d;
  
  private String e;
  
  public String b;
  
  private String f;
  
  private String g;
  
  public String c;
  
  private String j;
  
  public boolean b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  private Hashtable a = new Hashtable();
  
  private Hashtable b = new Hashtable();
  
  public boolean c;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public final String a() {
    return this.c;
  }
  
  public bi() {
    super(false);
  }
  
  public final String b() {
    return (String)(!ab.a(this.f) ? this.f : "https://vk.com/images/camera_50.png");
  }
  
  public final int a() {
    return this.a;
  }
  
  public final da a(bj parambj) {
    if (parambj == null)
      return this; 
    this.a = parambj.a("id");
    this.b = parambj.a("sex");
    this.c = parambj.a("status");
    this.d = parambj.a("first_name");
    this.e = parambj.a("last_name");
    this.b = (Hashtable)parambj.a("deactivated");
    this.f = parambj.a("photo_50");
    this.g = parambj.a("photo_100");
    parambj.b("is_closed");
    parambj.b("can_access_closed");
    this.c = parambj.a("online");
    this.e = parambj.a("online_app");
    this.d = parambj.a("online_mobile");
    this.g = parambj.a("friend_status");
    this.b = b(parambj.a("blacklisted"));
    parambj.a("blacklisted_by_me");
    parambj.a("can_see_audio");
    this.c = b(parambj.a("can_write_private_message"));
    this.a = (Hashtable)parambj.a("bdate");
    this.j = parambj.a("screen_name");
    bj bj1;
    if ((bj1 = parambj.a("counters")) != null) {
      this.h = bj1.a("audios");
      this.i = bj1.a("friends");
      this.j = bj1.a("groups");
      this.k = bj1.a("online_friends");
      bj1.a("mutual_friends");
      bj1.a("followers");
      bj1.a("photos");
      bj1.a("albums");
      bj1.a("videos");
    } 
    if ((bj1 = parambj.a("last_seen")) != null) {
      this.f = bj1.a("time");
      bj1.a("platform");
    } 
    this.a.put("first_name_nom", parambj.a("first_name_nom", this.d));
    this.a.put("first_name_gen", parambj.a("first_name_gen", this.d));
    this.a.put("first_name_dat", parambj.a("first_name_dat", this.d));
    this.a.put("first_name_acc", parambj.a("first_name_acc", this.d));
    this.a.put("first_name_ins", parambj.a("first_name_ins", this.d));
    this.a.put("first_name_abl", parambj.a("first_name_abl", this.d));
    this.b.put("last_name_nom", parambj.a("last_name_nom", this.e));
    this.b.put("last_name_gen", parambj.a("last_name_gen", this.e));
    this.b.put("last_name_dat", parambj.a("last_name_dat", this.e));
    this.b.put("last_name_acc", parambj.a("last_name_acc", this.e));
    this.b.put("last_name_ins", parambj.a("last_name_ins", this.e));
    this.b.put("last_name_abl", parambj.a("last_name_abl", this.e));
    return this;
  }
  
  public final String c() {
    return (String)(!ab.a(this.g) ? this.g : "https://vk.com/images/camera_100.png");
  }
  
  public final String a(String paramString) {
    // Byte code:
    //   0: getstatic bi.a : Z
    //   3: ifeq -> 150
    //   6: aload_0
    //   7: aload_1
    //   8: astore_2
    //   9: dup
    //   10: astore_1
    //   11: getfield b : Ljava/util/Hashtable;
    //   14: new java/lang/StringBuffer
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: ldc 'last_name_'
    //   23: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   26: aload_2
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   30: invokevirtual toString : ()Ljava/lang/String;
    //   33: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast java/lang/String
    //   39: astore_3
    //   40: aload_1
    //   41: getfield a : Ljava/util/Hashtable;
    //   44: new java/lang/StringBuffer
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: ldc 'first_name_'
    //   53: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   56: aload_2
    //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   60: invokevirtual toString : ()Ljava/lang/String;
    //   63: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   66: checkcast java/lang/String
    //   69: astore_2
    //   70: aload_3
    //   71: ifnonnull -> 79
    //   74: aload_1
    //   75: getfield e : Ljava/lang/String;
    //   78: astore_3
    //   79: aload_2
    //   80: ifnonnull -> 88
    //   83: aload_1
    //   84: getfield d : Ljava/lang/String;
    //   87: astore_2
    //   88: new java/lang/StringBuffer
    //   91: dup
    //   92: invokespecial <init> : ()V
    //   95: aload_2
    //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   99: aload_3
    //   100: ifnull -> 141
    //   103: aload_3
    //   104: invokevirtual length : ()I
    //   107: ifle -> 141
    //   110: new java/lang/StringBuffer
    //   113: dup
    //   114: invokespecial <init> : ()V
    //   117: ldc ' '
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   122: aload_3
    //   123: iconst_0
    //   124: invokevirtual charAt : (I)C
    //   127: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   130: ldc '.'
    //   132: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   135: invokevirtual toString : ()Ljava/lang/String;
    //   138: goto -> 143
    //   141: ldc ''
    //   143: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   146: invokevirtual toString : ()Ljava/lang/String;
    //   149: areturn
    //   150: aload_0
    //   151: aload_1
    //   152: astore_2
    //   153: dup
    //   154: astore_1
    //   155: getfield b : Ljava/util/Hashtable;
    //   158: new java/lang/StringBuffer
    //   161: dup
    //   162: invokespecial <init> : ()V
    //   165: ldc 'last_name_'
    //   167: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   170: aload_2
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   174: invokevirtual toString : ()Ljava/lang/String;
    //   177: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   180: checkcast java/lang/String
    //   183: astore_3
    //   184: aload_1
    //   185: getfield a : Ljava/util/Hashtable;
    //   188: new java/lang/StringBuffer
    //   191: dup
    //   192: invokespecial <init> : ()V
    //   195: ldc 'first_name_'
    //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   200: aload_2
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   204: invokevirtual toString : ()Ljava/lang/String;
    //   207: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   210: checkcast java/lang/String
    //   213: astore_2
    //   214: aload_3
    //   215: ifnonnull -> 223
    //   218: aload_1
    //   219: getfield e : Ljava/lang/String;
    //   222: astore_3
    //   223: aload_2
    //   224: ifnonnull -> 232
    //   227: aload_1
    //   228: getfield d : Ljava/lang/String;
    //   231: astore_2
    //   232: new java/lang/StringBuffer
    //   235: dup
    //   236: invokespecial <init> : ()V
    //   239: aload_2
    //   240: ifnull -> 276
    //   243: aload_2
    //   244: invokevirtual length : ()I
    //   247: ifle -> 276
    //   250: new java/lang/StringBuffer
    //   253: dup
    //   254: invokespecial <init> : ()V
    //   257: aload_2
    //   258: iconst_0
    //   259: invokevirtual charAt : (I)C
    //   262: invokevirtual append : (C)Ljava/lang/StringBuffer;
    //   265: ldc '. '
    //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   270: invokevirtual toString : ()Ljava/lang/String;
    //   273: goto -> 278
    //   276: ldc ''
    //   278: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   281: aload_3
    //   282: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   285: invokevirtual toString : ()Ljava/lang/String;
    //   288: areturn
  }
  
  public final String b(String paramString) {
    return (ab.a(paramString) || !this.b.containsKey("last_name_" + paramString) || !this.a.containsKey("first_name_" + paramString)) ? (this.d + " " + this.e) : (new StringBuffer()).append(this.a.get("first_name_" + paramString)).append(" ").append(this.b.get("last_name_" + paramString)).toString();
  }
  
  public final String d() {
    return this.j;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/bi.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */