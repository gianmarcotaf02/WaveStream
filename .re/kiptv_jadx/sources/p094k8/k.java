package p094k8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p094k8.j f24529a = new p094k8.j(new byte[0], 0, 0, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f24530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceArray f24534f;
    public static final java.util.concurrent.atomic.AtomicReferenceArray g;

    static {
        int iIntValue;
        int i3 = 0;
        int iHighestOneBit = java.lang.Integer.highestOneBit((java.lang.Runtime.getRuntime().availableProcessors() * 2) - 1);
        f24530b = iHighestOneBit;
        int i9 = iHighestOneBit / 2;
        int i10 = i9 >= 1 ? i9 : 1;
        f24531c = i10;
        java.lang.String property = java.lang.System.getProperty("kotlinx.io.pool.size.bytes", kotlin.jvm.internal.m.a(java.lang.System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        kotlin.jvm.internal.m.d(property, "getProperty(...)");
        java.lang.Integer numZ0 = O7.x.z0(property);
        if (numZ0 != null && (iIntValue = numZ0.intValue()) >= 0) {
            i3 = iIntValue;
        }
        f24532d = i3;
        int i11 = i3 / i10;
        if (i11 < 8192) {
            i11 = 8192;
        }
        f24533e = i11;
        f24534f = new java.util.concurrent.atomic.AtomicReferenceArray(iHighestOneBit);
        g = new java.util.concurrent.atomic.AtomicReferenceArray(i10);
    }

    public static final void a(p094k8.j segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        if (segment.f24528f != null || segment.g != null) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        p094k8.p pVar = segment.f24526d;
        if (pVar != null) {
            p094k8.i iVar = (p094k8.i) pVar;
            if (iVar.f24522b != 0) {
                int iDecrementAndGet = p094k8.i.f24521c.decrementAndGet(iVar);
                if (iDecrementAndGet >= 0) {
                    return;
                }
                if (iDecrementAndGet != -1) {
                    throw new java.lang.IllegalStateException(("Shared copies count is negative: " + (iDecrementAndGet + 1)).toString());
                }
                iVar.f24522b = 0;
            }
        }
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = f24534f;
        int id = (int) ((((long) f24530b) - 1) & java.lang.Thread.currentThread().getId());
        segment.f24524b = 0;
        segment.f24527e = true;
        while (true) {
            p094k8.j jVar = (p094k8.j) atomicReferenceArray.get(id);
            p094k8.j jVar2 = f24529a;
            if (jVar != jVar2) {
                int i3 = jVar != null ? jVar.f24525c : 0;
                if (i3 < 65536) {
                    segment.f24528f = jVar;
                    segment.f24525c = i3 + 8192;
                    while (!atomicReferenceArray.compareAndSet(id, jVar, segment)) {
                        if (atomicReferenceArray.get(id) != jVar) {
                        }
                    }
                    return;
                }
                if (f24532d <= 0) {
                    return;
                }
                segment.f24524b = 0;
                segment.f24527e = true;
                int id2 = (int) ((((long) f24531c) - 1) & java.lang.Thread.currentThread().getId());
                java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray2 = g;
                int i9 = 0;
                while (true) {
                    p094k8.j jVar3 = (p094k8.j) atomicReferenceArray2.get(id2);
                    if (jVar3 != jVar2) {
                        int i10 = (jVar3 != null ? jVar3.f24525c : 0) + 8192;
                        if (i10 <= f24533e) {
                            segment.f24528f = jVar3;
                            segment.f24525c = i10;
                            while (!atomicReferenceArray2.compareAndSet(id2, jVar3, segment)) {
                                if (atomicReferenceArray2.get(id2) != jVar3) {
                                }
                            }
                            return;
                        }
                        int i11 = f24531c;
                        if (i9 >= i11) {
                            return;
                        }
                        i9++;
                        id2 = (id2 + 1) & (i11 - 1);
                    }
                }
            }
        }
    }

    public static final p094k8.j b() {
        p094k8.j jVar;
        p094k8.j jVar2;
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = f24534f;
        int id = (int) ((((long) f24530b) - 1) & java.lang.Thread.currentThread().getId());
        do {
            jVar = f24529a;
            jVar2 = (p094k8.j) atomicReferenceArray.getAndSet(id, jVar);
        } while (kotlin.jvm.internal.m.a(jVar2, jVar));
        if (jVar2 != null) {
            atomicReferenceArray.set(id, jVar2.f24528f);
            jVar2.f24528f = null;
            jVar2.f24525c = 0;
            return jVar2;
        }
        atomicReferenceArray.set(id, null);
        if (f24532d <= 0) {
            return new p094k8.j();
        }
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray2 = g;
        int i3 = f24531c;
        int id2 = (int) (java.lang.Thread.currentThread().getId() & (((long) i3) - 1));
        int i9 = 0;
        while (true) {
            p094k8.j jVar3 = (p094k8.j) atomicReferenceArray2.getAndSet(id2, jVar);
            if (!kotlin.jvm.internal.m.a(jVar3, jVar)) {
                if (jVar3 != null) {
                    atomicReferenceArray2.set(id2, jVar3.f24528f);
                    jVar3.f24528f = null;
                    jVar3.f24525c = 0;
                    return jVar3;
                }
                atomicReferenceArray2.set(id2, null);
                if (i9 >= i3) {
                    return new p094k8.j();
                }
                id2 = (id2 + 1) & (i3 - 1);
                i9++;
            }
        }
    }
}
