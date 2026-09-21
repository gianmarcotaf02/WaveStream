package io.sentry.vendor.gson.stream;

/* JADX INFO: loaded from: classes4.dex */
public class JsonReader implements java.io.Closeable, java.lang.AutoCloseable {
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final java.io.Reader in;
    private int[] pathIndices;
    private java.lang.String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private java.lang.String peekedString;
    private int[] stack;
    private boolean lenient = false;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    public JsonReader(java.io.Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new java.lang.String[32];
        this.pathIndices = new int[32];
        if (reader == null) {
            throw new java.lang.NullPointerException("in == null");
        }
        this.in = reader;
    }

    private void checkLenient() throws java.io.IOException {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() throws java.io.IOException {
        nextNonWhitespace(true);
        int i3 = this.pos;
        int i9 = i3 - 1;
        this.pos = i9;
        if (i3 + 4 <= this.limit || fillBuffer(5)) {
            char[] cArr = this.buffer;
            if (cArr[i9] == ')' && cArr[i3] == ']' && cArr[i3 + 1] == '}' && cArr[i3 + 2] == '\'' && cArr[i3 + 3] == '\n') {
                this.pos += 5;
            }
        }
    }

    private boolean fillBuffer(int i3) throws java.io.IOException {
        int i9;
        int i10;
        char[] cArr = this.buffer;
        int i11 = this.lineStart;
        int i12 = this.pos;
        this.lineStart = i11 - i12;
        int i13 = this.limit;
        if (i13 != i12) {
            int i14 = i13 - i12;
            this.limit = i14;
            java.lang.System.arraycopy(cArr, i12, cArr, 0, i14);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            java.io.Reader reader = this.in;
            int i15 = this.limit;
            int i16 = reader.read(cArr, i15, cArr.length - i15);
            if (i16 == -1) {
                return false;
            }
            i9 = this.limit + i16;
            this.limit = i9;
            if (this.lineNumber == 0 && (i10 = this.lineStart) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i10 + 1;
                i3++;
            }
        } while (i9 < i3);
        return true;
    }

    private boolean isLiteral(char c9) throws java.io.IOException {
        if (c9 == '\t' || c9 == '\n' || c9 == '\f' || c9 == '\r' || c9 == ' ') {
            return false;
        }
        if (c9 != '#') {
            if (c9 == ',') {
                return false;
            }
            if (c9 != '/' && c9 != '=') {
                if (c9 == '{' || c9 == '}' || c9 == ':') {
                    return false;
                }
                if (c9 != ';') {
                    switch (c9) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    private int nextNonWhitespace(boolean z6) throws java.io.IOException {
        char[] cArr = this.buffer;
        int i3 = this.pos;
        int i9 = this.limit;
        while (true) {
            if (i3 == i9) {
                this.pos = i3;
                if (!fillBuffer(1)) {
                    if (!z6) {
                        return -1;
                    }
                    throw new java.io.EOFException("End of input" + locationString());
                }
                i3 = this.pos;
                i9 = this.limit;
            }
            int i10 = i3 + 1;
            char c9 = cArr[i3];
            if (c9 == '\n') {
                this.lineNumber++;
                this.lineStart = i10;
            } else if (c9 != ' ' && c9 != '\r' && c9 != '\t') {
                if (c9 == '/') {
                    this.pos = i10;
                    if (i10 == i9) {
                        this.pos = i3;
                        boolean zFillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!zFillBuffer) {
                        }
                        return c9;
                    }
                    checkLenient();
                    int i11 = this.pos;
                    char c10 = cArr[i11];
                    if (c10 == '*') {
                        this.pos = i11 + 1;
                        if (!skipTo("*/")) {
                            throw syntaxError("Unterminated comment");
                        }
                        i3 = this.pos + 2;
                        i9 = this.limit;
                    } else {
                        if (c10 != '/') {
                            return c9;
                        }
                        this.pos = i11 + 1;
                        skipToEndOfLine();
                        i3 = this.pos;
                        i9 = this.limit;
                    }
                } else {
                    if (c9 != '#') {
                        this.pos = i10;
                        return c9;
                    }
                    this.pos = i10;
                    checkLenient();
                    skipToEndOfLine();
                    i3 = this.pos;
                    i9 = this.limit;
                }
            }
            i3 = i10;
        }
    }

    private java.lang.String nextQuotedValue(char c9) throws java.io.IOException {
        int i3;
        char[] cArr = this.buffer;
        java.lang.StringBuilder sb = null;
        do {
            int i9 = this.pos;
            int i10 = this.limit;
            while (true) {
                int i11 = i10;
                i3 = i9;
                while (true) {
                    if (i9 < i11) {
                        int i12 = i9 + 1;
                        char c10 = cArr[i9];
                        if (c10 == c9) {
                            this.pos = i12;
                            int i13 = (i12 - i3) - 1;
                            if (sb == null) {
                                return new java.lang.String(cArr, i3, i13);
                            }
                            sb.append(cArr, i3, i13);
                            return sb.toString();
                        }
                        if (c10 == '\\') {
                            this.pos = i12;
                            int i14 = i12 - i3;
                            int i15 = i14 - 1;
                            if (sb == null) {
                                sb = new java.lang.StringBuilder(java.lang.Math.max(i14 * 2, 16));
                            }
                            sb.append(cArr, i3, i15);
                            sb.append(readEscapeCharacter());
                            i9 = this.pos;
                            i10 = this.limit;
                        } else {
                            if (c10 == '\n') {
                                this.lineNumber++;
                                this.lineStart = i12;
                            }
                            i9 = i12;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new java.lang.StringBuilder(java.lang.Math.max((i9 - i3) * 2, 16));
            }
            sb.append(cArr, i3, i9 - i3);
            this.pos = i9;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private java.lang.String nextUnquotedValue() throws java.io.IOException {
        java.lang.String string;
        java.lang.StringBuilder sb = null;
        int i3 = 0;
        while (true) {
            int i9 = 0;
            while (true) {
                int i10 = this.pos;
                if (i10 + i9 < this.limit) {
                    char c9 = this.buffer[i10 + i9];
                    if (c9 != '\t' && c9 != '\n' && c9 != '\f' && c9 != '\r' && c9 != ' ') {
                        if (c9 != '#') {
                            if (c9 != ',') {
                                if (c9 != '/' && c9 != '=') {
                                    if (c9 != '{' && c9 != '}' && c9 != ':') {
                                        if (c9 != ';') {
                                            switch (c9) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i9++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    i3 = i9;
                } else if (i9 >= this.buffer.length) {
                    if (sb == null) {
                        sb = new java.lang.StringBuilder(java.lang.Math.max(i9, 16));
                    }
                    sb.append(this.buffer, this.pos, i9);
                    this.pos += i9;
                    if (!fillBuffer(1)) {
                    }
                } else if (!fillBuffer(i9 + 1)) {
                    i3 = i9;
                }
                if (sb == null) {
                    string = new java.lang.String(this.buffer, this.pos, i3);
                } else {
                    sb.append(this.buffer, this.pos, i3);
                    string = sb.toString();
                }
                this.pos += i3;
                return string;
            }
        }
    }

    private int peekKeyword() {
        java.lang.String str;
        java.lang.String str2;
        int i3;
        char c9 = this.buffer[this.pos];
        if (c9 == 't' || c9 == 'T') {
            str = "true";
            str2 = "TRUE";
            i3 = 5;
        } else if (c9 == 'f' || c9 == 'F') {
            str = "false";
            str2 = "FALSE";
            i3 = 6;
        } else {
            if (c9 != 'n' && c9 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i3 = 7;
        }
        int length = str.length();
        for (int i9 = 1; i9 < length; i9++) {
            if (this.pos + i9 >= this.limit && !fillBuffer(i9 + 1)) {
                return 0;
            }
            char c10 = this.buffer[this.pos + i9];
            if (c10 != str.charAt(i9) && c10 != str2.charAt(i9)) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i3;
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    private int peekNumber() {
        char c9;
        int i3;
        char[] cArr = this.buffer;
        int i9 = this.pos;
        int i10 = this.limit;
        int i11 = 0;
        int i12 = 0;
        char c10 = 0;
        boolean z6 = false;
        int i13 = 1;
        long j = 0;
        while (true) {
            char c11 = 2;
            if (i9 + i12 != i10) {
                c9 = cArr[i9 + i12];
                i3 = i11;
                if (c9 != '+') {
                    if (c9 != 'E' || c9 == 'e') {
                        if (c10 == 2 && c10 != 4) {
                            return i3;
                        }
                        c10 = 5;
                    } else if (c9 == '-') {
                        c11 = 6;
                        if (c10 == 0) {
                            c10 = 1;
                            z6 = true;
                        } else if (c10 != 5) {
                            return i3;
                        }
                    } else if (c9 != '.') {
                        if (c9 < '0' || c9 > '9') {
                            if (!isLiteral(c9)) {
                                break;
                            }
                            return i3;
                        }
                        if (c10 == 1 || c10 == 0) {
                            j = -(c9 - '0');
                        } else if (c10 == 2) {
                            if (j == 0) {
                                return i3;
                            }
                            long j9 = (10 * j) - ((long) (c9 - '0'));
                            i13 &= (j > MIN_INCOMPLETE_INTEGER || (j == MIN_INCOMPLETE_INTEGER && j9 < j)) ? 1 : i3;
                            j = j9;
                        } else if (c10 == 3) {
                            c10 = 4;
                        } else if (c10 == 5 || c10 == 6) {
                            c10 = 7;
                        }
                    } else {
                        if (c10 != 2) {
                            return i3;
                        }
                        c10 = 3;
                    }
                    i12++;
                    i11 = i3;
                } else {
                    c11 = 6;
                    if (c10 != 5) {
                        return i3;
                    }
                }
                c10 = c11;
                i12++;
                i11 = i3;
            } else {
                if (i12 == cArr.length) {
                    return i11;
                }
                if (!fillBuffer(i12 + 1)) {
                    i3 = i11;
                    break;
                }
                i9 = this.pos;
                i10 = this.limit;
                c9 = cArr[i9 + i12];
                i3 = i11;
                if (c9 != '+') {
                    if (c9 != 'E') {
                        if (c10 == 2) {
                        }
                        c10 = 5;
                    } else {
                        if (c10 == 2) {
                        }
                        c10 = 5;
                    }
                    i12++;
                    i11 = i3;
                } else {
                    c11 = 6;
                    if (c10 != 5) {
                        return i3;
                    }
                }
                c10 = c11;
                i12++;
                i11 = i3;
            }
        }
        if (c10 == 2 && i13 != 0 && ((j != Long.MIN_VALUE || z6) && (j != 0 || !z6))) {
            if (!z6) {
                j = -j;
            }
            this.peekedLong = j;
            this.pos += i12;
            this.peeked = 15;
            return 15;
        }
        if (c10 != 2 && c10 != 4 && c10 != 7) {
            return i3;
        }
        this.peekedNumberLength = i12;
        this.peeked = 16;
        return 16;
    }

    private void push(int i3) {
        int i9 = this.stackSize;
        int[] iArr = this.stack;
        if (i9 == iArr.length) {
            int i10 = i9 * 2;
            this.stack = java.util.Arrays.copyOf(iArr, i10);
            this.pathIndices = java.util.Arrays.copyOf(this.pathIndices, i10);
            this.pathNames = (java.lang.String[]) java.util.Arrays.copyOf(this.pathNames, i10);
        }
        int[] iArr2 = this.stack;
        int i11 = this.stackSize;
        this.stackSize = i11 + 1;
        iArr2[i11] = i3;
    }

    private char readEscapeCharacter() throws java.io.IOException {
        int i3;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i9 = this.pos;
        int i10 = i9 + 1;
        this.pos = i10;
        char c9 = cArr[i9];
        if (c9 == '\n') {
            this.lineNumber++;
            this.lineStart = i10;
            return c9;
        }
        if (c9 == '\"' || c9 == '\'' || c9 == '/' || c9 == '\\') {
            return c9;
        }
        if (c9 == 'b') {
            return '\b';
        }
        if (c9 == 'f') {
            return '\f';
        }
        if (c9 == 'n') {
            return '\n';
        }
        if (c9 == 'r') {
            return '\r';
        }
        if (c9 == 't') {
            return '\t';
        }
        if (c9 != 'u') {
            throw syntaxError("Invalid escape sequence");
        }
        if (i9 + 5 > this.limit && !fillBuffer(4)) {
            throw syntaxError("Unterminated escape sequence");
        }
        int i11 = this.pos;
        int i12 = i11 + 4;
        char c10 = 0;
        while (i11 < i12) {
            char c11 = this.buffer[i11];
            char c12 = (char) (c10 << 4);
            if (c11 >= '0' && c11 <= '9') {
                i3 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i3 = c11 - 'W';
            } else {
                if (c11 < 'A' || c11 > 'F') {
                    throw new java.lang.NumberFormatException("\\u".concat(new java.lang.String(this.buffer, this.pos, 4)));
                }
                i3 = c11 - '7';
            }
            c10 = (char) (i3 + c12);
            i11++;
        }
        this.pos += 4;
        return c10;
    }

    private void skipQuotedValue(char c9) throws java.io.IOException {
        char[] cArr = this.buffer;
        do {
            int i3 = this.pos;
            int i9 = this.limit;
            while (i3 < i9) {
                int i10 = i3 + 1;
                char c10 = cArr[i3];
                if (c10 == c9) {
                    this.pos = i10;
                    return;
                }
                if (c10 == '\\') {
                    this.pos = i10;
                    readEscapeCharacter();
                    i3 = this.pos;
                    i9 = this.limit;
                } else {
                    if (c10 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i10;
                    }
                    i3 = i10;
                }
            }
            this.pos = i3;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private boolean skipTo(java.lang.String str) {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i3 = this.pos;
            if (cArr[i3] != '\n') {
                for (int i9 = 0; i9 < length; i9++) {
                    if (this.buffer[this.pos + i9] == str.charAt(i9)) {
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i3 + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() {
        char c9;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i3 = this.pos;
            int i9 = i3 + 1;
            this.pos = i9;
            c9 = cArr[i3];
            if (c9 == '\n') {
                this.lineNumber++;
                this.lineStart = i9;
                return;
            }
        } while (c9 != '\r');
    }

    private void skipUnquotedValue() throws java.io.IOException {
        do {
            int i3 = 0;
            while (true) {
                int i9 = this.pos;
                if (i9 + i3 < this.limit) {
                    char c9 = this.buffer[i9 + i3];
                    if (c9 != '\t' && c9 != '\n' && c9 != '\f' && c9 != '\r' && c9 != ' ') {
                        if (c9 != '#') {
                            if (c9 != ',') {
                                if (c9 != '/' && c9 != '=') {
                                    if (c9 != '{' && c9 != '}' && c9 != ':') {
                                        if (c9 != ';') {
                                            switch (c9) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i3++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    this.pos += i3;
                    return;
                }
                this.pos = i9 + i3;
            }
        } while (fillBuffer(1));
    }

    private java.io.IOException syntaxError(java.lang.String str) throws io.sentry.vendor.gson.stream.MalformedJsonException {
        java.lang.StringBuilder sbV = p121o0.p.v(str);
        sbV.append(locationString());
        throw new io.sentry.vendor.gson.stream.MalformedJsonException(sbV.toString());
    }

    public void beginArray() throws java.io.IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 3) {
            push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            throw new java.lang.IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + locationString());
        }
    }

    public void beginObject() throws java.io.IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 1) {
            push(3);
            this.peeked = 0;
        } else {
            throw new java.lang.IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + locationString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    public int doPeek() throws java.io.IOException {
        int iNextNonWhitespace;
        int[] iArr = this.stack;
        int i3 = this.stackSize;
        int i9 = iArr[i3 - 1];
        if (i9 == 1) {
            iArr[i3 - 1] = 2;
        } else if (i9 == 2) {
            int iNextNonWhitespace2 = nextNonWhitespace(true);
            if (iNextNonWhitespace2 != 44) {
                if (iNextNonWhitespace2 != 59) {
                    if (iNextNonWhitespace2 != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i3 - 1] = 4;
                if (i9 == 5 && (iNextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (iNextNonWhitespace != 59) {
                        if (iNextNonWhitespace != 125) {
                            throw syntaxError("Unterminated object");
                        }
                        this.peeked = 2;
                        return 2;
                    }
                    checkLenient();
                }
                int iNextNonWhitespace3 = nextNonWhitespace(true);
                if (iNextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (iNextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (iNextNonWhitespace3 == 125) {
                    if (i9 == 5) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 2;
                    return 2;
                }
                checkLenient();
                this.pos--;
                if (!isLiteral((char) iNextNonWhitespace3)) {
                    throw syntaxError("Expected name");
                }
                this.peeked = 14;
                return 14;
            }
            if (i9 == 4) {
                iArr[i3 - 1] = 5;
                int iNextNonWhitespace4 = nextNonWhitespace(true);
                if (iNextNonWhitespace4 != 58) {
                    if (iNextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        int i10 = this.pos;
                        if (cArr[i10] == '>') {
                            this.pos = i10 + 1;
                        }
                    }
                }
            } else if (i9 == 6) {
                if (this.lenient) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
            } else if (i9 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                checkLenient();
                this.pos--;
            } else if (i9 == 8) {
                throw new java.lang.IllegalStateException("JsonReader is closed");
            }
        }
        int iNextNonWhitespace5 = nextNonWhitespace(true);
        if (iNextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (iNextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
            if (iNextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (iNextNonWhitespace5 != 93) {
                if (iNextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos--;
                int iPeekKeyword = peekKeyword();
                if (iPeekKeyword != 0) {
                    return iPeekKeyword;
                }
                int iPeekNumber = peekNumber();
                if (iPeekNumber != 0) {
                    return iPeekNumber;
                }
                if (!isLiteral(this.buffer[this.pos])) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i9 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i9 != 1 && i9 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.pos--;
        this.peeked = 7;
        return 7;
    }

    public void endArray() throws java.io.IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 4) {
            throw new java.lang.IllegalStateException("Expected END_ARRAY but was " + peek() + locationString());
        }
        int i3 = this.stackSize;
        this.stackSize = i3 - 1;
        int[] iArr = this.pathIndices;
        int i9 = i3 - 2;
        iArr[i9] = iArr[i9] + 1;
        this.peeked = 0;
    }

    public void endObject() throws java.io.IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 2) {
            throw new java.lang.IllegalStateException("Expected END_OBJECT but was " + peek() + locationString());
        }
        int i3 = this.stackSize;
        int i9 = i3 - 1;
        this.stackSize = i9;
        this.pathNames[i9] = null;
        int[] iArr = this.pathIndices;
        int i10 = i3 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.peeked = 0;
    }

    public java.lang.String getPath() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$");
        int i3 = this.stackSize;
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = this.stack[i9];
            if (i10 == 1 || i10 == 2) {
                sb.append('[');
                sb.append(this.pathIndices[i9]);
                sb.append(']');
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                sb.append('.');
                java.lang.String str = this.pathNames[i9];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean hasNext() throws java.io.IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        return (iDoPeek == 2 || iDoPeek == 4) ? false : true;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    public java.lang.String locationString() {
        java.lang.StringBuilder sbS = p121o0.p.s(this.lineNumber + 1, (this.pos - this.lineStart) + 1, " at line ", " column ", " path ");
        sbS.append(getPath());
        return sbS.toString();
    }

    public boolean nextBoolean() throws java.io.IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (iDoPeek != 6) {
            throw new java.lang.IllegalStateException("Expected a boolean but was " + peek() + locationString());
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i9 = this.stackSize - 1;
        iArr2[i9] = iArr2[i9] + 1;
        return false;
    }

    public double nextDouble() throws java.io.IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new java.lang.String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else if (iDoPeek == 8 || iDoPeek == 9) {
            this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
        } else if (iDoPeek == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (iDoPeek != 11) {
            throw new java.lang.IllegalStateException("Expected a double but was " + peek() + locationString());
        }
        this.peeked = 11;
        double d4 = java.lang.Double.parseDouble(this.peekedString);
        if (!this.lenient && (java.lang.Double.isNaN(d4) || java.lang.Double.isInfinite(d4))) {
            throw new io.sentry.vendor.gson.stream.MalformedJsonException("JSON forbids NaN and infinities: " + d4 + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i9 = this.stackSize - 1;
        iArr2[i9] = iArr2[i9] + 1;
        return d4;
    }

    public int nextInt() throws java.io.IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            long j = this.peekedLong;
            int i3 = (int) j;
            if (j != i3) {
                throw new java.lang.NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
            }
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i9 = this.stackSize - 1;
            iArr[i9] = iArr[i9] + 1;
            return i3;
        }
        if (iDoPeek == 16) {
            this.peekedString = new java.lang.String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw new java.lang.IllegalStateException("Expected an int but was " + peek() + locationString());
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
            }
            try {
                int i10 = java.lang.Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i11 = this.stackSize - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return i10;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d4 = java.lang.Double.parseDouble(this.peekedString);
        int i12 = (int) d4;
        if (i12 != d4) {
            throw new java.lang.NumberFormatException("Expected an int but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i13 = this.stackSize - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return i12;
    }

    public long nextLong() throws java.io.IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new java.lang.String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw new java.lang.IllegalStateException("Expected a long but was " + peek() + locationString());
            }
            if (iDoPeek == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(iDoPeek == 8 ? '\'' : '\"');
            }
            try {
                long j = java.lang.Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i9 = this.stackSize - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return j;
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d4 = java.lang.Double.parseDouble(this.peekedString);
        long j9 = (long) d4;
        if (j9 != d4) {
            throw new java.lang.NumberFormatException("Expected a long but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i10 = this.stackSize - 1;
        iArr3[i10] = iArr3[i10] + 1;
        return j9;
    }

    public java.lang.String nextName() throws java.io.IOException {
        java.lang.String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            strNextQuotedValue = nextUnquotedValue();
        } else if (iDoPeek == 12) {
            strNextQuotedValue = nextQuotedValue('\'');
        } else {
            if (iDoPeek != 13) {
                throw new java.lang.IllegalStateException("Expected a name but was " + peek() + locationString());
            }
            strNextQuotedValue = nextQuotedValue('\"');
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = strNextQuotedValue;
        return strNextQuotedValue;
    }

    public void nextNull() throws java.io.IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 7) {
            throw new java.lang.IllegalStateException("Expected null but was " + peek() + locationString());
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public java.lang.String nextString() throws java.io.IOException {
        java.lang.String str;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 10) {
            str = nextUnquotedValue();
        } else if (iDoPeek == 8) {
            str = nextQuotedValue('\'');
        } else if (iDoPeek == 9) {
            str = nextQuotedValue('\"');
        } else if (iDoPeek == 11) {
            str = this.peekedString;
            this.peekedString = null;
        } else if (iDoPeek == 15) {
            str = java.lang.Long.toString(this.peekedLong);
        } else {
            if (iDoPeek != 16) {
                throw new java.lang.IllegalStateException("Expected a string but was " + peek() + locationString());
            }
            str = new java.lang.String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    public io.sentry.vendor.gson.stream.JsonToken peek() throws java.io.IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        switch (iDoPeek) {
            case 1:
                return io.sentry.vendor.gson.stream.JsonToken.BEGIN_OBJECT;
            case 2:
                return io.sentry.vendor.gson.stream.JsonToken.END_OBJECT;
            case 3:
                return io.sentry.vendor.gson.stream.JsonToken.BEGIN_ARRAY;
            case 4:
                return io.sentry.vendor.gson.stream.JsonToken.END_ARRAY;
            case 5:
            case 6:
                return io.sentry.vendor.gson.stream.JsonToken.BOOLEAN;
            case 7:
                return io.sentry.vendor.gson.stream.JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return io.sentry.vendor.gson.stream.JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return io.sentry.vendor.gson.stream.JsonToken.NAME;
            case 15:
            case 16:
                return io.sentry.vendor.gson.stream.JsonToken.NUMBER;
            case 17:
                return io.sentry.vendor.gson.stream.JsonToken.END_DOCUMENT;
            default:
                throw new java.lang.AssertionError();
        }
    }

    public final void setLenient(boolean z6) {
        this.lenient = z6;
    }

    public void skipValue() throws java.io.IOException {
        int i3 = 0;
        do {
            int iDoPeek = this.peeked;
            if (iDoPeek == 0) {
                iDoPeek = doPeek();
            }
            if (iDoPeek == 3) {
                push(1);
            } else {
                if (iDoPeek == 1) {
                    push(3);
                } else if (iDoPeek == 4 || iDoPeek == 2) {
                    this.stackSize--;
                    i3--;
                } else if (iDoPeek == 14 || iDoPeek == 10) {
                    skipUnquotedValue();
                } else if (iDoPeek == 8 || iDoPeek == 12) {
                    skipQuotedValue('\'');
                } else if (iDoPeek == 9 || iDoPeek == 13) {
                    skipQuotedValue('\"');
                } else if (iDoPeek == 16) {
                    this.pos += this.peekedNumberLength;
                }
                this.peeked = 0;
            }
            i3++;
            this.peeked = 0;
        } while (i3 != 0);
        int[] iArr = this.pathIndices;
        int i9 = this.stackSize;
        int i10 = i9 - 1;
        iArr[i10] = iArr[i10] + 1;
        this.pathNames[i9 - 1] = "null";
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + locationString();
    }
}
