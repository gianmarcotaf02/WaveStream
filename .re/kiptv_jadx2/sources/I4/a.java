package I4;

public final class a {

    public static final a f4605h;

    public static final a f4606i;
    public static final a j;

    public static final a f4607k;

    public static final a f4608l;

    public static final a f4609m;

    public static final a f4610n;

    public static final a[] f4611o;

    static {
        a aVar = new a("ERROR_CORRECTION", 0);
        f4605h = aVar;
        a aVar2 = new a("CHARACTER_SET", 1);
        f4606i = aVar2;
        a aVar3 = new a("DATA_MATRIX_SHAPE", 2);
        a aVar4 = new a("DATA_MATRIX_COMPACT", 3);
        a aVar5 = new a("MIN_SIZE", 4);
        a aVar6 = new a("MAX_SIZE", 5);
        a aVar7 = new a("MARGIN", 6);
        j = aVar7;
        a aVar8 = new a("PDF417_COMPACT", 7);
        a aVar9 = new a("PDF417_COMPACTION", 8);
        a aVar10 = new a("PDF417_DIMENSIONS", 9);
        a aVar11 = new a("PDF417_AUTO_ECI", 10);
        a aVar12 = new a("AZTEC_LAYERS", 11);
        a aVar13 = new a("QR_VERSION", 12);
        f4607k = aVar13;
        a aVar14 = new a("QR_MASK_PATTERN", 13);
        f4608l = aVar14;
        a aVar15 = new a("QR_COMPACT", 14);
        f4609m = aVar15;
        a aVar16 = new a("GS1_FORMAT", 15);
        f4610n = aVar16;
        f4611o = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, new a("FORCE_CODE_SET", 16), new a("FORCE_C40", 17), new a("CODE128_COMPACT", 18)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4611o.clone();
    }
}
