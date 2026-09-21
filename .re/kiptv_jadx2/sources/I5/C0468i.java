package I5;

import C5.C0102d0;
import com.kiptv.core.model.WatchProgress;
import kotlin.jvm.functions.Function0;
import p208z5.C3224q;

public final class C0468i implements Function0 {

    public final int f5160h;

    public final p020c0.X f5161i;
    public final p194x6.j j;

    public final p020c0.X f5162k;

    public C0468i(p020c0.X x9, p194x6.j jVar, p020c0.X x10, int i3) {
        this.f5160h = i3;
        this.f5161i = x9;
        this.j = jVar;
        this.f5162k = x10;
    }

    @Override
    public final Object invoke() {
        switch (this.f5160h) {
            case 0:
                p099l5.y yVar = p099l5.y.ExoPlayer;
                E8.d.w(this.f5161i, this.j, this.f5162k, yVar);
                break;
            case 1:
                p099l5.y yVar2 = p099l5.y.VLC;
                E8.d.w(this.f5161i, this.j, this.f5162k, yVar2);
                break;
            case 2:
                p020c0.X x9 = this.f5161i;
                WatchProgress watchProgress = ((C3224q) x9.getValue()).j;
                if (watchProgress == null || !watchProgress.g()) {
                    this.j.invoke(new C0102d0(((C3224q) x9.getValue()).f32788b, false));
                } else {
                    this.f5162k.setValue(Boolean.TRUE);
                }
                break;
            default:
                this.f5161i.setValue(Boolean.FALSE);
                this.j.invoke(new C0102d0(((C3224q) this.f5162k.getValue()).f32788b, true));
                break;
        }
        return p070h6.A.f22523a;
    }

    public C0468i(p194x6.j jVar, p020c0.X x9, p020c0.X x10, int i3) {
        this.f5160h = i3;
        this.j = jVar;
        this.f5161i = x9;
        this.f5162k = x10;
    }
}
