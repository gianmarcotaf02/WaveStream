package Z2;

import io.ktor.sse.ServerSentEventKt;

public final class C1208s {

    public static final C1208s f12931c = new C1208s(r.f12920h, 0);

    public static final C1208s f12932d = new C1208s(r.f12924m, 1);

    public final r f12933a;

    public final int f12934b;

    public C1208s(r rVar, int i3) {
        this.f12933a = rVar;
        this.f12934b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1208s.class != obj.getClass()) {
            return false;
        }
        C1208s c1208s = (C1208s) obj;
        return this.f12933a == c1208s.f12933a && this.f12934b == c1208s.f12934b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12933a);
        sb.append(ServerSentEventKt.SPACE);
        int i3 = this.f12934b;
        if (i3 != 1) {
            str = i3 != 2 ? "null" : "slice";
        } else {
            str = "meet";
        }
        sb.append(str);
        return sb.toString();
    }
}
