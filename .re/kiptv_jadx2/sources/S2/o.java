package S2;

import android.content.Context;

public final class o {

    public final Context f9284a;

    public final T2.h f9285b;

    public final T2.g f9286c;

    public final T2.d f9287d;

    public final String f9288e;

    public final M8.q f9289f;
    public final c g;

    public final c f9290h;

    public final c f9291i;
    public final E2.k j;

    public o(Context context, T2.h hVar, T2.g gVar, T2.d dVar, String str, M8.q qVar, c cVar, c cVar2, c cVar3, E2.k kVar) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f9284a, oVar.f9284a) && kotlin.jvm.internal.m.a(this.f9285b, oVar.f9285b) && this.f9286c == oVar.f9286c && this.f9287d == oVar.f9287d && kotlin.jvm.internal.m.a(this.f9288e, oVar.f9288e) && kotlin.jvm.internal.m.a(this.f9289f, oVar.f9289f) && this.g == oVar.g && this.f9290h == oVar.f9290h && this.f9291i == oVar.f9291i && kotlin.jvm.internal.m.a(this.j, oVar.j);
    }

    public final int hashCode() {
        int iHashCode = (this.f9287d.hashCode() + ((this.f9286c.hashCode() + ((this.f9285b.hashCode() + (this.f9284a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f9288e;
        return this.j.f2787a.hashCode() + ((this.f9291i.hashCode() + ((this.f9290h.hashCode() + ((this.g.hashCode() + ((this.f9289f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f9284a + ", size=" + this.f9285b + ", scale=" + this.f9286c + ", precision=" + this.f9287d + ", diskCacheKey=" + this.f9288e + ", fileSystem=" + this.f9289f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.f9290h + ", networkCachePolicy=" + this.f9291i + ", extras=" + this.j + ')';
    }
}
