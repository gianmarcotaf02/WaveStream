package p086j6;

import D1.I;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p201y6.a;

public final class c extends I implements Iterator, a {

    public final int f24237l;

    public c(e map, int i3) {
        this.f24237l = i3;
        m.e(map, "map");
        this.f1972k = map;
        this.f1971i = -1;
        this.j = map.f24247o;
        e();
    }

    @Override
    public final Object next() {
        switch (this.f24237l) {
            case 0:
                b();
                int i3 = this.f1970h;
                e eVar = (e) this.f1972k;
                if (i3 >= eVar.f24245m) {
                    throw new NoSuchElementException();
                }
                this.f1970h = i3 + 1;
                this.f1971i = i3;
                d dVar = new d(eVar, i3);
                e();
                return dVar;
            case 1:
                b();
                int i9 = this.f1970h;
                e eVar2 = (e) this.f1972k;
                if (i9 >= eVar2.f24245m) {
                    throw new NoSuchElementException();
                }
                this.f1970h = i9 + 1;
                this.f1971i = i9;
                Object obj = eVar2.f24241h[i9];
                e();
                return obj;
            default:
                b();
                int i10 = this.f1970h;
                e eVar3 = (e) this.f1972k;
                if (i10 >= eVar3.f24245m) {
                    throw new NoSuchElementException();
                }
                this.f1970h = i10 + 1;
                this.f1971i = i10;
                Object[] objArr = eVar3.f24242i;
                m.b(objArr);
                Object obj2 = objArr[this.f1971i];
                e();
                return obj2;
        }
    }
}
