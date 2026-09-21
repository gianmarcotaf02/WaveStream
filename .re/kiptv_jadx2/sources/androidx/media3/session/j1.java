package androidx.media3.session;

public final class j1 implements p068h4.j {

    public final int f17057a;

    public final MediaSessionStub.Controller2Cb f17058b;

    public j1(MediaSessionStub.Controller2Cb controller2Cb, int i3) {
        this.f17057a = i3;
        this.f17058b = controller2Cb;
    }

    @Override
    public final Object apply(Object obj) {
        switch (this.f17057a) {
            case 0:
                return this.f17058b.lambda$setCustomLayout$0((CommandButton) obj);
            case 1:
                return this.f17058b.lambda$setMediaButtonPreferences$1((CommandButton) obj);
            default:
                return this.f17058b.lambda$setMediaButtonPreferences$2((CommandButton) obj);
        }
    }
}
