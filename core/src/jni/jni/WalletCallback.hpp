// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#ifndef DJINNI_GENERATED_WALLETCALLBACK_HPP_JNI_
#define DJINNI_GENERATED_WALLETCALLBACK_HPP_JNI_

#include "../../api/WalletCallback.hpp"
#include "djinni_support.hpp"

namespace djinni_generated {

class WalletCallback final : ::djinni::JniInterface<::ledger::core::api::WalletCallback, WalletCallback> {
public:
    using CppType = std::shared_ptr<::ledger::core::api::WalletCallback>;
    using CppOptType = std::shared_ptr<::ledger::core::api::WalletCallback>;
    using JniType = jobject;

    using Boxed = WalletCallback;

    ~WalletCallback();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<WalletCallback>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<WalletCallback>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    WalletCallback();
    friend ::djinni::JniClass<WalletCallback>;
    friend ::djinni::JniInterface<::ledger::core::api::WalletCallback, WalletCallback>;

    class JavaProxy final : ::djinni::JavaProxyHandle<JavaProxy>, public ::ledger::core::api::WalletCallback
    {
    public:
        JavaProxy(JniType j);
        ~JavaProxy();

        void onCallback(const std::shared_ptr<::ledger::core::api::Wallet> & result, const std::experimental::optional<::ledger::core::api::Error> & error) override;

    private:
        friend ::djinni::JniInterface<::ledger::core::api::WalletCallback, ::djinni_generated::WalletCallback>;
    };

    const ::djinni::GlobalRef<jclass> clazz { ::djinni::jniFindClass("co/ledger/core/WalletCallback") };
    const jmethodID method_onCallback { ::djinni::jniGetMethodID(clazz.get(), "onCallback", "(Lco/ledger/core/Wallet;Lco/ledger/core/Error;)V") };
};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_WALLETCALLBACK_HPP_JNI_