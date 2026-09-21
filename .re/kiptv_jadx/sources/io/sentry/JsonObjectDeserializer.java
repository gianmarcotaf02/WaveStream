package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonObjectDeserializer {
    private final java.util.ArrayList<io.sentry.JsonObjectDeserializer.Token> tokens = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: io.sentry.JsonObjectDeserializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$vendor$gson$stream$JsonToken;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.JsonToken.values().length];
            $SwitchMap$io$sentry$vendor$gson$stream$JsonToken = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.JsonToken.NAME.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.JsonToken.STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.JsonToken.NUMBER.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.JsonToken.BOOLEAN.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.JsonToken.NULL.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[io.sentry.vendor.gson.stream.JsonToken.END_DOCUMENT.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    public interface NextValue {
        java.lang.Object nextValue();
    }

    public interface Token {
        java.lang.Object getValue();
    }

    public static final class TokenName implements io.sentry.JsonObjectDeserializer.Token {
        final java.lang.String value;

        public TokenName(java.lang.String str) {
            this.value = str;
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public java.lang.Object getValue() {
            return this.value;
        }
    }

    public static final class TokenPrimitive implements io.sentry.JsonObjectDeserializer.Token {
        final java.lang.Object value;

        public TokenPrimitive(java.lang.Object obj) {
            this.value = obj;
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public java.lang.Object getValue() {
            return this.value;
        }
    }

    private io.sentry.JsonObjectDeserializer.Token getCurrentToken() {
        if (this.tokens.isEmpty()) {
            return null;
        }
        return (io.sentry.JsonObjectDeserializer.Token) com.google.android.gms.internal.play_billing.M0.j(1, this.tokens);
    }

    private boolean handleArrayOrMapEnd() {
        if (hasOneToken()) {
            return true;
        }
        io.sentry.JsonObjectDeserializer.Token currentToken = getCurrentToken();
        popCurrentToken();
        if (!(getCurrentToken() instanceof io.sentry.JsonObjectDeserializer.TokenName)) {
            if (!(getCurrentToken() instanceof io.sentry.JsonObjectDeserializer.TokenArray)) {
                return false;
            }
            io.sentry.JsonObjectDeserializer.TokenArray tokenArray = (io.sentry.JsonObjectDeserializer.TokenArray) getCurrentToken();
            if (currentToken == null || tokenArray == null) {
                return false;
            }
            tokenArray.value.add(currentToken.getValue());
            return false;
        }
        io.sentry.JsonObjectDeserializer.TokenName tokenName = (io.sentry.JsonObjectDeserializer.TokenName) getCurrentToken();
        popCurrentToken();
        io.sentry.JsonObjectDeserializer.TokenMap tokenMap = (io.sentry.JsonObjectDeserializer.TokenMap) getCurrentToken();
        if (tokenName == null || currentToken == null || tokenMap == null) {
            return false;
        }
        tokenMap.value.put(tokenName.value, currentToken.getValue());
        return false;
    }

    private boolean handlePrimitive(io.sentry.JsonObjectDeserializer.NextValue nextValue) {
        java.lang.Object objNextValue = nextValue.nextValue();
        if (getCurrentToken() == null && objNextValue != null) {
            pushCurrentToken(new io.sentry.JsonObjectDeserializer.TokenPrimitive(objNextValue));
            return true;
        }
        if (getCurrentToken() instanceof io.sentry.JsonObjectDeserializer.TokenName) {
            io.sentry.JsonObjectDeserializer.TokenName tokenName = (io.sentry.JsonObjectDeserializer.TokenName) getCurrentToken();
            popCurrentToken();
            ((io.sentry.JsonObjectDeserializer.TokenMap) getCurrentToken()).value.put(tokenName.value, objNextValue);
            return false;
        }
        if (!(getCurrentToken() instanceof io.sentry.JsonObjectDeserializer.TokenArray)) {
            return false;
        }
        ((io.sentry.JsonObjectDeserializer.TokenArray) getCurrentToken()).value.add(objNextValue);
        return false;
    }

    private boolean hasOneToken() {
        return this.tokens.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$parse$2(io.sentry.JsonObjectReader jsonObjectReader) {
        return java.lang.Boolean.valueOf(jsonObjectReader.nextBoolean());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object lambda$parse$3() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: nextNumber, reason: merged with bridge method [inline-methods] */
    public java.lang.Object lambda$parse$1(io.sentry.JsonObjectReader jsonObjectReader) {
        try {
            try {
                return java.lang.Integer.valueOf(jsonObjectReader.nextInt());
            } catch (java.lang.Exception unused) {
                return java.lang.Double.valueOf(jsonObjectReader.nextDouble());
            }
        } catch (java.lang.Exception unused2) {
            return java.lang.Long.valueOf(jsonObjectReader.nextLong());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void parse(final io.sentry.JsonObjectReader jsonObjectReader) {
        boolean zHandleArrayOrMapEnd;
        io.sentry.JsonObjectDeserializer.AnonymousClass1 anonymousClass1 = null;
        switch (io.sentry.JsonObjectDeserializer.AnonymousClass1.$SwitchMap$io$sentry$vendor$gson$stream$JsonToken[jsonObjectReader.peek().ordinal()]) {
            case 1:
                jsonObjectReader.beginArray();
                pushCurrentToken(new io.sentry.JsonObjectDeserializer.TokenArray(anonymousClass1));
                zHandleArrayOrMapEnd = false;
                break;
            case 2:
                jsonObjectReader.endArray();
                zHandleArrayOrMapEnd = handleArrayOrMapEnd();
                break;
            case 3:
                jsonObjectReader.beginObject();
                pushCurrentToken(new io.sentry.JsonObjectDeserializer.TokenMap(anonymousClass1));
                zHandleArrayOrMapEnd = false;
                break;
            case 4:
                jsonObjectReader.endObject();
                zHandleArrayOrMapEnd = handleArrayOrMapEnd();
                break;
            case 5:
                pushCurrentToken(new io.sentry.JsonObjectDeserializer.TokenName(jsonObjectReader.nextName()));
                zHandleArrayOrMapEnd = false;
                break;
            case 6:
                final int i3 = 0;
                zHandleArrayOrMapEnd = handlePrimitive(new io.sentry.JsonObjectDeserializer.NextValue() { // from class: io.sentry.e
                    @Override // io.sentry.JsonObjectDeserializer.NextValue
                    public final java.lang.Object nextValue() {
                        switch (i3) {
                            case 0:
                                return jsonObjectReader.nextString();
                            default:
                                return io.sentry.JsonObjectDeserializer.lambda$parse$2(jsonObjectReader);
                        }
                    }
                });
                break;
            case 7:
                zHandleArrayOrMapEnd = handlePrimitive(new io.sentry.f(this, jsonObjectReader, 0));
                break;
            case 8:
                final int i9 = 1;
                zHandleArrayOrMapEnd = handlePrimitive(new io.sentry.JsonObjectDeserializer.NextValue() { // from class: io.sentry.e
                    @Override // io.sentry.JsonObjectDeserializer.NextValue
                    public final java.lang.Object nextValue() {
                        switch (i9) {
                            case 0:
                                return jsonObjectReader.nextString();
                            default:
                                return io.sentry.JsonObjectDeserializer.lambda$parse$2(jsonObjectReader);
                        }
                    }
                });
                break;
            case 9:
                jsonObjectReader.nextNull();
                zHandleArrayOrMapEnd = handlePrimitive(new io.sentry.g(0));
                break;
            case 10:
                zHandleArrayOrMapEnd = true;
                break;
            default:
                zHandleArrayOrMapEnd = false;
                break;
        }
        if (zHandleArrayOrMapEnd) {
            return;
        }
        parse(jsonObjectReader);
    }

    private void popCurrentToken() {
        if (this.tokens.isEmpty()) {
            return;
        }
        java.util.ArrayList<io.sentry.JsonObjectDeserializer.Token> arrayList = this.tokens;
        arrayList.remove(arrayList.size() - 1);
    }

    private void pushCurrentToken(io.sentry.JsonObjectDeserializer.Token token) {
        this.tokens.add(token);
    }

    public java.lang.Object deserialize(io.sentry.JsonObjectReader jsonObjectReader) {
        parse(jsonObjectReader);
        io.sentry.JsonObjectDeserializer.Token currentToken = getCurrentToken();
        if (currentToken != null) {
            return currentToken.getValue();
        }
        return null;
    }

    public static final class TokenArray implements io.sentry.JsonObjectDeserializer.Token {
        final java.util.ArrayList<java.lang.Object> value;

        private TokenArray() {
            this.value = new java.util.ArrayList<>();
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public java.lang.Object getValue() {
            return this.value;
        }

        public /* synthetic */ TokenArray(io.sentry.JsonObjectDeserializer.AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static final class TokenMap implements io.sentry.JsonObjectDeserializer.Token {
        final java.util.HashMap<java.lang.String, java.lang.Object> value;

        private TokenMap() {
            this.value = new java.util.HashMap<>();
        }

        @Override // io.sentry.JsonObjectDeserializer.Token
        public java.lang.Object getValue() {
            return this.value;
        }

        public /* synthetic */ TokenMap(io.sentry.JsonObjectDeserializer.AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
