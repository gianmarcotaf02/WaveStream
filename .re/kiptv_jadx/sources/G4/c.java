package G4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final G4.c f3789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ G4.c[] f3790i;

    static {
        G4.c cVar = new G4.c("DEFAULT", 0);
        f3789h = cVar;
        f3790i = new G4.c[]{cVar, new G4.c("SIGNED", 1), new G4.c("FIXED", 2)};
    }

    public static G4.c valueOf(java.lang.String str) {
        return (G4.c) java.lang.Enum.valueOf(G4.c.class, str);
    }

    public static G4.c[] values() {
        return (G4.c[]) f3790i.clone();
    }
}
