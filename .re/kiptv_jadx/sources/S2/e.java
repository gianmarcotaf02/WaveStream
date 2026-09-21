package S2;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f9219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S2.f f9220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f9221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S.p f9222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Map f9223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p100l6.i f9224f;
    public p100l6.i g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p100l6.i f9225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final X2.k f9226i;
    public final X2.k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final X2.k f9227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public T2.i f9228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public T2.g f9229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public T2.d f9230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.Object f9231o;

    public e(android.content.Context context) {
        this.f9219a = context;
        this.f9220b = S2.f.f9232o;
        this.f9221c = null;
        this.f9222d = null;
        this.f9223e = p078i6.x.f23206h;
        this.f9224f = null;
        this.g = null;
        this.f9225h = null;
        X2.k kVar = X2.k.f10835h;
        this.f9226i = kVar;
        this.j = kVar;
        this.f9227k = kVar;
        this.f9228l = null;
        this.f9229m = null;
        this.f9230n = null;
        this.f9231o = E2.k.f2786b;
    }

    public final S2.h a() {
        java.util.Map mapN0;
        E2.k kVar;
        java.lang.Object obj = this.f9221c;
        if (obj == null) {
            obj = S2.m.f9283a;
        }
        java.lang.Object obj2 = obj;
        S.p pVar = this.f9222d;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.util.Map map = this.f9223e;
        if (kotlin.jvm.internal.m.a(map, bool)) {
            kotlin.jvm.internal.m.c(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            mapN0 = P3.e.n0(kotlin.jvm.internal.E.a(map));
        } else {
            if (!(map instanceof java.util.Map)) {
                throw new java.lang.AssertionError();
            }
            mapN0 = map;
        }
        java.util.Map map2 = mapN0;
        kotlin.jvm.internal.m.c(map2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        S2.f fVar = this.f9220b;
        M8.q qVar = fVar.f9233a;
        S2.c cVar = fVar.f9237e;
        S2.c cVar2 = fVar.f9238f;
        S2.c cVar3 = fVar.g;
        p100l6.h hVar = this.f9224f;
        if (hVar == null) {
            hVar = fVar.f9234b;
        }
        p100l6.h hVar2 = hVar;
        p100l6.h hVar3 = this.g;
        if (hVar3 == null) {
            hVar3 = fVar.f9235c;
        }
        p100l6.h hVar4 = hVar3;
        p100l6.h hVar5 = this.f9225h;
        if (hVar5 == null) {
            hVar5 = fVar.f9236d;
        }
        p100l6.h hVar6 = hVar5;
        p194x6.j jVar = this.f9226i;
        if (jVar == null) {
            jVar = fVar.f9239h;
        }
        p194x6.j jVar2 = jVar;
        p194x6.j jVar3 = this.j;
        if (jVar3 == null) {
            jVar3 = fVar.f9240i;
        }
        p194x6.j jVar4 = jVar3;
        p194x6.j jVar5 = this.f9227k;
        if (jVar5 == null) {
            jVar5 = fVar.j;
        }
        p194x6.j jVar6 = jVar5;
        T2.i iVar = this.f9228l;
        if (iVar == null) {
            iVar = fVar.f9241k;
        }
        T2.i iVar2 = iVar;
        T2.g gVar = this.f9229m;
        if (gVar == null) {
            gVar = fVar.f9242l;
        }
        T2.g gVar2 = gVar;
        T2.d dVar = this.f9230n;
        if (dVar == null) {
            dVar = fVar.f9243m;
        }
        T2.d dVar2 = dVar;
        java.lang.Object obj3 = this.f9231o;
        if (obj3 instanceof E2.i) {
            E2.i iVar3 = (E2.i) obj3;
            iVar3.getClass();
            kVar = new E2.k(P3.e.n0(iVar3.f2784a));
        } else {
            if (!(obj3 instanceof E2.k)) {
                throw new java.lang.AssertionError();
            }
            kVar = (E2.k) obj3;
        }
        return new S2.h(this.f9219a, obj2, pVar, map2, qVar, hVar2, hVar4, hVar6, cVar, cVar2, cVar3, jVar2, jVar4, jVar6, iVar2, gVar2, dVar2, kVar, new S2.g(this.f9224f, this.g, this.f9225h, this.f9226i, this.j, this.f9227k, this.f9228l, this.f9229m, this.f9230n), this.f9220b);
    }

    public e(S2.h hVar, android.content.Context context) {
        this.f9219a = context;
        this.f9220b = hVar.f9270t;
        this.f9221c = hVar.f9254b;
        this.f9222d = hVar.f9255c;
        this.f9223e = hVar.f9256d;
        S2.g gVar = hVar.f9269s;
        this.f9224f = gVar.f9245a;
        this.g = gVar.f9246b;
        this.f9225h = gVar.f9247c;
        this.f9226i = gVar.f9248d;
        this.j = gVar.f9249e;
        this.f9227k = gVar.f9250f;
        this.f9228l = gVar.g;
        this.f9229m = gVar.f9251h;
        this.f9230n = gVar.f9252i;
        this.f9231o = hVar.f9268r;
    }
}
