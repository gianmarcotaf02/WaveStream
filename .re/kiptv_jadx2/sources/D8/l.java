package D8;

import java.io.IOException;
import java.util.List;

public final class l extends z8.a {

    public final int f2539e = 1;

    public final n f2540f;
    public final int g;

    public l(String str, n nVar, int i3, List list) {
        super(str, true);
        this.f2540f = nVar;
        this.g = i3;
    }

    @Override
    public final long a() {
        switch (this.f2539e) {
            case 0:
                this.f2540f.f2559r.getClass();
                try {
                    this.f2540f.f2547D.v(this.g, 9);
                    synchronized (this.f2540f) {
                        this.f2540f.f2549F.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f2540f.f2559r.getClass();
                try {
                    this.f2540f.f2547D.v(this.g, 9);
                    synchronized (this.f2540f) {
                        this.f2540f.f2549F.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    public l(String str, n nVar, int i3, List list, boolean z6) {
        super(str, true);
        this.f2540f = nVar;
        this.g = i3;
    }
}
