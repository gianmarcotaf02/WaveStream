package io.sentry;

import com.google.android.gms.internal.play_billing.M0;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.ArrayList;
import java.util.HashMap;

public final class JsonObjectDeserializer {
    private final ArrayList<Token> tokens = new ArrayList<>();

    public static class AnonymousClass1 {
        static final int[] $SwitchMap$io$sentry$vendor$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$io$sentry$vendor$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface NextValue {
        Object nextValue();
    }

    public interface Token {
        Object getValue();
    }

    public static final class TokenName implements Token {
        final String value;

        public TokenName(String str) {
            this.value = str;
        }

        @Override
        public Object getValue() {
            return this.value;
        }
    }

    public static final class TokenPrimitive implements Token {
        final Object value;

        public TokenPrimitive(Object obj) {
            this.value = obj;
        }

        @Override
        public Object getValue() {
            return this.value;
        }
    }

    private Token getCurrentToken() {
        if (this.tokens.isEmpty()) {
            return null;
        }
        return (Token) M0.j(1, this.tokens);
    }

    private boolean handleArrayOrMapEnd() {
        if (hasOneToken()) {
            return true;
        }
        Token currentToken = getCurrentToken();
        popCurrentToken();
        if (!(getCurrentToken() instanceof TokenName)) {
            if (!(getCurrentToken() instanceof TokenArray)) {
                return false;
            }
            TokenArray tokenArray = (TokenArray) getCurrentToken();
            if (currentToken == null || tokenArray == null) {
                return false;
            }
            tokenArray.value.add(currentToken.getValue());
            return false;
        }
        TokenName tokenName = (TokenName) getCurrentToken();
        popCurrentToken();
        TokenMap tokenMap = (TokenMap) getCurrentToken();
        if (tokenName == null || currentToken == null || tokenMap == null) {
            return false;
        }
        tokenMap.value.put(tokenName.value, currentToken.getValue());
        return false;
    }

    private boolean handlePrimitive(NextValue nextValue) {
        Object objNextValue = nextValue.nextValue();
        if (getCurrentToken() == null && objNextValue != null) {
            pushCurrentToken(new TokenPrimitive(objNextValue));
            return true;
        }
        if (getCurrentToken() instanceof TokenName) {
            TokenName tokenName = (TokenName) getCurrentToken();
            popCurrentToken();
            ((TokenMap) getCurrentToken()).value.put(tokenName.value, objNextValue);
            return false;
        }
        if (!(getCurrentToken() instanceof TokenArray)) {
            return false;
        }
        ((TokenArray) getCurrentToken()).value.add(objNextValue);
        return false;
    }

    private boolean hasOneToken() {
        return this.tokens.size() == 1;
    }

    public static Object lambda$parse$2(JsonObjectReader jsonObjectReader) {
        return Boolean.valueOf(jsonObjectReader.nextBoolean());
    }

    public static Object lambda$parse$3() {
        return null;
    }

    public Object lambda$parse$1(JsonObjectReader jsonObjectReader) {
        try {
            try {
                return Integer.valueOf(jsonObjectReader.nextInt());
            } catch (Exception unused) {
                return Double.valueOf(jsonObjectReader.nextDouble());
            }
        } catch (Exception unused2) {
            return Long.valueOf(jsonObjectReader.nextLong());
        }
    }

    private void parse(final JsonObjectReader jsonObjectReader) {
        boolean zHandleArrayOrMapEnd;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$io$sentry$vendor$gson$stream$JsonToken[jsonObjectReader.peek().ordinal()]) {
            case 1:
                jsonObjectReader.beginArray();
                pushCurrentToken(new TokenArray(anonymousClass1));
                zHandleArrayOrMapEnd = false;
                break;
            case 2:
                jsonObjectReader.endArray();
                zHandleArrayOrMapEnd = handleArrayOrMapEnd();
                break;
            case 3:
                jsonObjectReader.beginObject();
                pushCurrentToken(new TokenMap(anonymousClass1));
                zHandleArrayOrMapEnd = false;
                break;
            case 4:
                jsonObjectReader.endObject();
                zHandleArrayOrMapEnd = handleArrayOrMapEnd();
                break;
            case 5:
                pushCurrentToken(new TokenName(jsonObjectReader.nextName()));
                zHandleArrayOrMapEnd = false;
                break;
            case 6:
                final int i3 = 0;
                zHandleArrayOrMapEnd = handlePrimitive(new NextValue() {
                    @Override
                    public final Object nextValue() {
                        switch (i3) {
                            case 0:
                                return jsonObjectReader.nextString();
                            default:
                                return JsonObjectDeserializer.lambda$parse$2(jsonObjectReader);
                        }
                    }
                });
                break;
            case 7:
                zHandleArrayOrMapEnd = handlePrimitive(new f(this, jsonObjectReader, 0));
                break;
            case 8:
                final int i9 = 1;
                zHandleArrayOrMapEnd = handlePrimitive(new NextValue() {
                    @Override
                    public final Object nextValue() {
                        switch (i9) {
                            case 0:
                                return jsonObjectReader.nextString();
                            default:
                                return JsonObjectDeserializer.lambda$parse$2(jsonObjectReader);
                        }
                    }
                });
                break;
            case 9:
                jsonObjectReader.nextNull();
                zHandleArrayOrMapEnd = handlePrimitive(new g(0));
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
        ArrayList<Token> arrayList = this.tokens;
        arrayList.remove(arrayList.size() - 1);
    }

    private void pushCurrentToken(Token token) {
        this.tokens.add(token);
    }

    public Object deserialize(JsonObjectReader jsonObjectReader) {
        parse(jsonObjectReader);
        Token currentToken = getCurrentToken();
        if (currentToken != null) {
            return currentToken.getValue();
        }
        return null;
    }

    public static final class TokenArray implements Token {
        final ArrayList<Object> value;

        private TokenArray() {
            this.value = new ArrayList<>();
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        public TokenArray(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static final class TokenMap implements Token {
        final HashMap<String, Object> value;

        private TokenMap() {
            this.value = new HashMap<>();
        }

        @Override
        public Object getValue() {
            return this.value;
        }

        public TokenMap(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
