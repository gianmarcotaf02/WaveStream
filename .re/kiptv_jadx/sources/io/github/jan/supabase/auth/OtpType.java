package io.github.jan.supabase.auth;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lio/github/jan/supabase/auth/OtpType;", "", "type", "", "getType", "()Ljava/lang/String;", "Email", "Phone", "Lio/github/jan/supabase/auth/OtpType$Email;", "Lio/github/jan/supabase/auth/OtpType$Phone;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface OtpType {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lio/github/jan/supabase/auth/OtpType$Email;", "Lio/github/jan/supabase/auth/OtpType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "MAGIC_LINK", "SIGNUP", "INVITE", "RECOVERY", "EMAIL_CHANGE", "EMAIL", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum Email implements io.github.jan.supabase.auth.OtpType {
        MAGIC_LINK("magiclink"),
        SIGNUP("signup"),
        INVITE("invite"),
        RECOVERY("recovery"),
        EMAIL_CHANGE("email_change"),
        EMAIL("email");

        private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());
        private final java.lang.String type;

        Email(java.lang.String str) {
            this.type = str;
        }

        public static p126o6.a getEntries() {
            return $ENTRIES;
        }

        @Override // io.github.jan.supabase.auth.OtpType
        public java.lang.String getType() {
            return this.type;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/github/jan/supabase/auth/OtpType$Phone;", "Lio/github/jan/supabase/auth/OtpType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "SMS", "PHONE_CHANGE", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum Phone implements io.github.jan.supabase.auth.OtpType {
        SMS("sms"),
        PHONE_CHANGE("phone_change");

        private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());
        private final java.lang.String type;

        Phone(java.lang.String str) {
            this.type = str;
        }

        public static p126o6.a getEntries() {
            return $ENTRIES;
        }

        @Override // io.github.jan.supabase.auth.OtpType
        public java.lang.String getType() {
            return this.type;
        }
    }

    java.lang.String getType();
}
