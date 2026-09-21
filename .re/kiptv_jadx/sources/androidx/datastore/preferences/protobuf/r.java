package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.r f16244i;
    public static final androidx.datastore.preferences.protobuf.r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.r[] f16245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ androidx.datastore.preferences.protobuf.r[] f16246l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16247h;

    /* JADX INFO: Fake field, exist only in values array */
    androidx.datastore.preferences.protobuf.r EF0;

    static {
        androidx.datastore.preferences.protobuf.A a2 = androidx.datastore.preferences.protobuf.A.DOUBLE;
        androidx.datastore.preferences.protobuf.r rVar = new androidx.datastore.preferences.protobuf.r("DOUBLE", 0, 0, 1, a2);
        androidx.datastore.preferences.protobuf.A a9 = androidx.datastore.preferences.protobuf.A.FLOAT;
        androidx.datastore.preferences.protobuf.r rVar2 = new androidx.datastore.preferences.protobuf.r("FLOAT", 1, 1, 1, a9);
        androidx.datastore.preferences.protobuf.A a10 = androidx.datastore.preferences.protobuf.A.LONG;
        androidx.datastore.preferences.protobuf.r rVar3 = new androidx.datastore.preferences.protobuf.r("INT64", 2, 2, 1, a10);
        androidx.datastore.preferences.protobuf.r rVar4 = new androidx.datastore.preferences.protobuf.r("UINT64", 3, 3, 1, a10);
        androidx.datastore.preferences.protobuf.A a11 = androidx.datastore.preferences.protobuf.A.INT;
        androidx.datastore.preferences.protobuf.r rVar5 = new androidx.datastore.preferences.protobuf.r("INT32", 4, 4, 1, a11);
        androidx.datastore.preferences.protobuf.r rVar6 = new androidx.datastore.preferences.protobuf.r("FIXED64", 5, 5, 1, a10);
        androidx.datastore.preferences.protobuf.r rVar7 = new androidx.datastore.preferences.protobuf.r("FIXED32", 6, 6, 1, a11);
        androidx.datastore.preferences.protobuf.A a12 = androidx.datastore.preferences.protobuf.A.BOOLEAN;
        androidx.datastore.preferences.protobuf.r rVar8 = new androidx.datastore.preferences.protobuf.r("BOOL", 7, 7, 1, a12);
        androidx.datastore.preferences.protobuf.A a13 = androidx.datastore.preferences.protobuf.A.STRING;
        androidx.datastore.preferences.protobuf.r rVar9 = new androidx.datastore.preferences.protobuf.r("STRING", 8, 8, 1, a13);
        androidx.datastore.preferences.protobuf.A a14 = androidx.datastore.preferences.protobuf.A.MESSAGE;
        androidx.datastore.preferences.protobuf.r rVar10 = new androidx.datastore.preferences.protobuf.r("MESSAGE", 9, 9, 1, a14);
        androidx.datastore.preferences.protobuf.A a15 = androidx.datastore.preferences.protobuf.A.BYTE_STRING;
        androidx.datastore.preferences.protobuf.r rVar11 = new androidx.datastore.preferences.protobuf.r("BYTES", 10, 10, 1, a15);
        androidx.datastore.preferences.protobuf.r rVar12 = new androidx.datastore.preferences.protobuf.r("UINT32", 11, 11, 1, a11);
        androidx.datastore.preferences.protobuf.A a16 = androidx.datastore.preferences.protobuf.A.ENUM;
        androidx.datastore.preferences.protobuf.r rVar13 = new androidx.datastore.preferences.protobuf.r("ENUM", 12, 12, 1, a16);
        androidx.datastore.preferences.protobuf.r rVar14 = new androidx.datastore.preferences.protobuf.r("SFIXED32", 13, 13, 1, a11);
        androidx.datastore.preferences.protobuf.r rVar15 = new androidx.datastore.preferences.protobuf.r("SFIXED64", 14, 14, 1, a10);
        androidx.datastore.preferences.protobuf.r rVar16 = new androidx.datastore.preferences.protobuf.r("SINT32", 15, 15, 1, a11);
        androidx.datastore.preferences.protobuf.r rVar17 = new androidx.datastore.preferences.protobuf.r("SINT64", 16, 16, 1, a10);
        androidx.datastore.preferences.protobuf.r rVar18 = new androidx.datastore.preferences.protobuf.r("GROUP", 17, 17, 1, a14);
        androidx.datastore.preferences.protobuf.r rVar19 = new androidx.datastore.preferences.protobuf.r("DOUBLE_LIST", 18, 18, 2, a2);
        androidx.datastore.preferences.protobuf.r rVar20 = new androidx.datastore.preferences.protobuf.r("FLOAT_LIST", 19, 19, 2, a9);
        androidx.datastore.preferences.protobuf.r rVar21 = new androidx.datastore.preferences.protobuf.r("INT64_LIST", 20, 20, 2, a10);
        androidx.datastore.preferences.protobuf.r rVar22 = new androidx.datastore.preferences.protobuf.r("UINT64_LIST", 21, 21, 2, a10);
        androidx.datastore.preferences.protobuf.r rVar23 = new androidx.datastore.preferences.protobuf.r("INT32_LIST", 22, 22, 2, a11);
        androidx.datastore.preferences.protobuf.r rVar24 = new androidx.datastore.preferences.protobuf.r("FIXED64_LIST", 23, 23, 2, a10);
        androidx.datastore.preferences.protobuf.r rVar25 = new androidx.datastore.preferences.protobuf.r("FIXED32_LIST", 24, 24, 2, a11);
        androidx.datastore.preferences.protobuf.r rVar26 = new androidx.datastore.preferences.protobuf.r("BOOL_LIST", 25, 25, 2, a12);
        androidx.datastore.preferences.protobuf.r rVar27 = new androidx.datastore.preferences.protobuf.r("STRING_LIST", 26, 26, 2, a13);
        androidx.datastore.preferences.protobuf.r rVar28 = new androidx.datastore.preferences.protobuf.r("MESSAGE_LIST", 27, 27, 2, a14);
        androidx.datastore.preferences.protobuf.r rVar29 = new androidx.datastore.preferences.protobuf.r("BYTES_LIST", 28, 28, 2, a15);
        androidx.datastore.preferences.protobuf.r rVar30 = new androidx.datastore.preferences.protobuf.r("UINT32_LIST", 29, 29, 2, a11);
        androidx.datastore.preferences.protobuf.r rVar31 = new androidx.datastore.preferences.protobuf.r("ENUM_LIST", 30, 30, 2, a16);
        androidx.datastore.preferences.protobuf.r rVar32 = new androidx.datastore.preferences.protobuf.r("SFIXED32_LIST", 31, 31, 2, a11);
        androidx.datastore.preferences.protobuf.r rVar33 = new androidx.datastore.preferences.protobuf.r("SFIXED64_LIST", 32, 32, 2, a10);
        androidx.datastore.preferences.protobuf.r rVar34 = new androidx.datastore.preferences.protobuf.r("SINT32_LIST", 33, 33, 2, a11);
        androidx.datastore.preferences.protobuf.r rVar35 = new androidx.datastore.preferences.protobuf.r("SINT64_LIST", 34, 34, 2, a10);
        androidx.datastore.preferences.protobuf.r rVar36 = new androidx.datastore.preferences.protobuf.r("DOUBLE_LIST_PACKED", 35, 35, 3, a2);
        f16244i = rVar36;
        androidx.datastore.preferences.protobuf.r rVar37 = new androidx.datastore.preferences.protobuf.r("FLOAT_LIST_PACKED", 36, 36, 3, a9);
        androidx.datastore.preferences.protobuf.r rVar38 = new androidx.datastore.preferences.protobuf.r("INT64_LIST_PACKED", 37, 37, 3, a10);
        androidx.datastore.preferences.protobuf.r rVar39 = new androidx.datastore.preferences.protobuf.r("UINT64_LIST_PACKED", 38, 38, 3, a10);
        androidx.datastore.preferences.protobuf.r rVar40 = new androidx.datastore.preferences.protobuf.r("INT32_LIST_PACKED", 39, 39, 3, a11);
        androidx.datastore.preferences.protobuf.r rVar41 = new androidx.datastore.preferences.protobuf.r("FIXED64_LIST_PACKED", 40, 40, 3, a10);
        androidx.datastore.preferences.protobuf.r rVar42 = new androidx.datastore.preferences.protobuf.r("FIXED32_LIST_PACKED", 41, 41, 3, a11);
        androidx.datastore.preferences.protobuf.r rVar43 = new androidx.datastore.preferences.protobuf.r("BOOL_LIST_PACKED", 42, 42, 3, a12);
        androidx.datastore.preferences.protobuf.r rVar44 = new androidx.datastore.preferences.protobuf.r("UINT32_LIST_PACKED", 43, 43, 3, a11);
        androidx.datastore.preferences.protobuf.r rVar45 = new androidx.datastore.preferences.protobuf.r("ENUM_LIST_PACKED", 44, 44, 3, a16);
        androidx.datastore.preferences.protobuf.r rVar46 = new androidx.datastore.preferences.protobuf.r("SFIXED32_LIST_PACKED", 45, 45, 3, a11);
        androidx.datastore.preferences.protobuf.r rVar47 = new androidx.datastore.preferences.protobuf.r("SFIXED64_LIST_PACKED", 46, 46, 3, a10);
        androidx.datastore.preferences.protobuf.r rVar48 = new androidx.datastore.preferences.protobuf.r("SINT32_LIST_PACKED", 47, 47, 3, a11);
        androidx.datastore.preferences.protobuf.r rVar49 = new androidx.datastore.preferences.protobuf.r("SINT64_LIST_PACKED", 48, 48, 3, a10);
        j = rVar49;
        f16246l = new androidx.datastore.preferences.protobuf.r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, rVar15, rVar16, rVar17, rVar18, rVar19, rVar20, rVar21, rVar22, rVar23, rVar24, rVar25, rVar26, rVar27, rVar28, rVar29, rVar30, rVar31, rVar32, rVar33, rVar34, rVar35, rVar36, rVar37, rVar38, rVar39, rVar40, rVar41, rVar42, rVar43, rVar44, rVar45, rVar46, rVar47, rVar48, rVar49, new androidx.datastore.preferences.protobuf.r("GROUP_LIST", 49, 49, 2, a14), new androidx.datastore.preferences.protobuf.r("MAP", 50, 50, 4, androidx.datastore.preferences.protobuf.A.VOID)};
        androidx.datastore.preferences.protobuf.r[] rVarArrValues = values();
        f16245k = new androidx.datastore.preferences.protobuf.r[rVarArrValues.length];
        for (androidx.datastore.preferences.protobuf.r rVar50 : rVarArrValues) {
            f16245k[rVar50.f16247h] = rVar50;
        }
    }

    public r(java.lang.String str, int i3, int i9, int i10, androidx.datastore.preferences.protobuf.A a2) {
        super(str, i3);
        this.f16247h = i9;
        int iC = Z.AbstractC1149h0.c(i10);
        if (iC == 1 || iC == 3) {
            a2.getClass();
        }
        if (i10 == 1) {
            a2.ordinal();
        }
    }

    public static androidx.datastore.preferences.protobuf.r valueOf(java.lang.String str) {
        return (androidx.datastore.preferences.protobuf.r) java.lang.Enum.valueOf(androidx.datastore.preferences.protobuf.r.class, str);
    }

    public static androidx.datastore.preferences.protobuf.r[] values() {
        return (androidx.datastore.preferences.protobuf.r[]) f16246l.clone();
    }
}
