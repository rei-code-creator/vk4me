import java.util.Enumeration;
import java.util.Hashtable;

public final class bj {
  private Hashtable a = new Hashtable();
  
  public static final Object a = new ck();
  
  public bj() {}
  
  public bj(iw paramiw) {
    this();
    if (paramiw.b() != '{')
      throw paramiw.a("A JSONObject text must begin with '{'"); 
    while (true) {
      switch (paramiw.b()) {
        case '\000':
          throw paramiw.a("A JSONObject text must end with '}'");
        case '}':
          return;
      } 
      paramiw.a();
      String str = paramiw.a().toString();
      char c;
      if ((c = paramiw.b()) == '=') {
        if (paramiw.a() != '>')
          paramiw.a(); 
      } else if (c != ':') {
        throw paramiw.a("Expected a ':' after a key");
      } 
      a(str, paramiw.a());
      switch (paramiw.b()) {
        case ',':
        case ';':
          if (paramiw.b() == '}')
            return; 
          paramiw.a();
          continue;
        case '}':
          return;
      } 
      throw paramiw.a("Expected a ',' or '}'");
    } 
  }
  
  public bj(String paramString) {
    this(new iw(paramString));
  }
  
  private Object a(String paramString) {
    Object object;
    if ((object = b(paramString)) == null)
      throw new dc("JSONObject[" + b(paramString) + "] not found."); 
    return object;
  }
  
  private double a(String paramString) {
    Object object;
    if (object = a(paramString) instanceof Byte)
      return ((Byte)object).byteValue(); 
    if (object instanceof Short)
      return ((Short)object).shortValue(); 
    if (object instanceof Integer)
      return ((Integer)object).intValue(); 
    if (object instanceof Long)
      return ((Long)object).longValue(); 
    if (object instanceof Float)
      return ((Float)object).floatValue(); 
    if (object instanceof Double)
      return ((Double)object).doubleValue(); 
    if (object instanceof String)
      try {
        return Double.valueOf((String)object).doubleValue();
      } catch (Exception exception) {
        throw new dc("JSONObject[" + b(paramString) + "] is not a number.");
      }  
    throw new dc("JSONObject[" + b(paramString) + "] is not a number.");
  }
  
  public final boolean a(String paramString) {
    return this.a.containsKey(paramString);
  }
  
  private static String b(Object paramObject) {
    if (paramObject == null)
      throw new dc("Null pointer"); 
    a(paramObject);
    if ((paramObject = paramObject.toString()).indexOf('.') > 0 && paramObject.indexOf('e') < 0 && paramObject.indexOf('E') < 0) {
      while (paramObject.endsWith("0"))
        paramObject = paramObject.substring(0, paramObject.length() - 1); 
      if (paramObject.endsWith("."))
        paramObject = paramObject.substring(0, paramObject.length() - 1); 
    } 
    return (String)paramObject;
  }
  
  private Object b(String paramString) {
    return (paramString == null) ? null : this.a.get(paramString);
  }
  
  public final boolean b(String paramString) {
    return a(paramString, false);
  }
  
  public final boolean a(String paramString, boolean paramBoolean) {
    try {
      Object object;
      String str;
      if ((object = a(str = paramString)).equals(Boolean.FALSE) || (object instanceof String && ((String)object).equalsIgnoreCase("false")))
        return false; 
      if (object.equals(Boolean.TRUE) || (object instanceof String && ((String)object).equalsIgnoreCase("true")))
        return true; 
      throw new dc("JSONObject[" + b(str) + "] is not a Boolean.");
    } catch (Exception exception) {
      return paramBoolean;
    } 
  }
  
  public final bj a(String paramString, boolean paramBoolean) {
    a(paramString, paramBoolean ? Boolean.TRUE : Boolean.FALSE);
    return this;
  }
  
  public final int a(String paramString) {
    return a(paramString, 0);
  }
  
  public final int a(String paramString, int paramInt) {
    try {
      String str = paramString;
      bj bj1;
      Object object;
      if (object = (bj1 = this).a(str) instanceof Byte)
        return ((Byte)object).byteValue(); 
      if (object instanceof Short)
        return ((Short)object).shortValue(); 
      if (object instanceof Integer)
        return ((Integer)object).intValue(); 
      if (object instanceof Long)
        return (int)((Long)object).longValue(); 
      if (object instanceof Float)
        return (int)((Float)object).floatValue(); 
      if (object instanceof Double)
        return (int)((Double)object).doubleValue(); 
      if (object instanceof String)
        return (int)bj1.a(str); 
      throw new dc("JSONObject[" + b(str) + "] is not a number.");
    } catch (Exception exception) {
      return paramInt;
    } 
  }
  
  public final at a(String paramString) {
    Object object;
    return (object = b(paramString) instanceof at) ? (at)object : null;
  }
  
  public final bj a(String paramString) {
    Object object;
    return (object = b(paramString) instanceof bj) ? (bj)object : null;
  }
  
  public final long a(String paramString) {
    return b(paramString);
  }
  
  private long b(String paramString) {
    try {
      String str = paramString;
      bj bj1;
      Object object;
      if (object = (bj1 = this).a(str) instanceof Byte)
        return ((Byte)object).byteValue(); 
      if (object instanceof Short)
        return ((Short)object).shortValue(); 
      if (object instanceof Integer)
        return ((Integer)object).intValue(); 
      if (object instanceof Long)
        return ((Long)object).longValue(); 
      if (object instanceof Float)
        return (long)((Float)object).floatValue(); 
      if (object instanceof Double)
        return (long)((Double)object).doubleValue(); 
      if (object instanceof String)
        return (long)bj1.a(str); 
      throw new dc("JSONObject[" + b(str) + "] is not a number.");
    } catch (Exception exception) {
      return 0L;
    } 
  }
  
  public final String a(String paramString) {
    return a(paramString, "");
  }
  
  public final String a(String paramString1, String paramString2) {
    Object object;
    return ((object = b(paramString1)) != null) ? object.toString() : paramString2;
  }
  
  public final bj a(String paramString, int paramInt) {
    a(paramString, new Integer(paramInt));
    return this;
  }
  
  public final bj a(String paramString, Object paramObject) {
    if (paramString == null)
      throw new dc("Null key."); 
    if (paramObject != null) {
      a(paramObject);
      this.a.put(paramString, paramObject);
    } else {
      paramObject = paramString;
      this.a.remove(paramObject);
    } 
    return this;
  }
  
  private static String b(String paramString) {
    if (paramString == null || paramString.length() == 0)
      return "\"\""; 
    char c = Character.MIN_VALUE;
    int i = paramString.length();
    StringBuffer stringBuffer;
    (stringBuffer = new StringBuffer(i + 4)).append('"');
    for (byte b = 0; b < i; b++) {
      char c1 = c;
      switch (c = paramString.charAt(b)) {
        case '"':
        case '\\':
          stringBuffer.append('\\');
          stringBuffer.append(c);
          break;
        case '/':
          if (c1 == '<')
            stringBuffer.append('\\'); 
          stringBuffer.append(c);
          break;
        case '\b':
          stringBuffer.append("\\b");
          break;
        case '\t':
          stringBuffer.append("\\t");
          break;
        case '\n':
          stringBuffer.append("\\n");
          break;
        case '\f':
          stringBuffer.append("\\f");
          break;
        case '\r':
          stringBuffer.append("\\r");
          break;
        default:
          if (c < ' ') {
            String str = "000" + Integer.toHexString(c);
            stringBuffer.append("\\u" + str.substring(str.length() - 4));
            break;
          } 
          stringBuffer.append(c);
          break;
      } 
    } 
    stringBuffer.append('"');
    return stringBuffer.toString();
  }
  
  private static void a(Object paramObject) {
    if (paramObject != null)
      if (paramObject instanceof Double) {
        if (((Double)paramObject).isInfinite() || ((Double)paramObject).isNaN())
          throw new dc("JSON does not allow non-finite numbers"); 
      } else if (paramObject instanceof Float && (((Float)paramObject).isInfinite() || ((Float)paramObject).isNaN())) {
        throw new dc("JSON does not allow non-finite numbers.");
      }  
  }
  
  public final String toString() {
    try {
      Enumeration enumeration = this.a.keys();
      StringBuffer stringBuffer = new StringBuffer("{");
      while (enumeration.hasMoreElements()) {
        if (stringBuffer.length() > 1)
          stringBuffer.append(','); 
        Object object = enumeration.nextElement();
        stringBuffer.append(b(object.toString()));
        stringBuffer.append(':');
        stringBuffer.append(a(this.a.get(object)));
      } 
      stringBuffer.append('}');
      return stringBuffer.toString();
    } catch (Exception exception) {
      return null;
    } 
  }
  
  static String a(Object paramObject) {
    if (paramObject == null || paramObject.equals(null))
      return "null"; 
    if (paramObject instanceof id) {
      try {
        paramObject = ((id)paramObject).a();
      } catch (Exception exception) {
        throw new dc(exception);
      } 
      if (exception instanceof String)
        return (String)exception; 
      throw new dc("Bad value from toJSONString: " + exception);
    } 
    return (exception instanceof Float || exception instanceof Double || exception instanceof Byte || exception instanceof Short || exception instanceof Integer || exception instanceof Long) ? b(exception) : ((exception instanceof Boolean || exception instanceof bj || exception instanceof at) ? exception.toString() : b(exception.toString()));
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/bj.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */