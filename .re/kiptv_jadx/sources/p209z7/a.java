package p209z7;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends p195x7.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p209z7.a f32949m;

    static {
        p110m7.C2635h c2635h = new p110m7.C2635h();
        p071h7.b.a(c2635h);
        p110m7.C2641n packageFqName = p071h7.b.f22559a;
        kotlin.jvm.internal.m.d(packageFqName, "packageFqName");
        p110m7.C2641n constructorAnnotation = p071h7.b.f22561c;
        kotlin.jvm.internal.m.d(constructorAnnotation, "constructorAnnotation");
        p110m7.C2641n classAnnotation = p071h7.b.f22560b;
        kotlin.jvm.internal.m.d(classAnnotation, "classAnnotation");
        p110m7.C2641n functionAnnotation = p071h7.b.f22562d;
        kotlin.jvm.internal.m.d(functionAnnotation, "functionAnnotation");
        p110m7.C2641n propertyAnnotation = p071h7.b.f22563e;
        kotlin.jvm.internal.m.d(propertyAnnotation, "propertyAnnotation");
        p110m7.C2641n propertyGetterAnnotation = p071h7.b.f22564f;
        kotlin.jvm.internal.m.d(propertyGetterAnnotation, "propertyGetterAnnotation");
        p110m7.C2641n propertySetterAnnotation = p071h7.b.g;
        kotlin.jvm.internal.m.d(propertySetterAnnotation, "propertySetterAnnotation");
        p110m7.C2641n enumEntryAnnotation = p071h7.b.f22566i;
        kotlin.jvm.internal.m.d(enumEntryAnnotation, "enumEntryAnnotation");
        p110m7.C2641n compileTimeValue = p071h7.b.f22565h;
        kotlin.jvm.internal.m.d(compileTimeValue, "compileTimeValue");
        p110m7.C2641n parameterAnnotation = p071h7.b.j;
        kotlin.jvm.internal.m.d(parameterAnnotation, "parameterAnnotation");
        p110m7.C2641n typeAnnotation = p071h7.b.f22567k;
        kotlin.jvm.internal.m.d(typeAnnotation, "typeAnnotation");
        p110m7.C2641n typeParameterAnnotation = p071h7.b.f22568l;
        kotlin.jvm.internal.m.d(typeParameterAnnotation, "typeParameterAnnotation");
        f32949m = new p209z7.a(c2635h, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public static java.lang.String a(p101l7.c fqName) {
        java.lang.String strB;
        kotlin.jvm.internal.m.e(fqName, "fqName");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        p101l7.d dVar = fqName.f24829a;
        sb.append(O7.x.v0(dVar.f24832a, '.', '/'));
        sb.append('/');
        if (dVar.c()) {
            strB = "default-package";
        } else {
            strB = dVar.f().b();
            kotlin.jvm.internal.m.d(strB, "asString(...)");
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
