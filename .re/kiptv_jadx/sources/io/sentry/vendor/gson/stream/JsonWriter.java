package io.sentry.vendor.gson.stream;

/* JADX INFO: loaded from: classes4.dex */
public class JsonWriter implements java.io.Closeable, java.io.Flushable, java.lang.AutoCloseable {
    private static final java.lang.String[] HTML_SAFE_REPLACEMENT_CHARS;
    private static final java.lang.String[] REPLACEMENT_CHARS = new java.lang.String[128];
    private java.lang.String deferredName;
    private boolean htmlSafe;
    private java.lang.String indent;
    private boolean lenient;
    private final java.io.Writer out;
    private java.lang.String separator;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;

    static {
        for (int i3 = 0; i3 <= 31; i3++) {
            REPLACEMENT_CHARS[i3] = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(i3));
        }
        java.lang.String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(java.io.Writer writer) {
        push(6);
        this.separator = ":";
        this.serializeNulls = true;
        if (writer == null) {
            throw new java.lang.NullPointerException("out == null");
        }
        this.out = writer;
    }

    private void beforeName() throws java.io.IOException {
        int iPeek = peek();
        if (iPeek == 5) {
            this.out.write(44);
        } else if (iPeek != 3) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws java.io.IOException {
        int iPeek = peek();
        if (iPeek == 1) {
            replaceTop(2);
            newline();
            return;
        }
        if (iPeek == 2) {
            this.out.append(',');
            newline();
        } else {
            if (iPeek == 4) {
                this.out.append((java.lang.CharSequence) this.separator);
                replaceTop(5);
                return;
            }
            if (iPeek != 6) {
                if (iPeek != 7) {
                    throw new java.lang.IllegalStateException("Nesting problem.");
                }
                if (!this.lenient) {
                    throw new java.lang.IllegalStateException("JSON must have only one top-level value.");
                }
            }
            replaceTop(7);
        }
    }

    private io.sentry.vendor.gson.stream.JsonWriter close(int i3, int i9, char c9) throws java.io.IOException {
        int iPeek = peek();
        if (iPeek != i9 && iPeek != i3) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            throw new java.lang.IllegalStateException("Dangling name: " + this.deferredName);
        }
        this.stackSize--;
        if (iPeek == i9) {
            newline();
        }
        this.out.write(c9);
        return this;
    }

    private void newline() throws java.io.IOException {
        if (this.indent == null) {
            return;
        }
        this.out.write(10);
        int i3 = this.stackSize;
        for (int i9 = 1; i9 < i3; i9++) {
            this.out.write(this.indent);
        }
    }

    private io.sentry.vendor.gson.stream.JsonWriter open(int i3, char c9) throws java.io.IOException {
        beforeValue();
        push(i3);
        this.out.write(c9);
        return this;
    }

    private int peek() {
        int i3 = this.stackSize;
        if (i3 != 0) {
            return this.stack[i3 - 1];
        }
        throw new java.lang.IllegalStateException("JsonWriter is closed.");
    }

    private void push(int i3) {
        int i9 = this.stackSize;
        int[] iArr = this.stack;
        if (i9 == iArr.length) {
            this.stack = java.util.Arrays.copyOf(iArr, i9 * 2);
        }
        int[] iArr2 = this.stack;
        int i10 = this.stackSize;
        this.stackSize = i10 + 1;
        iArr2[i10] = i3;
    }

    private void replaceTop(int i3) {
        this.stack[this.stackSize - 1] = i3;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void string(java.lang.String str) throws java.io.IOException {
        java.lang.String str2;
        java.lang.String[] strArr = this.htmlSafe ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        this.out.write(34);
        int length = str.length();
        int i3 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt = str.charAt(i9);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i3 < i9) {
                        this.out.write(str, i3, i9 - i3);
                    }
                    this.out.write(str2);
                    i3 = i9 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i3 < i9) {
                    this.out.write(str, i3, i9 - i3);
                }
                this.out.write(str2);
                i3 = i9 + 1;
            }
        }
        if (i3 < length) {
            this.out.write(str, i3, length - i3);
        }
        this.out.write(34);
    }

    private void writeDeferredName() throws java.io.IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public io.sentry.vendor.gson.stream.JsonWriter beginArray() throws java.io.IOException {
        writeDeferredName();
        return open(1, '[');
    }

    public io.sentry.vendor.gson.stream.JsonWriter beginObject() throws java.io.IOException {
        writeDeferredName();
        return open(3, '{');
    }

    public io.sentry.vendor.gson.stream.JsonWriter endArray() {
        return close(1, 2, ']');
    }

    public io.sentry.vendor.gson.stream.JsonWriter endObject() {
        return close(3, 5, '}');
    }

    @Override // java.io.Flushable
    public void flush() throws java.io.IOException {
        if (this.stackSize == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.out.flush();
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.lenient;
    }

    public io.sentry.vendor.gson.stream.JsonWriter jsonValue(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((java.lang.CharSequence) str);
        return this;
    }

    public io.sentry.vendor.gson.stream.JsonWriter name(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("name == null");
        }
        if (this.deferredName != null) {
            throw new java.lang.IllegalStateException();
        }
        if (this.stackSize == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.deferredName = str;
        return this;
    }

    public io.sentry.vendor.gson.stream.JsonWriter nullValue() throws java.io.IOException {
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public final void setHtmlSafe(boolean z6) {
        this.htmlSafe = z6;
    }

    public final void setIndent(java.lang.String str) {
        if (str.length() == 0) {
            this.indent = null;
            this.separator = ":";
        } else {
            this.indent = str;
            this.separator = ": ";
        }
    }

    public final void setLenient(boolean z6) {
        this.lenient = z6;
    }

    public final void setSerializeNulls(boolean z6) {
        this.serializeNulls = z6;
    }

    public io.sentry.vendor.gson.stream.JsonWriter value(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }

    public io.sentry.vendor.gson.stream.JsonWriter value(boolean z6) throws java.io.IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(z6 ? "true" : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.out.close();
        int i3 = this.stackSize;
        if (i3 <= 1 && (i3 != 1 || this.stack[i3 - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new java.io.IOException("Incomplete document");
    }

    public io.sentry.vendor.gson.stream.JsonWriter value(java.lang.Boolean bool) throws java.io.IOException {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public io.sentry.vendor.gson.stream.JsonWriter value(double d4) throws java.io.IOException {
        writeDeferredName();
        if (!this.lenient && (java.lang.Double.isNaN(d4) || java.lang.Double.isInfinite(d4))) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
        beforeValue();
        this.out.append((java.lang.CharSequence) java.lang.Double.toString(d4));
        return this;
    }

    public io.sentry.vendor.gson.stream.JsonWriter value(long j) throws java.io.IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(java.lang.Long.toString(j));
        return this;
    }

    public io.sentry.vendor.gson.stream.JsonWriter value(java.lang.Number number) throws java.io.IOException {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        java.lang.String string = number.toString();
        if (!this.lenient && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        beforeValue();
        this.out.append((java.lang.CharSequence) string);
        return this;
    }
}
