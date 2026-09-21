package p094k8;

import O7.x;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.m;

public abstract class k {

    public static final j f24529a = new j(new byte[0], 0, 0, null);

    public static final int f24530b;

    public static final int f24531c;

    public static final int f24532d;

    public static final int f24533e;

    public static final AtomicReferenceArray f24534f;
    public static final AtomicReferenceArray g;

    static {
        int iIntValue;
        int i3 = 0;
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f24530b = iHighestOneBit;
        int i9 = iHighestOneBit / 2;
        int i10 = i9 >= 1 ? i9 : 1;
        f24531c = i10;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", m.a(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        m.d(property, "getProperty(...)");
        Integer numZ0 = x.z0(property);
        if (numZ0 != null && (iIntValue = numZ0.intValue()) >= 0) {
            i3 = iIntValue;
        }
        f24532d = i3;
        int i11 = i3 / i10;
        if (i11 < 8192) {
            i11 = 8192;
        }
        f24533e = i11;
        f24534f = new AtomicReferenceArray(iHighestOneBit);
        g = new AtomicReferenceArray(i10);
    }

    public static final void a(j segment) {
        m.e(segment, "segment");
        if (segment.f24528f != null || segment.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        p pVar = segment.f24526d;
        if (pVar != null) {
            i iVar = (i) pVar;
            if (iVar.f24522b != 0) {
                int iDecrementAndGet = i.f24521c.decrementAndGet(iVar);
                if (iDecrementAndGet >= 0) {
                    return;
                }
                if (iDecrementAndGet != -1) {
                    throw new IllegalStateException(("Shared copies count is negative: " + (iDecrementAndGet + 1)).toString());
                }
                iVar.f24522b = 0;
            }
        }
        AtomicReferenceArray atomicReferenceArray = f24534f;
        int id = (int) ((((long) f24530b) - 1) & Thread.currentThread().getId());
        segment.f24524b = 0;
        segment.f24527e = true;
        while (true) {
            j jVar = (j) atomicReferenceArray.get(id);
            j jVar2 = f24529a;
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
                int id2 = (int) ((((long) f24531c) - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = g;
                int i9 = 0;
                while (true) {
                    j jVar3 = (j) atomicReferenceArray2.get(id2);
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

    public static final j b() {
        j jVar;
        j jVar2;
        AtomicReferenceArray atomicReferenceArray = f24534f;
        int id = (int) ((((long) f24530b) - 1) & Thread.currentThread().getId());
        do {
            jVar = f24529a;
            jVar2 = (j) atomicReferenceArray.getAndSet(id, jVar);
        } while (m.a(jVar2, jVar));
        if (jVar2 != null) {
            atomicReferenceArray.set(id, jVar2.f24528f);
            jVar2.f24528f = null;
            jVar2.f24525c = 0;
            return jVar2;
        }
        atomicReferenceArray.set(id, null);
        if (f24532d <= 0) {
            return new j();
        }
        AtomicReferenceArray atomicReferenceArray2 = g;
        int i3 = f24531c;
        int id2 = (int) (Thread.currentThread().getId() & (((long) i3) - 1));
        int i9 = 0;
        while (true) {
            j jVar3 = (j) atomicReferenceArray2.getAndSet(id2, jVar);
            if (!m.a(jVar3, jVar)) {
                if (jVar3 != null) {
                    atomicReferenceArray2.set(id2, jVar3.f24528f);
                    jVar3.f24528f = null;
                    jVar3.f24525c = 0;
                    return jVar3;
                }
                atomicReferenceArray2.set(id2, null);
                if (i9 >= i3) {
                    return new j();
                }
                id2 = (id2 + 1) & (i3 - 1);
                i9++;
            }
        }
    }
}
