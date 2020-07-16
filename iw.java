public final class iw {
  private int a;
  
  private String a = Character.MIN_VALUE;
  
  public iw(String paramString) {
    this.a = paramString;
  }
  
  public final void a() {
    if (this.a > null)
      this.a--; 
  }
  
  public final char a() {
    iw iw1;
    if (((iw1 = this).a < iw1.a.length())) {
      char c = this.a.charAt(this.a);
      this.a++;
      return c;
    } 
    return Character.MIN_VALUE;
  }
  
  private String a(int paramInt) {
    String str;
    int i;
    if ((i = (str = this.a) + paramInt) >= this.a.length())
      throw a("Substring bounds error"); 
    this.a += paramInt;
    return this.a.substring(str, i);
  }
  
  public final char b() {
    char c;
    while (true) {
      label31: while ((c = a()) == '/') {
        switch (a()) {
          case '/':
            do {
            
            } while ((c = a()) != '\n' && c != '\r' && c != '\000');
            continue;
          case '*':
            while (true) {
              if ((c = a()) == '\000')
                throw a("Unclosed comment."); 
              if (c == '*') {
                if (a() != '/') {
                  a();
                  continue;
                } 
                continue label31;
              } 
            } 
        } 
        a();
        return '/';
      } 
      if (c == '#') {
        do {
        
        } while ((c = a()) != '\n' && c != '\r' && c != '\000');
        continue;
      } 
      if (c == '\000' || c > ' ')
        break; 
    } 
    return c;
  }
  
  public final Object a() {
    iw iw1;
    char c1;
    StringBuffer stringBuffer2;
    char c;
    switch (c = b()) {
      case '"':
      case '\'':
        c1 = c;
        iw1 = this;
        stringBuffer2 = new StringBuffer();
        while (true) {
          char c2;
          switch (c2 = iw1.a()) {
            case '\000':
            case '\n':
            case '\r':
              throw iw1.a("Unterminated string");
            case '\\':
              switch (c2 = iw1.a()) {
                case 'b':
                  stringBuffer2.append('\b');
                  continue;
                case 't':
                  stringBuffer2.append('\t');
                  continue;
                case 'n':
                  stringBuffer2.append('\n');
                  continue;
                case 'f':
                  stringBuffer2.append('\f');
                  continue;
                case 'r':
                  stringBuffer2.append('\r');
                  continue;
                case 'u':
                  stringBuffer2.append((char)Integer.parseInt(iw1.a(4), 16));
                  continue;
                case 'x':
                  stringBuffer2.append((char)Integer.parseInt(iw1.a(2), 16));
                  continue;
              } 
              stringBuffer2.append(c2);
              continue;
          } 
          if (c2 == c1)
            return stringBuffer2.toString(); 
          stringBuffer2.append(c2);
        } 
      case '{':
        a();
        return new bj(this);
      case '[':
        a();
        return new at(this);
    } 
    StringBuffer stringBuffer1 = new StringBuffer();
    iw iw2 = iw1;
    while (iw1 >= 32 && ",:]}/\\\"[{;=#".indexOf(iw1) < 0) {
      stringBuffer1.append(iw1);
      char c2 = a();
    } 
    a();
    String str;
    if ((str = stringBuffer1.toString().trim()).equals(""))
      throw a("Missing value."); 
    if (str.equalsIgnoreCase("true"))
      return Boolean.TRUE; 
    if (str.equalsIgnoreCase("false"))
      return Boolean.FALSE; 
    if (str.equalsIgnoreCase("null"))
      return bj.a; 
    if ((iw2 >= 48 && iw2 <= 57) || iw2 == 46 || iw2 == 45 || iw2 == 43) {
      if (iw2 == 48)
        if (str.length() > 2 && (str.charAt(1) == 'x' || str.charAt(1) == 'X')) {
          try {
            return new Integer(Integer.parseInt(str.substring(2), 16));
          } catch (Exception exception) {}
        } else {
          try {
            return new Integer(Integer.parseInt(str, 8));
          } catch (Exception exception) {}
        }  
      try {
        return Integer.valueOf(str);
      } catch (Exception exception) {
        try {
          return new Long(Long.parseLong(str));
        } catch (Exception exception1) {
          try {
            return Double.valueOf(str);
          } catch (Exception exception2) {
            return str;
          } 
        } 
      } 
    } 
    return str;
  }
  
  public final dc a(String paramString) {
    return new dc(paramString + toString());
  }
  
  public final String toString() {
    return " at character " + this.a + " of " + this.a;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/iw.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */