package p066h2;

import B7.l;
import Y1.F;
import androidx.lifecycle.e0;
import p136q.T;
import p166t3.d;

public class b extends e0 {

    public static final F f22458d = new F(1);

    public final T f22459b = new T(0);

    public boolean f22460c = false;

    @Override
    public final void d() {
        T t9 = this.f22459b;
        int iG = t9.g();
        for (int i3 = 0; i3 < iG; i3++) {
            a aVar = (a) t9.h(i3);
            d dVar = aVar.f22455l;
            dVar.a();
            dVar.f27771c = true;
            l lVar = aVar.f22457n;
            if (lVar != null) {
                aVar.h(lVar);
            }
            a aVar2 = dVar.f27769a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f27769a = null;
            if (lVar != null) {
                boolean z6 = lVar.f840i;
            }
            dVar.f27772d = true;
            dVar.f27770b = false;
            dVar.f27771c = false;
            dVar.f27773e = false;
        }
        int i9 = t9.f26357k;
        Object[] objArr = t9.j;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        t9.f26357k = 0;
        t9.f26355h = false;
    }
}
