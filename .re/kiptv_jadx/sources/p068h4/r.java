package p068h4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class r implements p068h4.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p068h4.n f22499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p068h4.r[] f22500i;

    static {
        p068h4.n nVar = new p068h4.n();
        f22499h = nVar;
        f22500i = new p068h4.r[]{nVar, new p068h4.r() { // from class: h4.o
            @Override // p068h4.l
            public final boolean apply(java.lang.Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new p068h4.r() { // from class: h4.p
            @Override // p068h4.l
            public final boolean apply(java.lang.Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "Predicates.isNull()";
            }
        }, new p068h4.r() { // from class: h4.q
            @Override // p068h4.l
            public final boolean apply(java.lang.Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static p068h4.r valueOf(java.lang.String str) {
        return (p068h4.r) java.lang.Enum.valueOf(p068h4.r.class, str);
    }

    public static p068h4.r[] values() {
        return (p068h4.r[]) f22500i.clone();
    }
}
