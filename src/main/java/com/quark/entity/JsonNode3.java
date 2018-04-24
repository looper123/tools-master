package com.quark.entity;

import java.util.List;

/**
 * Created by ZhenpengLu on 2018/4/20.
 * 孙子节点entity
 */
public class JsonNode3 {

    private String  id;
    private String name;
    private List<String> strings;

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

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
}
