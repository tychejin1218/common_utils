package com.common.utils;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class HttpConnectionUtilsTest {

	@Test
	public void testGetRequest() {
		
		String url = "https://jsonplaceholder.typicode.com/posts/1";
				
		String response = HttpConnectionUtils.getRequest(url);
		System.out.println("getRequest:" + response);
	}

	@Test
	public void testPostRequest() {
		
		String url = "https://jsonplaceholder.typicode.com/posts";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("title", "foo");
		map.put("body", "bar");
		map.put("userId", 1);
				
		String response = HttpConnectionUtils.postRequest(url, map);
		System.out.println("postRequest:" + response);
	}
}