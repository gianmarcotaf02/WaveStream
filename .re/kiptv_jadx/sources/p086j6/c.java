package p086j6;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends D1.I implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f24237l;

    public c(p086j6.e map, int i3) {
        this.f24237l = i3;
        kotlin.jvm.internal.m.e(map, "map");
        this.f1972k = map;
        this.f1971i = -1;
        this.j = map.f24247o;
        e();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f24237l) {
            case 0:
                b();
                int i3 = this.f1970h;
                p086j6.e eVar = (p086j6.e) this.f1972k;
                if (i3 >= eVar.f24245m) {
                    throw new java.util.NoSuchElementException();
                }
                this.f1970h = i3 + 1;
                this.f1971i = i3;
                p086j6.d dVar = new p086j6.d(eVar, i3);
                e();
                return dVar;
            case 1:
                b();
                int i9 = this.f1970h;
                p086j6.e eVar2 = (p086j6.e) this.f1972k;
                if (i9 >= eVar2.f24245m) {
                    throw new java.util.NoSuchElementException();
                }
                this.f1970h = i9 + 1;
                this.f1971i = i9;
                java.lang.Object obj = eVar2.f24241h[i9];
                e();
                return obj;
            default:
                b();
                int i10 = this.f1970h;
                p086j6.e eVar3 = (p086j6.e) this.f1972k;
                if (i10 >= eVar3.f24245m) {
                    throw new java.util.NoSuchElementException();
                }
                this.f1970h = i10 + 1;
                this.f1971i = i10;
                java.lang.Object[] objArr = eVar3.f24242i;
                kotlin.jvm.internal.m.b(objArr);
                java.lang.Object obj2 = objArr[this.f1971i];
                e();
                return obj2;
        }
    }
}
