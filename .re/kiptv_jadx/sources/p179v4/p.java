package p179v4;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q2.i f29184a = new q2.i(9);

    public static void a(j1.l lVar) {
        o4.f fVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p200y4.a aVar = p200y4.a.f31883b;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) lVar.f23899i).values().iterator();
        while (it.hasNext()) {
            for (o4.k kVar : (java.util.List) it.next()) {
                int iOrdinal = kVar.f26126d.ordinal();
                if (iOrdinal == 1) {
                    fVar = o4.f.f26115c;
                } else if (iOrdinal == 2) {
                    fVar = o4.f.f26116d;
                } else {
                    if (iOrdinal != 3) {
                        throw new java.lang.IllegalStateException("Unknown key status");
                    }
                    fVar = o4.f.f26117e;
                }
                java.lang.String strSubstring = kVar.g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new p200y4.b(fVar, kVar.f26128f, strSubstring, kVar.f26127e.name()));
            }
        }
        o4.k kVar2 = (o4.k) lVar.j;
        java.lang.Integer numValueOf = kVar2 != null ? java.lang.Integer.valueOf(kVar2.f26128f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((p200y4.b) it2.next()).f31886b == iIntValue) {
                    }
                }
                throw new java.security.GeneralSecurityException("primary key ID is not present in entries");
            } catch (java.security.GeneralSecurityException e6) {
                throw new java.lang.IllegalStateException(e6);
            }
        }
        java.util.Collections.unmodifiableList(arrayList);
    }
}
