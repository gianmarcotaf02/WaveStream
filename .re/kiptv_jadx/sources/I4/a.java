package I4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final I4.a f4605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final I4.a f4606i;
    public static final I4.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final I4.a f4607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final I4.a f4608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final I4.a f4609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I4.a f4610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ I4.a[] f4611o;

    static {
        I4.a aVar = new I4.a("ERROR_CORRECTION", 0);
        f4605h = aVar;
        I4.a aVar2 = new I4.a("CHARACTER_SET", 1);
        f4606i = aVar2;
        I4.a aVar3 = new I4.a("DATA_MATRIX_SHAPE", 2);
        I4.a aVar4 = new I4.a("DATA_MATRIX_COMPACT", 3);
        I4.a aVar5 = new I4.a("MIN_SIZE", 4);
        I4.a aVar6 = new I4.a("MAX_SIZE", 5);
        I4.a aVar7 = new I4.a("MARGIN", 6);
        j = aVar7;
        I4.a aVar8 = new I4.a("PDF417_COMPACT", 7);
        I4.a aVar9 = new I4.a("PDF417_COMPACTION", 8);
        I4.a aVar10 = new I4.a("PDF417_DIMENSIONS", 9);
        I4.a aVar11 = new I4.a("PDF417_AUTO_ECI", 10);
        I4.a aVar12 = new I4.a("AZTEC_LAYERS", 11);
        I4.a aVar13 = new I4.a("QR_VERSION", 12);
        f4607k = aVar13;
        I4.a aVar14 = new I4.a("QR_MASK_PATTERN", 13);
        f4608l = aVar14;
        I4.a aVar15 = new I4.a("QR_COMPACT", 14);
        f4609m = aVar15;
        I4.a aVar16 = new I4.a("GS1_FORMAT", 15);
        f4610n = aVar16;
        f4611o = new I4.a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, new I4.a("FORCE_CODE_SET", 16), new I4.a("FORCE_C40", 17), new I4.a("CODE128_COMPACT", 18)};
    }

    public static I4.a valueOf(java.lang.String str) {
        return (I4.a) java.lang.Enum.valueOf(I4.a.class, str);
    }

    public static I4.a[] values() {
        return (I4.a[]) f4611o.clone();
    }
}
