package p036d8;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p036d8.m f21308i = new p036d8.m(0, 0);
    public static final p036d8.m j = new p036d8.m(0, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p036d8.m f21309k = new p036d8.m(0, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21310h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i3, int i9) {
        super(i3);
        this.f21310h = i9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f21310h) {
            case 0:
                return new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 1:
                return new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            default:
                return new j$.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
        }
    }
}
