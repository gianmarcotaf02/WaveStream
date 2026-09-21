package io.ktor.http.cio.internals;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001FB\u0017\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b&\u0010\rJ\u001f\u0010'\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u0011J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010+H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010%J\u001b\u00100\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u00101J-\u00100\u001a\u00060\u0002j\u0002`\u00032\b\u0010/\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b0\u00102J\u001d\u00100\u001a\u00060\u0002j\u0002`\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b0\u00103J\r\u00105\u001a\u000204¢\u0006\u0004\b5\u00106R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u00109R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010\u001d\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001d\u0010D\u001a\u0004\bE\u0010%¨\u0006G"}, d2 = {"Lio/ktor/http/cio/internals/CharArrayBuilder;", "", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Lio/ktor/utils/io/pool/ObjectPool;", "", "pool", "<init>", "(Lio/ktor/utils/io/pool/ObjectPool;)V", "", "index", "", "getImpl", "(I)C", "startIndex", "endIndex", "copy", "(II)Ljava/lang/CharSequence;", "bufferForIndex", "(I)[C", "", "throwSingleBuffer", "(I)Ljava/lang/Void;", "nonFullBuffer", "()[C", "appendNewArray", androidx.media3.extractor.text.ttml.TtmlNode.START, io.sentry.protocol.Request.JsonKeys.OTHER, "otherStart", io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH, "", "rangeEqualsImpl", "(ILjava/lang/CharSequence;II)Z", androidx.media3.extractor.text.ttml.TtmlNode.END, "hashCodeImpl", "(II)I", "currentPosition", "()I", "get", "subSequence", "", "toString", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "value", "append", "(C)Ljava/lang/Appendable;", "(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "(Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "Lh6/A;", "release", "()V", "Lio/ktor/utils/io/pool/ObjectPool;", "getPool", "()Lio/ktor/utils/io/pool/ObjectPool;", "", "buffers", "Ljava/util/List;", io.sentry.protocol.SentryThread.JsonKeys.CURRENT, "[C", "stringified", "Ljava/lang/String;", "released", "Z", "remaining", "I", "getLength", "SubSequenceImpl", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CharArrayBuilder implements java.lang.CharSequence, java.lang.Appendable {
    private java.util.List<char[]> buffers;
    private char[] current;
    private int length;
    private final io.ktor.utils.io.pool.ObjectPool<char[]> pool;
    private boolean released;
    private int remaining;
    private java.lang.String stringified;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006 "}, d2 = {"Lio/ktor/http/cio/internals/CharArrayBuilder$SubSequenceImpl;", "", "", androidx.media3.extractor.text.ttml.TtmlNode.START, androidx.media3.extractor.text.ttml.TtmlNode.END, "<init>", "(Lio/ktor/http/cio/internals/CharArrayBuilder;II)V", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getStart", "getEnd", "stringified", "Ljava/lang/String;", "getLength", io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH, "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public final class SubSequenceImpl implements java.lang.CharSequence {
        private final int end;
        private final int start;
        private java.lang.String stringified;

        public SubSequenceImpl(int i3, int i9) {
            this.start = i3;
            this.end = i9;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i3) {
            return get(i3);
        }

        public boolean equals(java.lang.Object other) {
            if (!(other instanceof java.lang.CharSequence)) {
                return false;
            }
            java.lang.CharSequence charSequence = (java.lang.CharSequence) other;
            if (charSequence.length() != length()) {
                return false;
            }
            return io.ktor.http.cio.internals.CharArrayBuilder.this.rangeEqualsImpl(this.start, charSequence, 0, length());
        }

        public char get(int index) {
            int i3 = this.start + index;
            if (index < 0) {
                throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(index, "index is negative: ").toString());
            }
            if (i3 < this.end) {
                return io.ktor.http.cio.internals.CharArrayBuilder.this.getImpl(i3);
            }
            throw new java.lang.IllegalArgumentException(Y6.f.j(p121o0.p.t(index, "index (", ") should be less than length ("), length(), ')').toString());
        }

        public final int getEnd() {
            return this.end;
        }

        public int getLength() {
            return this.end - this.start;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            java.lang.String str = this.stringified;
            return str != null ? str.hashCode() : io.ktor.http.cio.internals.CharArrayBuilder.this.hashCodeImpl(this.start, this.end);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return getLength();
        }

        @Override // java.lang.CharSequence
        public java.lang.CharSequence subSequence(int startIndex, int endIndex) {
            if (startIndex < 0) {
                throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(startIndex, "start is negative: ").toString());
            }
            if (startIndex <= endIndex) {
                int i3 = this.end;
                int i9 = this.start;
                if (endIndex <= i3 - i9) {
                    return startIndex == endIndex ? "" : io.ktor.http.cio.internals.CharArrayBuilder.this.new SubSequenceImpl(startIndex + i9, i9 + endIndex);
                }
                throw new java.lang.IllegalArgumentException(Y6.f.j(new java.lang.StringBuilder("end should be less than length ("), length(), ')').toString());
            }
            throw new java.lang.IllegalArgumentException(("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')').toString());
        }

        @Override // java.lang.CharSequence
        public java.lang.String toString() {
            java.lang.String str = this.stringified;
            if (str != null) {
                return str;
            }
            java.lang.String string = io.ktor.http.cio.internals.CharArrayBuilder.this.copy(this.start, this.end).toString();
            this.stringified = string;
            return string;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CharArrayBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final char[] appendNewArray() {
        java.util.List list;
        char[] cArrBorrow = this.pool.borrow();
        char[] cArr = this.current;
        this.current = cArrBorrow;
        this.remaining = cArrBorrow.length;
        this.released = false;
        if (cArr != null) {
            java.util.List<char[]> list2 = this.buffers;
            if (list2 == null) {
                list = list2;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.buffers = arrayList;
                arrayList.add(cArr);
                list = arrayList;
            }
            list = list2;
            list.add(cArrBorrow);
        }
        return cArrBorrow;
    }

    private final char[] bufferForIndex(int index) {
        java.util.List<char[]> list = this.buffers;
        if (list != null) {
            char[] cArr = this.current;
            kotlin.jvm.internal.m.b(cArr);
            return list.get(index / cArr.length);
        }
        if (index >= 2048) {
            throwSingleBuffer(index);
            throw new I3.b();
        }
        char[] cArr2 = this.current;
        if (cArr2 != null) {
            return cArr2;
        }
        throwSingleBuffer(index);
        throw new I3.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.CharSequence copy(int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(endIndex - startIndex);
        for (int i3 = startIndex - (startIndex % 2048); i3 < endIndex; i3 += 2048) {
            char[] cArrBufferForIndex = bufferForIndex(i3);
            int iMin = java.lang.Math.min(endIndex - i3, 2048);
            for (int iMax = java.lang.Math.max(0, startIndex - i3); iMax < iMin; iMax++) {
                sb.append(cArrBufferForIndex[iMax]);
            }
        }
        return sb;
    }

    private final int currentPosition() {
        char[] cArr = this.current;
        kotlin.jvm.internal.m.b(cArr);
        return cArr.length - this.remaining;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final char getImpl(int index) {
        char[] cArrBufferForIndex = bufferForIndex(index);
        char[] cArr = this.current;
        kotlin.jvm.internal.m.b(cArr);
        return cArrBufferForIndex[index % cArr.length];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int hashCodeImpl(int start, int end) {
        int impl = 0;
        while (start < end) {
            impl = (impl * 31) + getImpl(start);
            start++;
        }
        return impl;
    }

    private final char[] nonFullBuffer() {
        if (this.remaining == 0) {
            return appendNewArray();
        }
        char[] cArr = this.current;
        kotlin.jvm.internal.m.b(cArr);
        return cArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean rangeEqualsImpl(int start, java.lang.CharSequence other, int otherStart, int length) {
        for (int i3 = 0; i3 < length; i3++) {
            if (getImpl(start + i3) != other.charAt(otherStart + i3)) {
                return false;
            }
        }
        return true;
    }

    private final java.lang.Void throwSingleBuffer(int index) {
        if (this.released) {
            throw new java.lang.IllegalStateException("Buffer is already released");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(index);
        sb.append(" is not in range [0; ");
        throw new java.lang.IndexOutOfBoundsException(Y6.f.j(sb, currentPosition(), ')'));
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(char value) {
        char[] cArrNonFullBuffer = nonFullBuffer();
        char[] cArr = this.current;
        kotlin.jvm.internal.m.b(cArr);
        int length = cArr.length;
        int i3 = this.remaining;
        cArrNonFullBuffer[length - i3] = value;
        this.stringified = null;
        this.remaining = i3 - 1;
        this.length = length() + 1;
        return this;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i3) {
        return get(i3);
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof java.lang.CharSequence)) {
            return false;
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) other;
        if (length() != charSequence.length()) {
            return false;
        }
        return rangeEqualsImpl(0, charSequence, 0, length());
    }

    public char get(int index) {
        if (index < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(index, "index is negative: ").toString());
        }
        if (index < length()) {
            return getImpl(index);
        }
        java.lang.StringBuilder sbT = p121o0.p.t(index, "index ", " is not in range [0, ");
        sbT.append(length());
        sbT.append(')');
        throw new java.lang.IllegalArgumentException(sbT.toString().toString());
    }

    public int getLength() {
        return this.length;
    }

    public final io.ktor.utils.io.pool.ObjectPool<char[]> getPool() {
        return this.pool;
    }

    public int hashCode() {
        java.lang.String str = this.stringified;
        return str != null ? str.hashCode() : hashCodeImpl(0, length());
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final void release() {
        java.util.List<char[]> list = this.buffers;
        if (list != null) {
            this.current = null;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.pool.recycle(list.get(i3));
            }
        } else {
            char[] cArr = this.current;
            if (cArr != null) {
                this.pool.recycle(cArr);
            }
            this.current = null;
        }
        this.released = true;
        this.buffers = null;
        this.stringified = null;
        this.length = 0;
        this.remaining = 0;
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            throw new java.lang.IllegalArgumentException(("startIndex (" + startIndex + ") should be less or equal to endIndex (" + endIndex + ')').toString());
        }
        if (startIndex < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(startIndex, "startIndex is negative: ").toString());
        }
        if (endIndex <= length()) {
            return new io.ktor.http.cio.internals.CharArrayBuilder.SubSequenceImpl(startIndex, endIndex);
        }
        java.lang.StringBuilder sbT = p121o0.p.t(endIndex, "endIndex (", ") is greater than length (");
        sbT.append(length());
        sbT.append(')');
        throw new java.lang.IllegalArgumentException(sbT.toString().toString());
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        java.lang.String str = this.stringified;
        if (str != null) {
            return str;
        }
        java.lang.String string = copy(0, length()).toString();
        this.stringified = string;
        return string;
    }

    public CharArrayBuilder(io.ktor.utils.io.pool.ObjectPool<char[]> pool) {
        kotlin.jvm.internal.m.e(pool, "pool");
        this.pool = pool;
    }

    public /* synthetic */ CharArrayBuilder(io.ktor.utils.io.pool.ObjectPool objectPool, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? io.ktor.http.cio.internals.CharArrayPoolKt.getCharArrayPool() : objectPool);
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence value, int startIndex, int endIndex) {
        if (value == null) {
            return this;
        }
        int i3 = startIndex;
        while (i3 < endIndex) {
            char[] cArrNonFullBuffer = nonFullBuffer();
            int length = cArrNonFullBuffer.length;
            int i9 = this.remaining;
            int i10 = length - i9;
            int iMin = java.lang.Math.min(endIndex - i3, i9);
            for (int i11 = 0; i11 < iMin; i11++) {
                cArrNonFullBuffer[i10 + i11] = value.charAt(i3 + i11);
            }
            i3 += iMin;
            this.remaining -= iMin;
        }
        this.stringified = null;
        this.length = (endIndex - startIndex) + length();
        return this;
    }

    @Override // java.lang.Appendable
    public java.lang.Appendable append(java.lang.CharSequence value) {
        return value == null ? this : append(value, 0, value.length());
    }
}
