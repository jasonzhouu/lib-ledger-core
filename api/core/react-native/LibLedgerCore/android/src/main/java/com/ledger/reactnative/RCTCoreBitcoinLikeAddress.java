// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

package com.ledger.reactnative;

import BitcoinLikeAddress;
import RCTCoreBitcoinLikeNetworkParameters;
import co.ledger.core.BitcoinLikeNetworkParameters;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.UUID;;

/** Helper class for manipulating Bitcoin like addresses */
public class RCTCoreBitcoinLikeAddress extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, BitcoinLikeAddress> javaObjects;

    public RCTCoreBitcoinLikeAddress(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, BitcoinLikeAddress>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreBitcoinLikeAddress";
    }

    /**
     * Gets the version of the address (P2SH or P2PKH)
     * @return The version of the address
     */
    @ReactMethod
    public void getVersion(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            BitcoinLikeAddress currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreBitcoinLikeAddress instance passed to getVersion method");
            }

            byte[] javaResult = currentInstanceObj.getVersion();
            Map<String, byte[]> result = new HashMap<String, byte[]>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreBitcoinLikeAddress::getVersion : Failed to return byte[] from getVersion method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     * Gets the raw hash160 of the public key
     * @return The 20 bytes of the public key hash160
     */
    @ReactMethod
    public void getHash160(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            BitcoinLikeAddress currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreBitcoinLikeAddress instance passed to getHash160 method");
            }

            byte[] javaResult = currentInstanceObj.getHash160();
            Map<String, byte[]> result = new HashMap<String, byte[]>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreBitcoinLikeAddress::getHash160 : Failed to return byte[] from getHash160 method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     * Gets the network parameters used for serializing the address
     * @return The network parameters of the address
     */
    @ReactMethod
    public void getNetworkParameters(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            BitcoinLikeAddress currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreBitcoinLikeAddress instance passed to getNetworkParameters method");
            }

            BitcoinLikeNetworkParameters javaResult = currentInstanceObj.getNetworkParameters();

            String uuid = UUID.randomUUID().toString();
            RCTCoreBitcoinLikeNetworkParameters rctImpl_objcResult = (RCTCoreBitcoinLikeNetworkParameters)self.bridge moduleForName("RCTCoreBitcoinLikeNetworkParameters");
            rctImpl_objcResult.javaObjects.put(uuid, objcResult);
            Map<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreBitcoinLikeNetworkParameters");
            result.put("uid",uuid);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreBitcoinLikeAddress::getNetworkParameters : Failed to return BitcoinLikeNetworkParameters from getNetworkParameters method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     * Serializes the hash160 into a Base58 encoded address (with checksum)
     * @return The Base58 serialization
     */
    @ReactMethod
    public void toBase58(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            BitcoinLikeAddress currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreBitcoinLikeAddress instance passed to toBase58 method");
            }

            String javaResult = currentInstanceObj.toBase58();
            Map<String, String> result = new HashMap<String, String>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreBitcoinLikeAddress::toBase58 : Failed to return String from toBase58 method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     * Serializes the hash160 to a payment uri (i.e bitcoin:16UwLL9Risc3QfPqBUvKofHmBQ7wMtjvM)
     * @return A payment uri to this address
     * toPaymentUri(): string;
     * Checks if the given address is a P2SH address
     * @return True if the version byte matches the P2SH byte version of the address network parameters
     */
    @ReactMethod
    public void isP2SH(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            BitcoinLikeAddress currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreBitcoinLikeAddress instance passed to isP2SH method");
            }

            boolean javaResult = currentInstanceObj.isP2SH();
            Map<String, boolean> result = new HashMap<String, boolean>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreBitcoinLikeAddress::isP2SH : Failed to return boolean from isP2SH method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    /**
     * Checks if the given address is a P2PKH address
     * @return True if the version byte matches the P2PKH byte version of the address network parameters
     */
    @ReactMethod
    public void isP2PKH(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            BitcoinLikeAddress currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreBitcoinLikeAddress instance passed to isP2PKH method");
            }

            boolean javaResult = currentInstanceObj.isP2PKH();
            Map<String, boolean> result = new HashMap<String, boolean>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreBitcoinLikeAddress::isP2PKH : Failed to return boolean from isP2PKH method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
}
