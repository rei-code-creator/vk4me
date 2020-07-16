import java.util.Hashtable;

public final class au {
  private static Hashtable a = new Hashtable();
  
  public static lb a(int paramInt, boolean paramBoolean) {
    if (paramInt == 0)
      paramInt = ((iq)fy.a).a; 
    if (!a.containsKey(String.valueOf(paramInt))) {
      a(paramInt);
    } else if (a.get(String.valueOf(paramInt)) != null && paramBoolean && !((lb)a.get(String.valueOf(paramInt))).e) {
      a(paramInt);
    } 
    return (lb)a.get(String.valueOf(paramInt));
  }
  
  public static lb a(int paramInt) {
    return a(paramInt, false);
  }
  
  private static void a(int paramInt) {
    if (fy.a != null) {
      fj fj;
      if (paramInt > 0) {
        if ((fj = (fj)(new ic(paramInt)).a((iq)fy.a)) != null && fj.d())
          a(fj.a()); 
        return;
      } 
      ee ee;
      if (fj != null && (ee = (ee)(new if(fj)).a((iq)fy.a)) != null && ((ee.a() != null)))
        a(ee.a()); 
    } 
  }
  
  public static void a(aj paramaj) {
    if (paramaj == null)
      return; 
    if (paramaj instanceof fv) {
      aj aj2;
      if ((((fv)(aj2 = paramaj = paramaj)).a != null && ((fv)aj2).a.length > 0))
        for (byte b = 0; b < ((fv)paramaj).a.length; b++) {
          lk lk;
          if ((lk = ((fv)paramaj).a[b]) != null)
            a(lk); 
        }  
      if ((((fv)(aj2 = paramaj)).a != null && ((fv)aj2).a.length > 0))
        for (byte b = 0; b < ((fv)paramaj).a.length; b++) {
          lk lk;
          if ((lk = ((fv)paramaj).a[b]) != null)
            a(lk); 
        }  
      return;
    } 
    if (paramaj instanceof fj) {
      if ((paramaj = paramaj).b())
        for (byte b = 0; b < ((fj)paramaj).a.length; b++) {
          bi bi;
          if ((bi = ((fj)paramaj).a[b]) != null) {
            bi.e = (((fj)paramaj).a.length == 1);
            a(bi);
          } 
        }  
      return;
    } 
    if (paramaj instanceof ee) {
      if ((paramaj = paramaj).b())
        for (byte b = 0; b < ((ee)paramaj).a.length; b++) {
          lk lk;
          if ((lk = ((ee)paramaj).a[b]) != null) {
            lk.e = (((ee)paramaj).a.length == 1);
            a(lk);
          } 
        }  
      return;
    } 
    if (paramaj instanceof ai) {
      if ((paramaj = paramaj).b())
        for (byte b = 0; b < ((ai)paramaj).a.length; b++) {
          lk lk;
          if ((lk = ((ai)paramaj).a[b]) != null)
            a(lk); 
        }  
      return;
    } 
    if (paramaj instanceof gh) {
      if ((paramaj = paramaj).b())
        for (byte b = 0; b < ((gh)paramaj).a.length; b++) {
          bi bi;
          if ((bi = ((gh)paramaj).a[b]) != null)
            a(bi); 
        }  
      return;
    } 
    if (paramaj instanceof ge) {
      aj aj2;
      if ((((ge)(aj2 = paramaj = paramaj)).a != null && ((ge)aj2).a.length > 0))
        for (byte b = 0; b < ((ge)paramaj).a.length; b++) {
          bi bi;
          if ((bi = ((ge)paramaj).a[b]) != null)
            a(bi); 
        }  
      return;
    } 
    aj aj1;
    if (paramaj instanceof ed && ((((ed)(aj1 = paramaj = paramaj)).a != null && ((ed)aj1).a.length > 0)))
      for (byte b = 0; b < ((ed)paramaj).a.length; b++) {
        bi bi;
        if ((bi = ((ed)paramaj).a[b]) != null)
          a(bi); 
      }  
  }
  
  public static int a(lb paramlb) {
    a.put(String.valueOf(paramlb.a()), paramlb);
    return paramlb.a();
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/au.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */