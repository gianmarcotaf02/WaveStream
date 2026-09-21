package Z1;

public final class b {

    public static final b f12631h;

    public static final b f12632i;
    public static final b j;

    public static final b[] f12633k;

    b EF0;

    static {
        b bVar = new b("PENALTY_LOG", 0);
        b bVar2 = new b("PENALTY_DEATH", 1);
        b bVar3 = new b("DETECT_FRAGMENT_REUSE", 2);
        f12631h = bVar3;
        b bVar4 = new b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f12632i = bVar4;
        b bVar5 = new b("DETECT_RETAIN_INSTANCE_USAGE", 4);
        b bVar6 = new b("DETECT_SET_USER_VISIBLE_HINT", 5);
        b bVar7 = new b("DETECT_TARGET_FRAGMENT_USAGE", 6);
        b bVar8 = new b("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        j = bVar8;
        f12633k = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f12633k.clone();
    }
}
