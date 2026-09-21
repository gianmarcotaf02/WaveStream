package S2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p100l6.i f9245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p100l6.i f9246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p100l6.i f9247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X2.k f9248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X2.k f9249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X2.k f9250f;
    public final T2.i g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final T2.g f9251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final T2.d f9252i;

    public g(p100l6.i iVar, p100l6.i iVar2, p100l6.i iVar3, X2.k kVar, X2.k kVar2, X2.k kVar3, T2.i iVar4, T2.g gVar, T2.d dVar) {
        this.f9245a = iVar;
        this.f9246b = iVar2;
        this.f9247c = iVar3;
        this.f9248d = kVar;
        this.f9249e = kVar2;
        this.f9250f = kVar3;
        this.g = iVar4;
        this.f9251h = gVar;
        this.f9252i = dVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S2.g)) {
            return false;
        }
        S2.g gVar = (S2.g) obj;
        gVar.getClass();
        return kotlin.jvm.internal.m.a(this.f9245a, gVar.f9245a) && kotlin.jvm.internal.m.a(this.f9246b, gVar.f9246b) && kotlin.jvm.internal.m.a(this.f9247c, gVar.f9247c) && kotlin.jvm.internal.m.a(this.f9248d, gVar.f9248d) && kotlin.jvm.internal.m.a(this.f9249e, gVar.f9249e) && kotlin.jvm.internal.m.a(this.f9250f, gVar.f9250f) && kotlin.jvm.internal.m.a(this.g, gVar.g) && this.f9251h == gVar.f9251h && this.f9252i == gVar.f9252i;
    }

    public final int hashCode() {
        X2.k kVar = this.f9248d;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        X2.k kVar2 = this.f9249e;
        int iHashCode2 = (iHashCode + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
        X2.k kVar3 = this.f9250f;
        int iHashCode3 = (iHashCode2 + (kVar3 == null ? 0 : kVar3.hashCode())) * 31;
        T2.i iVar = this.g;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        T2.g gVar = this.f9251h;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        T2.d dVar = this.f9252i;
        return iHashCode5 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.f9245a + ", fetcherCoroutineContext=" + this.f9246b + ", decoderCoroutineContext=" + this.f9247c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.f9248d + ", errorFactory=" + this.f9249e + ", fallbackFactory=" + this.f9250f + ", sizeResolver=" + this.g + ", scale=" + this.f9251h + ", precision=" + this.f9252i + ')';
    }
}
