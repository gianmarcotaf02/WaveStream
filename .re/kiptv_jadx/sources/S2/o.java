package S2;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f9284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T2.h f9285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T2.g f9286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T2.d f9287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f9288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M8.q f9289f;
    public final S2.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S2.c f9290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S2.c f9291i;
    public final E2.k j;

    public o(android.content.Context context, T2.h hVar, T2.g gVar, T2.d dVar, java.lang.String str, M8.q qVar, S2.c cVar, S2.c cVar2, S2.c cVar3, E2.k kVar) {
        this.f9284a = context;
        this.f9285b = hVar;
        this.f9286c = gVar;
        this.f9287d = dVar;
        this.f9288e = str;
        this.f9289f = qVar;
        this.g = cVar;
        this.f9290h = cVar2;
        this.f9291i = cVar3;
        this.j = kVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S2.o)) {
            return false;
        }
        S2.o oVar = (S2.o) obj;
        return kotlin.jvm.internal.m.a(this.f9284a, oVar.f9284a) && kotlin.jvm.internal.m.a(this.f9285b, oVar.f9285b) && this.f9286c == oVar.f9286c && this.f9287d == oVar.f9287d && kotlin.jvm.internal.m.a(this.f9288e, oVar.f9288e) && kotlin.jvm.internal.m.a(this.f9289f, oVar.f9289f) && this.g == oVar.g && this.f9290h == oVar.f9290h && this.f9291i == oVar.f9291i && kotlin.jvm.internal.m.a(this.j, oVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.f9287d.hashCode() + ((this.f9286c.hashCode() + ((this.f9285b.hashCode() + (this.f9284a.hashCode() * 31)) * 31)) * 31)) * 31;
        java.lang.String str = this.f9288e;
        return this.j.f2787a.hashCode() + ((this.f9291i.hashCode() + ((this.f9290h.hashCode() + ((this.g.hashCode() + ((this.f9289f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Options(context=" + this.f9284a + ", size=" + this.f9285b + ", scale=" + this.f9286c + ", precision=" + this.f9287d + ", diskCacheKey=" + this.f9288e + ", fileSystem=" + this.f9289f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.f9290h + ", networkCachePolicy=" + this.f9291i + ", extras=" + this.j + ')';
    }
}
