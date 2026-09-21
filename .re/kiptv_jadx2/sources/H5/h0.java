package H5;

import androidx.media3.exoplayer.upstream.CmcdData;

public final class h0 implements p194x6.j {

    public final int f4214h;

    public final E0 f4215i;
    public final int j;

    public final p194x6.j f4216k;

    public h0(E0 e6, int i3, p194x6.j jVar, int i9) {
        this.f4214h = i9;
        this.f4215i = e6;
        this.j = i3;
        this.f4216k = jVar;
    }

    @Override
    public final Object invoke(Object obj) {
        int i3 = this.f4214h;
        Integer num = (Integer) obj;
        num.getClass();
        switch (i3) {
            case 0:
                this.f4215i.f4068h = CmcdData.OBJECT_TYPE_MANIFEST + this.j;
                this.f4216k.invoke(num);
                break;
            default:
                this.f4215i.f4068h = CmcdData.STREAMING_FORMAT_SS + this.j;
                this.f4216k.invoke(num);
                break;
        }
        return p070h6.A.f22523a;
    }
}
