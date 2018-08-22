// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from amount.djinni

package com.ledger.reactnative;

import FormatRules;
import co.ledger.core.RoundingMode;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.UUID;;

/**TODO */
public class RCTCoreFormatRules extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, FormatRules> javaObjects;

    public RCTCoreFormatRules(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, FormatRules>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreFormatRules";
    }
    public static void init(RoundingMode roundingMode, int maxNumberOfDecimals, Promise promise) {
        FormatRules javaResult = FormatRules.init(roundingMode, maxNumberOfDecimals);

        String uuid = UUID.randomUUID().toString();
        self.bridge.javaObjects.put(uuid, javaResult);
        Map<String, String> finalResult = new HashMap<String, String>();
        finalResult.put("type","RCTCoreFormatRules");
        finalResult.put("uid",uuid);
        promise.resolve(finalResult);
    }
}
