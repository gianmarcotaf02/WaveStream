package J5;

import V7.InterfaceC0982h;
import com.kiptv.core.model.Playlist;

public final class L0 implements InterfaceC0982h {

    public final int f6177h;

    public final O0 f6178i;

    public L0(O0 o8, int i3) {
        this.f6177h = i3;
        this.f6178i = o8;
    }

    @Override
    public final Object emit(Object obj, p100l6.c cVar) {
        switch (this.f6177h) {
            case 0:
                V7.n0 n0Var = this.f6178i.f6206d;
                n0Var.i(null, K0.a((K0) n0Var.getValue(), (com.kiptv.core.model.l0) obj, null, null, 125));
                break;
            default:
                Playlist playlist = (Playlist) obj;
                V7.n0 n0Var2 = this.f6178i.f6206d;
                n0Var2.i(null, K0.a((K0) n0Var2.getValue(), null, playlist != null ? playlist.f20033a : null, playlist != null ? playlist.f20035c : null, 79));
                break;
        }
        return p070h6.A.f22523a;
    }
}
