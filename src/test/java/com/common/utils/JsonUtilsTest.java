package com.common.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Before;
import org.junit.Test;

public class JsonUtilsTest {
	
	Map<String, Object> map = null;	
	List<Map<String, Object>> list = null;
	
	String jsonStr = "{\"key01\":\"value01\",\"key02\":\"value02\",\"key03\":\"value03\",\"key04\":\"value04\",\"key05\":\"value05\"}";
	
	JSONObject jsonObject = null;	
	JSONArray jsonArray = null;
	
	@Before
	public void initJsonStringParam() {
		
		map = new HashMap<String, Object>();
		map.put("key01", "value01");
		map.put("key02", "value02");
		map.put("key03", "value03");
		map.put("key04", "value04");
		map.put("key05", "value05");
		
		list = new ArrayList<Map<String, Object>>(); 
		list.add(map);		
		list.add(map);		
		list.add(map);
	}
	
	@SuppressWarnings("unchecked")
	@Before
	public void initJsonObjectParam() {
		
		jsonObject = new JSONObject();
		jsonObject.put("key01", "value01");
		jsonObject.put("key02", "value02");
		jsonObject.put("key03", "value03");
		jsonObject.put("key04", "value04");
		jsonObject.put("key05", "value05");
		
		jsonArray = new JSONArray();
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
		jsonArray.add(jsonObject);
	}

	@Test
	public void testGetJsonStringFromMap() {
		
		String jsonStr = JsonUtils.getJsonStringFromMap(map);
			
		System.out.println("JsonStringFromMap : " + jsonStr);
	}

	@Test
	public void testGetJsonStringFromList() {

		String jsonStr = JsonUtils.getJsonStringFromList(list);
		
		System.out.println("JsonStringFromList : " + jsonStr);
	}
	
	
	@Test
	public void testGetJsonObjectFromString() {
		
		JSONObject jsonObject = JsonUtils.getJsonObjectFromString(jsonStr);
		
		System.out.println("JsonObjectFromString : " + jsonObject);
	}
	
	
	@Test
	public void testGetMapFromJsonObject() {
	
		Map<String, Object> map = JsonUtils.getMapFromJsonObject(jsonObject);
		
		System.out.println("MapFromJsonObject : " + map);
	}
	
	@Test
	public void testGetListMapFromJsonArray() {
	
		List<Map<String, Object>> list = JsonUtils.getListMapFromJsonArray(jsonArray);
		
		System.out.println("ListMapFromJsonArray : " + list);
	}
}