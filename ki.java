public final class ki {
  char[] a;
  
  char[] b;
  
  int a;
  
  int b = -1;
  
  public ki(int paramInt, char[] paramArrayOfchar) {
    this(paramArrayOfchar, paramArrayOfchar.length);
    this.b = paramInt;
  }
  
  private ki(char[] paramArrayOfchar, int paramInt) {
    a(paramArrayOfchar, paramInt);
  }
  
  private void a(char[] paramArrayOfchar, int paramInt) {
    this.a = paramArrayOfchar;
    this.a = 0;
    this.b = null;
    if (paramArrayOfchar != null && paramInt != 0) {
      if (paramInt >= 3 && paramArrayOfchar[0] == '|') {
        short s = (short)paramArrayOfchar[2];
        if (paramArrayOfchar[s] == 'E' && paramInt >= 6) {
          char c;
          if ((c = paramArrayOfchar[3]) == 'A') {
            c = paramArrayOfchar[4];
            this.b = new char[c];
            System.arraycopy(paramArrayOfchar, 6, this.b, 0, c);
          } else if (c == '^') {
            this.a |= 0x2;
          } 
        } 
      } 
      for (int i = 0; i < paramInt; i += 3) {
        switch (paramArrayOfchar[i]) {
          case '[':
            i += paramArrayOfchar[i + 1] << 1;
            break;
          case 'A':
            i += paramArrayOfchar[i + 1];
            break;
          case '#':
            this.a |= 0x1;
            return;
        } 
      } 
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ki.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */