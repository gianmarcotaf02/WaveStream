package V6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements V6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final V6.c f10357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final V6.c f10358i;
    public static final V6.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final V6.c f10359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final V6.c f10360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final V6.c f10361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final V6.c f10362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final V6.c f10363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ V6.c[] f10364p;

    /* JADX INFO: Fake field, exist only in values array */
    V6.c EF1;

    static {
        V6.c cVar = new V6.c("FROM_IDE", 0);
        V6.c cVar2 = new V6.c("FROM_BACKEND", 1);
        V6.c cVar3 = new V6.c("FROM_TEST", 2);
        V6.c cVar4 = new V6.c("FROM_BUILTINS", 3);
        f10357h = cVar4;
        V6.c cVar5 = new V6.c("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        V6.c cVar6 = new V6.c("WHEN_CHECK_OVERRIDES", 5);
        V6.c cVar7 = new V6.c("FOR_SCRIPT", 6);
        V6.c cVar8 = new V6.c("FROM_REFLECTION", 7);
        f10358i = cVar8;
        V6.c cVar9 = new V6.c("WHEN_RESOLVE_DECLARATION", 8);
        V6.c cVar10 = new V6.c("WHEN_GET_DECLARATION_SCOPE", 9);
        V6.c cVar11 = new V6.c("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        V6.c cVar12 = new V6.c("FOR_ALREADY_TRACKED", 11);
        j = cVar12;
        V6.c cVar13 = new V6.c("WHEN_GET_ALL_DESCRIPTORS", 12);
        f10359k = cVar13;
        V6.c cVar14 = new V6.c("WHEN_TYPING", 13);
        V6.c cVar15 = new V6.c("WHEN_GET_SUPER_MEMBERS", 14);
        f10360l = cVar15;
        V6.c cVar16 = new V6.c("FOR_NON_TRACKED_SCOPE", 15);
        f10361m = cVar16;
        V6.c cVar17 = new V6.c("FROM_SYNTHETIC_SCOPE", 16);
        V6.c cVar18 = new V6.c("FROM_DESERIALIZATION", 17);
        f10362n = cVar18;
        V6.c cVar19 = new V6.c("FROM_JAVA_LOADER", 18);
        f10363o = cVar19;
        V6.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, new V6.c("WHEN_GET_LOCAL_VARIABLE", 19), new V6.c("WHEN_FIND_BY_FQNAME", 20), new V6.c("WHEN_GET_COMPANION_OBJECT", 21), new V6.c("FOR_DEFAULT_IMPORTS", 22)};
        f10364p = cVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(cVarArr);
    }

    public static V6.c valueOf(java.lang.String str) {
        return (V6.c) java.lang.Enum.valueOf(V6.c.class, str);
    }

    public static V6.c[] values() {
        return (V6.c[]) f10364p.clone();
    }
}
