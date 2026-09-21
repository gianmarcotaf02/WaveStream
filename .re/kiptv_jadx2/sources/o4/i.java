package o4;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p121o0.p;

public abstract class i {

    public static final CopyOnWriteArrayList f26122a = new CopyOnWriteArrayList();

    public static p174u4.c a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (p174u4.c cVar : f26122a) {
            synchronized (cVar) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(p.C("No KMS client does support: ", str));
    }
}
