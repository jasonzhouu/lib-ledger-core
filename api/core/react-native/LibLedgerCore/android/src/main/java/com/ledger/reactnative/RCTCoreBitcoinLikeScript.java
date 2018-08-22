// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_script.djinni

package com.ledger.reactnative;

import BitcoinLikeScript;
import RCTCoreBitcoinLikeScript;
import RCTCoreBitcoinLikeScriptChunk;
import co.ledger.core.BitcoinLikeScript;
import co.ledger.core.BitcoinLikeScriptChunk;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.UUID;;

public class RCTCoreBitcoinLikeScript extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeScript> javaObjects;

    public RCTCoreBitcoinLikeScript(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeScript>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeScript";
    }

    @ReactMethod
    public void head(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            BitcoinLikeScript currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreBitcoinLikeScript instance passed to head method");
            }

            BitcoinLikeScriptChunk javaResult = currentInstanceObj.head();

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeScriptChunk rctImpl_objcResult = (RCTCoreBitcoinLikeScriptChunk)self.bridge moduleForName("RCTCoreBitcoinLikeScriptChunk");
            rctImpl_objcResult.javaObjects.put(uuid, objcResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeScriptChunk");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreBitcoinLikeScript::head : Failed to return BitcoinLikeScriptChunk from head method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    @ReactMethod
    public void toString(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            BitcoinLikeScript currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreBitcoinLikeScript instance passed to toString method");
            }

            String javaResult = currentInstanceObj.toString();
            Map<String, String> result = new HashMap<String, String>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreBitcoinLikeScript::toString : Failed to return String from toString method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    @ReactMethod
    public void parse(Map<String, String> currentInstance, byte[] data, Promise promise) {
        try
        {
            BitcoinLikeScript javaResult = BitcoinLikeScript.parse(data);

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeScript rctImpl_objcResult = (RCTCoreBitcoinLikeScript)self.bridge moduleForName("RCTCoreBitcoinLikeScript");
            rctImpl_objcResult.javaObjects.put(uuid, objcResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeScript");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreBitcoinLikeScript::parse : Failed to return BitcoinLikeScript from parse method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
}
