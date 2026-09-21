package S2;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f9253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f9254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S.p f9255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f9256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M8.q f9257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p100l6.h f9258f;
    public final p100l6.h g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p100l6.h f9259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S2.c f9260i;
    public final S2.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final S2.c f9261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p194x6.j f9262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p194x6.j f9263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p194x6.j f9264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T2.i f9265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final T2.g f9266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final T2.d f9267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final E2.k f9268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final S2.g f9269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final S2.f f9270t;

    public h(android.content.Context context, java.lang.Object obj, S.p pVar, java.util.Map map, M8.q qVar, p100l6.h hVar, p100l6.h hVar2, p100l6.h hVar3, S2.c cVar, S2.c cVar2, S2.c cVar3, p194x6.j jVar, p194x6.j jVar2, p194x6.j jVar3, T2.i iVar, T2.g gVar, T2.d dVar, E2.k kVar, S2.g gVar2, S2.f fVar) {
        this.f9253a = context;
        this.f9254b = obj;
        this.f9255c = pVar;
        this.f9256d = map;
        this.f9257e = qVar;
        this.f9258f = hVar;
        this.g = hVar2;
        this.f9259h = hVar3;
        this.f9260i = cVar;
        this.j = cVar2;
        this.f9261k = cVar3;
        this.f9262l = jVar;
        this.f9263m = jVar2;
        this.f9264n = jVar3;
        this.f9265o = iVar;
        this.f9266p = gVar;
        this.f9267q = dVar;
        this.f9268r = kVar;
        this.f9269s = gVar2;
        this.f9270t = fVar;
    }

    public static S2.e a(S2.h hVar) {
        android.content.Context context = hVar.f9253a;
        hVar.getClass();
        return new S2.e(hVar, context);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S2.h)) {
            return false;
        }
        S2.h hVar = (S2.h) obj;
        return kotlin.jvm.internal.m.a(this.f9253a, hVar.f9253a) && this.f9254b.equals(hVar.f9254b) && kotlin.jvm.internal.m.a(this.f9255c, hVar.f9255c) && this.f9256d.equals(hVar.f9256d) && kotlin.jvm.internal.m.a(this.f9257e, hVar.f9257e) && kotlin.jvm.internal.m.a(this.f9258f, hVar.f9258f) && kotlin.jvm.internal.m.a(this.g, hVar.g) && kotlin.jvm.internal.m.a(this.f9259h, hVar.f9259h) && this.f9260i == hVar.f9260i && this.j == hVar.j && this.f9261k == hVar.f9261k && kotlin.jvm.internal.m.a(this.f9262l, hVar.f9262l) && kotlin.jvm.internal.m.a(this.f9263m, hVar.f9263m) && kotlin.jvm.internal.m.a(this.f9264n, hVar.f9264n) && kotlin.jvm.internal.m.a(this.f9265o, hVar.f9265o) && this.f9266p == hVar.f9266p && this.f9267q == hVar.f9267q && kotlin.jvm.internal.m.a(this.f9268r, hVar.f9268r) && this.f9269s.equals(hVar.f9269s) && kotlin.jvm.internal.m.a(this.f9270t, hVar.f9270t);
    }

    public final int hashCode() {
        int iHashCode = (this.f9254b.hashCode() + (this.f9253a.hashCode() * 31)) * 31;
        S.p pVar = this.f9255c;
        return this.f9270t.hashCode() + ((this.f9269s.hashCode() + B2.a.c((this.f9267q.hashCode() + ((this.f9266p.hashCode() + ((this.f9265o.hashCode() + ((this.f9264n.hashCode() + ((this.f9263m.hashCode() + ((this.f9262l.hashCode() + ((this.f9261k.hashCode() + ((this.j.hashCode() + ((this.f9260i.hashCode() + ((this.f9259h.hashCode() + ((this.g.hashCode() + ((this.f9258f.hashCode() + ((this.f9257e.hashCode() + B2.a.c((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 29791, 961, this.f9256d)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f9268r.f2787a)) * 31);
    }

    public final java.lang.String toString() {
        return "ImageRequest(context=" + this.f9253a + ", data=" + this.f9254b + ", target=" + this.f9255c + ", listener=null, memoryCacheKey=null, memoryCacheKeyExtras=" + this.f9256d + ", diskCacheKey=null, fileSystem=" + this.f9257e + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f9258f + ", fetcherCoroutineContext=" + this.g + ", decoderCoroutineContext=" + this.f9259h + ", memoryCachePolicy=" + this.f9260i + ", diskCachePolicy=" + this.j + ", networkCachePolicy=" + this.f9261k + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.f9262l + ", errorFactory=" + this.f9263m + ", fallbackFactory=" + this.f9264n + ", sizeResolver=" + this.f9265o + ", scale=" + this.f9266p + ", precision=" + this.f9267q + ", extras=" + this.f9268r + ", defined=" + this.f9269s + ", defaults=" + this.f9270t + ')';
    }
}
