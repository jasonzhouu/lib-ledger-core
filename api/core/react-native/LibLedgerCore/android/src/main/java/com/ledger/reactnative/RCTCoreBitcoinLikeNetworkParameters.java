// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

package com.ledger.reactnative;

import BitcoinLikeNetworkParameters;
import co.ledger.core.BitcoinLikeFeePolicy;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.ArrayList;
import java.util.UUID;;

public class RCTCoreBitcoinLikeNetworkParameters extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeNetworkParameters> javaObjects;

    public RCTCoreBitcoinLikeNetworkParameters(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeNetworkParameters>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeNetworkParameters";
    }
    public static void init(String Identifier, byte[] P2PKHVersion, byte[] P2SHVersion, byte[] XPUBVersion, BitcoinLikeFeePolicy FeePolicy, long DustAmount, String MessagePrefix, boolean UsesTimestampedTransaction, long TimestampDelay, byte[] SigHash, ArrayList<String> AdditionalBIPs, Promise promise) {
        BitcoinLikeNetworkParameters javaResult = BitcoinLikeNetworkParameters.init(Identifier, P2PKHVersion, P2SHVersion, XPUBVersion, FeePolicy, DustAmount, MessagePrefix, UsesTimestampedTransaction, TimestampDelay, SigHash, AdditionalBIPs);

        String uuid = UUID.randomUUID().toString();
        self.bridge.javaObjects.put(uuid, javaResult);
        Map<String, String> finalResult = new HashMap<String, String>();
        finalResult.put("type","RCTCoreBitcoinLikeNetworkParameters");
        finalResult.put("uid",uuid);
        promise.resolve(finalResult);
    }
}
