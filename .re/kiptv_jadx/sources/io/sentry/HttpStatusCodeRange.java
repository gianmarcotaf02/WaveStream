package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpStatusCodeRange {
    public static final int DEFAULT_MAX = 599;
    public static final int DEFAULT_MIN = 500;
    private final int max;
    private final int min;

    public HttpStatusCodeRange(int i3, int i9) {
        this.min = i3;
        this.max = i9;
    }

    public boolean isInRange(int i3) {
        return i3 >= this.min && i3 <= this.max;
    }

    public HttpStatusCodeRange(int i3) {
        this.min = i3;
        this.max = i3;
    }
}
