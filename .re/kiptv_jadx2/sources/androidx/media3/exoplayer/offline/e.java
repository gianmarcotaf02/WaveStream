package androidx.media3.exoplayer.offline;

import java.io.IOException;

public final class e implements Runnable {

    public final int f16704h;

    public final Object f16705i;
    public final Object j;

    public e(Object obj, Object obj2, int i3) {
        this.f16704h = i3;
        this.f16705i = obj;
        this.j = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16704h) {
            case 0:
                ((DownloadService.DownloadManagerHelper) this.f16705i).lambda$attachService$0((DownloadService) this.j);
                break;
            case 1:
                ((DownloadHelper) this.f16705i).lambda$onMediaPreparationFailed$3((IOException) this.j);
                break;
            default:
                ((DownloadHelper) this.f16705i).lambda$prepare$1((DownloadHelper.Callback) this.j);
                break;
        }
    }
}
