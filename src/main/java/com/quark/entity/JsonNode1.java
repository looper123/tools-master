package com.quark.entity;

import java.util.List;
import java.util.Map;

/**
 * Created by ZhenpengLu on 2018/4/20.
 * 父节点entity
 */
public class JsonNode1 {

    private String  id;
    private String name;
    private List<JsonNode2> jsonNode2s;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JsonNode2> getJsonNode2s() {
        return jsonNode2s;
    }

    public void setJsonNode2s(List<JsonNode2> jsonNode2s) {
        this.jsonNode2s = jsonNode2s;
    }
}
