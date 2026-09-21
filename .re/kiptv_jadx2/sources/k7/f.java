package k7;

import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class f extends p079i7.a {
    public static final f g;

    public static final f f24502h;

    public final boolean f24503f;

    static {
        f fVar = new f(new int[]{2, 1, 0}, false);
        g = fVar;
        int i3 = fVar.f23212c;
        int i9 = fVar.f23211b;
        f24502h = (i9 == 1 && i3 == 9) ? new f(new int[]{2, 0, 0}, false) : new f(new int[]{i9, i3 + 1, 0}, false);
        new f(new int[0], false);
    }

    public f(int[] versionArray, boolean z6) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        m.e(versionArray, "versionArray");
        this.f24503f = z6;
    }

    public final boolean b(f metadataVersionFromLanguageVersion) {
        m.e(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        f fVar = g;
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
