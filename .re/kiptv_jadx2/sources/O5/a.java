package O5;

import com.kiptv.tv.update.PlayUpdateManifest;
import kotlin.jvm.internal.m;

public final class a implements c {

    public final PlayUpdateManifest f7951a;

    public a(PlayUpdateManifest playUpdateManifest) {
        this.f7951a = playUpdateManifest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && m.a(this.f7951a, ((a) obj).f7951a);
    }

    public final int hashCode() {
        return this.f7951a.hashCode();
    }

    public final String toString() {
        return "Available(manifest=" + this.f7951a + ")";
    }
}
