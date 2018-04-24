package com.quark.entity;

import java.util.List;

/**
 * Created by ZhenpengLu on 2018/4/20.
 * 子节点entity
 */
public class JsonNode2 {

    private String  id;
    private String name;
    private List<JsonNode3> jsonNode3s;

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

    public List<JsonNode3> getJsonNode3s() {
        return jsonNode3s;
    }

    public void setJsonNode3s(List<JsonNode3> jsonNode3s) {
        this.jsonNode3s = jsonNode3s;
    }
}
