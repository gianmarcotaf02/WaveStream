package p085j5;

public final class b0 {

    public final long f24112a;

    public final long f24113b;

    public long f24114c = Long.MIN_VALUE;

    public long f24115d;

    public long f24116e;

    public boolean f24117f;

    public b0(long j, long j9) {
        this.f24112a = j;
        this.f24113b = j9;
    }

    public final Long a(boolean z6, long j, long j9, long j10) {
        if (!this.f24117f) {
            if (z6 && j == this.f24114c) {
                long j11 = this.f24115d;
                if (j11 != 0) {
                    long j12 = j10 - j11;
                    long j13 = j9 - this.f24116e;
                    if (j12 >= this.f24112a && j13 >= this.f24113b) {
                        this.f24117f = true;
                        return Long.valueOf(j12);
                    }
                }
            }
            this.f24114c = j;
            this.f24115d = j10;
            this.f24116e = j9;
            return null;
        }
        return null;
    }

    public final void b() {
        this.f24114c = Long.MIN_VALUE;
        this.f24115d = 0L;
        this.f24116e = 0L;
        this.f24117f = false;
    }
}
