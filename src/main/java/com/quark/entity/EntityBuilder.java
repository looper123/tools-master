package com.quark.entity;

/**
 * Created by ZhenpengLu on 2018/7/2.
 * 使用java构建器 解决构造函数中参数过多的问题
 */
public class EntityBuilder {

    private String  propA;
    private String  propB;
    private String  propC;
    private String  propD;
    private String  propE;
    private String  propF;

    public EntityBuilder() {
    }

    public EntityBuilder initPropA(String prop){
        this.propA = prop;
        return this;
    }

    public EntityBuilder initPropB(String prop){
        this.propB = prop;
        return this;
    }

    public EntityBuilder initPropC(String prop){
        this.propC = prop;
        return this;
    }

    public EntityBuilder initPropD(String prop){
        this.propD = prop;
        return this;
    }

    public EntityBuilder initPropE(String prop){
        this.propE = prop;
        return this;
    }

    public EntityBuilder initPropF(String prop){
        this.propF = prop;
        return this;
    }

    @Override
    public String toString() {
        return "EntityBuilder{" +
                "propA='" + propA + '\'' +
                ", propB='" + propB + '\'' +
                ", propC='" + propC + '\'' +
                ", propD='" + propD + '\'' +
                ", propE='" + propE + '\'' +
                ", propF='" + propF + '\'' +
                '}';
    }

    public static void main(String[] args) {
        EntityBuilder entityBuilder = new EntityBuilder();
        entityBuilder.initPropA("A")
                .initPropB("B")
                .initPropC("C")
                .initPropD("D")
                .initPropE("E")
                .initPropF("F");
        System.out.println(entityBuilder.toString());
    }


}
