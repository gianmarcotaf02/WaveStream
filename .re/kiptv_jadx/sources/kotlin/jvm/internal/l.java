package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object[] f24551a = new java.lang.Object[0];

    public static final java.lang.Object[] a(java.util.Collection collection) {
        kotlin.jvm.internal.m.e(collection, "collection");
        int size = collection.size();
        java.lang.Object[] objArr = f24551a;
        if (size == 0) {
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        java.lang.Object[] objArrCopyOf = new java.lang.Object[size];
        int i3 = 0;
        while (true) {
            int i9 = i3 + 1;
            objArrCopyOf[i3] = it.next();
            if (i9 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i10 = ((i9 * 3) + 1) >>> 1;
                if (i10 <= i9) {
                    i10 = 2147483645;
                    if (i9 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i10);
                kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i9);
                kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i3 = i9;
        }
    }

    public static final java.lang.Object[] b(java.util.Collection collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArrCopyOf;
        kotlin.jvm.internal.m.e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i3 = 0;
        if (size != 0) {
            java.util.Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
                    kotlin.jvm.internal.m.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (java.lang.Object[]) objNewInstance;
                }
                while (true) {
                    int i9 = i3 + 1;
                    objArrCopyOf[i3] = it.next();
                    if (i9 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i10 = ((i9 * 3) + 1) >>> 1;
                        if (i10 <= i9) {
                            i10 = 2147483645;
                            if (i9 >= 2147483645) {
                                throw new java.lang.OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i10);
                        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i9] = null;
                            return objArr;
                        }
                        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i9);
                        kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i3 = i9;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
