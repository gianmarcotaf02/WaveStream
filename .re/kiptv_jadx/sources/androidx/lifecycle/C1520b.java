package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1520b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f16336a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f16337b;

    public C1520b(java.util.HashMap map) {
        this.f16337b = map;
        for (java.util.Map.Entry entry : map.entrySet()) {
            androidx.lifecycle.EnumC1532n enumC1532n = (androidx.lifecycle.EnumC1532n) entry.getValue();
            java.util.List arrayList = (java.util.List) this.f16336a.get(enumC1532n);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                this.f16336a.put(enumC1532n, arrayList);
            }
            arrayList.add((androidx.lifecycle.C1521c) entry.getKey());
        }
    }

    public static void a(java.util.List list, androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.EnumC1532n enumC1532n, androidx.lifecycle.InterfaceC1539v interfaceC1539v) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                androidx.lifecycle.C1521c c1521c = (androidx.lifecycle.C1521c) list.get(size);
                c1521c.getClass();
                try {
                    int i3 = c1521c.f16340a;
                    java.lang.reflect.Method method = c1521c.f16341b;
                    if (i3 == 0) {
                        method.invoke(interfaceC1539v, null);
                    } else if (i3 == 1) {
                        method.invoke(interfaceC1539v, interfaceC1540w);
                    } else if (i3 == 2) {
                        method.invoke(interfaceC1539v, interfaceC1540w, enumC1532n);
                    }
                } catch (java.lang.IllegalAccessException e6) {
                    throw new java.lang.RuntimeException(e6);
                } catch (java.lang.reflect.InvocationTargetException e9) {
                    throw new java.lang.RuntimeException("Failed to call observer method", e9.getCause());
                }
            }
        }
    }
}
