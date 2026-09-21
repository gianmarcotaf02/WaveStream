package R4;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class f {

    public static final f f9069h;

    public static final f f9070i;
    public static final f j;

    public static final f[] f9071k;

    f EF0;

    static {
        f fVar = new f("Pending", 0);
        f fVar2 = new f("Running", 1);
        f9069h = fVar2;
        f fVar3 = new f("Completed", 2);
        f9070i = fVar3;
        f fVar4 = new f("Failed", 3);
        j = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f9071k = fVarArr;
        q0.t(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f9071k.clone();
    }
}
