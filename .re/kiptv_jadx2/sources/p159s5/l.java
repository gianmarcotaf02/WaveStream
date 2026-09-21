package p159s5;

import B2.a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m;
import p078i6.w;
import p078i6.y;
import p121o0.p;

public final class l {

    public final e f27300a;

    public final String f27301b;

    public final String f27302c;

    public final List f27303d;

    public final D f27304e;

    public final Set f27305f;
    public final Set g;

    public final Set f27306h;

    public final Set f27307i;
    public final Set j;

    public final Set f27308k;

    public final Set f27309l;

    public final Set f27310m;

    public l(e type, String categoryId, String categoryName, List items, D sort, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8) {
        m.e(type, "type");
        m.e(categoryId, "categoryId");
        m.e(categoryName, "categoryName");
        m.e(items, "items");
        m.e(sort, "sort");
        this.f27300a = type;
        this.f27301b = categoryId;
        this.f27302c = categoryName;
        this.f27303d = items;
        this.f27304e = sort;
        this.f27305f = set;
        this.g = set2;
        this.f27306h = set3;
        this.f27307i = set4;
        this.j = set5;
        this.f27308k = set6;
        this.f27309l = set7;
        this.f27310m = set8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f27300a == lVar.f27300a && m.a(this.f27301b, lVar.f27301b) && m.a(this.f27302c, lVar.f27302c) && m.a(this.f27303d, lVar.f27303d) && this.f27304e == lVar.f27304e && m.a(this.f27305f, lVar.f27305f) && m.a(this.g, lVar.g) && m.a(this.f27306h, lVar.f27306h) && m.a(this.f27307i, lVar.f27307i) && m.a(this.j, lVar.j) && m.a(this.f27308k, lVar.f27308k) && m.a(this.f27309l, lVar.f27309l) && m.a(this.f27310m, lVar.f27310m);
    }

    public final int hashCode() {
        return this.f27310m.hashCode() + p.g(this.f27309l, p.g(this.f27308k, p.g(this.j, p.g(this.f27307i, p.g(this.f27306h, p.g(this.g, p.g(this.f27305f, (this.f27304e.hashCode() + a.b(a.a(a.a(this.f27300a.hashCode() * 31, 31, this.f27301b), 31, this.f27302c), 31, this.f27303d)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TvExpandedCategoryUiState(type=" + this.f27300a + ", categoryId=" + this.f27301b + ", categoryName=" + this.f27302c + ", items=" + this.f27303d + ", sort=" + this.f27304e + ", lockedItemIds=" + this.f27305f + ", lockedCategoryIds=" + this.g + ", watchedMovieIds=" + this.f27306h + ", traktWatchedMovieIds=" + this.f27307i + ", kiptvWatchedMovieIds=" + this.j + ", watchedSeriesIds=" + this.f27308k + ", traktWatchedSeriesIds=" + this.f27309l + ", kiptvWatchedSeriesIds=" + this.f27310m + ")";
    }

    public l(e eVar, String str, String str2, List list, D d4, int i3) {
        List list2 = (i3 & 8) != 0 ? w.f23205h : list;
        D d6 = (i3 & 16) != 0 ? D.f27269h : d4;
        y yVar = y.f23207h;
        this(eVar, str, str2, list2, d6, yVar, yVar, yVar, yVar, yVar, yVar, yVar, yVar);
    }
}
