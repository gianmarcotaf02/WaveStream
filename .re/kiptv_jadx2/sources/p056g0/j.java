package p056g0;

import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

public final class j extends a {
    public int j;

    public Object[] f21769k;

    public boolean f21770l;

    public j(Object[] objArr, int i3, int i9, int i10) {
        super(i3, i9);
        this.j = i10;
        Object[] objArr2 = new Object[i10];
        this.f21769k = objArr2;
        ?? r9 = i3 == i9 ? 1 : 0;
        this.f21770l = r9;
        objArr2[0] = objArr;
        b(i3 - r9, 1);
    }

    public final Object a() {
        int i3 = this.f21748h & 31;
        Object obj = this.f21769k[this.j - 1];
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i3];
    }

    public final void b(int i3, int i9) {
        int i10 = (this.j - i9) * 5;
        while (i9 < this.j) {
            Object[] objArr = this.f21769k;
            Object obj = objArr[i9 - 1];
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i9] = ((Object[]) obj)[AbstractC1853k0.y(i3, i10)];
            i10 -= 5;
            i9++;
        }
    }

    public final void c(int i3) {
        int i9 = 0;
        while (AbstractC1853k0.y(this.f21748h, i9) == i3) {
            i9 += 5;
        }
        if (i9 > 0) {
            b(this.f21748h, ((this.j - 1) - (i9 / 5)) + 1);
        }
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i3 = this.f21748h + 1;
        this.f21748h = i3;
        if (i3 == this.f21749i) {
            this.f21770l = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f21748h--;
        if (this.f21770l) {
            this.f21770l = false;
            return a();
        }
        c(31);
        return a();
    }
}
