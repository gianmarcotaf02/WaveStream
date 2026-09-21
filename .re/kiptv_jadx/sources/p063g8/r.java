package p063g8;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements p080i8.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final E6.l f22391h;

    public r(E6.l property) {
        kotlin.jvm.internal.m.e(property, "property");
        this.f22391h = property;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        E6.l lVar = this.f22391h;
        java.lang.Object obj2 = lVar.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        throw new java.lang.IllegalStateException("Field " + lVar.getName() + " is not set");
    }

    @Override // p080i8.a
    public final java.lang.Object r(java.lang.Object obj, java.lang.Object obj2) {
        E6.l lVar = this.f22391h;
        java.lang.Object obj3 = lVar.get(obj);
        if (obj3 == null) {
            lVar.set(obj, obj2);
            return null;
        }
        if (obj3.equals(obj2)) {
            return null;
        }
        return obj3;
    }
}
