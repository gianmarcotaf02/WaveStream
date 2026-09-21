package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.media3.container.ReorderingBufferQueue.OutputConsumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16862i;

    public /* synthetic */ b(int i3, java.lang.Object obj) {
        this.f16861h = i3;
        this.f16862i = obj;
    }

    @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
    public final void consume(long j, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        switch (this.f16861h) {
            case 0:
                ((androidx.media3.extractor.ts.UserDataReader) this.f16862i).lambda$new$0(j, parsableByteArray);
                break;
            default:
                ((androidx.media3.extractor.ts.SeiReader) this.f16862i).lambda$new$0(j, parsableByteArray);
                break;
        }
    }
}
