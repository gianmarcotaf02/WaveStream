package I5;

import com.kiptv.core.model.TMDBVideo;
import kotlin.jvm.functions.Function0;

public final class G implements Function0 {

    public final int f4739h;

    public final TMDBVideo f4740i;
    public final p020c0.X j;

    public final p020c0.X f4741k;

    public G(TMDBVideo tMDBVideo, p020c0.X x9, p020c0.X x10, int i3) {
        this.f4739h = i3;
        this.f4740i = tMDBVideo;
        this.j = x9;
        this.f4741k = x10;
    }

    @Override
    public final Object invoke() {
        switch (this.f4739h) {
            case 0:
                TMDBVideo tMDBVideo = this.f4740i;
                this.j.setValue(tMDBVideo.f20342b);
                this.f4741k.setValue(tMDBVideo.f20343c);
                break;
            default:
                TMDBVideo tMDBVideo2 = this.f4740i;
                this.j.setValue(tMDBVideo2.f20342b);
                this.f4741k.setValue(tMDBVideo2.f20343c);
                break;
        }
        return p070h6.A.f22523a;
    }
}
