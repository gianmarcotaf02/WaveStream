package S2;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final S2.f f9232o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M8.q f9233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p100l6.h f9234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p100l6.h f9235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p100l6.h f9236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S2.c f9237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S2.c f9238f;
    public final S2.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p194x6.j f9239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p194x6.j f9240i;
    public final p194x6.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T2.i f9241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final T2.g f9242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final T2.d f9243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final E2.k f9244n;

    static {
        M8.w wVar = M8.q.f7275h;
        p100l6.i iVar = p100l6.i.f24820h;
        Z7.e eVar = S7.M.f9549a;
        Z7.d dVar = Z7.d.f13044i;
        S2.c cVar = S2.c.j;
        X2.k kVar = X2.k.f10835h;
        f9232o = new S2.f(wVar, iVar, dVar, dVar, cVar, cVar, cVar, kVar, kVar, kVar, T2.i.f9741a, T2.g.f9737i, T2.d.f9733h, E2.k.f2786b);
    }

    public f(M8.q qVar, p100l6.h hVar, p100l6.h hVar2, p100l6.h hVar3, S2.c cVar, S2.c cVar2, S2.c cVar3, p194x6.j jVar, p194x6.j jVar2, p194x6.j jVar3, T2.i iVar, T2.g gVar, T2.d dVar, E2.k kVar) {
        this.f9233a = qVar;
        this.f9234b = hVar;
        this.f9235c = hVar2;
        this.f9236d = hVar3;
        this.f9237e = cVar;
        this.f9238f = cVar2;
        this.g = cVar3;
        this.f9239h = jVar;
        this.f9240i = jVar2;
        this.j = jVar3;
        this.f9241k = iVar;
        this.f9242l = gVar;
        this.f9243m = dVar;
        this.f9244n = kVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S2.f)) {
            return false;
        }
        S2.f fVar = (S2.f) obj;
        return kotlin.jvm.internal.m.a(this.f9233a, fVar.f9233a) && kotlin.jvm.internal.m.a(this.f9234b, fVar.f9234b) && kotlin.jvm.internal.m.a(this.f9235c, fVar.f9235c) && kotlin.jvm.internal.m.a(this.f9236d, fVar.f9236d) && this.f9237e == fVar.f9237e && this.f9238f == fVar.f9238f && this.g == fVar.g && kotlin.jvm.internal.m.a(this.f9239h, fVar.f9239h) && kotlin.jvm.internal.m.a(this.f9240i, fVar.f9240i) && kotlin.jvm.internal.m.a(this.j, fVar.j) && kotlin.jvm.internal.m.a(this.f9241k, fVar.f9241k) && this.f9242l == fVar.f9242l && this.f9243m == fVar.f9243m && kotlin.jvm.internal.m.a(this.f9244n, fVar.f9244n);
    }

    public final int hashCode() {
        return this.f9244n.f2787a.hashCode() + ((this.f9243m.hashCode() + ((this.f9242l.hashCode() + ((this.f9241k.hashCode() + ((this.j.hashCode() + ((this.f9240i.hashCode() + ((this.f9239h.hashCode() + ((this.g.hashCode() + ((this.f9238f.hashCode() + ((this.f9237e.hashCode() + ((this.f9236d.hashCode() + ((this.f9235c.hashCode() + ((this.f9234b.hashCode() + (this.f9233a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Defaults(fileSystem=" + this.f9233a + ", interceptorCoroutineContext=" + this.f9234b + ", fetcherCoroutineContext=" + this.f9235c + ", decoderCoroutineContext=" + this.f9236d + ", memoryCachePolicy=" + this.f9237e + ", diskCachePolicy=" + this.f9238f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.f9239h + ", errorFactory=" + this.f9240i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.f9241k + ", scale=" + this.f9242l + ", precision=" + this.f9243m + ", extras=" + this.f9244n + ')';
    }
}
