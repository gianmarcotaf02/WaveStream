package w8;

import androidx.media3.common.util.Log;
import java.util.concurrent.TimeUnit;

public final class C3023c {

    public static final int f30521n = 0;

    public final boolean f30522a;

    public final boolean f30523b;

    public final int f30524c;

    public final int f30525d;

    public final boolean f30526e;

    public final boolean f30527f;
    public final boolean g;

    public final int f30528h;

    public final int f30529i;
    public final boolean j;

    public final boolean f30530k;

    public final boolean f30531l;

    public String f30532m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Log.LOG_LEVEL_OFF);
    }

    public C3023c(boolean z6, boolean z9, int i3, int i9, boolean z10, boolean z11, boolean z12, int i10, int i11, boolean z13, boolean z14, boolean z15, String str) {
        this.f30522a = z6;
        this.f30523b = z9;
        this.f30524c = i3;
        this.f30525d = i9;
        this.f30526e = z10;
        this.f30527f = z11;
        this.g = z12;
        this.f30528h = i10;
        this.f30529i = i11;
        this.j = z13;
        this.f30530k = z14;
        this.f30531l = z15;
        this.f30532m = str;
    }

    public final String toString() {
        String str = this.f30532m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f30522a) {
            sb.append("no-cache, ");
        }
        if (this.f30523b) {
            sb.append("no-store, ");
        }
        int i3 = this.f30524c;
        if (i3 != -1) {
            sb.append("max-age=");
            sb.append(i3);
            sb.append(", ");
        }
        int i9 = this.f30525d;
        if (i9 != -1) {
            sb.append("s-maxage=");
            sb.append(i9);
            sb.append(", ");
        }
        if (this.f30526e) {
            sb.append("private, ");
        }
        if (this.f30527f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i10 = this.f30528h;
        if (i10 != -1) {
            sb.append("max-stale=");
            sb.append(i10);
            sb.append(", ");
        }
        int i11 = this.f30529i;
        if (i11 != -1) {
            sb.append("min-fresh=");
            sb.append(i11);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.f30530k) {
            sb.append("no-transform, ");
        }
        if (this.f30531l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "StringBuilder().apply(builderAction).toString()");
        this.f30532m = string;
        return string;
    }
}
