package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class EnvelopeReader implements io.sentry.IEnvelopeReader {
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    private final io.sentry.ISerializer serializer;

    public EnvelopeReader(io.sentry.ISerializer iSerializer) {
        this.serializer = iSerializer;
    }

    private io.sentry.SentryEnvelopeHeader deserializeEnvelopeHeader(byte[] bArr, int i3, int i9) {
        java.io.StringReader stringReader = new java.io.StringReader(new java.lang.String(bArr, i3, i9, UTF_8));
        try {
            io.sentry.SentryEnvelopeHeader sentryEnvelopeHeader = (io.sentry.SentryEnvelopeHeader) this.serializer.deserialize(stringReader, io.sentry.SentryEnvelopeHeader.class);
            stringReader.close();
            return sentryEnvelopeHeader;
        } catch (java.lang.Throwable th) {
            try {
                stringReader.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private io.sentry.SentryEnvelopeItemHeader deserializeEnvelopeItemHeader(byte[] bArr, int i3, int i9) {
        java.io.StringReader stringReader = new java.io.StringReader(new java.lang.String(bArr, i3, i9, UTF_8));
        try {
            io.sentry.SentryEnvelopeItemHeader sentryEnvelopeItemHeader = (io.sentry.SentryEnvelopeItemHeader) this.serializer.deserialize(stringReader, io.sentry.SentryEnvelopeItemHeader.class);
            stringReader.close();
            return sentryEnvelopeItemHeader;
        } catch (java.lang.Throwable th) {
            try {
                stringReader.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.IEnvelopeReader
    public io.sentry.SentryEnvelope read(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i3 = 0;
        int i9 = -1;
        while (true) {
            try {
                int i10 = inputStream.read(bArr);
                if (i10 <= 0) {
                    break;
                }
                for (int i11 = 0; i9 == -1 && i11 < i10; i11++) {
                    if (bArr[i11] == 10) {
                        i9 = i3 + i11;
                        break;
                    }
                }
                byteArrayOutputStream.write(bArr, 0, i10);
                i3 += i10;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new java.lang.IllegalArgumentException("Empty stream.");
        }
        if (i9 == -1) {
            throw new java.lang.IllegalArgumentException("Envelope contains no header.");
        }
        io.sentry.SentryEnvelopeHeader sentryEnvelopeHeaderDeserializeEnvelopeHeader = deserializeEnvelopeHeader(byteArray, 0, i9);
        if (sentryEnvelopeHeaderDeserializeEnvelopeHeader == null) {
            throw new java.lang.IllegalArgumentException("Envelope header is null.");
        }
        int i12 = i9 + 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            int i13 = i12;
            while (true) {
                if (i13 >= byteArray.length) {
                    i13 = -1;
                    break;
                }
                if (byteArray[i13] == 10) {
                    break;
                }
                i13++;
            }
            if (i13 == -1) {
                throw new java.lang.IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            io.sentry.SentryEnvelopeItemHeader sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader = deserializeEnvelopeItemHeader(byteArray, i12, i13 - i12);
            if (sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader == null || sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader.getLength() <= 0) {
                throw new java.lang.IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
            }
            int length = sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader.getLength() + i13;
            int i14 = length + 1;
            if (i14 > byteArray.length) {
                throw new java.lang.IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i14 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new io.sentry.SentryEnvelopeItem(sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader, java.util.Arrays.copyOfRange(byteArray, i13 + 1, i14)));
            if (i14 == byteArray.length) {
                break;
            }
            i12 = length + 2;
            if (i12 == byteArray.length) {
                if (byteArray[i14] == 10) {
                    break;
                }
                throw new java.lang.IllegalArgumentException("Envelope has invalid data following an item.");
            }
        }
        io.sentry.SentryEnvelope sentryEnvelope = new io.sentry.SentryEnvelope(sentryEnvelopeHeaderDeserializeEnvelopeHeader, arrayList);
        byteArrayOutputStream.close();
        return sentryEnvelope;
    }
}
