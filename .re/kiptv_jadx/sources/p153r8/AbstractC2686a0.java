package p153r8;

/* JADX INFO: renamed from: r8.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2686a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.SerialDescriptor[] f26939a = new kotlinx.serialization.descriptors.SerialDescriptor[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f26940b = new kotlinx.serialization.KSerializer[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f26941c = new java.lang.Object();

    public static final p153r8.G a(java.lang.String str, kotlinx.serialization.KSerializer kSerializer) {
        return new p153r8.G(str, new p153r8.H(kSerializer));
    }

    public static final java.util.Set b(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.m.e(serialDescriptor, "<this>");
        if (serialDescriptor instanceof p153r8.InterfaceC2701l) {
            return ((p153r8.InterfaceC2701l) serialDescriptor).b();
        }
        java.util.HashSet hashSet = new java.util.HashSet(serialDescriptor.f());
        int iF = serialDescriptor.f();
        for (int i3 = 0; i3 < iF; i3++) {
            hashSet.add(serialDescriptor.g(i3));
        }
        return hashSet;
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor[] c(java.util.List list) {
        kotlinx.serialization.descriptors.SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (kotlinx.serialization.descriptors.SerialDescriptor[]) list.toArray(new kotlinx.serialization.descriptors.SerialDescriptor[0])) == null) ? f26939a : serialDescriptorArr;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    public static final kotlinx.serialization.KSerializer d(E6.InterfaceC0331d interfaceC0331d, kotlinx.serialization.KSerializer... args) {
        java.lang.Object obj;
        kotlinx.serialization.KSerializer kSerializer;
        java.lang.Class<?> cls;
        java.lang.Object obj2;
        kotlinx.serialization.KSerializer kSerializerH;
        java.lang.reflect.Field field;
        kotlin.jvm.internal.m.e(interfaceC0331d, "<this>");
        kotlin.jvm.internal.m.e(args, "args");
        java.lang.Class clsX = com.google.android.gms.internal.play_billing.AbstractC1833d1.x(interfaceC0331d);
        kotlinx.serialization.KSerializer[] args2 = (kotlinx.serialization.KSerializer[]) java.util.Arrays.copyOf(args, args.length);
        kotlin.jvm.internal.m.e(args2, "args");
        if (clsX.isEnum() && clsX.getAnnotation(p119n8.i.class) == null && clsX.getAnnotation(p119n8.c.class) == null) {
            java.lang.Object[] enumConstants = clsX.getEnumConstants();
            java.lang.String canonicalName = clsX.getCanonicalName();
            kotlin.jvm.internal.m.d(canonicalName, "getCanonicalName(...)");
            kotlin.jvm.internal.m.c(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new p153r8.C2714z(canonicalName, (java.lang.Enum[]) enumConstants);
        }
        kotlinx.serialization.KSerializer[] kSerializerArr = (kotlinx.serialization.KSerializer[]) java.util.Arrays.copyOf(args2, args2.length);
        p119n8.d dVar = null;
        try {
            java.lang.reflect.Field declaredField = clsX.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (java.lang.Throwable unused) {
            obj = null;
        }
        kotlinx.serialization.KSerializer kSerializerH2 = obj == null ? null : h(obj, (kotlinx.serialization.KSerializer[]) java.util.Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerH2 != null) {
            return kSerializerH2;
        }
        java.lang.String canonicalName2 = clsX.getCanonicalName();
        if (canonicalName2 == null || O7.x.x0(canonicalName2, "java.", false) || O7.x.x0(canonicalName2, "kotlin.", false)) {
            kSerializer = null;
        } else {
            java.lang.reflect.Field[] declaredFields = clsX.getDeclaredFields();
            kotlin.jvm.internal.m.d(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            int i3 = 0;
            boolean z6 = false;
            java.lang.reflect.Field field2 = null;
            while (true) {
                if (i3 >= length) {
                    if (!z6) {
                        break;
                    }
                    break;
                }
                java.lang.reflect.Field field3 = declaredFields[i3];
                if (kotlin.jvm.internal.m.a(field3.getName(), "INSTANCE") && kotlin.jvm.internal.m.a(field3.getType(), clsX) && java.lang.reflect.Modifier.isStatic(field3.getModifiers())) {
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
                java.lang.Object obj3 = field2.get(null);
                java.lang.reflect.Method[] methods = clsX.getMethods();
                kotlin.jvm.internal.m.d(methods, "getMethods(...)");
                int length2 = methods.length;
                int i9 = 0;
                boolean z9 = false;
                java.lang.reflect.Method method = null;
                while (true) {
                    if (i9 >= length2) {
                        if (!z9) {
                            break;
                        }
                        break;
                    }
                    java.lang.reflect.Method method2 = methods[i9];
                    if (kotlin.jvm.internal.m.a(method2.getName(), "serializer")) {
                        java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                        kotlin.jvm.internal.m.d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && kotlin.jvm.internal.m.a(method2.getReturnType(), kotlinx.serialization.KSerializer.class)) {
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
                    java.lang.Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof kotlinx.serialization.KSerializer) {
                        kSerializer = (kotlinx.serialization.KSerializer) objInvoke;
                    } else {
                        kSerializer = null;
                    }
                }
            }
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        kotlinx.serialization.KSerializer[] kSerializerArr2 = (kotlinx.serialization.KSerializer[]) java.util.Arrays.copyOf(args2, args2.length);
        java.lang.Class<?>[] declaredClasses = clsX.getDeclaredClasses();
        kotlin.jvm.internal.m.d(declaredClasses, "getDeclaredClasses(...)");
        int length3 = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length3) {
                cls = null;
                break;
            }
            cls = declaredClasses[i10];
            if (cls.getAnnotation(p153r8.V.class) != null) {
                break;
            }
            i10++;
        }
        if (cls == null) {
            obj2 = null;
        } else {
            try {
                java.lang.reflect.Field declaredField2 = clsX.getDeclaredField(cls.getSimpleName());
                declaredField2.setAccessible(true);
                obj2 = declaredField2.get(null);
            } catch (java.lang.Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (kSerializerH = h(obj2, (kotlinx.serialization.KSerializer[]) java.util.Arrays.copyOf(kSerializerArr2, kSerializerArr2.length))) == null) {
            try {
                java.lang.Class<?>[] declaredClasses2 = clsX.getDeclaredClasses();
                kotlin.jvm.internal.m.d(declaredClasses2, "getDeclaredClasses(...)");
                int length4 = declaredClasses2.length;
                java.lang.Class<?> cls2 = null;
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    if (i11 < length4) {
                        java.lang.Class<?> cls3 = declaredClasses2[i11];
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
                java.lang.Object obj4 = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
                kSerializerH = obj4 instanceof kotlinx.serialization.KSerializer ? (kotlinx.serialization.KSerializer) obj4 : null;
            } catch (java.lang.NoSuchFieldException unused3) {
            }
        }
        if (kSerializerH != null) {
            return kSerializerH;
        }
        if (clsX.getAnnotation(p119n8.c.class) == null) {
            p119n8.i iVar = (p119n8.i) clsX.getAnnotation(p119n8.i.class);
            if (iVar != null) {
                java.lang.Class clsWith = iVar.with();
                kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
                if (c9.b(clsWith).equals(c9.b(p119n8.d.class))) {
                    dVar = new p119n8.d(com.google.android.gms.internal.play_billing.AbstractC1833d1.A(clsX));
                }
            }
        } else {
            dVar = new p119n8.d(com.google.android.gms.internal.play_billing.AbstractC1833d1.A(clsX));
        }
        return dVar;
    }

    public static final p153r8.C2714z e(java.lang.String str, java.lang.Enum[] values, java.lang.String[] strArr, java.lang.annotation.Annotation[][] annotationArr) {
        kotlin.jvm.internal.m.e(values, "values");
        p153r8.C2713y c2713y = new p153r8.C2713y(str, values.length);
        int length = values.length;
        int i3 = 0;
        int i9 = 0;
        while (i3 < length) {
            java.lang.Enum r9 = values[i3];
            int i10 = i9 + 1;
            java.lang.String strName = (java.lang.String) p078i6.m.r0(strArr, i9);
            if (strName == null) {
                strName = r9.name();
            }
            c2713y.k(strName, false);
            java.lang.annotation.Annotation[] annotationArr2 = (java.lang.annotation.Annotation[]) p078i6.m.r0(annotationArr, i9);
            if (annotationArr2 != null) {
                for (java.lang.annotation.Annotation annotation : annotationArr2) {
                    kotlin.jvm.internal.m.e(annotation, "annotation");
                    int i11 = c2713y.f26948d;
                    java.util.List[] listArr = c2713y.f26950f;
                    java.util.List arrayList = listArr[i11];
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList(1);
                        listArr[c2713y.f26948d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i3++;
            i9 = i10;
        }
        p153r8.C2714z c2714z = new p153r8.C2714z(str, values);
        c2714z.f27027c = c2713y;
        return c2714z;
    }

    public static final p153r8.C2714z f(java.lang.String str, java.lang.Enum[] values) {
        kotlin.jvm.internal.m.e(values, "values");
        return new p153r8.C2714z(str, values);
    }

    public static final int g(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor[] typeParams) {
        kotlin.jvm.internal.m.e(serialDescriptor, "<this>");
        kotlin.jvm.internal.m.e(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.a().hashCode() * 31) + java.util.Arrays.hashCode(typeParams);
        int iF = serialDescriptor.f();
        int i3 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i9 = iF - 1;
            int i10 = i3 * 31;
            java.lang.String strA = serialDescriptor.i(serialDescriptor.f() - iF).a();
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
            com.google.android.gms.internal.play_billing.V0 v0C = serialDescriptor.i(serialDescriptor.f() - iF2).c();
            iHashCode3 = i12 + (v0C != null ? v0C.hashCode() : 0);
            iF2 = i11;
        }
    }

    public static final kotlinx.serialization.KSerializer h(java.lang.Object obj, kotlinx.serialization.KSerializer... kSerializerArr) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new java.lang.Class[0];
            } else {
                int length = kSerializerArr.length;
                java.lang.Class[] clsArr2 = new java.lang.Class[length];
                for (int i3 = 0; i3 < length; i3++) {
                    clsArr2[i3] = kotlinx.serialization.KSerializer.class;
                }
                clsArr = clsArr2;
            }
            java.lang.Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, java.util.Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof kotlinx.serialization.KSerializer) {
                return (kotlinx.serialization.KSerializer) objInvoke;
            }
            return null;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        } catch (java.lang.reflect.InvocationTargetException e6) {
            java.lang.Throwable cause = e6.getCause();
            if (cause == null) {
                throw e6;
            }
            java.lang.String message = cause.getMessage();
            if (message == null) {
                message = e6.getMessage();
            }
            throw new java.lang.reflect.InvocationTargetException(cause, message);
        }
    }

    public static final boolean i(E6.InterfaceC0331d interfaceC0331d) {
        kotlin.jvm.internal.m.e(interfaceC0331d, "<this>");
        return com.google.android.gms.internal.play_billing.AbstractC1833d1.x(interfaceC0331d).isInterface();
    }

    public static final E6.InterfaceC0331d j(E6.v vVar) {
        kotlin.jvm.internal.m.e(vVar, "<this>");
        E6.InterfaceC0332e interfaceC0332eD = vVar.d();
        if (interfaceC0332eD instanceof E6.InterfaceC0331d) {
            return (E6.InterfaceC0331d) interfaceC0332eD;
        }
        if (!(interfaceC0332eD instanceof E6.w)) {
            throw new java.lang.IllegalArgumentException("Only KClass supported as classifier, got " + interfaceC0332eD);
        }
        throw new java.lang.IllegalArgumentException("Captured type parameter " + interfaceC0332eD + " from generic non-reified function. Such functionality cannot be supported because " + interfaceC0332eD + " is erased, either specify serializer explicitly or make calling function inline with reified " + interfaceC0332eD + '.');
    }

    public static final void k(E6.InterfaceC0331d interfaceC0331d) {
        kotlin.jvm.internal.m.e(interfaceC0331d, "<this>");
        java.lang.String strH = interfaceC0331d.h();
        if (strH == null) {
            strH = "<local class name not available>";
        }
        throw new p119n8.j(Y6.f.h("Serializer for class '", strH, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final void l(int i3, int i9, kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i10 = (~i3) & i9;
        for (int i11 = 0; i11 < 32; i11++) {
            if ((i10 & 1) != 0) {
                arrayList.add(descriptor.g(i11));
            }
            i10 >>>= 1;
        }
        throw new p119n8.b(descriptor.a(), arrayList);
    }

    public static final void m(E6.InterfaceC0331d baseClass, java.lang.String str) {
        java.lang.String string;
        kotlin.jvm.internal.m.e(baseClass, "baseClass");
        java.lang.String str2 = "in the polymorphic scope of '" + baseClass.h() + '\'';
        if (str == null) {
            string = B2.a.i('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            java.lang.StringBuilder sbO = Y6.f.o("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            B2.a.x(sbO, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbO.append(baseClass.h());
            sbO.append("' has to be sealed and '@Serializable'.");
            string = sbO.toString();
        }
        throw new p119n8.j(string);
    }
}
