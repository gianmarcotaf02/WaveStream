package p056g0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public final class h extends a {
    public final f j;

    public int f21764k;

    public j f21765l;

    public int f21766m;

    public h(f fVar, int i3) {
        super(i3, fVar.f21762o);
        this.j = fVar;
        this.f21764k = fVar.p();
        this.f21766m = -1;
        b();
    }

    public final void a() {
        if (this.f21764k != this.j.p()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final void add(Object obj) {
        a();
        int i3 = this.f21748h;
        f fVar = this.j;
        fVar.add(i3, obj);
        this.f21748h++;
        this.f21749i = fVar.d();
        this.f21764k = fVar.p();
        this.f21766m = -1;
        b();
    }

    public final void b() {
        f fVar = this.j;
        Object[] objArr = fVar.f21760m;
        if (objArr == null) {
            this.f21765l = null;
            return;
        }
        int i3 = (fVar.f21762o - 1) & (-32);
        int i9 = this.f21748h;
        if (i9 > i3) {
            i9 = i3;
        }
        int i10 = (fVar.f21758k / 5) + 1;
        j jVar = this.f21765l;
        if (jVar == null) {
            this.f21765l = new j(objArr, i9, i3, i10);
            return;
        }
        jVar.f21748h = i9;
        jVar.f21749i = i3;
        jVar.j = i10;
        if (jVar.f21769k.length < i10) {
            jVar.f21769k = new Object[i10];
        }
        jVar.f21769k[0] = objArr;
        ?? r9 = i9 == i3 ? 1 : 0;
        jVar.f21770l = r9;
        jVar.b(i9 - r9, 1);
    }

    @Override
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f21748h;
        this.f21766m = i3;
        j jVar = this.f21765l;
        f fVar = this.j;
        if (jVar == null) {
            Object[] objArr = fVar.f21761n;
            this.f21748h = i3 + 1;
            return objArr[i3];
        }
        if (jVar.hasNext()) {
            this.f21748h++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f21761n;
        int i9 = this.f21748h;
        this.f21748h = i9 + 1;
        return objArr2[i9 - jVar.f21749i];
    }

    @Override
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f21748h;
        this.f21766m = i3 - 1;
        j jVar = this.f21765l;
        f fVar = this.j;
        if (jVar == null) {
            Object[] objArr = fVar.f21761n;
            int i9 = i3 - 1;
            this.f21748h = i9;
            return objArr[i9];
        }
        int i10 = jVar.f21749i;
        if (i3 <= i10) {
            this.f21748h = i3 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f21761n;
        int i11 = i3 - 1;
        this.f21748h = i11;
        return objArr2[i11 - i10];
    }

    @Override
    public final void remove() {
        a();
        int i3 = this.f21766m;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.j;
        fVar.e(i3);
        int i9 = this.f21766m;
        if (i9 < this.f21748h) {
            this.f21748h = i9;
        }
        this.f21749i = fVar.d();
        this.f21764k = fVar.p();
        this.f21766m = -1;
        b();
    }

    @Override
    public final void set(Object obj) {
        a();
        int i3 = this.f21766m;
        if (i3 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.j;
        fVar.set(i3, obj);
        this.f21764k = fVar.p();
        b();
    }
}
