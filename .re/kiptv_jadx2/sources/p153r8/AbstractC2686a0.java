package p153r8;

import B2.a;
import E6.InterfaceC0331d;
import E6.InterfaceC0332e;
import E6.v;
import E6.w;
import O7.x;
import Y6.f;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.android.gms.internal.play_billing.V0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p119n8.b;
import p119n8.c;
import p119n8.d;
import p119n8.i;
import p119n8.j;

public abstract class AbstractC2686a0 {

    public static final SerialDescriptor[] f26939a = new SerialDescriptor[0];

    public static final KSerializer[] f26940b = new KSerializer[0];

    public static final Object f26941c = new Object();

    public static final G a(String str, KSerializer kSerializer) {
        return new G(str, new H(kSerializer));
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        m.e(serialDescriptor, "<this>");
        if (serialDescriptor instanceof InterfaceC2701l) {
            return ((InterfaceC2701l) serialDescriptor).b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.f());
        int iF = serialDescriptor.f();
        for (int i3 = 0; i3 < iF; i3++) {
            hashSet.add(serialDescriptor.g(i3));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f26939a : serialDescriptorArr;
    }

    public static final KSerializer d(InterfaceC0331d interfaceC0331d, KSerializer... args) {
        Object obj;
        KSerializer kSerializer;
        Class<?> cls;
        Object obj2;
        KSerializer kSerializerH;
        Field field;
        m.e(interfaceC0331d, "<this>");
        m.e(args, "args");
        Class clsX = AbstractC1833d1.x(interfaceC0331d);
        KSerializer[] args2 = (KSerializer[]) Arrays.copyOf(args, args.length);
        m.e(args2, "args");
        if (clsX.isEnum() && clsX.getAnnotation(i.class) == null && clsX.getAnnotation(c.class) == null) {
            Object[] enumConstants = clsX.getEnumConstants();
            String canonicalName = clsX.getCanonicalName();
            m.d(canonicalName, "getCanonicalName(...)");
            m.c(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new C2714z(canonicalName, (Enum[]) enumConstants);
        }
        KSerializer[] kSerializerArr = (KSerializer[]) Arrays.copyOf(args2, args2.length);
        d dVar = null;
        try {
            Field declaredField = clsX.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        KSerializer kSerializerH2 = obj == null ? null : h(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerH2 != null) {
            return kSerializerH2;
        }
        String canonicalName2 = clsX.getCanonicalName();
        if (canonicalName2 == null || x.x0(canonicalName2, "java.", false) || x.x0(canonicalName2, "kotlin.", false)) {
            kSerializer = null;
        } else {
            Field[] declaredFields = clsX.getDeclaredFields();
            m.d(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            int i3 = 0;
            boolean z6 = false;
            Field field2 = null;
            while (true) {
                if (i3 >= length) {
                    if (!z6) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i3];
                if (m.a(field3.getName(), "INSTANCE") && m.a(field3.getType(), clsX) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z6) {
                        z6 = true;
                        field2 = field3;
                    }
                }
                i3++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                kSerializer = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = clsX.getMethods();
                m.d(methods, "getMethods(...)");
                int length2 = methods.length;
                int i9 = 0;
                boolean z9 = false;
                Method method = null;
                while (true) {
                    if (i9 >= length2) {
                        if (!z9) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i9];
                    if (m.a(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        m.d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && m.a(method2.getReturnType(), KSerializer.class)) {
                            if (!z9) {
                                z9 = true;
                                method = method2;
                            }
                        }
                    }
                    i9++;
                    method = null;
                    break;
                }
                if (method == null) {
                    kSerializer = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof KSerializer) {
                        kSerializer = (KSerializer) objInvoke;
                    } else {
                        kSerializer = null;
                    }
                }
            }
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(args2, args2.length);
        Class<?>[] declaredClasses = clsX.getDeclaredClasses();
        m.d(declaredClasses, "getDeclaredClasses(...)");
        int length3 = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i10];
            if (cls.getAnnotation(V.class) != null) {
                break;
            }
            i10++;
        }
        if (cls == null) {
            obj2 = null;
        } else {
            try {
                Field declaredField2 = clsX.getDeclaredField(cls.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (kSerializerH = h(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = clsX.getDeclaredClasses();
                m.d(declaredClasses2, "getDeclaredClasses(...)");
                int length4 = declaredClasses2.length;
                Class<?> cls2 = null;
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    if (i11 < length4) {
                        Class<?> cls3 = declaredClasses2[i11];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z10) {
                                z10 = true;
                                cls2 = cls3;
                            }
                        }
                        i11++;
                    } else if (!z10) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                kSerializerH = obj4 instanceof KSerializer ? (KSerializer) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (kSerializerH != null) {
            return kSerializerH;
        }
        if (clsX.getAnnotation(c.class) == null) {
            i iVar = (i) clsX.getAnnotation(i.class);
            if (iVar != null) {
                Class clsWith = iVar.with();
                C c9 = B.f24540a;
                if (c9.b(clsWith).equals(c9.b(d.class))) {
                    dVar = new d(AbstractC1833d1.A(clsX));
                }
            }
        } else {
            dVar = new d(AbstractC1833d1.A(clsX));
        }
        return dVar;
    }

    public static final C2714z e(String str, Enum[] values, String[] strArr, Annotation[][] annotationArr) {
        m.e(values, "values");
        C2713y c2713y = new C2713y(str, values.length);
        int length = values.length;
        int i3 = 0;
        int i9 = 0;
        while (i3 < length) {
            Enum r9 = values[i3];
            int i10 = i9 + 1;
            String strName = (String) p078i6.m.r0(strArr, i9);
            if (strName == null) {
                strName = r9.name();
            }
            c2713y.k(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) p078i6.m.r0(annotationArr, i9);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    m.e(annotation, "annotation");
                    int i11 = c2713y.f26948d;
                    List[] listArr = c2713y.f26950f;
                    List arrayList = listArr[i11];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[c2713y.f26948d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i3++;
            i9 = i10;
        }
        C2714z c2714z = new C2714z(str, values);
        c2714z.f27027c = c2713y;
        return c2714z;
    }

    public static final C2714z f(String str, Enum[] values) {
        m.e(values, "values");
        return new C2714z(str, values);
    }

    public static final int g(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        m.e(serialDescriptor, "<this>");
        m.e(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.a().hashCode() * 31) + Arrays.hashCode(typeParams);
        int iF = serialDescriptor.f();
        int i3 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i9 = iF - 1;
            int i10 = i3 * 31;
            String strA = serialDescriptor.i(serialDescriptor.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i3 = i10 + iHashCode2;
            iF = i9;
        }
        int iF2 = serialDescriptor.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i3) * 31) + iHashCode3;
            }
            int i11 = iF2 - 1;
            int i12 = iHashCode3 * 31;
            V0 v0C = serialDescriptor.i(serialDescriptor.f() - iF2).c();
            iHashCode3 = i12 + (v0C != null ? v0C.hashCode() : 0);
            iF2 = i11;
        }
    }

    public static final KSerializer h(Object obj, KSerializer... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i3 = 0; i3 < length; i3++) {
                    clsArr2[i3] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause == null) {
                throw e6;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e6.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean i(InterfaceC0331d interfaceC0331d) {
        m.e(interfaceC0331d, "<this>");
        return AbstractC1833d1.x(interfaceC0331d).isInterface();
    }

    public static final InterfaceC0331d j(v vVar) {
        m.e(vVar, "<this>");
        InterfaceC0332e interfaceC0332eD = vVar.d();
        if (interfaceC0332eD instanceof InterfaceC0331d) {
            return (InterfaceC0331d) interfaceC0332eD;
        }
        if (!(interfaceC0332eD instanceof w)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + interfaceC0332eD);
        }
        throw new IllegalArgumentException("Captured type parameter " + interfaceC0332eD + " from generic non-reified function. Such functionality cannot be supported because " + interfaceC0332eD + " is erased, either specify serializer explicitly or make calling function inline with reified " + interfaceC0332eD + '.');
    }

    public static final void k(InterfaceC0331d interfaceC0331d) {
        m.e(interfaceC0331d, "<this>");
        String strH = interfaceC0331d.h();
        if (strH == null) {
            strH = "<local class name not available>";
        }
        throw new j(f.h("Serializer for class '", strH, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void l(int i3, int i9, SerialDescriptor descriptor) {
        m.e(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i10 = (~i3) & i9;
        for (int i11 = 0; i11 < 32; i11++) {
            if ((i10 & 1) != 0) {
                arrayList.add(descriptor.g(i11));
            }
            i10 >>>= 1;
        }
        throw new b(descriptor.a(), arrayList);
    }

    public static final void m(InterfaceC0331d baseClass, String str) {
        String string;
        m.e(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.h() + '\'';
        if (str == null) {
            string = a.i('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbO = f.o("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            a.x(sbO, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbO.append(baseClass.h());
            sbO.append("' has to be sealed and '@Serializable'.");
            string = sbO.toString();
        }
        throw new j(string);
    }
}
