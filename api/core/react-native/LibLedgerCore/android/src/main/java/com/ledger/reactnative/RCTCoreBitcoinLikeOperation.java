// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

package com.ledger.reactnative;

import BitcoinLikeOperation;
import RCTCoreBitcoinLikeTransaction;
import co.ledger.core.BitcoinLikeTransaction;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.UUID;;

/**Class representing a Bitcoin Operation */
public class RCTCoreBitcoinLikeOperation extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeOperation> javaObjects;

    public RCTCoreBitcoinLikeOperation(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeOperation>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeOperation";
    }

    /**
     *Get operation's transaction
     *@return BitcoinLikeTransaction object
     */
    @ReactMethod
    public void getTransaction(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            BitcoinLikeOperation currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreBitcoinLikeOperation instance passed to getTransaction method");
            }

            BitcoinLikeTransaction javaResult = currentInstanceObj.getTransaction();

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeTransaction rctImpl_objcResult = (RCTCoreBitcoinLikeTransaction)self.bridge moduleForName("RCTCoreBitcoinLikeTransaction");
            rctImpl_objcResult.javaObjects.put(uuid, objcResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeTransaction");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreBitcoinLikeOperation::getTransaction : Failed to return BitcoinLikeTransaction from getTransaction method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
}
