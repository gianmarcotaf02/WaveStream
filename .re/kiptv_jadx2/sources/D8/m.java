package D8;

import java.io.IOException;

public final class m extends z8.a {

    public final n f2541e;

    public final int f2542f;
    public final long g;

    public m(String str, n nVar, int i3, long j) {
        super(str, true);
        this.f2541e = nVar;
        this.f2542f = i3;
        this.g = j;
    }

    @Override
    public final long a() {
        n nVar = this.f2541e;
        try {
            nVar.f2547D.z(this.f2542f, this.g);
            return -1L;
        } catch (IOException e6) {
            nVar.b(2, 2, e6);
            return -1L;
        }
    }
}
