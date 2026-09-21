package F2;

public final class b {

    public static final b f3526a = new b();

    public final boolean a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof S2.h) || !(obj2 instanceof S2.h)) {
            return kotlin.jvm.internal.m.a(obj, obj2);
        }
        S2.h hVar = (S2.h) obj;
        S2.h hVar2 = (S2.h) obj2;
        return kotlin.jvm.internal.m.a(hVar.f9253a, hVar2.f9253a) && hVar.f9254b.equals(hVar2.f9254b) && hVar.f9256d.equals(hVar2.f9256d) && kotlin.jvm.internal.m.a(hVar.f9265o, hVar2.f9265o) && hVar.f9266p == hVar2.f9266p && hVar.f9267q == hVar2.f9267q;
    }

    public final int b(Object obj) {
        if (!(obj instanceof S2.h)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        S2.h hVar = (S2.h) obj;
        return hVar.f9267q.hashCode() + ((hVar.f9266p.hashCode() + ((hVar.f9265o.hashCode() + B2.a.c((hVar.f9254b.hashCode() + (hVar.f9253a.hashCode() * 31)) * 961, 961, hVar.f9256d)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}
