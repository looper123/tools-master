import com.google.gson.Gson;
import com.quark.entity.JsonNode1;
import com.quark.entity.JsonNode2;
import com.quark.entity.JsonNode3;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZhenpengLu on 2018/4/20.
 * 复杂json格式的解析
 * @see com.quark.entity.JsonNode1,com.quark.entity.JsonNode2,com.quark.entity.JsonNode3
 */
public class ComplexJsonAnalyzerTest {

    @Test
    public void entityTest(){
        Gson gson = new Gson();
        JsonNode1 jsonNode1 = new JsonNode1();
        JsonNode2 jsonNode2 = new JsonNode2();
        JsonNode3 jsonNode3 = new JsonNode3();
        List<String>  strings = new ArrayList<>();
        strings.add("right");
        strings.add("left");
        strings.add("mid");
        jsonNode3.setStrings(strings);
        jsonNode3.setId("3");
        jsonNode3.setName("jsonNode3");
        List<JsonNode3>  node3s = new ArrayList<>();
        node3s.add(jsonNode3);
        jsonNode2.setId("2");
        jsonNode2.setName("jsonNode2");
        jsonNode2.setJsonNode3s(node3s);
        List<JsonNode2>  node2s = new ArrayList<>();
        node2s.add(jsonNode2);
        jsonNode1.setId("1");
        jsonNode1.setName("jsonNode1");
        jsonNode1.setJsonNode2s(node2s);
        Map<String, Object> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","success");
        map.put("jsonNode1",jsonNode1);
        String json = gson.toJson(map);
        System.out.println(json);
    }

    @Test
    public void mapTest(){
        Gson gson = new Gson();
        Map<String,Object> map1 = new HashMap();
        Map<String,Object> map2 = new HashMap();
        Map<String,Object> map3= new HashMap();
        List<String>  strings3 = new ArrayList<>();
        strings3.add("right");
        strings3.add("left");
        strings3.add("mid");
        map3.put("strings",strings3);
        map3.put("id","3");
        map3.put("name","jsonNode3");
        List<Map>  node3List = new ArrayList<>();
        node3List.add(map3);
        map2.put("strings",strings3);
        map2.put("id","2");
        map2.put("name","jsonNode2");
        map2.put("node3List",node3List);
        List<Map>  node2List = new ArrayList<>();
        node2List.add(map2);
        map1.put("strings",strings3);
        map1.put("id","1");
        map1.put("name","jsonNode1");
        map1.put("node2List",node2List);
        List<Map>  node1List = new ArrayList<>();
        node1List.add(map1);
        Map<String, Object> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","success");
        map.put("node1List",node1List);
        String json = gson.toJson(map);
        System.out.println(json);
    }

    @Test
    public void mapToStringTest(){
        Gson gson = new Gson();
        Map<String,Object> map1 = new HashMap();
        Map<String,Object> map2 = new HashMap();
        Map<String,Object> map3= new HashMap();
        List<String>  strings3 = new ArrayList<>();
        strings3.add("right");
        strings3.add("left");
        strings3.add("mid");
        map3.put("strings",strings3);
        map3.put("id","3");
        map3.put("name","jsonNode3");
        List<String>  node3List = new ArrayList<>();
        node3List.add(gson.toJson(map3));
        map2.put("strings",strings3);
        map2.put("id","2");
        map2.put("name","jsonNode2");
        map2.put("node3List",node3List);
        List<String>  node2List = new ArrayList<>();
        node2List.add(gson.toJson(map2));
        map1.put("strings",strings3);
        map1.put("id","1");
        map1.put("name","jsonNode1");
        map1.put("node2List",node2List);
        List<String>  node1List = new ArrayList<>();
        node1List.add(gson.toJson(map1));
        Map<String, Object> map = new HashMap<>();
        map.put("code","200");
        map.put("msg","success");
        map.put("node1List",node1List);
        String json = gson.toJson(map);
        System.out.println(json);
    }
}
