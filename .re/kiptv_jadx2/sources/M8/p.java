package M8;

import java.util.ArrayList;
import java.util.Map;

public final class p {

    public final boolean f7268a;

    public final boolean f7269b;

    public final A f7270c;

    public final Long f7271d;

    public final Long f7272e;

    public final Long f7273f;
    public final Long g;

    public final Map f7274h;

    public p(boolean z6, boolean z9, A a2, Long l2, Long l9, Long l10, Long l11, Map extras) {
        kotlin.jvm.internal.m.e(extras, "extras");
        this.f7268a = z6;
        this.f7269b = z9;
        this.f7270c = a2;
        this.f7271d = l2;
        this.f7272e = l9;
        this.f7273f = l10;
        this.g = l11;
        this.f7274h = p078i6.C.Y0(extras);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f7268a) {
            arrayList.add("isRegularFile");
        }
        if (this.f7269b) {
            arrayList.add("isDirectory");
        }
        Long l2 = this.f7271d;
        if (l2 != null) {
            arrayList.add("byteCount=" + l2);
        }
        Long l9 = this.f7272e;
        if (l9 != null) {
            arrayList.add("createdAt=" + l9);
        }
        Long l10 = this.f7273f;
        if (l10 != null) {
            arrayList.add("lastModifiedAt=" + l10);
        }
        Long l11 = this.g;
        if (l11 != null) {
            arrayList.add("lastAccessedAt=" + l11);
        }
        Map map = this.f7274h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return p078i6.o.o1(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public p(boolean z6, boolean z9, A a2, Long l2, Long l9, Long l10, Long l11) {
        this(z6, z9, a2, l2, l9, l10, l11, p078i6.x.f23206h);
    }
}
