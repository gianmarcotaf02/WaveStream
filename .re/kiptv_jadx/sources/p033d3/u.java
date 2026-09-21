package p033d3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final android.util.SparseArray f21226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p033d3.u[] f21227i;

    /* JADX INFO: Fake field, exist only in values array */
    p033d3.u EF1;

    static {
        p033d3.u uVar = new p033d3.u("MOBILE", 0);
        p033d3.u uVar2 = new p033d3.u("WIFI", 1);
        p033d3.u uVar3 = new p033d3.u("MOBILE_MMS", 2);
        p033d3.u uVar4 = new p033d3.u("MOBILE_SUPL", 3);
        p033d3.u uVar5 = new p033d3.u("MOBILE_DUN", 4);
        p033d3.u uVar6 = new p033d3.u("MOBILE_HIPRI", 5);
        p033d3.u uVar7 = new p033d3.u("WIMAX", 6);
        p033d3.u uVar8 = new p033d3.u("BLUETOOTH", 7);
        p033d3.u uVar9 = new p033d3.u("DUMMY", 8);
        p033d3.u uVar10 = new p033d3.u("ETHERNET", 9);
        p033d3.u uVar11 = new p033d3.u("MOBILE_FOTA", 10);
        p033d3.u uVar12 = new p033d3.u("MOBILE_IMS", 11);
        p033d3.u uVar13 = new p033d3.u("MOBILE_CBS", 12);
        p033d3.u uVar14 = new p033d3.u("WIFI_P2P", 13);
        p033d3.u uVar15 = new p033d3.u("MOBILE_IA", 14);
        p033d3.u uVar16 = new p033d3.u("MOBILE_EMERGENCY", 15);
        p033d3.u uVar17 = new p033d3.u("PROXY", 16);
        p033d3.u uVar18 = new p033d3.u("VPN", 17);
        p033d3.u uVar19 = new p033d3.u("NONE", 18);
        f21227i = new p033d3.u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19};
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        f21226h = sparseArray;
        sparseArray.put(0, uVar);
        sparseArray.put(1, uVar2);
        sparseArray.put(2, uVar3);
        sparseArray.put(3, uVar4);
        sparseArray.put(4, uVar5);
        sparseArray.put(5, uVar6);
        sparseArray.put(6, uVar7);
        sparseArray.put(7, uVar8);
        sparseArray.put(8, uVar9);
        sparseArray.put(9, uVar10);
        sparseArray.put(10, uVar11);
        sparseArray.put(11, uVar12);
        sparseArray.put(12, uVar13);
        sparseArray.put(13, uVar14);
        sparseArray.put(14, uVar15);
        sparseArray.put(15, uVar16);
        sparseArray.put(16, uVar17);
        sparseArray.put(17, uVar18);
        sparseArray.put(-1, uVar19);
    }

    public static p033d3.u valueOf(java.lang.String str) {
        return (p033d3.u) java.lang.Enum.valueOf(p033d3.u.class, str);
    }

    public static p033d3.u[] values() {
        return (p033d3.u[]) f21227i.clone();
    }
}
