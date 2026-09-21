package p079i7;

import io.sentry.protocol.ViewHierarchyNode;
import p030d0.J;
import p062g7.A;
import p062g7.EnumC2162i;
import p062g7.EnumC2178z;
import p062g7.f0;

public abstract class d {

    public static final b f23216A;

    public static final b f23217B;

    public static final b f23218C;

    public static final b f23219D;

    public static final b f23220E;

    public static final b f23221F;

    public static final b f23222G;
    public static final b H;

    public static final b f23223I;

    public static final b f23224J;

    public static final b f23225K;

    public static final b f23226L;

    public static final b f23227M;

    public static final b f23228N;

    public static final b f23229a;

    public static final b f23230b;

    public static final b f23231c;

    public static final c f23232d;

    public static final c f23233e;

    public static final c f23234f;
    public static final b g;

    public static final b f23235h;

    public static final b f23236i;
    public static final b j;

    public static final b f23237k;

    public static final b f23238l;

    public static final b f23239m;

    public static final b f23240n;

    public static final b f23241o;

    public static final c f23242p;

    public static final b f23243q;

    public static final b f23244r;

    public static final b f23245s;

    public static final b f23246t;

    public static final b f23247u;

    public static final b f23248v;

    public static final b f23249w;

    public static final b f23250x;
    public static final b y;

    public static final b f23251z;

    static {
        b bVarB = J.b();
        f23229a = bVarB;
        f23230b = J.a(bVarB);
        b bVarB2 = J.b();
        f23231c = bVarB2;
        f0[] f0VarArrValues = f0.values();
        int i3 = bVarB2.f21111b + bVarB2.f21112c;
        c cVar = new c(i3, f0VarArrValues);
        f23232d = cVar;
        A[] aArrValues = A.values();
        int i9 = i3 + cVar.f21112c;
        c cVar2 = new c(i9, aArrValues);
        f23233e = cVar2;
        EnumC2162i[] enumC2162iArrValues = EnumC2162i.values();
        int i10 = cVar2.f21112c;
        c cVar3 = new c(i9 + i10, enumC2162iArrValues);
        f23234f = cVar3;
        b bVarA = J.a(cVar3);
        g = bVarA;
        b bVarA2 = J.a(bVarA);
        f23235h = bVarA2;
        b bVarA3 = J.a(bVarA2);
        f23236i = bVarA3;
        b bVarA4 = J.a(bVarA3);
        j = bVarA4;
        b bVarA5 = J.a(bVarA4);
        f23237k = bVarA5;
        b bVarA6 = J.a(bVarA5);
        f23238l = bVarA6;
        f23239m = J.a(bVarA6);
        b bVarA7 = J.a(cVar);
        f23240n = bVarA7;
        f23241o = J.a(bVarA7);
        c cVar4 = new c(i9 + i10, EnumC2178z.values());
        f23242p = cVar4;
        b bVarA8 = J.a(cVar4);
        f23243q = bVarA8;
        b bVarA9 = J.a(bVarA8);
        f23244r = bVarA9;
        b bVarA10 = J.a(bVarA9);
        f23245s = bVarA10;
        b bVarA11 = J.a(bVarA10);
        f23246t = bVarA11;
        b bVarA12 = J.a(bVarA11);
        f23247u = bVarA12;
        b bVarA13 = J.a(bVarA12);
        f23248v = bVarA13;
        b bVarA14 = J.a(bVarA13);
        f23249w = bVarA14;
        f23250x = J.a(bVarA14);
        b bVarA15 = J.a(cVar4);
        y = bVarA15;
        b bVarA16 = J.a(bVarA15);
        f23251z = bVarA16;
        b bVarA17 = J.a(bVarA16);
        f23216A = bVarA17;
        b bVarA18 = J.a(bVarA17);
        f23217B = bVarA18;
        b bVarA19 = J.a(bVarA18);
        f23218C = bVarA19;
        b bVarA20 = J.a(bVarA19);
        f23219D = bVarA20;
        b bVarA21 = J.a(bVarA20);
        f23220E = bVarA21;
        b bVarA22 = J.a(bVarA21);
        f23221F = bVarA22;
        f23222G = J.a(bVarA22);
        b bVarA23 = J.a(bVarB2);
        H = bVarA23;
        b bVarA24 = J.a(bVarA23);
        f23223I = bVarA24;
        f23224J = J.a(bVarA24);
        b bVarA25 = J.a(cVar2);
        f23225K = bVarA25;
        b bVarA26 = J.a(bVarA25);
        f23226L = bVarA26;
        f23227M = J.a(bVarA26);
        f23228N = J.b();
    }

    public static void a(int i3) {
        Object[] objArr = new Object[3];
        if (i3 == 1) {
            objArr[0] = "modality";
        } else if (i3 == 2) {
            objArr[0] = "kind";
        } else if (i3 == 5) {
            objArr[0] = "modality";
        } else if (i3 == 6) {
            objArr[0] = "memberKind";
        } else if (i3 == 8) {
            objArr[0] = "modality";
        } else if (i3 == 9) {
            objArr[0] = "memberKind";
        } else if (i3 != 11) {
            objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i3) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
