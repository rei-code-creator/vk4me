import java.util.Vector;

public final class at {
  public Vector a = new Vector();
  
  public at() {}
  
  public at(iw paramiw) {
    this();
    if (paramiw.b() != '[')
      throw paramiw.a("A JSONArray text must start with '['"); 
    if (paramiw.b() == ']')
      return; 
    paramiw.a();
    while (true) {
      if (paramiw.b() == ',') {
        paramiw.a();
        this.a.addElement(null);
      } else {
        paramiw.a();
        this.a.addElement(paramiw.a());
      } 
      switch (paramiw.b()) {
        case ',':
        case ';':
          if (paramiw.b() == ']')
            return; 
          paramiw.a();
          continue;
        case ']':
          return;
      } 
      throw paramiw.a("Expected a ',' or ']'");
    } 
  }
  
  public at(String paramString) {
    this(new iw(paramString));
  }
  
  private double a(int paramInt) {
    Object object;
    if ((object = a(paramInt)) == null)
      throw new dc("JSONArray[" + paramInt + "] not found."); 
    object = object;
    try {
      return Double.valueOf(object.toString()).doubleValue();
    } catch (Exception exception) {
      throw new dc("JSONArray[" + paramInt + "] is not a number.");
    } 
  }
  
  private String a(String paramString) {
    int i = this.a.size();
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < i; b++) {
      if (b > 0)
        stringBuffer.append(paramString); 
      stringBuffer.append(bj.a(this.a.elementAt(b)));
    } 
    return stringBuffer.toString();
  }
  
  public final Object a(int paramInt) {
    return (paramInt < 0 || paramInt >= this.a.size()) ? null : this.a.elementAt(paramInt);
  }
  
  public final int a(int paramInt) {
    try {
      return (int)a(paramInt);
    } catch (Exception exception) {
      return 0;
    } 
  }
  
  public final at a(int paramInt) {
    Object object;
    return (object = a(paramInt) instanceof at) ? (at)object : null;
  }
  
  public final bj a(int paramInt) {
    Object object;
    return (object = a(paramInt) instanceof bj) ? (bj)object : null;
  }
  
  public final String toString() {
    try {
      return '[' + a(",") + ']';
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/at.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */