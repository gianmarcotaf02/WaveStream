package X7;

import S7.U;
import S7.V;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class u {

    public static final AtomicIntegerFieldUpdater f10937b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_size$volatile");
    private volatile int _size$volatile;

    public U[] f10938a;

    public final void a(U u6) {
        u6.c((V) this);
        U[] uArr = this.f10938a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10937b;
        if (uArr == null) {
            uArr = new U[4];
            this.f10938a = uArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= uArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(uArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            uArr = (U[]) objArrCopyOf;
            this.f10938a = uArr;
        }
        int i3 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i3 + 1);
        uArr[i3] = u6;
        u6.f9557i = i3;
        c(i3);
    }

    public final U b(int i3) {
        int i9;
        int i10;
        Object[] objArr;
        int i11;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.f10938a;
        kotlin.jvm.internal.m.b(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10937b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i3 < atomicIntegerFieldUpdater.get(this)) {
            d(i3, atomicIntegerFieldUpdater.get(this));
            int i12 = (i3 - 1) / 2;
            if (i3 > 0) {
                U u6 = objArr2[i3];
                kotlin.jvm.internal.m.b(u6);
                Object obj2 = objArr2[i12];
                kotlin.jvm.internal.m.b(obj2);
                if (u6.compareTo(obj2) < 0) {
                    d(i3, i12);
                    c(i12);
                } else {
                    while (true) {
                        i9 = i3 * 2;
                        i10 = i9 + 1;
                        if (i10 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.f10938a;
                        kotlin.jvm.internal.m.b(objArr);
                        i11 = i9 + 2;
                        if (i11 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i11];
                            kotlin.jvm.internal.m.b(comparable3);
                            obj = objArr[i10];
                            kotlin.jvm.internal.m.b(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i11 = i10;
                            }
                        } else {
                            i11 = i10;
                        }
                        comparable = objArr[i3];
                        kotlin.jvm.internal.m.b(comparable);
                        comparable2 = objArr[i11];
                        kotlin.jvm.internal.m.b(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        d(i3, i11);
                        i3 = i11;
                    }
                }
            } else {
                while (true) {
                    i9 = i3 * 2;
                    i10 = i9 + 1;
                    if (i10 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.f10938a;
                    kotlin.jvm.internal.m.b(objArr);
                    i11 = i9 + 2;
                    if (i11 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i11];
                        kotlin.jvm.internal.m.b(comparable3);
                        obj = objArr[i10];
                        kotlin.jvm.internal.m.b(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i11 = i10;
                        }
                    } else {
                        i11 = i10;
                    }
                    comparable = objArr[i3];
                    kotlin.jvm.internal.m.b(comparable);
                    comparable2 = objArr[i11];
                    kotlin.jvm.internal.m.b(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    d(i3, i11);
                    i3 = i11;
                }
            }
        }
        U u7 = objArr2[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.m.b(u7);
        u7.c(null);
        u7.f9557i = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return u7;
    }

    public final void c(int i3) {
        while (i3 > 0) {
            U[] uArr = this.f10938a;
            kotlin.jvm.internal.m.b(uArr);
            int i9 = (i3 - 1) / 2;
            U u6 = uArr[i9];
            kotlin.jvm.internal.m.b(u6);
            U u7 = uArr[i3];
            kotlin.jvm.internal.m.b(u7);
            if (u6.compareTo(u7) <= 0) {
                return;
            }
            d(i3, i9);
            i3 = i9;
        }
    }

    public final void d(int i3, int i9) {
        U[] uArr = this.f10938a;
        kotlin.jvm.internal.m.b(uArr);
        U u6 = uArr[i9];
        kotlin.jvm.internal.m.b(u6);
        U u7 = uArr[i3];
        kotlin.jvm.internal.m.b(u7);
        uArr[i3] = u6;
        uArr[i9] = u7;
        u6.f9557i = i3;
        u7.f9557i = i9;
    }
}
