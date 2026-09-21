package H5;

import java.util.ArrayList;
import java.util.List;

public final class C {

    public final boolean f4044a;

    public final boolean f4045b;

    public final EnumC0399q f4046c;

    public final List f4047d;

    public final List f4048e;

    public final int f4049f;
    public final int g;

    public final String f4050h;

    public C(boolean z6, boolean z9, EnumC0399q selectedType, List movies, List series, int i3, int i9, String str) {
        kotlin.jvm.internal.m.e(selectedType, "selectedType");
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(series, "series");
        this.f4044a = z6;
        this.f4045b = z9;
        this.f4046c = selectedType;
        this.f4047d = movies;
        this.f4048e = series;
        this.f4049f = i3;
        this.g = i9;
        this.f4050h = str;
    }

    public static C a(C c9, boolean z6, boolean z9, EnumC0399q enumC0399q, ArrayList arrayList, ArrayList arrayList2, int i3, int i9, int i10) {
        if ((i10 & 1) != 0) {
            z6 = c9.f4044a;
        }
        boolean z10 = z6;
        if ((i10 & 2) != 0) {
            z9 = c9.f4045b;
        }
        boolean z11 = z9;
        if ((i10 & 4) != 0) {
            enumC0399q = c9.f4046c;
        }
        EnumC0399q selectedType = enumC0399q;
        List list = arrayList;
        if ((i10 & 8) != 0) {
            list = c9.f4047d;
        }
        List movies = list;
        List list2 = arrayList2;
        if ((i10 & 16) != 0) {
            list2 = c9.f4048e;
        }
        List series = list2;
        if ((i10 & 32) != 0) {
            i3 = c9.f4049f;
        }
        int i11 = i3;
        int i12 = (i10 & 64) != 0 ? c9.g : i9;
        String str = c9.f4050h;
        c9.getClass();
        kotlin.jvm.internal.m.e(selectedType, "selectedType");
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(series, "series");
        return new C(z10, z11, selectedType, movies, series, i11, i12, str);
    }

    public final List b() {
        int iOrdinal = this.f4046c.ordinal();
        if (iOrdinal == 0) {
            return p078i6.o.J1(this.f4047d, this.f4049f);
        }
        if (iOrdinal == 1) {
            return p078i6.o.J1(this.f4048e, this.g);
        }
        throw new I3.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        return this.f4044a == c9.f4044a && this.f4045b == c9.f4045b && this.f4046c == c9.f4046c && kotlin.jvm.internal.m.a(this.f4047d, c9.f4047d) && kotlin.jvm.internal.m.a(this.f4048e, c9.f4048e) && this.f4049f == c9.f4049f && this.g == c9.g && kotlin.jvm.internal.m.a(this.f4050h, c9.f4050h);
    }

    public final int hashCode() {
        return this.f4050h.hashCode() + p121o0.p.d(this.g, p121o0.p.d(this.f4049f, B2.a.b(B2.a.b((this.f4046c.hashCode() + p121o0.p.f(Boolean.hashCode(this.f4044a) * 31, 31, this.f4045b)) * 31, 31, this.f4047d), 31, this.f4048e), 31), 31);
    }

    public final String toString() {
        return "TvGenreResultsUiState(isLoading=" + this.f4044a + ", loadFailed=" + this.f4045b + ", selectedType=" + this.f4046c + ", movies=" + this.f4047d + ", series=" + this.f4048e + ", displayedMoviesCount=" + this.f4049f + ", displayedSeriesCount=" + this.g + ", imageBaseUrl=" + this.f4050h + ")";
    }
}
