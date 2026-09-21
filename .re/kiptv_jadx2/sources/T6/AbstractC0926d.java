package T6;

import E6.InterfaceC0331d;
import H6.InterfaceC0416f;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import io.sentry.profilemeasurements.ProfileMeasurement;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

public abstract class AbstractC0926d {

    public static final List f9849a;

    public static final Map f9850b;

    public static final Map f9851c;

    public static final Map f9852d;

    static {
        int i3 = 0;
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        List<InterfaceC0331d> listB0 = p078i6.p.B0(c9.b(Boolean.TYPE), c9.b(Byte.TYPE), c9.b(Character.TYPE), c9.b(Double.TYPE), c9.b(Float.TYPE), c9.b(Integer.TYPE), c9.b(Long.TYPE), c9.b(Short.TYPE));
        f9849a = listB0;
        ArrayList arrayList = new ArrayList(p078i6.q.I0(listB0, 10));
        for (InterfaceC0331d interfaceC0331d : listB0) {
            arrayList.add(new p070h6.k(AbstractC1833d1.y(interfaceC0331d), AbstractC1833d1.z(interfaceC0331d)));
        }
        f9850b = p078i6.C.X0(arrayList);
        List<InterfaceC0331d> list = f9849a;
        ArrayList arrayList2 = new ArrayList(p078i6.q.I0(list, 10));
        for (InterfaceC0331d interfaceC0331d2 : list) {
            arrayList2.add(new p070h6.k(AbstractC1833d1.z(interfaceC0331d2), AbstractC1833d1.y(interfaceC0331d2)));
        }
        f9851c = p078i6.C.X0(arrayList2);
        List listB1 = p078i6.p.B0(Function0.class, p194x6.j.class, p194x6.m.class, p194x6.n.class, p194x6.o.class, p194x6.p.class, p194x6.q.class, p194x6.r.class, p194x6.s.class, p194x6.t.class, p194x6.a.class, p194x6.b.class, InterfaceC0416f.class, p194x6.c.class, p194x6.d.class, p194x6.e.class, p194x6.f.class, p194x6.g.class, p194x6.h.class, p194x6.i.class, p194x6.k.class, p194x6.l.class, InterfaceC0416f.class);
        ArrayList arrayList3 = new ArrayList(p078i6.q.I0(listB1, 10));
        for (Object obj : listB1) {
            int i9 = i3 + 1;
            if (i3 < 0) {
                p078i6.p.H0();
                throw null;
            }
            arrayList3.add(new p070h6.k((Class) obj, Integer.valueOf(i3)));
            i3 = i9;
        }
        f9852d = p078i6.C.X0(arrayList3);
    }

    public static final p101l7.b a(Class cls) {
        kotlin.jvm.internal.m.e(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            p101l7.c cVar = new p101l7.c(cls.getName());
            return new p101l7.b(cVar.b(), com.google.common.util.concurrent.D.M(cVar.f24829a.f()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return a(declaringClass).d(p101l7.e.e(cls.getSimpleName()));
        }
        p101l7.c cVar2 = new p101l7.c(cls.getName());
        return new p101l7.b(cVar2.b(), cVar2.f24829a.f());
    }

    public static final String b(Class cls) {
        kotlin.jvm.internal.m.e(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return O7.x.v0(cls.getName(), '.', '/');
            }
            return "L" + O7.x.v0(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals(ProfileMeasurement.UNIT_BYTES)) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List c(Type type) {
        kotlin.jvm.internal.m.e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return p078i6.w.f23205h;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return N7.o.s0(new N7.j(N7.o.m0(type, C0925c.f9845i), C0925c.j, N7.s.f7466h));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.m.d(actualTypeArguments, "getActualTypeArguments(...)");
        return p078i6.m.E0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        kotlin.jvm.internal.m.e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.m.d(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }
}
