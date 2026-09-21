package v;

import android.widget.Magnifier;

public class z0 implements x0 {

    public final Magnifier f29044a;

    public z0(Magnifier magnifier) {
        this.f29044a = magnifier;
    }

    @Override
    public void a(long j, long j9) {
        this.f29044a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.f29044a.dismiss();
    }

    public final long c() {
        return (((long) this.f29044a.getHeight()) & 4294967295L) | (((long) this.f29044a.getWidth()) << 32);
    }

    public final void d() {
        this.f29044a.update();
    }
}
