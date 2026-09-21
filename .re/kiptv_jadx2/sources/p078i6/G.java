package p078i6;

public final class G extends AbstractC2251b {
    public int j;

    public int f23179k;

    public final H f23180l;

    public G(H h9) {
        this.f23180l = h9;
        this.j = h9.f23183k;
        this.f23179k = h9.j;
    }

    @Override
    public final void a() {
        int i3 = this.j;
        if (i3 == 0) {
            this.f23191h = 2;
            return;
        }
        H h9 = this.f23180l;
        Object[] objArr = h9.f23181h;
        int i9 = this.f23179k;
        this.f23192i = objArr[i9];
        this.f23191h = 1;
        this.f23179k = (i9 + 1) % h9.f23182i;
        this.j = i3 - 1;
    }
}
