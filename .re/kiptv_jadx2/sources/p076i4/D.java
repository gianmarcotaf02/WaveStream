package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class D extends AbstractMap implements Serializable {

    public static final Object f22779q = new Object();

    public transient Object f22780h;

    public transient int[] f22781i;
    public transient Object[] j;

    public transient Object[] f22782k;

    public transient int f22783l;

    public transient int f22784m;

    public transient B f22785n;

    public transient B f22786o;

    public transient C2218s f22787p;

    public static D a() {
        D d4 = new D();
        d4.f22783l = q0.p(3, 1);
        return d4;
    }

    public static D b(int i3) {
        D d4 = new D();
        AbstractC1864o0.M(i3 >= 0, "Expected size must be >= 0");
        d4.f22783l = q0.p(i3, 1);
        return d4;
    }

    public final Map c() {
        Object obj = this.f22780h;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override
    public final void clear() {
        if (h()) {
            return;
        }
        this.f22783l += 32;
        Map mapC = c();
        if (mapC != null) {
            this.f22783l = q0.p(size(), 3);
            mapC.clear();
            this.f22780h = null;
            this.f22784m = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f22784m, (Object) null);
        Arrays.fill(l(), 0, this.f22784m, (Object) null);
        Object obj = this.f22780h;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f22784m, 0);
        this.f22784m = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i3 = 0; i3 < this.f22784m; i3++) {
            if (AbstractC1853k0.m(obj, l()[i3])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f22783l & 31)) - 1;
    }

    public final int e(Object obj) {
        if (h()) {
            return -1;
        }
        int iW = AbstractC2230y.w(obj);
        int iD = d();
        Object obj2 = this.f22780h;
        Objects.requireNonNull(obj2);
        int iX = AbstractC2230y.x(iW & iD, obj2);
        if (iX == 0) {
            return -1;
        }
        int i3 = ~iD;
        int i9 = iW & i3;
        do {
            int i10 = iX - 1;
            int i11 = j()[i10];
            if ((i11 & i3) == i9 && AbstractC1853k0.m(obj, k()[i10])) {
                return i10;
            }
            iX = i11 & iD;
        } while (iX != 0);
        return -1;
    }

    @Override
    public final Set entrySet() {
        B b9 = this.f22786o;
        if (b9 != null) {
            return b9;
        }
        B b10 = new B(this, 0);
        this.f22786o = b10;
        return b10;
    }

    public final void g(int i3, int i9) {
        Object obj = this.f22780h;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        Object[] objArrK = k();
        Object[] objArrL = l();
        int size = size();
        int i10 = size - 1;
        if (i3 >= i10) {
            objArrK[i3] = null;
            objArrL[i3] = null;
            iArrJ[i3] = 0;
            return;
        }
        Object obj2 = objArrK[i10];
        objArrK[i3] = obj2;
        objArrL[i3] = objArrL[i10];
        objArrK[i10] = null;
        objArrL[i10] = null;
        iArrJ[i3] = iArrJ[i10];
        iArrJ[i10] = 0;
        int iW = AbstractC2230y.w(obj2) & i9;
        int iX = AbstractC2230y.x(iW, obj);
        if (iX == size) {
            AbstractC2230y.y(iW, i3 + 1, obj);
            return;
        }
        while (true) {
            int i11 = iX - 1;
            int i12 = iArrJ[i11];
            int i13 = i12 & i9;
            if (i13 == size) {
                iArrJ[i11] = AbstractC2230y.p(i12, i3 + 1, i9);
                return;
            }
            iX = i13;
        }
    }

    @Override
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return l()[iE];
    }

    public final boolean h() {
        return this.f22780h == null;
    }

    public final Object i(Object obj) {
        boolean zH = h();
        Object obj2 = f22779q;
        if (!zH) {
            int iD = d();
            Object obj3 = this.f22780h;
            Objects.requireNonNull(obj3);
            int iS = AbstractC2230y.s(obj, null, iD, obj3, j(), k(), null);
            if (iS != -1) {
                Object obj4 = l()[iS];
                g(iS, iD);
                this.f22784m--;
                this.f22783l += 32;
                return obj4;
            }
        }
        return obj2;
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.f22781i;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.j;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override
    public final Set keySet() {
        B b9 = this.f22785n;
        if (b9 != null) {
            return b9;
        }
        B b10 = new B(this, 1);
        this.f22785n = b10;
        return b10;
    }

    public final Object[] l() {
        Object[] objArr = this.f22782k;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i3, int i9, int i10, int i11) {
        Object objG = AbstractC2230y.g(i9);
        int i12 = i9 - 1;
        if (i11 != 0) {
            AbstractC2230y.y(i10 & i12, i11 + 1, objG);
        }
        Object obj = this.f22780h;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        for (int i13 = 0; i13 <= i3; i13++) {
            int iX = AbstractC2230y.x(i13, obj);
            while (iX != 0) {
                int i14 = iX - 1;
                int i15 = iArrJ[i14];
                int i16 = ((~i3) & i15) | i13;
                int i17 = i16 & i12;
                int iX2 = AbstractC2230y.x(i17, objG);
                AbstractC2230y.y(i17, iX, objG);
                iArrJ[i14] = AbstractC2230y.p(i16, iX2, i12);
                iX = i15 & i3;
            }
        }
        this.f22780h = objG;
        this.f22783l = AbstractC2230y.p(this.f22783l, 32 - Integer.numberOfLeadingZeros(i12), 31);
        return i12;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:55:0x00f4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p076i4.D.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objI = i(obj);
        if (objI == f22779q) {
            return null;
        }
        return objI;
    }

    @Override
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.f22784m;
    }

    @Override
    public final Collection values() {
        C2218s c2218s = this.f22787p;
        if (c2218s != null) {
            return c2218s;
        }
        C2218s c2218s2 = new C2218s(2, this);
        this.f22787p = c2218s2;
        return c2218s2;
    }
}
