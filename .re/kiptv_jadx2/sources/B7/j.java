package B7;

import java.util.concurrent.ConcurrentHashMap;

public class j implements p194x6.j {

    public final int f833h;

    public final Object f834i;
    public final Object j;

    public final Object f835k;

    public j(Object obj, Object obj2, Object obj3, int i3) {
        this.f833h = i3;
        this.f834i = obj;
        this.j = obj2;
        this.f835k = obj3;
    }

    public static void a(int i3) {
        String str = (i3 == 3 || i3 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i3 == 3 || i3 == 4) ? 2 : 3];
        if (i3 == 1) {
            objArr[0] = "map";
        } else if (i3 == 2) {
            objArr[0] = "compute";
        } else if (i3 == 3 || i3 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i3 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i3 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i3 != 3 && i3 != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i3 != 3 && i3 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public AssertionError c(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + k.f837i + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((m) this.f834i));
        m.e(assertionError);
        return assertionError;
    }

    public AssertionError d(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((m) this.f834i));
        m.e(assertionError);
        return assertionError;
    }

    public AssertionError f(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((m) this.f834i), th);
        m.e(assertionError);
        return assertionError;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v34 java.lang.Object, still in use, count: 2, list:
          (r1v34 java.lang.Object) from 0x00d7: PHI (r1 I:??) = (r1v30 java.lang.Object), (r1v34 java.lang.Object) binds: [B:23:0x00d6, B:151:0x00d7] A[DONT_GENERATE, DONT_INLINE]
          (r1v34 java.lang.Object) from 0x00cb: CHECK_CAST (com.kiptv.core.model.HomeSectionConfig) (r1v34 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override
    public java.lang.Object invoke(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B7.j.invoke(java.lang.Object):java.lang.Object");
    }

    public j(m mVar, ConcurrentHashMap concurrentHashMap, p194x6.j jVar) {
        this.f833h = 0;
        if (mVar == null) {
            a(0);
            throw null;
        }
        this.f834i = mVar;
        this.j = concurrentHashMap;
        this.f835k = jVar;
    }
}
