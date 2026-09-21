package S2;

import M8.w;
import S7.M;

public final class f {

    public static final f f9232o;

    public final M8.q f9233a;

    public final p100l6.h f9234b;

    public final p100l6.h f9235c;

    public final p100l6.h f9236d;

    public final c f9237e;

    public final c f9238f;
    public final c g;

    public final p194x6.j f9239h;

    public final p194x6.j f9240i;
    public final p194x6.j j;

    public final T2.i f9241k;

    public final T2.g f9242l;

    public final T2.d f9243m;

    public final E2.k f9244n;

    static {
        w wVar = M8.q.f7275h;
        p100l6.i iVar = p100l6.i.f24820h;
        Z7.e eVar = M.f9549a;
        Z7.d dVar = Z7.d.f13044i;
        c cVar = c.j;
        X2.k kVar = X2.k.f10835h;
        f9232o = new f(wVar, iVar, dVar, dVar, cVar, cVar, cVar, kVar, kVar, kVar, T2.i.f9741a, T2.g.f9737i, T2.d.f9733h, E2.k.f2786b);
    }

    public f(M8.q qVar, p100l6.h hVar, p100l6.h hVar2, p100l6.h hVar3, c cVar, c cVar2, c cVar3, p194x6.j jVar, p194x6.j jVar2, p194x6.j jVar3, T2.i iVar, T2.g gVar, T2.d dVar, E2.k kVar) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f9233a, fVar.f9233a) && kotlin.jvm.internal.m.a(this.f9234b, fVar.f9234b) && kotlin.jvm.internal.m.a(this.f9235c, fVar.f9235c) && kotlin.jvm.internal.m.a(this.f9236d, fVar.f9236d) && this.f9237e == fVar.f9237e && this.f9238f == fVar.f9238f && this.g == fVar.g && kotlin.jvm.internal.m.a(this.f9239h, fVar.f9239h) && kotlin.jvm.internal.m.a(this.f9240i, fVar.f9240i) && kotlin.jvm.internal.m.a(this.j, fVar.j) && kotlin.jvm.internal.m.a(this.f9241k, fVar.f9241k) && this.f9242l == fVar.f9242l && this.f9243m == fVar.f9243m && kotlin.jvm.internal.m.a(this.f9244n, fVar.f9244n);
    }

    public final int hashCode() {
        return this.f9244n.f2787a.hashCode() + ((this.f9243m.hashCode() + ((this.f9242l.hashCode() + ((this.f9241k.hashCode() + ((this.j.hashCode() + ((this.f9240i.hashCode() + ((this.f9239h.hashCode() + ((this.g.hashCode() + ((this.f9238f.hashCode() + ((this.f9237e.hashCode() + ((this.f9236d.hashCode() + ((this.f9235c.hashCode() + ((this.f9234b.hashCode() + (this.f9233a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.f9233a + ", interceptorCoroutineContext=" + this.f9234b + ", fetcherCoroutineContext=" + this.f9235c + ", decoderCoroutineContext=" + this.f9236d + ", memoryCachePolicy=" + this.f9237e + ", diskCachePolicy=" + this.f9238f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.f9239h + ", errorFactory=" + this.f9240i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.f9241k + ", scale=" + this.f9242l + ", precision=" + this.f9243m + ", extras=" + this.f9244n + ')';
    }
}
