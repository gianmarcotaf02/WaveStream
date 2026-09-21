package Z1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Z1.b f12631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z1.b f12632i;
    public static final Z1.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Z1.b[] f12633k;

    /* JADX INFO: Fake field, exist only in values array */
    Z1.b EF0;

    static {
        Z1.b bVar = new Z1.b("PENALTY_LOG", 0);
        Z1.b bVar2 = new Z1.b("PENALTY_DEATH", 1);
        Z1.b bVar3 = new Z1.b("DETECT_FRAGMENT_REUSE", 2);
        f12631h = bVar3;
        Z1.b bVar4 = new Z1.b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f12632i = bVar4;
        Z1.b bVar5 = new Z1.b("DETECT_RETAIN_INSTANCE_USAGE", 4);
        Z1.b bVar6 = new Z1.b("DETECT_SET_USER_VISIBLE_HINT", 5);
        Z1.b bVar7 = new Z1.b("DETECT_TARGET_FRAGMENT_USAGE", 6);
        Z1.b bVar8 = new Z1.b("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        j = bVar8;
        f12633k = new Z1.b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
    }

    public static Z1.b valueOf(java.lang.String str) {
        return (Z1.b) java.lang.Enum.valueOf(Z1.b.class, str);
    }

    public static Z1.b[] values() {
        return (Z1.b[]) f12633k.clone();
    }
}
