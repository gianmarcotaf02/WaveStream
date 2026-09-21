package p103m;

public final class K0 {

    public int f24930a;

    public int f24931b;

    public int f24932c;

    public int f24933d;

    public int f24934e;

    public int f24935f;
    public boolean g;

    public boolean f24936h;

    public final void a(int i3, int i9) {
        this.f24932c = i3;
        this.f24933d = i9;
        this.f24936h = true;
        if (this.g) {
            if (i9 != Integer.MIN_VALUE) {
                this.f24930a = i9;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f24931b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f24930a = i3;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f24931b = i9;
        }
    }
}
