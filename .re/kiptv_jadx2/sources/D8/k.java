package D8;

import M8.C0682j;
import java.io.IOException;

public final class k extends z8.a {

    public final n f2536e;

    public final int f2537f;
    public final C0682j g;

    public final int f2538h;

    public k(String str, n nVar, int i3, C0682j c0682j, int i9, boolean z6) {
        super(str, true);
        this.f2536e = nVar;
        this.f2537f = i3;
        this.g = c0682j;
        this.f2538h = i9;
    }

    @Override
    public final long a() {
        try {
            z zVar = this.f2536e.f2559r;
            C0682j c0682j = this.g;
            int i3 = this.f2538h;
            zVar.getClass();
            c0682j.C(i3);
            this.f2536e.f2547D.v(this.f2537f, 9);
            synchronized (this.f2536e) {
                this.f2536e.f2549F.remove(Integer.valueOf(this.f2537f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
