package androidx.media3.ui;

public interface TimeBar {

    public interface OnScrubListener {
        void onScrubMove(TimeBar timeBar, long j);

        void onScrubStart(TimeBar timeBar, long j);

        void onScrubStop(TimeBar timeBar, long j, boolean z6);
    }

    void addListener(OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void removeListener(OnScrubListener onScrubListener);

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i3);

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z6);

    void setKeyCountIncrement(int i3);

    void setKeyTimeIncrement(long j);

    void setPosition(long j);
}
