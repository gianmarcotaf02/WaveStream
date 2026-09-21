package p169t7;

import K6.k;
import io.sentry.profilemeasurements.ProfileMeasurement;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

public enum c {
    BOOLEAN(k.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(k.CHAR, "char", "C", "java.lang.Character"),
    BYTE(k.BYTE, ProfileMeasurement.UNIT_BYTES, "B", "java.lang.Byte"),
    SHORT(k.SHORT, "short", "S", "java.lang.Short"),
    INT(k.INT, "int", "I", "java.lang.Integer"),
    FLOAT(k.FLOAT, "float", "F", "java.lang.Float"),
    LONG(k.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(k.DOUBLE, "double", "D", "java.lang.Double");


    public static final HashMap f28539t = new HashMap();

    public static final EnumMap f28540u = new EnumMap(k.class);

    public static final HashMap f28541v = new HashMap();

    public static final HashSet f28542w = new HashSet();

    public static final HashMap f28543x = new HashMap();

    public final k f28544h;

    public final String f28545i;
    public final String j;

    public final p101l7.c f28546k;

    static {
        for (c cVar : values()) {
            f28539t.put(cVar.f28545i, cVar);
            f28540u.put(cVar.d(), cVar);
            f28541v.put(cVar.c(), cVar);
            String strReplace = cVar.f28546k.f24829a.f24832a.replace('.', '/');
            f28542w.add(strReplace);
            f28543x.put(strReplace, "(" + cVar.j + ")L" + strReplace + ";");
        }
    }

    c(k kVar, String str, String str2, String str3) {
        if (kVar == null) {
            a(8);
            throw null;
        }
        this.f28544h = kVar;
        this.f28545i = str;
        this.j = str2;
        this.f28546k = new p101l7.c(str3);
    }

    public static void a(int i3) {
        String str;
        int i9;
        if (i3 != 4 && i3 != 6) {
            switch (i3) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i3 != 4 && i3 != 6) {
            switch (i3) {
                case 12:
                case 13:
                case 14:
                case 15:
                    i9 = 2;
                    break;
                default:
                    i9 = 3;
                    break;
            }
        } else {
            i9 = 2;
        }
        Object[] objArr = new Object[i9];
        switch (i3) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = "type";
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i3 != 4 && i3 != 6) {
            switch (i3) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i3) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i3 != 4 && i3 != 6) {
            switch (i3) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static c b(String str) {
        c cVar = (c) f28539t.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String c() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final k d() {
        k kVar = this.f28544h;
        if (kVar != null) {
            return kVar;
        }
        a(12);
        throw null;
    }
}
