// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from configuration.djinni

#import "LGConfiguration+Private.h"
#import "LGConfiguration.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGConfiguration ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::Configuration>&)cppRef;

@end

@implementation LGConfiguration {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::Configuration>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::Configuration>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}


namespace djinni_generated {

auto Configuration::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto Configuration::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGConfiguration>(cpp);
}

}  // namespace djinni_generated

@end