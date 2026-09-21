package p179v4;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29160a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f29161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f29162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f29163d;

    public d(p079i7.e eVar, Q6.z zVar, N6.P p2) {
        this.f29161b = eVar;
        this.f29162c = zVar;
        this.f29163d = p2;
    }

    public abstract p101l7.c a();

    public int b() {
        return 1;
    }

    public abstract java.lang.String c();

    public java.lang.Object d(com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906a, java.lang.Class cls) {
        p131p4.f fVar = (p131p4.f) ((java.util.Map) this.f29163d).get(cls);
        if (fVar != null) {
            return fVar.a(abstractC1906a);
        }
        throw new java.lang.IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract D1.AbstractC0220e0 e();

    public abstract A4.X f();

    public abstract com.google.crypto.tink.shaded.protobuf.AbstractC1906a g(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j);

    public abstract void h(com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906a);

    public java.lang.String toString() {
        switch (this.f29160a) {
            case 1:
                return getClass().getSimpleName() + ": " + a();
            default:
                return super.toString();
        }
    }

    public d(java.lang.Class cls, p131p4.f[] fVarArr) {
        this.f29161b = cls;
        java.util.HashMap map = new java.util.HashMap();
        for (p131p4.f fVar : fVarArr) {
            boolean zContainsKey = map.containsKey(fVar.f26195a);
            java.lang.Class cls2 = fVar.f26195a;
            if (!zContainsKey) {
                map.put(cls2, fVar);
            } else {
                throw new java.lang.IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
            }
        }
        if (fVarArr.length > 0) {
            this.f29162c = fVarArr[0].f26195a;
        } else {
            this.f29162c = java.lang.Void.class;
        }
        this.f29163d = java.util.Collections.unmodifiableMap(map);
    }
}
