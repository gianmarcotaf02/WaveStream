package k7;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends p079i7.a {
    public static final k7.f g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k7.f f24502h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24503f;

    static {
        k7.f fVar = new k7.f(new int[]{2, 1, 0}, false);
        g = fVar;
        int i3 = fVar.f23212c;
        int i9 = fVar.f23211b;
        f24502h = (i9 == 1 && i3 == 9) ? new k7.f(new int[]{2, 0, 0}, false) : new k7.f(new int[]{i9, i3 + 1, 0}, false);
        new k7.f(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int[] versionArray, boolean z6) {
        super(java.util.Arrays.copyOf(versionArray, versionArray.length));
        kotlin.jvm.internal.m.e(versionArray, "versionArray");
        this.f24503f = z6;
    }

    public final boolean b(k7.f metadataVersionFromLanguageVersion) {
        kotlin.jvm.internal.m.e(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        k7.f fVar = g;
        int i3 = this.f23211b;
        int i9 = this.f23212c;
        if (i3 == 2 && i9 == 0 && fVar.f23211b == 1 && fVar.f23212c == 8) {
            return true;
        }
        if (!this.f24503f) {
            fVar = f24502h;
        }
        fVar.getClass();
        int i10 = metadataVersionFromLanguageVersion.f23211b;
        int i11 = fVar.f23211b;
        if (i11 > i10 || (i11 >= i10 && fVar.f23212c > metadataVersionFromLanguageVersion.f23212c)) {
            metadataVersionFromLanguageVersion = fVar;
        }
        boolean z6 = false;
        if ((i3 == 1 && i9 == 0) || i3 == 0) {
            return false;
        }
        int i12 = metadataVersionFromLanguageVersion.f23211b;
        if (i3 > i12 || (i3 >= i12 && i9 > metadataVersionFromLanguageVersion.f23212c)) {
            z6 = true;
        }
        return !z6;
    }
}
