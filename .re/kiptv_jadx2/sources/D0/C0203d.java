package D0;

import java.util.ArrayList;
import java.util.List;

public final class C0203d {

    public final String f1857a;

    public final float f1858b;

    public final float f1859c;

    public final float f1860d;

    public final float f1861e;

    public final float f1862f;
    public final float g;

    public final float f1863h;

    public final List f1864i;
    public final ArrayList j;

    public C0203d(String str, float f9, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        f9 = (i3 & 2) != 0 ? 0.0f : f9;
        f10 = (i3 & 4) != 0 ? 0.0f : f10;
        f11 = (i3 & 8) != 0 ? 0.0f : f11;
        f12 = (i3 & 16) != 0 ? 1.0f : f12;
        f13 = (i3 & 32) != 0 ? 1.0f : f13;
        f14 = (i3 & 64) != 0 ? 0.0f : f14;
        f15 = (i3 & 128) != 0 ? 0.0f : f15;
        if ((i3 & 256) != 0) {
            int i9 = I.f1820a;
            list = p078i6.w.f23205h;
        }
        ArrayList arrayList = new ArrayList();
        this.f1857a = str;
        this.f1858b = f9;
        this.f1859c = f10;
        this.f1860d = f11;
        this.f1861e = f12;
        this.f1862f = f13;
        this.g = f14;
        this.f1863h = f15;
        this.f1864i = list;
        this.j = arrayList;
    }
}
