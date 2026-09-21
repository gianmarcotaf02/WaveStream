package X7;

/* JADX INFO: loaded from: classes4.dex */
public class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f10937b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(X7.u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S7.U[] f10938a;

    public final void a(S7.U u6) {
        u6.c((S7.V) this);
        S7.U[] uArr = this.f10938a;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10937b;
        if (uArr == null) {
            uArr = new S7.U[4];
            this.f10938a = uArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= uArr.length) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(uArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            uArr = (S7.U[]) objArrCopyOf;
            this.f10938a = uArr;
        }
        int i3 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i3 + 1);
        uArr[i3] = u6;
        u6.f9557i = i3;
        c(i3);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final S7.U b(int i3) {
        int i9;
        int i10;
        java.lang.Object[] objArr;
        int i11;
        java.lang.Comparable comparable;
        java.lang.Comparable comparable2;
        java.lang.Comparable comparable3;
        java.lang.Object obj;
        java.lang.Object[] objArr2 = this.f10938a;
        kotlin.jvm.internal.m.b(objArr2);
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10937b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i3 < atomicIntegerFieldUpdater.get(this)) {
            d(i3, atomicIntegerFieldUpdater.get(this));
            int i12 = (i3 - 1) / 2;
            if (i3 > 0) {
                S7.U u6 = objArr2[i3];
                kotlin.jvm.internal.m.b(u6);
                java.lang.Object obj2 = objArr2[i12];
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
        S7.U u7 = objArr2[atomicIntegerFieldUpdater.get(this)];
        kotlin.jvm.internal.m.b(u7);
        u7.c(null);
        u7.f9557i = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return u7;
    }

    public final void c(int i3) {
        while (i3 > 0) {
            S7.U[] uArr = this.f10938a;
            kotlin.jvm.internal.m.b(uArr);
            int i9 = (i3 - 1) / 2;
            S7.U u6 = uArr[i9];
            kotlin.jvm.internal.m.b(u6);
            S7.U u7 = uArr[i3];
            kotlin.jvm.internal.m.b(u7);
            if (u6.compareTo(u7) <= 0) {
                return;
            }
            d(i3, i9);
            i3 = i9;
        }
    }

    public final void d(int i3, int i9) {
        S7.U[] uArr = this.f10938a;
        kotlin.jvm.internal.m.b(uArr);
        S7.U u6 = uArr[i9];
        kotlin.jvm.internal.m.b(u6);
        S7.U u7 = uArr[i3];
        kotlin.jvm.internal.m.b(u7);
        uArr[i3] = u6;
        uArr[i9] = u7;
        u6.f9557i = i3;
        u7.f9557i = i9;
    }
}
