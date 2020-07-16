import java.util.Vector;

public final class jx {
  public dj a;
  
  private ki a;
  
  public transient cl a;
  
  private int b;
  
  public transient int a;
  
  private transient int c;
  
  private transient int d;
  
  private transient int e;
  
  private transient int f;
  
  private transient int g;
  
  private transient int h;
  
  private transient int[] a;
  
  private transient int[] b = 16;
  
  private transient int[] c;
  
  private transient int[] d;
  
  public jx(String paramString, byte paramByte) {
    this(paramString);
  }
  
  private jx(String paramString) {
    this((new ih()).a(paramString));
  }
  
  private jx(ki paramki) {
    ki ki1 = paramki;
    jx jx1;
    (jx1 = this).a = (int[])ki1;
    if (ki1 != null && ki1.b != -1) {
      jx1.b = ki1.b;
      return;
    } 
    jx1.b = 16;
  }
  
  public jx() {
    this((ki)null);
  }
  
  public final int a(int paramInt) {
    if (paramInt < this.a) {
      switch (paramInt) {
        case 0:
          return this.c;
        case 1:
          return this.e;
        case 2:
          return this.g;
      } 
      if (this.a == null)
        a(); 
      return this.a[paramInt];
    } 
    return -1;
  }
  
  public final int b(int paramInt) {
    if (paramInt < this.a) {
      switch (paramInt) {
        case 0:
          return this.d;
        case 1:
          return this.f;
        case 2:
          return this.h;
      } 
      if (this.b == null)
        a(); 
      return this.b[paramInt];
    } 
    return -1;
  }
  
  private void a(int paramInt1, int paramInt2) {
    if (paramInt1 < this.a) {
      switch (paramInt1) {
        case 0:
          this.c = paramInt2;
          return;
        case 1:
          this.e = paramInt2;
          return;
        case 2:
          this.g = paramInt2;
          return;
      } 
      if (this.a == null)
        a(); 
      this.a[paramInt1] = paramInt2;
    } 
  }
  
  private void b(int paramInt1, int paramInt2) {
    if (paramInt1 < this.a) {
      switch (paramInt1) {
        case 0:
          this.d = paramInt2;
          return;
        case 1:
          this.f = paramInt2;
          return;
        case 2:
          this.h = paramInt2;
          return;
      } 
      if (this.b == null)
        a(); 
      this.b[paramInt1] = paramInt2;
    } 
  }
  
  private static void a(String paramString) {
    throw new Error("RE internal error: " + paramString);
  }
  
  private void a() {
    this.a = new int[this.b];
    this.b = new int[this.b];
    for (byte b = 0; b < this.b; b++) {
      this.a[b] = -1;
      this.b[b] = -1;
    } 
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3) {
    label204: while (true) {
      int i = ((ki)this.a).a;
      int j;
      for (j = paramInt1; j < paramInt2; j = paramInt1) {
        int n;
        int k = i[j];
        paramInt1 = j + (short)i[j + 2];
        int m = i[j + 1];
        switch (k) {
          case 42:
          case 63:
            if ((k = a(j + 3, 65536, paramInt3)) != -1)
              return k; 
            break;
          case 43:
            if ((k = a(paramInt1, 65536, paramInt3)) != -1)
              return k; 
            j = paramInt1 + (short)i[paramInt1 + 2];
            continue;
          case 47:
          case 56:
            if ((k = a(paramInt1, 65536, paramInt3)) != -1)
              return k; 
            paramInt2 = paramInt1;
            paramInt1 = j + 3;
            this = this;
            continue label204;
          case 61:
            if ((k = a(paramInt1 + (short)i[paramInt1 + 2], 65536, paramInt3)) != -1)
              return k; 
            break;
          case 40:
            if ((((ki)this.a).a & 0x1) != 0)
              this.c[m] = paramInt3; 
            if ((k = a(paramInt1, 65536, paramInt3)) != -1) {
              if (m >= this.a)
                this.a = m + 1; 
              if (a(m) == -1)
                a(m, paramInt3); 
            } 
            return k;
          case 41:
            if ((((ki)this.a).a & 0x1) != 0)
              this.d[m] = paramInt3; 
            if ((k = a(paramInt1, 65536, paramInt3)) != -1) {
              if (m >= this.a)
                this.a = m + 1; 
              if (b(m) == -1)
                b(m, paramInt3); 
            } 
            return k;
          case 35:
            k = this.c[m];
            j = this.d[m];
            if (k == -1 || j == -1)
              return -1; 
            if (k != j) {
              j -= k;
              if (this.a.a(paramInt3 + j - 1))
                return -1; 
              for (byte b = 0; b < j; b++) {
                if (a(this.a.a(paramInt3++), this.a.a(k + b)) != 0)
                  return -1; 
              } 
            } 
            break;
          case 94:
            if (paramInt3 != 0)
              return -1; 
            break;
          case 36:
            if (!this.a.a(0) && !this.a.a(paramInt3))
              return -1; 
            break;
          case 92:
            switch (m) {
              case 66:
              case 98:
                k = (paramInt3 == 0) ? 10 : this.a.a(paramInt3 - 1);
                j = this.a.a(paramInt3) ? 10 : this.a.a(paramInt3);
                if (((a.d(k) == a.d(j)) ? true : false) == ((m == 98) ? true : false))
                  return -1; 
                break;
              case 68:
              case 83:
              case 87:
              case 100:
              case 115:
              case 119:
                if (this.a.a(paramInt3))
                  return -1; 
                k = this.a.a(paramInt3);
                switch (m) {
                  case 87:
                  case 119:
                    if (((a.d(k) || k == 95) ? true : false) != ((m == 119) ? true : false))
                      return -1; 
                    break;
                  case 68:
                  case 100:
                    if (a.b(k) != ((m == 100)))
                      return -1; 
                    break;
                  case 83:
                  case 115:
                    if (a.a(k) != ((m == 115)))
                      return -1; 
                    break;
                } 
                paramInt3++;
                break;
            } 
            a("Unrecognized escape '" + m + "'");
            break;
          case 46:
            if (this.a.a(paramInt3) || b(paramInt3))
              return -1; 
            paramInt3++;
            break;
          case 65:
            if (this.a.a(paramInt3))
              return -1; 
            k = j + 3;
            if (this.a.a(m + paramInt3 - 1))
              return -1; 
            for (j = 0; j < m; j++) {
              if (a(this.a.a(paramInt3++), i[k + j]) != 0)
                return -1; 
            } 
            break;
          case 80:
            if (this.a.a(paramInt3))
              return -1; 
            switch (m) {
              case 119:
                if (!a.d(this.a.a(paramInt3)))
                  return -1; 
                break;
              case 97:
                if (!a.c(this.a.a(paramInt3)))
                  return -1; 
                break;
              case 100:
                if (!a.b(this.a.a(paramInt3)))
                  return -1; 
                break;
              case 98:
                if (!a.e(this.a.a(paramInt3)))
                  return -1; 
                break;
              case 115:
                if (!a.a(this.a.a(paramInt3)))
                  return -1; 
                break;
              case 99:
                if (a.a(this.a.a(paramInt3)) != 15)
                  return -1; 
                break;
              case 103:
                switch (a.a(this.a.a(paramInt3))) {
                  case 25:
                  case 26:
                  case 27:
                  case 28:
                    break;
                } 
                return -1;
              case 108:
                if (a.a(this.a.a(paramInt3)) != 2)
                  return -1; 
                break;
              case 117:
                if (a.a(this.a.a(paramInt3)) != 1)
                  return -1; 
                break;
              case 112:
                if (a.a(this.a.a(paramInt3)) == 15)
                  return -1; 
                break;
              case 33:
                switch (a.a(this.a.a(paramInt3))) {
                  case 20:
                  case 21:
                  case 22:
                  case 23:
                  case 24:
                    break;
                } 
                return -1;
              case 120:
                if (!(((this.a.a(paramInt3) >= '0' && this.a.a(paramInt3) <= '9') || (this.a.a(paramInt3) >= 'a' && this.a.a(paramInt3) <= 'f') || (this.a.a(paramInt3) >= 'A' && this.a.a(paramInt3) <= 'F')) ? 1 : 0))
                  return -1; 
                break;
              case 106:
                if (!a.f(this.a.a(paramInt3)))
                  return -1; 
                break;
              case 107:
                if (!a.g(this.a.a(paramInt3)))
                  return -1; 
                break;
              default:
                a("Bad posix class");
                break;
            } 
            paramInt3++;
            break;
          case 91:
            if (this.a.a(paramInt3))
              return -1; 
            k = this.a.a(paramInt3);
            m = (j += 3) + (m << 1);
            for (n = 0; !n && j < m; n = (a(k, n) >= 0 && a(k, i1) <= 0) ? 1 : 0) {
              n = i[j++];
              int i1 = i[j++];
            } 
            if (n == 0)
              return -1; 
            paramInt3++;
            break;
          case 124:
            if (i[paramInt1] != 124) {
              j += 3;
              continue;
            } 
            do {
              if ((k = a(j + 3, 65536, paramInt3)) != -1)
                return k; 
              k = (short)i[j + 2];
              j += k;
            } while (k != 0 && i[j] == 124);
            return -1;
          case 60:
          case 62:
          case 71:
          case 78:
            break;
          case 67:
            j += 3;
            continue;
          case 69:
            b(0, paramInt3);
            return paramInt3;
          default:
            a("Invalid opcode '" + k + "'");
            break;
        } 
      } 
      a("Corrupt program");
      return -1;
    } 
  }
  
  private boolean a(int paramInt) {
    this.c = -1;
    this.d = -1;
    this.e = -1;
    this.f = -1;
    this.g = -1;
    this.h = -1;
    this.a = null;
    this.b = null;
    this.a = true;
    a(0, paramInt);
    if ((((ki)this.a).a & 0x1) != 0) {
      this.c = new int[this.b];
      this.d = new int[this.b];
    } 
    if ((paramInt = a(0, 65536, paramInt)) != -1) {
      b(0, paramInt);
      return true;
    } 
    this.a = false;
    return false;
  }
  
  public final boolean a(String paramString, int paramInt) {
    int i = paramInt;
    cl cl1 = new cl(paramString);
    jx jx1;
    if ((jx1 = this).a == null)
      a("No RE program to run!"); 
    jx1.a = (int[])cl1;
    if ((((ki)jx1.a).a & 0x2) == 2)
      return (i == 0 && jx1.a(i)); 
    if (((ki)jx1.a).b == null) {
      while (!cl1.a(i - 1)) {
        if (jx1.a(i))
          return true; 
        i++;
      } 
      return false;
    } 
    int j = ((ki)jx1.a).b;
    while (!cl1.a(i + j.length - 1)) {
      int k = i;
      byte b = 0;
      do {
      
      } while (((cl1.a(k++) - j[b++] == 0)) && b < j.length);
      if (b == j.length && jx1.a(i))
        return true; 
      i++;
    } 
    return false;
  }
  
  public final Vector a(String paramString) {
    Vector vector = new Vector();
    int i = 0;
    int j = paramString.length();
    while (i < j && a(paramString, i)) {
      int k = a(0);
      int m;
      if ((m = b(0)) == i) {
        vector.addElement(paramString.substring(i, k + 1));
        m++;
      } else {
        vector.addElement(paramString.substring(i, k));
      } 
      i = m;
    } 
    String str = paramString.substring(i);
    vector.addElement(str);
    return vector;
  }
  
  public final String[] a(String paramString) {
    Vector vector;
    String[] arrayOfString = new String[(vector = a(paramString)).size()];
    vector.copyInto((Object[])arrayOfString);
    return arrayOfString;
  }
  
  private boolean b(int paramInt) {
    return ((paramInt = this.a.a(paramInt)) == 10 || paramInt == 13 || paramInt == 133 || paramInt == 8232 || paramInt == 8233);
  }
  
  private static int a(char paramChar1, char paramChar2) {
    return paramChar1 - paramChar2;
  }
  
  public final String a(String paramString) {
    if (a(paramString, 0)) {
      int i = a(0);
      int j = b(0);
      return paramString.substring(i, j);
    } 
    return null;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/jx.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */