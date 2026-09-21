package io.sentry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

public final class EnvelopeReader implements IEnvelopeReader {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final ISerializer serializer;

    public EnvelopeReader(ISerializer iSerializer) {
        this.serializer = iSerializer;
    }

    private SentryEnvelopeHeader deserializeEnvelopeHeader(byte[] bArr, int i3, int i9) {
        StringReader stringReader = new StringReader(new String(bArr, i3, i9, UTF_8));
        try {
            SentryEnvelopeHeader sentryEnvelopeHeader = (SentryEnvelopeHeader) this.serializer.deserialize(stringReader, SentryEnvelopeHeader.class);
            stringReader.close();
            return sentryEnvelopeHeader;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SentryEnvelopeItemHeader deserializeEnvelopeItemHeader(byte[] bArr, int i3, int i9) {
        StringReader stringReader = new StringReader(new String(bArr, i3, i9, UTF_8));
        try {
            SentryEnvelopeItemHeader sentryEnvelopeItemHeader = (SentryEnvelopeItemHeader) this.serializer.deserialize(stringReader, SentryEnvelopeItemHeader.class);
            stringReader.close();
            return sentryEnvelopeItemHeader;
        } catch (Throwable th) {
            try {
                stringReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override
    public SentryEnvelope read(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
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
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i9 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        SentryEnvelopeHeader sentryEnvelopeHeaderDeserializeEnvelopeHeader = deserializeEnvelopeHeader(byteArray, 0, i9);
        if (sentryEnvelopeHeaderDeserializeEnvelopeHeader == null) {
            throw new IllegalArgumentException("Envelope header is null.");
        }
        int i12 = i9 + 1;
        ArrayList arrayList = new ArrayList();
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
                throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
            }
            SentryEnvelopeItemHeader sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader = deserializeEnvelopeItemHeader(byteArray, i12, i13 - i12);
            if (sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader == null || sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader.getLength() <= 0) {
                throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
            }
            int length = sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader.getLength() + i13;
            int i14 = length + 1;
            if (i14 > byteArray.length) {
                throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i14 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
            }
            arrayList.add(new SentryEnvelopeItem(sentryEnvelopeItemHeaderDeserializeEnvelopeItemHeader, Arrays.copyOfRange(byteArray, i13 + 1, i14)));
            if (i14 == byteArray.length) {
                break;
            }
            i12 = length + 2;
            if (i12 == byteArray.length) {
                if (byteArray[i14] == 10) {
                    break;
                }
                throw new IllegalArgumentException("Envelope has invalid data following an item.");
            }
        }
        SentryEnvelope sentryEnvelope = new SentryEnvelope(sentryEnvelopeHeaderDeserializeEnvelopeHeader, arrayList);
        byteArrayOutputStream.close();
        return sentryEnvelope;
    }
}
