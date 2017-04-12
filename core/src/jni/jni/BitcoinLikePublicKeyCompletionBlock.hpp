// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#pragma once

#include "../../api/BitcoinLikePublicKeyCompletionBlock.hpp"
#include "djinni_support.hpp"

namespace djinni_generated {

class BitcoinLikePublicKeyCompletionBlock final : ::djinni::JniInterface<::ledger::core::api::BitcoinLikePublicKeyCompletionBlock, BitcoinLikePublicKeyCompletionBlock> {
public:
    using CppType = std::shared_ptr<::ledger::core::api::BitcoinLikePublicKeyCompletionBlock>;
    using CppOptType = std::shared_ptr<::ledger::core::api::BitcoinLikePublicKeyCompletionBlock>;
    using JniType = jobject;

    using Boxed = BitcoinLikePublicKeyCompletionBlock;

    ~BitcoinLikePublicKeyCompletionBlock();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<BitcoinLikePublicKeyCompletionBlock>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<BitcoinLikePublicKeyCompletionBlock>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    BitcoinLikePublicKeyCompletionBlock();
    friend ::djinni::JniClass<BitcoinLikePublicKeyCompletionBlock>;
    friend ::djinni::JniInterface<::ledger::core::api::BitcoinLikePublicKeyCompletionBlock, BitcoinLikePublicKeyCompletionBlock>;

};

}  // namespace djinni_generated