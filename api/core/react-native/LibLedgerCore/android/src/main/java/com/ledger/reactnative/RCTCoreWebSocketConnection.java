// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from websocket_client.djinni

package com.ledger.reactnative;

import WebSocketConnection;
import co.ledger.core.ErrorCode;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.UUID;;

public class RCTCoreWebSocketConnection extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, WebSocketConnection> javaObjects;

    public RCTCoreWebSocketConnection(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, WebSocketConnection>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreWebSocketConnection";
    }

    @ReactMethod
    public void onConnect(Map<String, String> currentInstance, int connectionId, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            WebSocketConnection currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreWebSocketConnection instance passed to onConnect method");
            }

            currentInstanceObj.onConnect(connectionId);
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    @ReactMethod
    public void onClose(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            WebSocketConnection currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreWebSocketConnection instance passed to onClose method");
            }

            currentInstanceObj.onClose();
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    @ReactMethod
    public void onMessage(Map<String, String> currentInstance, String data, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            WebSocketConnection currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreWebSocketConnection instance passed to onMessage method");
            }

            currentInstanceObj.onMessage(data);
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    @ReactMethod
    public void onError(Map<String, String> currentInstance, ErrorCode code, String message, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            WebSocketConnection currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreWebSocketConnection instance passed to onError method");
            }

            currentInstanceObj.onError(code, message);
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
    @ReactMethod
    public void getConnectionId(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");
            String sType = currentInstance.get("type");

            WebSocketConnection currentInstanceObj = self.javaObjects.get("uid");
            if (!javaObj)
            {
                throw new Exception("Wrong RCTCoreWebSocketConnection instance passed to getConnectionId method");
            }

            int javaResult = currentInstanceObj.getConnectionId();
            Map<String, int> result = new HashMap<String, int>();
            result.put("value", javaResult);

            if(result)
            {
                promise.resolve(result);
            }
            else
            {
                throw new Exception("RCTCoreWebSocketConnection::getConnectionId : Failed to return int from getConnectionId method");
            }
        }
        catch(Exception e)
        {
            promise.reject(ERROR, e);
        }
    }
}
