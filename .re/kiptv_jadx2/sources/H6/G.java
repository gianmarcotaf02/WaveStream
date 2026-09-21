package H6;

import N6.AbstractC0702p;
import N6.InterfaceC0689c;
import N6.InterfaceC0697k;
import T6.AbstractC0926d;
import androidx.media3.container.MdtaMetadataEntry;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.InterfaceC2539d;

public abstract class G implements InterfaceC2539d {

    public static final O7.o f4370h = new O7.o("<v#(\\d+)>");

    public static void e(ArrayList arrayList, ArrayList arrayList2, boolean z6) {
        boolean zA = kotlin.jvm.internal.m.a(p078i6.o.s1(arrayList2), AbstractC2541f.class);
        List listSubList = arrayList2;
        if (zA) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(listSubList);
        int size = (listSubList.size() + 31) / 32;
        for (int i3 = 0; i3 < size; i3++) {
            Class TYPE = Integer.TYPE;
            kotlin.jvm.internal.m.d(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        arrayList.add(z6 ? AbstractC2541f.class : Object.class);
    }

    public static Method r(Class cls, String str, Class[] clsArr, Class cls2, boolean z6) {
        Class clsV;
        Method methodR;
        if (z6) {
            clsArr[0] = cls;
        }
        Method methodV = v(cls, str, clsArr, cls2);
        if (methodV != null) {
            return methodV;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodR = r(superclass, str, clsArr, cls2, z6)) != null) {
            return methodR;
        }
        D1.X xH = kotlin.jvm.internal.m.h(cls.getInterfaces());
        while (xH.hasNext()) {
            Class cls3 = (Class) xH.next();
            kotlin.jvm.internal.m.b(cls3);
            Method methodR2 = r(cls3, str, clsArr, cls2, z6);
            if (methodR2 != null) {
                return methodR2;
            }
            if (z6 && (clsV = O7.r.V(AbstractC0926d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodV2 = v(clsV, str, clsArr, cls2);
                if (methodV2 != null) {
                    return methodV2;
                }
            }
        }
        return null;
    }

    public static Constructor u(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method v(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (kotlin.jvm.internal.m.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.m.d(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (kotlin.jvm.internal.m.a(method.getName(), str) && kotlin.jvm.internal.m.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method j(String name, String desc, boolean z6) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z6) {
            arrayList.add(b());
        }
        S.p pVarS = s(desc, true);
        e(arrayList, (ArrayList) pVarS.f9153i, false);
        Class clsP = p();
        String strConcat = name.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) pVarS.j;
        kotlin.jvm.internal.m.b(cls);
        return r(clsP, strConcat, clsArr, cls, z6);
    }

    public final Method k(String name, String desc) {
        Method methodR;
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        S.p pVarS = s(desc, true);
        Class[] clsArr = (Class[]) ((ArrayList) pVarS.f9153i).toArray(new Class[0]);
        Class cls = (Class) pVarS.j;
        kotlin.jvm.internal.m.b(cls);
        Method methodR2 = r(p(), name, clsArr, cls, false);
        if (methodR2 != null) {
            return methodR2;
        }
        if (!p().isInterface() || (methodR = r(Object.class, name, clsArr, cls, false)) == null) {
            return null;
        }
        return methodR;
    }

    public abstract Collection l();

    public abstract Collection m(p101l7.e eVar);

    public abstract N6.N n(int i3);

    public final List o(p180v7.o scope, E e6) {
        AbstractC0428s abstractC0428s;
        kotlin.jvm.internal.m.e(scope, "scope");
        F f9 = new F(this);
        Collection<InterfaceC0697k> collectionV = AbstractC1909d.V(scope, null, 3);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0697k interfaceC0697k : collectionV) {
            if (interfaceC0697k instanceof InterfaceC0689c) {
                InterfaceC0689c interfaceC0689c = (InterfaceC0689c) interfaceC0697k;
                if (kotlin.jvm.internal.m.a(interfaceC0689c.getVisibility(), AbstractC0702p.f7408h)) {
                    abstractC0428s = null;
                } else if ((interfaceC0689c.c() != 2) == (e6 == E.f4368h)) {
                    abstractC0428s = (AbstractC0428s) interfaceC0697k.B(f9, p070h6.A.f22523a);
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

    public Class p() {
        Class clsB = b();
        List list = AbstractC0926d.f9849a;
        kotlin.jvm.internal.m.e(clsB, "<this>");
        Class cls = (Class) AbstractC0926d.f9851c.get(clsB);
        return cls == null ? b() : cls;
    }

    public abstract Collection q(p101l7.e eVar);

    public final S.p s(String str, boolean z6) {
        int iK0;
        ArrayList arrayList = new ArrayList();
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
                    throw new t0("Unknown type prefix in the method signature: ".concat(str));
                }
                iK0 = O7.q.K0(str, ';', i3, 4) + 1;
            }
            arrayList.add(t(i3, iK0, str));
            i3 = iK0;
        }
        return new S.p(arrayList, z6 ? t(i3 + 1, str.length(), str) : null, 18);
    }

    public final Class t(int i3, int i9, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i3);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = AbstractC0926d.d(b());
            String strSubstring = str.substring(i3 + 1, i9 - 1);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderD.loadClass(O7.x.v0(strSubstring, '/', '.'));
            kotlin.jvm.internal.m.d(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            kotlin.jvm.internal.m.d(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            Class clsT = t(i3 + 1, i9, str);
            p101l7.c cVar = B0.f4363a;
            kotlin.jvm.internal.m.e(clsT, "<this>");
            return Array.newInstance((Class<?>) clsT, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case MdtaMetadataEntry.TYPE_INDICATOR_INT32:
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new t0("Unknown type prefix in the method signature: ".concat(str));
        }
    }
}
