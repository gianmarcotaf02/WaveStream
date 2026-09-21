package p018b8;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends p100l6.a implements p100l6.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final V1.b f18024i = new V1.b(12);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Map f18025h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a() {
        super(f18024i);
        S8.a aVar = P8.e.f8188a;
        if (aVar == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        java.util.Map mapW = aVar.w();
        this.f18025h = mapW;
    }

    public static void W(java.util.Map map) {
        if (map == null) {
            S8.a aVar = P8.e.f8188a;
            if (aVar == null) {
                throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
            }
            aVar.clear();
            return;
        }
        S8.a aVar2 = P8.e.f8188a;
        if (aVar2 == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        aVar2.r(map);
    }

    public final void V(java.lang.Object obj) {
        W((java.util.Map) obj);
    }

    public final java.lang.Object X(p100l6.h hVar) {
        S8.a aVar = P8.e.f8188a;
        if (aVar == null) {
            throw new java.lang.IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        java.util.Map mapW = aVar.w();
        W(this.f18025h);
        return mapW;
    }
}
