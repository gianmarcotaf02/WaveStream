package io.sentry.android.core.internal.threaddump;

/* JADX INFO: loaded from: classes4.dex */
public final class Lines {
    private final java.util.ArrayList<? extends io.sentry.android.core.internal.threaddump.Line> mList;
    private final int mMax;
    private final int mMin = 0;
    public int pos;

    public Lines(java.util.ArrayList<? extends io.sentry.android.core.internal.threaddump.Line> arrayList) {
        this.mList = arrayList;
        this.mMax = arrayList.size();
    }

    public static io.sentry.android.core.internal.threaddump.Lines readLines(java.io.File file) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
        try {
            io.sentry.android.core.internal.threaddump.Lines lines = readLines(bufferedReader);
            bufferedReader.close();
            return lines;
        } catch (java.lang.Throwable th) {
            try {
                bufferedReader.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean hasNext() {
        return this.pos < this.mMax;
    }

    public io.sentry.android.core.internal.threaddump.Line next() {
        int i3 = this.pos;
        if (i3 < this.mMin || i3 >= this.mMax) {
            return null;
        }
        java.util.ArrayList<? extends io.sentry.android.core.internal.threaddump.Line> arrayList = this.mList;
        this.pos = i3 + 1;
        return arrayList.get(i3);
    }

    public void rewind() {
        this.pos--;
    }

    public static io.sentry.android.core.internal.threaddump.Lines readLines(java.io.BufferedReader bufferedReader) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i3 = 0;
        while (true) {
            java.lang.String line = bufferedReader.readLine();
            if (line != null) {
                i3++;
                arrayList.add(new io.sentry.android.core.internal.threaddump.Line(i3, line));
            } else {
                return new io.sentry.android.core.internal.threaddump.Lines(arrayList);
            }
        }
    }
}
