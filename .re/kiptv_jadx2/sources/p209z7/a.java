package p209z7;

import O7.x;
import kotlin.jvm.internal.m;
import p071h7.b;
import p101l7.c;
import p101l7.d;
import p110m7.C2635h;
import p110m7.C2641n;

public final class a extends p195x7.a {

    public static final a f32949m;

    static {
        C2635h c2635h = new C2635h();
        b.a(c2635h);
        C2641n packageFqName = b.f22559a;
        m.d(packageFqName, "packageFqName");
        C2641n constructorAnnotation = b.f22561c;
        m.d(constructorAnnotation, "constructorAnnotation");
        C2641n classAnnotation = b.f22560b;
        m.d(classAnnotation, "classAnnotation");
        C2641n functionAnnotation = b.f22562d;
        m.d(functionAnnotation, "functionAnnotation");
        C2641n propertyAnnotation = b.f22563e;
        m.d(propertyAnnotation, "propertyAnnotation");
        C2641n propertyGetterAnnotation = b.f22564f;
        m.d(propertyGetterAnnotation, "propertyGetterAnnotation");
        C2641n propertySetterAnnotation = b.g;
        m.d(propertySetterAnnotation, "propertySetterAnnotation");
        C2641n enumEntryAnnotation = b.f22566i;
        m.d(enumEntryAnnotation, "enumEntryAnnotation");
        C2641n compileTimeValue = b.f22565h;
        m.d(compileTimeValue, "compileTimeValue");
        C2641n parameterAnnotation = b.j;
        m.d(parameterAnnotation, "parameterAnnotation");
        C2641n typeAnnotation = b.f22567k;
        m.d(typeAnnotation, "typeAnnotation");
        C2641n typeParameterAnnotation = b.f22568l;
        m.d(typeParameterAnnotation, "typeParameterAnnotation");
        f32949m = new a(c2635h, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public static String a(c fqName) {
        String strB;
        m.e(fqName, "fqName");
        StringBuilder sb = new StringBuilder();
        d dVar = fqName.f24829a;
        sb.append(x.v0(dVar.f24832a, '.', '/'));
        sb.append('/');
        if (dVar.c()) {
            strB = "default-package";
        } else {
            strB = dVar.f().b();
            m.d(strB, "asString(...)");
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
