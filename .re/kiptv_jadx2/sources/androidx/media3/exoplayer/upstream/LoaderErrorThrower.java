package androidx.media3.exoplayer.upstream;

public interface LoaderErrorThrower {

    public static final class Placeholder implements LoaderErrorThrower {
        @Override
        public void maybeThrowError() {
        }

        @Override
        public void maybeThrowError(int i3) {
        }
    }

    void maybeThrowError();

    void maybeThrowError(int i3);
}
