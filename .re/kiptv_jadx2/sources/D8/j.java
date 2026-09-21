package D8;

import com.google.android.gms.internal.play_billing.M0;
import java.io.IOException;

public final class j extends z8.a {

    public final int f2533e;

    public final n f2534f;
    public final int g;

    public final int f2535h;

    public j(String str, n nVar, int i3, int i9, int i10) {
        super(str, true);
        this.f2533e = i10;
        this.f2534f = nVar;
        this.g = i3;
        this.f2535h = i9;
    }

    @Override
    public final long a() {
        switch (this.f2533e) {
            case 0:
                int i3 = this.g;
                int i9 = this.f2535h;
                n nVar = this.f2534f;
                nVar.getClass();
                try {
                    nVar.f2547D.u(i3, i9, true);
                    return -1L;
                } catch (IOException e6) {
                    nVar.b(2, 2, e6);
                    return -1L;
                }
            case 1:
                z zVar = this.f2534f.f2559r;
                int i10 = this.f2535h;
                zVar.getClass();
                M0.s(i10, "errorCode");
                synchronized (this.f2534f) {
                    this.f2534f.f2549F.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                n nVar2 = this.f2534f;
                try {
                    int i11 = this.g;
                    int i12 = this.f2535h;
                    nVar2.getClass();
                    M0.s(i12, "statusCode");
                    nVar2.f2547D.v(i11, i12);
                    return -1L;
                } catch (IOException e9) {
                    nVar2.b(2, 2, e9);
                    return -1L;
                }
        }
    }
}
