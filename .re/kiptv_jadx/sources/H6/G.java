package H6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class G implements kotlin.jvm.internal.InterfaceC2539d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O7.o f4370h = new O7.o("<v#(\\d+)>");

    public static void e(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, boolean z6) {
        boolean zA = kotlin.jvm.internal.m.a(p078i6.o.s1(arrayList2), kotlin.jvm.internal.AbstractC2541f.class);
        java.util.List listSubList = arrayList2;
        if (zA) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(listSubList);
        int size = (listSubList.size() + 31) / 32;
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Class TYPE = java.lang.Integer.TYPE;
            kotlin.jvm.internal.m.d(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        arrayList.add(z6 ? kotlin.jvm.internal.AbstractC2541f.class : java.lang.Object.class);
    }

    public static java.lang.reflect.Method r(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Class cls2, boolean z6) {
        java.lang.Class clsV;
        java.lang.reflect.Method methodR;
        if (z6) {
            clsArr[0] = cls;
        }
        java.lang.reflect.Method methodV = v(cls, str, clsArr, cls2);
        if (methodV != null) {
            return methodV;
        }
        java.lang.Class superclass = cls.getSuperclass();
        if (superclass != null && (methodR = r(superclass, str, clsArr, cls2, z6)) != null) {
            return methodR;
        }
        D1.X xH = kotlin.jvm.internal.m.h(cls.getInterfaces());
        while (xH.hasNext()) {
            java.lang.Class cls3 = (java.lang.Class) xH.next();
            kotlin.jvm.internal.m.b(cls3);
            java.lang.reflect.Method methodR2 = r(cls3, str, clsArr, cls2, z6);
            if (methodR2 != null) {
                return methodR2;
            }
            if (z6 && (clsV = O7.r.V(T6.AbstractC0926d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                java.lang.reflect.Method methodV2 = v(clsV, str, clsArr, cls2);
                if (methodV2 != null) {
                    return methodV2;
                }
            }
        }
        return null;
    }

    public static java.lang.reflect.Constructor u(java.lang.Class cls, java.util.ArrayList arrayList) {
        try {
            java.lang.Class[] clsArr = (java.lang.Class[]) arrayList.toArray(new java.lang.Class[0]);
            return cls.getDeclaredConstructor((java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    public static java.lang.reflect.Method v(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr, java.lang.Class cls2) {
        try {
            java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod(str, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
            if (kotlin.jvm.internal.m.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.m.d(declaredMethods, "getDeclaredMethods(...)");
            for (java.lang.reflect.Method method : declaredMethods) {
                if (kotlin.jvm.internal.m.a(method.getName(), str) && kotlin.jvm.internal.m.a(method.getReturnType(), cls2) && java.util.Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    public final java.lang.reflect.Method j(java.lang.String name, java.lang.String desc, boolean z6) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z6) {
            arrayList.add(b());
        }
        S.p pVarS = s(desc, true);
        e(arrayList, (java.util.ArrayList) pVarS.f9153i, false);
        java.lang.Class clsP = p();
        java.lang.String strConcat = name.concat("$default");
        java.lang.Class[] clsArr = (java.lang.Class[]) arrayList.toArray(new java.lang.Class[0]);
        java.lang.Class cls = (java.lang.Class) pVarS.j;
        kotlin.jvm.internal.m.b(cls);
        return r(clsP, strConcat, clsArr, cls, z6);
    }

    public final java.lang.reflect.Method k(java.lang.String name, java.lang.String desc) {
        java.lang.reflect.Method methodR;
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        S.p pVarS = s(desc, true);
        java.lang.Class[] clsArr = (java.lang.Class[]) ((java.util.ArrayList) pVarS.f9153i).toArray(new java.lang.Class[0]);
        java.lang.Class cls = (java.lang.Class) pVarS.j;
        kotlin.jvm.internal.m.b(cls);
        java.lang.reflect.Method methodR2 = r(p(), name, clsArr, cls, false);
        if (methodR2 != null) {
            return methodR2;
        }
        if (!p().isInterface() || (methodR = r(java.lang.Object.class, name, clsArr, cls, false)) == null) {
            return null;
        }
        return methodR;
    }

    public abstract java.util.Collection l();

    public abstract java.util.Collection m(p101l7.e eVar);

    public abstract N6.N n(int i3);

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    public final java.util.List o(p180v7.o scope, H6.E e6) {
        H6.AbstractC0428s abstractC0428s;
        kotlin.jvm.internal.m.e(scope, "scope");
        H6.F f9 = new H6.F(this);
        java.util.Collection<N6.InterfaceC0697k> collectionV = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.V(scope, null, 3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (N6.InterfaceC0697k interfaceC0697k : collectionV) {
            if (interfaceC0697k instanceof N6.InterfaceC0689c) {
                N6.InterfaceC0689c interfaceC0689c = (N6.InterfaceC0689c) interfaceC0697k;
                if (kotlin.jvm.internal.m.a(interfaceC0689c.getVisibility(), N6.AbstractC0702p.f7408h)) {
                    abstractC0428s = null;
                } else if ((interfaceC0689c.c() != 2) == (e6 == H6.E.f4368h)) {
                    abstractC0428s = (H6.AbstractC0428s) interfaceC0697k.B(f9, p070h6.A.f22523a);
                } else {
                    abstractC0428s = null;
                }
            } else {
                abstractC0428s = null;
            }
            if (abstractC0428s != null) {
                arrayList.add(abstractC0428s);
            }
        }
        return p078i6.o.N1(arrayList);
    }

    public java.lang.Class p() {
        java.lang.Class clsB = b();
        java.util.List list = T6.AbstractC0926d.f9849a;
        kotlin.jvm.internal.m.e(clsB, "<this>");
        java.lang.Class cls = (java.lang.Class) T6.AbstractC0926d.f9851c.get(clsB);
        return cls == null ? b() : cls;
    }

    public abstract java.util.Collection q(p101l7.e eVar);

    public final S.p s(java.lang.String str, boolean z6) {
        int iK0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 1;
        while (str.charAt(i3) != ')') {
            int i9 = i3;
            while (str.charAt(i9) == '[') {
                i9++;
            }
            char cCharAt = str.charAt(i9);
            if (O7.q.C0("VZCBSIFJD", cCharAt)) {
                iK0 = i9 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new H6.t0("Unknown type prefix in the method signature: ".concat(str));
                }
                iK0 = O7.q.K0(str, ';', i3, 4) + 1;
            }
            arrayList.add(t(i3, iK0, str));
            i3 = iK0;
        }
        return new S.p(arrayList, z6 ? t(i3 + 1, str.length(), str) : null, 18);
    }

    public final java.lang.Class t(int i3, int i9, java.lang.String str) throws java.lang.ClassNotFoundException {
        char cCharAt = str.charAt(i3);
        if (cCharAt == 'F') {
            return java.lang.Float.TYPE;
        }
        if (cCharAt == 'L') {
            java.lang.ClassLoader classLoaderD = T6.AbstractC0926d.d(b());
            java.lang.String strSubstring = str.substring(i3 + 1, i9 - 1);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            java.lang.Class<?> clsLoadClass = classLoaderD.loadClass(O7.x.v0(strSubstring, '/', '.'));
            kotlin.jvm.internal.m.d(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return java.lang.Short.TYPE;
        }
        if (cCharAt == 'V') {
            java.lang.Class TYPE = java.lang.Void.TYPE;
            kotlin.jvm.internal.m.d(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return java.lang.Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return java.lang.Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return java.lang.Boolean.TYPE;
        }
        if (cCharAt == '[') {
            java.lang.Class clsT = t(i3 + 1, i9, str);
            p101l7.c cVar = H6.B0.f4363a;
            kotlin.jvm.internal.m.e(clsT, "<this>");
            return java.lang.reflect.Array.newInstance((java.lang.Class<?>) clsT, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return java.lang.Byte.TYPE;
            case androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                return java.lang.Character.TYPE;
            case 'D':
                return java.lang.Double.TYPE;
            default:
                throw new H6.t0("Unknown type prefix in the method signature: ".concat(str));
        }
    }
}
