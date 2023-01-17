package com.postman.collection;

import com.google.gson.*;
import java.util.UUID;

public class PostmanAuth implements IPostmanCollectionElement {
    private transient String key = UUID.randomUUID().toString();    
    private String type = "";
    private PostmanAPIKey[] apikey = null;
    
    
    public String getType() {
        return type;
    }

    
    @Override
    public String getKey() {
        
        return type;
    }


    public boolean isValid() {
        return true;
    }

    


    @Override
    public String toJson(boolean escaped, enumVariableResolution variableStrategy) {
        
        return new Gson().toJson(this);
    }


    public void setType(String type) {
        this.type = type;
    }

    public PostmanAPIKey[] getApikey() {
        return apikey;
    }

    public void setApikey(PostmanAPIKey[] apikey) {
        this.apikey = apikey;
    }

    public PostmanAuth(String type, PostmanAPIKey[] apikey) {
        this.type = type;
        this.apikey = apikey;
    }

}
