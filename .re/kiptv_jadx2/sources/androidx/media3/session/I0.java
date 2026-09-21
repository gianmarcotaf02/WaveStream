package androidx.media3.session;

public final class I0 implements p068h4.v {

    public final int f16899h;

    public I0(int i3) {
        this.f16899h = i3;
    }

    @Override
    public final Object get() {
        switch (this.f16899h) {
            case 0:
                return Integer.valueOf(MediaSessionImpl.getMediaMetadataBitmapMaxSize());
            case 1:
                return Integer.valueOf(DefaultMediaNotificationProvider.getMaxNotificationIconSize());
            default:
                return SimpleBitmapLoader.lambda$static$0();
        }
    }
}
