package p169t7;

/* JADX INFO: loaded from: classes4.dex */
public enum c {
    BOOLEAN(K6.k.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(K6.k.CHAR, "char", "C", "java.lang.Character"),
    BYTE(K6.k.BYTE, io.sentry.profilemeasurements.ProfileMeasurement.UNIT_BYTES, "B", "java.lang.Byte"),
    SHORT(K6.k.SHORT, "short", "S", "java.lang.Short"),
    INT(K6.k.INT, "int", "I", "java.lang.Integer"),
    FLOAT(K6.k.FLOAT, "float", "F", "java.lang.Float"),
    LONG(K6.k.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(K6.k.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final java.util.HashMap f28539t = new java.util.HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final java.util.EnumMap f28540u = new java.util.EnumMap(K6.k.class);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final java.util.HashMap f28541v = new java.util.HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final java.util.HashSet f28542w = new java.util.HashSet();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final java.util.HashMap f28543x = new java.util.HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final K6.k f28544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f28545i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p101l7.c f28546k;

    static {
        for (p169t7.c cVar : values()) {
            f28539t.put(cVar.f28545i, cVar);
            f28540u.put(cVar.d(), cVar);
            f28541v.put(cVar.c(), cVar);
            java.lang.String strReplace = cVar.f28546k.f24829a.f24832a.replace('.', '/');
            f28542w.add(strReplace);
            f28543x.put(strReplace, "(" + cVar.j + ")L" + strReplace + ";");
        }
    }

    c(K6.k kVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (kVar == null) {
            a(8);
            throw null;
        }
        this.f28544h = kVar;
        this.f28545i = str;
        this.j = str2;
        this.f28546k = new p101l7.c(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i3) {
        java.lang.String str;
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
        java.lang.Object[] objArr = new java.lang.Object[i9];
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
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 4 && i3 != 6) {
            switch (i3) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static p169t7.c b(java.lang.String str) {
        p169t7.c cVar = (p169t7.c) f28539t.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new java.lang.AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final java.lang.String c() {
        java.lang.String str = this.j;
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    public final K6.k d() {
        K6.k kVar = this.f28544h;
        if (kVar != null) {
            return kVar;
        }
        a(12);
        throw null;
    }
}
