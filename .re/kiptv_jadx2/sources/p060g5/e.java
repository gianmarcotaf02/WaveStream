package p060g5;

import com.google.crypto.tink.shaded.protobuf.q0;
import p126o6.b;
import p188x0.C3098s;
import p188x0.z;

public final class e {
    RED("red", 4289527817L, 4286383114L),
    GOLD("gold", 4292124695L, 4288311314L),
    SILVER("silver", 4288455599L, 4285231744L),
    WHITE("white", 4294967295L, 4292138196L),
    BROWN("brown", 4285218591L, 4283050258L),
    FUCHSIA("fuchsia", 4290782931L, 4286978447L),
    GREEN("green", 4279599165L, 4279062824L),
    INDIGO("indigo", 4282595530L, 4281413249L),
    LIME("lime", 4284850957L, 4283268111L),
    ORANGE("orange", 4293548044L, 4288690694L),
    PURPLE("purple", 4286456526L, 4283964551L),
    TEAL("teal", 4279080072L, 4279203438L);

    public static final d Companion = new d();

    public static final e f21882k = new e("red", 4289527817L, 4286383114L);

    public static final b f21884m;

    public final String f21885h;

    public final long f21886i;
    public final long j;

    static {
        f21884m = q0.t(new e[]{r0, new e("gold", 4292124695L, 4288311314L), new e("silver", 4288455599L, 4285231744L), new e("white", 4294967295L, 4292138196L), new e("brown", 4285218591L, 4283050258L), new e("fuchsia", 4290782931L, 4286978447L), new e("green", 4279599165L, 4279062824L), new e("indigo", 4282595530L, 4281413249L), new e("lime", 4284850957L, 4283268111L), new e("orange", 4293548044L, 4288690694L), new e("purple", 4286456526L, 4283964551L), new e("teal", 4279080072L, 4279203438L)});
    }

    public e(String str, long j, long j9) {
        super(str, i);
        this.f21885h = str;
        this.f21886i = j;
        this.j = j9;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f21883l.clone();
    }

    public final long a() {
        if (b()) {
            return z.d(4278848010L);
        }
        int i3 = C3098s.f31128h;
        return C3098s.f31124c;
    }

    public final boolean b() {
        long j = this.f21886i;
        return ((((double) (j & 255)) / 255.0d) * 0.114d) + (((((double) ((j >> 8) & 255)) / 255.0d) * 0.587d) + ((((double) ((j >> 16) & 255)) / 255.0d) * 0.299d)) > 0.7d;
    }
}
