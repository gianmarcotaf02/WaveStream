package p064h0;

import com.google.common.util.concurrent.U;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.m;
import p089k0.i;

public class e extends d {

    public final i f22436k;

    public Object f22437l;

    public boolean f22438m;

    public int f22439n;

    public e(i iVar, l[] lVarArr) {
        super(iVar.f24418i, lVarArr);
        this.f22436k = iVar;
        this.f22439n = iVar.f24419k;
    }

    public final void c(int i3, k kVar, Object obj, int i9) {
        int i10 = i9 * 5;
        l[] lVarArr = this.f22434h;
        if (i10 <= 30) {
            int iT0 = 1 << U.t0(i3, i10);
            if (kVar.h(iT0)) {
                lVarArr[i9].a(kVar.f22450d, Integer.bitCount(kVar.f22447a) * 2, kVar.f(iT0));
                this.f22435i = i9;
                return;
            } else {
                int iT = kVar.t(iT0);
                k kVarS = kVar.s(iT);
                lVarArr[i9].a(kVar.f22450d, Integer.bitCount(kVar.f22447a) * 2, iT);
                c(i3, kVarS, obj, i9 + 1);
                return;
            }
        }
        l lVar = lVarArr[i9];
        Object[] objArr = kVar.f22450d;
        lVar.a(objArr, objArr.length, 0);
        while (true) {
            l lVar2 = lVarArr[i9];
            if (m.a(lVar2.f22451h[lVar2.j], obj)) {
                this.f22435i = i9;
                return;
            } else {
                lVarArr[i9].j += 2;
            }
        }
    }

    @Override
    public final Object next() {
        if (this.f22436k.f24419k != this.f22439n) {
            throw new ConcurrentModificationException();
        }
        if (!this.j) {
            throw new NoSuchElementException();
        }
        l lVar = this.f22434h[this.f22435i];
        this.f22437l = lVar.f22451h[lVar.j];
        this.f22438m = true;
        return super.next();
    }

    @Override
    public final void remove() {
        if (!this.f22438m) {
            throw new IllegalStateException();
        }
        boolean z6 = this.j;
        i iVar = this.f22436k;
        if (!z6) {
            E.a(iVar).remove(this.f22437l);
        } else {
            if (!z6) {
                throw new NoSuchElementException();
            }
            l lVar = this.f22434h[this.f22435i];
            Object obj = lVar.f22451h[lVar.j];
            E.a(iVar).remove(this.f22437l);
            c(obj != null ? obj.hashCode() : 0, iVar.f24418i, obj, 0);
        }
        this.f22437l = null;
        this.f22438m = false;
        this.f22439n = iVar.f24419k;
    }
}
