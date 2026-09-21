package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public final class Lines {
    private final ArrayList<? extends Line> mList;
    private final int mMax;
    private final int mMin = 0;
    public int pos;

    public Lines(ArrayList<? extends Line> arrayList) {
        this.mList = arrayList;
        this.mMax = arrayList.size();
    }

    public static Lines readLines(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            Lines lines = readLines(bufferedReader);
            bufferedReader.close();
            return lines;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean hasNext() {
        return this.pos < this.mMax;
    }

    public Line next() {
        int i3 = this.pos;
        if (i3 < this.mMin || i3 >= this.mMax) {
            return null;
        }
        ArrayList<? extends Line> arrayList = this.mList;
        this.pos = i3 + 1;
        return arrayList.get(i3);
    }

    public void rewind() {
        this.pos--;
    }

    public static Lines readLines(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                i3++;
                arrayList.add(new Line(i3, line));
            } else {
                return new Lines(arrayList);
            }
        }
    }
}
